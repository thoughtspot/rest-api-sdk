const fs = require('fs');

const SPEC_PATH = './spec/openapiSpecv3-2_0.json';
const CONFIG_PATH = './api-playground-config.json';
const SCHEMA_REF_PREFIX = '#/components/schemas/';
const HTTP_METHODS = new Set(['get', 'put', 'post', 'delete', 'options', 'head', 'patch', 'trace']);

function isObject(value) {
  return value !== null && typeof value === 'object' && !Array.isArray(value);
}

//Resolves a JSON reference pointer (e.g., "#/components/schemas/MySchema") to the actual object in the spec.
function resolveRef(root, ref) {
  if (typeof ref !== 'string' || !ref.startsWith('#/')) return null;
  const parts = ref.slice(2).split('/').map((p) => p.replace(/~1/g, '/').replace(/~0/g, '~'));
  let node = root;
  for (const part of parts) {
    if (!isObject(node) || !(part in node)) return null;
    node = node[part];
  }
  return node;
}

//Recursively traverses a schema and removes the specified field.
function hideFieldInSchema(root, schemaNode, fieldPathParts) {
  if (!isObject(schemaNode)) return false;

  if (schemaNode.$ref && typeof schemaNode.$ref === 'string') {
    const target = resolveRef(root, schemaNode.$ref);
    if (isObject(target)) {
      return hideFieldInSchema(root, target, fieldPathParts);
    }
    return false;
  }

  if (isObject(schemaNode.items)) {
    if (hideFieldInSchema(root, schemaNode.items, fieldPathParts)) return true;
  }

  let modified = false;
  for (const keyword of ['allOf', 'oneOf', 'anyOf']) {
    const variants = schemaNode[keyword];
    if (Array.isArray(variants)) {
      for (const variant of variants) {
        if (hideFieldInSchema(root, variant, fieldPathParts)) modified = true;
      }
    }
  }

  if (!isObject(schemaNode.properties)) return modified;

  const [current, ...rest] = fieldPathParts;

  if (rest.length === 0) {
    if (schemaNode.properties[current]) {
      delete schemaNode.properties[current];
      return true;
    }
    return modified;
  }

  const child = schemaNode.properties[current];
  if (!child || typeof child !== 'object') return modified;
  return hideFieldInSchema(root, child, rest) || modified;
}

//Processes all operations in the spec and hides fields based on the configuration.
function hideApiFields(spec, config) {
  const hideApiFieldsConfig = config.hideApiFields || [];

  if (hideApiFieldsConfig.length === 0) {
    console.log('No API fields specified to hide');
    return;
  }

  const fieldsMap = new Map();
  for (const { operationId, fields } of hideApiFieldsConfig) {
    if (operationId && fields && fields.length > 0) {
      fieldsMap.set(operationId, fields);
    }
  }

  for (const [pathKey, pathItem] of Object.entries(spec.paths)) {
    for (const [method, operation] of Object.entries(pathItem)) {
      if (!operation.operationId) continue;

      const fields = fieldsMap.get(operation.operationId);
      if (!fields) continue;

      console.log(`\nProcessing operation: ${operation.operationId} (${method.toUpperCase()} ${pathKey})`);
      
      hideFieldsInOperation(spec, operation, fields);
      
    }
  }
}

//Hides specified fields from a single operation's parameters and request body.
function hideFieldsInOperation(spec, op, fields) {
  const hidden = { parameters: [], requestBody: [] };

  if (op.parameters) {
    const simpleFields = new Set(fields.filter((f) => !f.includes('.')));
    op.parameters = op.parameters.filter((p) => {
      if (p.name && simpleFields.has(p.name)) {
        hidden.parameters.push(p.name);
        return false;
      }
      return true;
    });
  }

  const requestBody = op.requestBody;

  if (requestBody && requestBody.content) {
    for (const media of Object.values(requestBody.content)) {
      if (media && media.schema) {
        for (const field of fields) {
          const parts = field.split('.').filter(Boolean);
          if (parts.length && hideFieldInSchema(spec, media.schema, parts)) {
            hidden.requestBody.push(field);
          }
        }
      }
    }
  }

  return hidden;
}

//Returns the names of component schemas reachable from the spec's paths, following $refs through schemas.
function findReachableSchemas(spec) {
  const schemas = (spec.components && spec.components.schemas) || {};
  const reachable = new Set();
  const visit = (node) => {
    if (Array.isArray(node)) {
      node.forEach(visit);
      return;
    }
    if (!isObject(node)) return;
    for (const [key, value] of Object.entries(node)) {
      if (key === '$ref' && typeof value === 'string' && value.startsWith(SCHEMA_REF_PREFIX)) {
        const name = value.slice(SCHEMA_REF_PREFIX.length).split('/')[0].replace(/~1/g, '/').replace(/~0/g, '~');
        if (!reachable.has(name)) {
          reachable.add(name);
          visit(schemas[name]);
        }
      } else {
        visit(value);
      }
    }
  };
  visit(spec.paths);
  return reachable;
}

//Removes deprecated operations, then the component schemas only they used; already-unreferenced schemas stay.
function hideDeprecatedOperations(spec) {
  const reachableBefore = findReachableSchemas(spec);
  const operations = [];

  for (const [pathKey, pathItem] of Object.entries(spec.paths)) {
    for (const method of Object.keys(pathItem)) {
      if (!HTTP_METHODS.has(method) || pathItem[method].deprecated !== true) continue;
      console.log(`Hiding deprecated operation: ${pathItem[method].operationId} (${method.toUpperCase()} ${pathKey})`);
      operations.push(pathItem[method].operationId);
      delete pathItem[method];
    }
    if (!Object.keys(pathItem).some((key) => HTTP_METHODS.has(key))) {
      delete spec.paths[pathKey];
    }
  }

  const reachableAfter = findReachableSchemas(spec);
  const schemas = [...reachableBefore].filter((name) => !reachableAfter.has(name));
  for (const name of schemas) {
    delete spec.components.schemas[name];
  }

  console.log(`Hid ${operations.length} deprecated operations and ${schemas.length} schemas used only by them`);
  return { operations, schemas };
}

async function processOpenApiSpec() {
  try {
    if (!fs.existsSync(CONFIG_PATH)) {
      console.error(`Config file not found: ${CONFIG_PATH}`);
      process.exit(1);
    }

    const specContent = fs.readFileSync(SPEC_PATH, 'utf8');
    const spec = JSON.parse(specContent);

    const configContent = fs.readFileSync(CONFIG_PATH, 'utf8');
    const config = JSON.parse(configContent);

    // hideApiFields edits shared component schemas in place, so drop deprecated operations first:
    // a configured operation that is about to be removed must not change a schema a live one uses.
    if (config.hideDeprecatedOperations) {
      console.log('\n=== Hiding Deprecated Operations in Spec ===');
      hideDeprecatedOperations(spec);
    }

    if (config.hideApiFields && config.hideApiFields.length > 0) {
      console.log('\n=== Hiding API Fields in Spec ===');
      hideApiFields(spec, config);
    }

    let updatedSpecContent = JSON.stringify(spec, null, 2);
    if (!updatedSpecContent.endsWith('\n')) {
      updatedSpecContent += '\n';
    }
    fs.writeFileSync(SPEC_PATH, updatedSpecContent, 'utf8');

    console.log('\n=== Processing Complete ===');
    console.log('Successfully updated OpenAPI specification file');

  } catch (error) {
    console.error('Error processing files:', error.message);
    process.exit(1);
  }
}

if (require.main === module) {
  processOpenApiSpec();
}

module.exports = { 
  processOpenApiSpec, 
  hideApiFields,
  hideDeprecatedOperations
};


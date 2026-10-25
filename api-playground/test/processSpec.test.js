const test = require('node:test');
const assert = require('node:assert');
const fs = require('fs');
const os = require('os');
const path = require('path');

const { processOpenApiSpec, hideDeprecatedOperations } = require('../processSpec');

const ref = (name) => ({ $ref: `#/components/schemas/${name}` });
const json = (schema) => ({ content: { 'application/json': { schema } } });

function makeSpec() {
  return {
    openapi: '3.0.0',
    paths: {
      '/live': {
        get: {
          operationId: 'liveOp',
          parameters: [{ name: 'org_id', in: 'query', deprecated: true, schema: { type: 'string' } }],
          responses: { 200: json(ref('Shared')) },
        },
      },
      '/mixed': {
        get: { operationId: 'mixedLive', responses: { 200: json(ref('LiveOnly')) } },
        post: { operationId: 'mixedDead', deprecated: true, requestBody: json(ref('DeadOnly')), responses: {} },
      },
      '/dead': {
        post: {
          operationId: 'deadOp',
          deprecated: true,
          requestBody: json(ref('DeadParent')),
          responses: { 200: json(ref('Shared')) },
        },
      },
    },
    components: {
      schemas: {
        Shared: { type: 'object', properties: { old_field: { type: 'string', deprecated: true } } },
        LiveOnly: { type: 'object' },
        DeadOnly: { type: 'object' },
        DeadParent: { type: 'object', properties: { child: ref('DeadChild') } },
        DeadChild: { type: 'array', items: { allOf: [ref('Shared')] } },
        Orphan: { type: 'object' },
      },
    },
  };
}

function operationIds(spec) {
  return Object.values(spec.paths).flatMap((item) => Object.values(item).map((op) => op.operationId)).sort();
}

test('removes deprecated operations, keeps live methods and their paths, drops emptied paths', () => {
  const spec = makeSpec();
  const removed = hideDeprecatedOperations(spec);

  assert.deepStrictEqual(removed.operations.sort(), ['deadOp', 'mixedDead']);
  assert.deepStrictEqual(operationIds(spec), ['liveOp', 'mixedLive']);
  assert.deepStrictEqual(Object.keys(spec.paths['/mixed']), ['get'], 'a path with one live method must keep it');
  assert.ok(!('/dead' in spec.paths), 'a path left with no methods must go, or the playground shows an empty entry');
});

test('removes only schemas newly orphaned by the removal, including transitive ones', () => {
  const spec = makeSpec();
  const removed = hideDeprecatedOperations(spec);

  assert.deepStrictEqual(removed.schemas.sort(), ['DeadChild', 'DeadOnly', 'DeadParent']);
  assert.deepStrictEqual(
    Object.keys(spec.components.schemas).sort(),
    // Shared: still used by liveOp. Orphan: unreferenced before filtering, so out of scope.
    ['LiveOnly', 'Orphan', 'Shared'],
  );
});

test('leaves deprecated parameters and schema properties alone', () => {
  const spec = makeSpec();
  hideDeprecatedOperations(spec);

  assert.deepStrictEqual(spec.paths['/live'].get.parameters.map((p) => p.name), ['org_id']);
  assert.ok('old_field' in spec.components.schemas.Shared.properties);
});

test('processOpenApiSpec filters spec/ per config and leaves the source api-spec/ file unchanged', async () => {
  const root = fs.mkdtempSync(path.join(os.tmpdir(), 'process-spec-'));
  const source = path.join(root, 'api-spec', 'openapiSpecv3-2_0.json');
  const playground = path.join(root, 'api-playground');
  const sourceContent = JSON.stringify(makeSpec(), null, 2);
  fs.mkdirSync(path.dirname(source));
  fs.mkdirSync(path.join(playground, 'spec'), { recursive: true });
  fs.writeFileSync(source, sourceContent);
  fs.copyFileSync(source, path.join(playground, 'spec', 'openapiSpecv3-2_0.json'));
  fs.writeFileSync(path.join(playground, 'api-playground-config.json'), JSON.stringify({ hideDeprecatedOperations: true }));

  const cwd = process.cwd();
  try {
    process.chdir(playground);
    await processOpenApiSpec();
    const output = JSON.parse(fs.readFileSync(path.join(playground, 'spec', 'openapiSpecv3-2_0.json'), 'utf8'));
    assert.deepStrictEqual(operationIds(output), ['liveOp', 'mixedLive']);
    assert.strictEqual(fs.readFileSync(source, 'utf8'), sourceContent);
  } finally {
    process.chdir(cwd);
    fs.rmSync(root, { recursive: true, force: true });
  }
});

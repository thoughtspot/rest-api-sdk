const fs = require('fs');
const path = require('path');

// File paths
const SPEC_PATH = './spec/openapiSpecv3-2_0.json';
const CONFIG_PATH = './api-playground-config.json';

/**
 * Operation to hide specified APIs from the OpenAPI specification
 */
function hideApis(spec, config) {
  const hiddenApis = config.hideApis || [];

  if (hiddenApis.length === 0) {
    console.log('No APIs specified to hide');
    return { spec, stats: { removedApis: 0, removedPaths: 0 } };
  }

  console.log(`Found ${hiddenApis.length} APIs to hide:`, hiddenApis);

  // Filter out hidden APIs from paths
  const filteredPaths = {};
  let removedCount = 0;
  let removedPathsCount = 0;

  for (const [pathKey, pathMethods] of Object.entries(spec.paths)) {
    const filteredMethods = {};

    for (const [method, operation] of Object.entries(pathMethods)) {
      if (operation.operationId && hiddenApis.includes(operation.operationId)) {
        console.log(`Removing API: ${operation.operationId} (${method.toUpperCase()} ${pathKey})`);
        removedCount++;
        continue;
      }
      filteredMethods[method] = operation;
    }

    // Only keep the path if it has at least one method
    if (Object.keys(filteredMethods).length > 0) {
      filteredPaths[pathKey] = filteredMethods;
    } else {
      console.log(`Removing empty path: ${pathKey}`);
      removedPathsCount++;
    }
  }

  // Update the spec with filtered paths
  spec.paths = filteredPaths;

  console.log(`Removed ${removedCount} APIs and ${removedPathsCount} empty paths from the specification`);
  
  return { 
    spec, 
    stats: { 
      removedApis: removedCount, 
      removedPaths: removedPathsCount 
    } 
  };
}

/**
 * Main function to process OpenAPI specification
 */
async function processOpenApiSpec() {
  try {
    console.log('Reading OpenAPI specification...');
    const specContent = fs.readFileSync(SPEC_PATH, 'utf8');
    const spec = JSON.parse(specContent);

    console.log('Reading configuration file...');
    const configContent = fs.readFileSync(CONFIG_PATH, 'utf8');
    const config = JSON.parse(configContent);

    const originalPathCount = Object.keys(spec.paths).length;
    let totalRemovedApis = 0;
    let totalRemovedPaths = 0;

    // Apply hideApis operation
    if (config.hideApis && config.hideApis.length > 0) {
      console.log('\n=== Applying Hide APIs Operation ===');
      const result = hideApis(spec, config);
      totalRemovedApis += result.stats.removedApis;
      totalRemovedPaths += result.stats.removedPaths;
    }

    // Write the updated spec back to the file
    const updatedSpecContent = JSON.stringify(spec, null, 2);
    fs.writeFileSync(SPEC_PATH, updatedSpecContent, 'utf8');

    console.log('\n=== Processing Complete ===');
    console.log('Successfully updated OpenAPI specification file');
    console.log(`Original paths: ${originalPathCount}`);
    console.log(`Remaining paths: ${Object.keys(spec.paths).length}`);
    console.log(`Total APIs removed: ${totalRemovedApis}`);
    console.log(`Total empty paths removed: ${totalRemovedPaths}`);

  } catch (error) {
    console.error('Error processing files:', error.message);
    process.exit(1);
  }
}

// Run the script
if (require.main === module) {
  processOpenApiSpec();
}

module.exports = { 
  processOpenApiSpec, 
  hideApis
}; 
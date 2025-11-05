const navigateEndpoint = (apiResourceId) => {
  document.location.hash = apiResourceId;
};

let shouldPatch = false;
let _setConfig = null;
let isApiMaticPortalReady = false;
let pendingConfig = null; // ✅ NEW: Queue config if received early

const channel = new MessageChannel();
let playgroundConfig = {};

document.getElementsByClassName('portal-header')[0].style.display = 'none';

const setPlaygroundConfig = ({ baseUrl, accessToken }) => {
  if (!isApiMaticPortalReady) {
    // ✅ NEW: Queue config if not ready yet
    console.log('APIMatic not ready yet, queueing config');
    pendingConfig = { baseUrl, accessToken };
    return;
  }
  
  console.log('Setting playground config:', { baseUrl, accessToken: accessToken?.substring(0, 10) + '...' });
  
  _setConfig((defaultConfig) => {
    const newConfig = {
      ...defaultConfig,
      showFullCode: true,  // ✅ CHANGED: Show full code
      maskSensitiveValues: false, // ✅ NEW: Disable masking (try this key)
      maskSensitiveFields: false, // ✅ NEW: Alternative key name
      hideSensitiveData: false,   // ✅ NEW: Another possible key
      auth: {
        ...defaultConfig.auth,
        bearerAuth: {
          ...defaultConfig.auth?.bearerAuth,
          AccessToken: accessToken,
        },
      },
      config: {
        ...defaultConfig.config,
        "base-url": baseUrl,
      },
      // ✅ NEW: Try alternative config structures
      serverConfiguration: {
        baseUrl: baseUrl,
      },
      authConfiguration: {
        bearerToken: accessToken,
      },
    };
    
    console.log('New config:', newConfig);
    return newConfig;
  });
};

/** setting APIMatic Portal */
const setAPIMaticPortalConfig = () => {
  APIMaticDevPortal.ready(({ setConfig }) => {
    console.log('APIMatic Portal is ready!');
    isApiMaticPortalReady = true;
    _setConfig = setConfig;
    
    window.parent.postMessage({ type: 'api-playground-ready' }, '*', [
      channel.port2,
    ]);
    
    // ✅ NEW: Apply pending config if it was received early
    if (pendingConfig) {
      console.log('Applying pending config:', pendingConfig);
      setPlaygroundConfig(pendingConfig);
      pendingConfig = null;
    }
  });
};

setAPIMaticPortalConfig();

window.addEventListener('hashchange', (e) => {
  if (!shouldPatch) {
    return;
  }
  const queryParams = window.location.href.split("#/")[1];
  window.parent.postMessage({ type: "url-change", data: queryParams }, "*");
  setPlaygroundConfig(playgroundConfig);
});

window.addEventListener('message', (event) => {
  console.log('Received message:', event.data); // ✅ NEW: Debug log
  
  if (event.data?.type === 'api-playground-config') {
    shouldPatch = true;
    playgroundConfig = event.data;
    
    console.log('Received playground config:', {
      baseUrl: event.data.baseUrl,
      hasToken: !!event.data.accessToken,
      tokenPreview: event.data.accessToken?.substring(0, 10) + '...'
    });
    
    setPlaygroundConfig(playgroundConfig);
    
    if (playgroundConfig.apiResourceId) {
      navigateEndpoint(playgroundConfig.apiResourceId);
    }
  }
});

// ✅ NEW: Debug helper
window.test = (config) => {
  console.log('Manual test called');
  setPlaygroundConfig(config || playgroundConfig);
};

// ✅ NEW: Expose debug info
window.debug = () => {
  console.log('Debug info:', {
    isApiMaticPortalReady,
    hasSetConfig: !!_setConfig,
    playgroundConfig,
    pendingConfig
  });
};
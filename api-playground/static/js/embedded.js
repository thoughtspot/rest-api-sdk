const navigateEndpoint = (apiResourceId) => {
  document.location.hash = apiResourceId;
};

let shouldPatch = false;
let _setConfig = null;
let isApiMaticPortalReady = false;

const channel = new MessageChannel();
let playgroundConfig = {};

const normalizeKey = (key = '') =>
  key
    .toString()
    .trim()
    .toLowerCase()
    .replace(/[\s_-]/g, '');

const BASE_URL_KEY_CANDIDATE = 'baseurl';

const applyBaseUrl = (configObject = {}, baseUrl) => {
  if (!baseUrl) {
    return configObject;
  }

  const updatedConfig = { ...configObject };
  let didUpdateExistingKey = false;

  Object.keys(updatedConfig).forEach((key) => {
    if (normalizeKey(key) === BASE_URL_KEY_CANDIDATE) {
      updatedConfig[key] = baseUrl;
      didUpdateExistingKey = true;
    }
  });

  if (!didUpdateExistingKey) {
    updatedConfig['base-url'] = baseUrl;
  }

  return updatedConfig;
};

const hidePortalHeader = () => {
  const headerElement = document.querySelector('.portal-header');
  if (!headerElement) {
    return false;
  }
  headerElement.style.display = 'none';
  return true;
};

if (!hidePortalHeader()) {
  const observer = new MutationObserver(() => {
    if (hidePortalHeader()) {
      observer.disconnect();
    }
  });
  observer.observe(document.body, { childList: true, subtree: true });
}

const setAPIMaticPortalConfig = () => {
  APIMaticDevPortal.ready(({ setConfig }) => {
    isApiMaticPortalReady = true;
    _setConfig = setConfig;
    window.parent.postMessage({ type: 'api-playground-ready' }, '*', [
      channel.port2,
    ]);
  });
};

const setPlaygroundConfig = ({ baseUrl, accessToken, environment }) => {
  if (!isApiMaticPortalReady || typeof _setConfig !== 'function') {
    return;
  }

  _setConfig((defaultConfig = {}) => {
    const updatedConfig = { ...defaultConfig };

    updatedConfig.showFullCode = false;
    updatedConfig.showCompleteCode = false;

    if (baseUrl || defaultConfig.config) {
      updatedConfig.config = applyBaseUrl(defaultConfig.config, baseUrl);
    }

    if (accessToken) {
      updatedConfig.auth = {
        ...(defaultConfig.auth ?? {}),
        bearerAuth: {
          ...(defaultConfig.auth?.bearerAuth ?? {}),
          AccessToken: accessToken,
        },
      };
    }

    if (environment) {
      if (Object.prototype.hasOwnProperty.call(defaultConfig, 'selectedEnvironment')) {
        updatedConfig.selectedEnvironment = environment;
      }
      if (Object.prototype.hasOwnProperty.call(defaultConfig, 'selectedEnvironmentId')) {
        updatedConfig.selectedEnvironmentId = environment;
      }
    }

    return updatedConfig;
  });
};

/** setting APIMatic Portal */
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
  if (event.data?.type === 'api-playground-config') {
    shouldPatch = true;
    playgroundConfig = event.data;
    setPlaygroundConfig(playgroundConfig);
    if (playgroundConfig.apiResourceId) {
      navigateEndpoint(playgroundConfig.apiResourceId);
    }
  }
});

window.test = (config) => {
  setPlaygroundConfig(playgroundConfig);
};

/**
 * Custom script to hide user_parameters from API responses in the APImatic playground
 */
(function() {
  // Function to intercept and modify fetch/XHR responses
  function setupResponseInterceptor() {
    // Create a proxy for the fetch function
    const originalFetch = window.fetch;
    window.fetch = async function(...args) {
      const response = await originalFetch.apply(this, args);
      
      // Clone the response to create a new one
      const clone = response.clone();
      
      // Check if this is a response from the auth token endpoints
      const url = args[0].toString();
      if (url.includes('/api/rest/2.0/auth/token/full') || url.includes('/api/rest/2.0/auth/token/object')) {
        return clone.json().then(data => {
          // Remove user_parameters if present
          if (data && data.user_parameters !== undefined) {
            delete data.user_parameters;
          }
          
          // Create a modified response
          const modifiedResponse = new Response(JSON.stringify(data), {
            status: response.status,
            statusText: response.statusText,
            headers: response.headers
          });
          
          return modifiedResponse;
        }).catch(() => {
          // If there's an error parsing JSON, return the original response
          return clone;
        });
      }
      
      return response;
    };
    
    // Also intercept XMLHttpRequest for older browsers/implementations
    const originalXHROpen = XMLHttpRequest.prototype.open;
    const originalXHRSend = XMLHttpRequest.prototype.send;
    
    XMLHttpRequest.prototype.open = function(method, url, ...rest) {
      this._url = url;
      return originalXHROpen.apply(this, [method, url, ...rest]);
    };
    
    XMLHttpRequest.prototype.send = function(...args) {
      const xhr = this;
      const originalOnReadyStateChange = xhr.onreadystatechange;
      
      xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
          const url = xhr._url.toString();
          
          if (url.includes('/api/rest/2.0/auth/token/full') || url.includes('/api/rest/2.0/auth/token/object')) {
            try {
              const response = JSON.parse(xhr.responseText);
              
              // Remove user_parameters if present
              if (response && response.user_parameters !== undefined) {
                delete response.user_parameters;
                
                // Override the response text with the modified JSON
                Object.defineProperty(xhr, 'responseText', {
                  get: function() {
                    return JSON.stringify(response);
                  }
                });
              }
            } catch (e) {
              // If error parsing JSON, leave the response as is
              console.error('Error processing XHR response:', e);
            }
          }
        }
        
        if (originalOnReadyStateChange) {
          originalOnReadyStateChange.apply(xhr, arguments);
        }
      };
      
      return originalXHRSend.apply(xhr, args);
    };
  }
  
  // Wait for the page to be fully loaded
  window.addEventListener('load', function() {
    console.log('Setting up response interceptor to hide user_parameters in API responses');
    setupResponseInterceptor();
  });
})();

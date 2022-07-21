/* Utility function for embed detection */
const isEmbedded = function () {
    let searchString = document.location.search;
    if (searchString != '') {
        searchString = searchString.substring(1);
        if (searchString.endsWith("/")) {
            searchString = searchString.slice(0, -1);
        }
        const searchParams = new URLSearchParams(searchString);
        return searchParams.get("embedded") === "true";
    }
}

/* Style updates for embedded */
window.addEventListener('DOMContentLoaded', () => {
    if (isEmbedded()) {
        document.body.classList.add("embedded");
    }
});

/* Default config for baseURL and Access Token */
const defaultPlaygroundConfig = { "BaseUrl": "https://cluster.thoughtspot.cloud", "AccessToken": "AccessToken" };

navigator.serviceWorker.onmessage = (event) => {
    if (event.data && event.data.type === 'FetchEmbedURLAndToken') {
        if (isEmbedded() && window.parent) {
            fetchPlaygroundConfig().then(data => {
                navigator.serviceWorker.controller.postMessage(data);
            })
        } else {
            navigator.serviceWorker.controller.postMessage(defaultPlaygroundConfig);
        }
    }
};

/* Promise to fetch the info from the parent TS portal */
function fetchPlaygroundConfig() {
    return new Promise(function (resolve, reject) {
        var messageChannel = new MessageChannel();
        messageChannel.port1.onmessage = function (event) {
            const { BaseUrl = defaultPlaygroundConfig.BaseUrl, AccessToken = defaultPlaygroundConfig.AccessToken } = event.data;
            resolve({ BaseUrl, AccessToken });
        };
        window.parent.postMessage({ "type": "PlaygroundConfig" }, "*", [messageChannel.port2]);
    });
}


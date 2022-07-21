const handleFetch = e => {
    if (e.request.url.includes("/static/docs/")) {
        e.respondWith(function () {
            return self.clients.get(e.clientId).then(client =>
                sendMessage({ "type": "FetchEmbedURLAndToken" }, client).then(data =>
                    fetch(e.request).then((response) => {
                        return response.json().then((content) => {
                            /* Update JSON with values from parent TS portal */
                            content.DataModel.config["base-url"] = data.BaseUrl;
                            content.DataModel.config.AccessToken = data.AccessToken;

                            return new Response(JSON.stringify(content), {
                                headers: { 'Content-Type': 'application/json' }
                            });
                        })
                    }).catch(function () {
                        return new Response("Failure fetching language json");
                    })
                )
            )
        }());
    }
};

const handleActivate = () => {
    return self.clients.claim();
};

function handleControlledMessage(resolve, event) {
    resolve(event.data);
}

function sendMessage(message, client) {
    return new Promise((resolve, reject) => {
        self.addEventListener('message', handleControlledMessage.bind(null, resolve), false);
        client.postMessage(message);
    });
}

self.addEventListener('fetch', handleFetch);
self.addEventListener('activate', handleActivate)
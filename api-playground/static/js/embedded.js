/* Style updates for embedded */
window.addEventListener('DOMContentLoaded', () => {
    let searchString = document.location.search;
    if (searchString != '') {
        searchString = searchString.substring(1);
        if (searchString.endsWith("/")) {
            searchString = searchString.slice(0, -1);
        }
        const searchParams = new URLSearchParams(searchString);
        if (searchParams.get("embedded") === "true") {
            document.body.classList.add("embedded");
        }
    }
});

/* Get the base-url and bearer token on load */
window.addEventListener('DOMContentLoaded', () => {
    if (window.parent) {
        window.addEventListener("message", (event) => {
            if (event.source == window.parent) {
                console.log(event.data);
            }
        }, false);

        window.parent.postMessage({ "name": "api-playground-load" }, "*");
    }
});


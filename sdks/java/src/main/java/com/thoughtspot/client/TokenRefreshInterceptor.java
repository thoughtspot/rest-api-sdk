package com.thoughtspot.client;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * OkHttp interceptor that integrates with {@link TokenProvider} to:
 *
 * <ol>
 *   <li>Resolve the current valid token (from cache or fresh fetch) before each request.
 *   <li>On a 401 response, clear the cache, fetch a new token, and retry the request once.
 * </ol>
 *
 * <p>This interceptor replaces the static {@code Authorization} header set by {@link
 * com.thoughtspot.client.auth.HttpBearerAuth} with the dynamically managed token from the
 * provider.
 */
class TokenRefreshInterceptor implements Interceptor {

    private final TokenProvider tokenProvider;

    TokenRefreshInterceptor(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // Only intercept requests that have a Bearer auth header
        String authHeader = request.header("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return chain.proceed(request);
        }

        // Replace the header with the token from the provider (cached or freshly fetched)
        String token = tokenProvider.token();
        request = replaceAuthHeader(request, token);

        Response response = chain.proceed(request);

        // On 401: clear cache, get new token, retry once
        if (response.code() == 401) {
            response.close();
            String newToken = tokenProvider.clearAndRefresh();
            if (newToken != null) {
                request = replaceAuthHeader(request, newToken);
                response = chain.proceed(request);
            }
        }

        return response;
    }

    private static Request replaceAuthHeader(Request request, String token) {
        return request.newBuilder()
                .removeHeader("Authorization")
                .addHeader("Authorization", "Bearer " + token)
                .build();
    }
}

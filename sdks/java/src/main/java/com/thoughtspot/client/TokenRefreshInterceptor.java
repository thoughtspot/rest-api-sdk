/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * OkHttp interceptor that integrates with {@link TokenProvider} to:
 *
 * <ol>
 *   <li>Inject the managed token as {@code Authorization: Bearer <token>} on every request.
 *   <li>On a 401 response, clear the cache, fetch a new token, and retry the request once.
 * </ol>
 *
 * <p>This interceptor is only registered when {@code getToken} is configured. It
 * unconditionally sets the {@code Authorization} header, replacing any value previously
 * set by {@link com.thoughtspot.client.auth.HttpBearerAuth}.
 */
class TokenRefreshInterceptor implements Interceptor {

    private final TokenProvider tokenProvider;
    private final ThreadLocal<Boolean> isFetching = ThreadLocal.withInitial(() -> false);

    TokenRefreshInterceptor(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // Re-entrant call from within the getToken callback (e.g. getFullAccessToken,
        // getCustomAccessToken). Skip token injection to avoid deadlocking on the
        // same thread's in-flight future in TokenProvider.requestNew().
        if (isFetching.get()) {
            return chain.proceed(request);
        }

        isFetching.set(true);
        try {
            String token = tokenProvider.token();
            request = replaceAuthHeader(request, token);

            Response response = chain.proceed(request);

            if (response.code() == 401) {
                String newToken = tokenProvider.clearAndRefresh(token);
                if (newToken != null && !newToken.equals(token)) {
                    response.close();
                    request = replaceAuthHeader(request, newToken);
                    response = chain.proceed(request);
                }
            }

            return response;
        } finally {
            isFetching.set(false);
        }
    }

    private static Request replaceAuthHeader(Request request, String token) {
        return request.newBuilder()
                .removeHeader("Authorization")
                .addHeader("Authorization", "Bearer " + token)
                .build();
    }
}
/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manages the bearer-token lifecycle: caching, proactive refresh before expiry, single-flight
 * deduplication of concurrent fetches, and 401-triggered retry.
 *
 * <p>Implements the standard from SCAL-338826:
 *
 * <ol>
 *   <li>Call {@code getToken} on first use (lazy, not in constructor).
 *   <li>Cache the token per client instance.
 *   <li>Reuse the cached token without validation.
 *   <li>If {@code expiresAt} is present, call {@code getToken} when fewer than {@code
 *       refreshBufferMs} milliseconds remain. If that call fails, keep using the cached token
 *       while it has not expired; once it has, surface the failure.
 *   <li>On 401, clear the cache, call {@code getToken} once, and retry the request once.
 *   <li>Deduplicate concurrent {@code getToken} calls into a single in-flight call.
 * </ol>
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
class TokenProvider {

    private static final Logger logger = Logger.getLogger(TokenProvider.class.getName());

    static final long DEFAULT_REFRESH_BUFFER_MS = 30_000;

    private final Supplier<TokenResult> getToken;
    private final long refreshBufferMs;

    private final AtomicReference<TokenResult> cached = new AtomicReference<>();
    private final AtomicReference<CompletableFuture<TokenResult>> inflight = new AtomicReference<>();

    /**
     * @param getToken supplier that fetches a new token (provided by the customer)
     * @param refreshBufferMs milliseconds before expiry to trigger proactive refresh
     */
    TokenProvider(Supplier<TokenResult> getToken, long refreshBufferMs) {
        this.getToken = getToken;
        this.refreshBufferMs = refreshBufferMs;
    }

    /**
     * Get the current valid token. Returns the cached token if it's still valid, otherwise fetches a
     * new one. If the refresh inside the buffer window fails, falls back to the cached token as long
     * as it has not expired yet.
     *
     * @return the bearer token string
     * @throws RuntimeException if no token could be fetched and there is no unexpired cached token
     */
    String token() {
        TokenResult current = cached.get();
        if (current == null) {
            return requestNew("cold").getToken();
        }
        if (!current.hasExpiry()) {
            return current.getToken();
        }

        long buffer = current.getTokenBufferMs() != null
                ? current.getTokenBufferMs()
                : refreshBufferMs;
        if (current.getExpiresAt() - System.currentTimeMillis() > buffer) {
            return current.getToken();
        }

        try {
            return requestNew("expiry").getToken();
        } catch (RuntimeException e) {
            if (current.getExpiresAt() > System.currentTimeMillis()) {
                logger.log(Level.WARNING,
                        "Token refresh before expiry failed, using cached token until it expires", e);
                return current.getToken();
            }
            throw new RuntimeException("Token refresh failed and the cached token has expired", e);
        }
    }

    /**
     * Clear the cached token and fetch a new one. Called on 401.
     * If another thread already refreshed the token, returns the new one without refetching.
     *
     * @param failedToken the token that received the 401
     * @return the new bearer token string, or null if refresh failed
     */
    String clearAndRefresh(String failedToken) {
        logger.log(Level.FINE, "401 received, clearing cache and refreshing token");
        TokenResult current = cached.get();
        if (current != null && !current.getToken().equals(failedToken)) {
            // Another thread already refreshed — use the new token
            return current.getToken();
        }
        cached.set(null);
        try {
            return requestNew("401").getToken();
        } catch (Exception e) {
            logger.log(Level.WARNING, "Token refresh after 401 failed", e);
            return null;
        }
    }

    /**
     * Single-flight token fetch. If a fetch is already in progress, join it instead of starting a
     * new one.
     */
    private TokenResult requestNew(String reason) {
        CompletableFuture<TokenResult> future = new CompletableFuture<>();

        if (inflight.compareAndSet(null, future)) {
            try {
                TokenResult result = fetchNew(reason);
                future.complete(result);
                return result;
            } catch (RuntimeException | Error e) {
                future.completeExceptionally(e);
                throw e;
            } finally {
                inflight.set(null);
            }
        } else {
            CompletableFuture<TokenResult> existing = inflight.get();
            if (existing != null) {
                try {
                    return existing.join();
                } catch (CompletionException e) {
                    // Rethrow the leader's original failure so waiters see the same exception
                    // the leader did, not a CompletionException wrapping it.
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) throw (RuntimeException) cause;
                    if (cause instanceof Error) throw (Error) cause;
                    throw e;
                }
            }
            TokenResult fresh = cached.get();
            if (fresh != null) return fresh;
            return fetchNew(reason);
        }
    }

    private TokenResult fetchNew(String reason) {
        logger.log(Level.FINE, "Calling getToken (reason: {0})", reason);
        TokenResult result = getToken.get();
        if (result == null) {
            throw new RuntimeException("getToken returned null");
        }
        cached.set(result);
        return result;
    }
}

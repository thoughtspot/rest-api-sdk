package com.thoughtspot.client;

import java.util.concurrent.CompletableFuture;
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
 *       refreshBufferMs} milliseconds remain.
 *   <li>On 401, clear the cache, call {@code getToken} once, and retry the request once.
 *   <li>Deduplicate concurrent {@code getToken} calls into a single in-flight call.
 * </ol>
 */
class TokenProvider {

    private static final Logger logger = Logger.getLogger(TokenProvider.class.getName());

    static final long DEFAULT_REFRESH_BUFFER_MS = 30_000;

    private final Supplier<TokenResult> getToken;
    private final long refreshBufferMs;
    private final boolean cachingEnabled;

    private final AtomicReference<TokenResult> cached = new AtomicReference<>();
    private final AtomicReference<CompletableFuture<TokenResult>> inflight = new AtomicReference<>();

    /**
     * @param getToken supplier that fetches a new token (provided by the customer)
     * @param refreshBufferMs milliseconds before expiry to trigger proactive refresh
     * @param cachingEnabled whether to cache the token between requests
     */
    TokenProvider(Supplier<TokenResult> getToken, long refreshBufferMs, boolean cachingEnabled) {
        this.getToken = getToken;
        this.refreshBufferMs = refreshBufferMs;
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * Get the current valid token. Returns the cached token if it's still valid, otherwise fetches a
     * new one.
     *
     * @return the bearer token string
     */
    String token() {
        if (!cachingEnabled) {
            return fetchNew("caching_disabled").getToken();
        }

        TokenResult current = cached.get();
        if (current != null) {
            long buffer = current.getTokenBufferMs() != null
                    ? current.getTokenBufferMs()
                    : refreshBufferMs;
            if (!current.hasExpiry() || current.getExpiresAt() - System.currentTimeMillis() > buffer) {
                return current.getToken();
            }
            // Token is expiring soon — proactive refresh
            logger.log(Level.FINE, "Token expiring soon, proactively refreshing");
            return requestNew("expiry").getToken();
        }

        // First use — cold fetch
        return requestNew("cold").getToken();
    }

    /**
     * Clear the cached token and fetch a new one. Called on 401.
     *
     * @return the new bearer token string, or null if refresh failed
     */
    String clearAndRefresh() {
        logger.log(Level.FINE, "401 received, clearing cache and refreshing token");
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
        // Try to be the one to start the fetch
        CompletableFuture<TokenResult> future = new CompletableFuture<>();

        // Java 8 compatible: compareAndSet returns boolean, not the old value
        if (inflight.compareAndSet(null, future)) {
            // We won the race — do the actual fetch
            try {
                TokenResult result = fetchNew(reason);
                future.complete(result);
                return result;
            } catch (Exception e) {
                future.completeExceptionally(e);
                throw e;
            } finally {
                inflight.set(null);
            }
        } else {
            // Another thread is already fetching — wait for its result
            CompletableFuture<TokenResult> existing = inflight.get();
            if (existing != null) {
                try {
                    return existing.join();
                } catch (Exception e) {
                    // If the in-flight request failed, try our own
                    return fetchNew(reason);
                }
            }
            // Edge case: inflight was cleared between compareAndSet and get
            return fetchNew(reason);
        }
    }

    private TokenResult fetchNew(String reason) {
        logger.log(Level.FINE, "Calling getToken (reason: {0})", reason);
        TokenResult result = getToken.get();
        if (result == null) {
            throw new RuntimeException("getToken returned null");
        }
        if (cachingEnabled) {
            cached.set(result);
        }
        return result;
    }
}

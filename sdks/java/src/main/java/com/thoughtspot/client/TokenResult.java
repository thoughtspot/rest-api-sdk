package com.thoughtspot.client;

/**
 * Represents the result of a token fetch operation.
 *
 * <p>Customers return this from their {@code getToken} function. Two forms are supported:
 *
 * <ul>
 *   <li>{@link #of(String)} — token string only. The SDK will call {@code getToken} again only
 *       after a 401.
 *   <li>{@link #of(String, long)} or {@link #of(String, long, long)} — token with {@code
 *       expiresAt} (epoch milliseconds). The SDK will call {@code getToken} proactively before
 *       expiry.
 * </ul>
 *
 * <p>{@code expiresAt} maps directly to {@code expiration_time_in_millis} from the
 * {@code /auth/token/*} response.
 */
public class TokenResult {

    private final String token;
    private final Long expiresAt;
    private final Long tokenBufferMs;

    private TokenResult(String token, Long expiresAt, Long tokenBufferMs) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("token must not be null or empty");
        }
        this.token = token;
        this.expiresAt = expiresAt;
        this.tokenBufferMs = tokenBufferMs;
    }

    /**
     * Create a TokenResult with just a token string. The SDK will not know when the token expires
     * and will only refresh on 401.
     *
     * @param token the bearer token string
     * @return a new TokenResult
     */
    public static TokenResult of(String token) {
        return new TokenResult(token, null, null);
    }

    /**
     * Create a TokenResult with a token and expiry time. The SDK will proactively refresh the token
     * before it expires.
     *
     * @param token the bearer token string
     * @param expiresAt expiration time in epoch milliseconds (maps to {@code
     *     expiration_time_in_millis} from the API response)
     * @return a new TokenResult
     */
    public static TokenResult of(String token, long expiresAt) {
        return new TokenResult(token, expiresAt, null);
    }

    /**
     * Create a TokenResult with a token, expiry time, and custom buffer.
     *
     * @param token the bearer token string
     * @param expiresAt expiration time in epoch milliseconds
     * @param tokenBufferMs milliseconds before expiry to trigger refresh (overrides the client-level
     *     default)
     * @return a new TokenResult
     */
    public static TokenResult of(String token, long expiresAt, long tokenBufferMs) {
        return new TokenResult(token, expiresAt, tokenBufferMs);
    }

    /** @return the bearer token string */
    public String getToken() {
        return token;
    }

    /** @return expiration time in epoch milliseconds, or null if unknown */
    public Long getExpiresAt() {
        return expiresAt;
    }

    /** @return custom buffer in milliseconds before expiry to refresh, or null to use the default */
    public Long getTokenBufferMs() {
        return tokenBufferMs;
    }

    /** @return true if the expiry time is known */
    public boolean hasExpiry() {
        return expiresAt != null;
    }
}

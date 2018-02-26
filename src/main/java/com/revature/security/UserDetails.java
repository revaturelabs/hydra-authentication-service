package com.revature.security;

import java.io.IOException;

/**
 * Project: caliber
 *
 * @author d4k1d23
 * @date 1/25/17
 */
@FunctionalInterface
public interface UserDetails {
    /**
     * Gets the in salesforce user
     * @param accessToken
     * @param endpoint the id field of the salesforce token
     * @return JSON representation of the salesforce user
     * @throws IOException
     */
    String getSalesforceUser(String accessToken, String endpoint) throws IOException;
}

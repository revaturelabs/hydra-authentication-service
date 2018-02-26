package com.revature.security.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Project: caliber
 *
 * @author d4k1d23
 * @date 1/25/17
 */
@Component
public abstract class AbstractSalesforceSecurityHelper {
	@Value("#{systemEnvironment['SALESFORCE_LOGIN_URL']}")
	protected String loginURL;
	@Value("services/oauth2/authorize")
	protected String authURL;
	@Value("services/oauth2/token")
	protected String accessTokenURL;
	@Value("#{systemEnvironment['SALESFORCE_CLIENT_ID']}")
	protected String clientId;
	@Value("#{systemEnvironment['SALESFORCE_CLIENT_SECRET']}")
	protected String clientSecret;
	@Value("#{systemEnvironment['SALESFORCE_REDIRECT_URI']}")
	protected String redirectUri;
	@Value("#{systemEnvironment['CALIBER_PROJECT_URL']}")
	protected String redirectUrl;
	@Value("services/oauth2/revoke")
	protected String revokeUrl;
	@Value("#{systemEnvironment['CALIBER_SERVER_URL']}")
	protected String baseUrl;
	@Value("#{systemEnvironment['CALIBER_API_USERNAME']}")
	protected String username;
	@Value("#{systemEnvironment['CALIBER_API_PASSWORD']}")
	protected String password;
	
    private BufferedReader bufferedReader;
    private StringBuilder stringBuilder;
    private static final Logger log = Logger.getLogger(AbstractSalesforceSecurityHelper.class);

    public String toJsonString (InputStream inputStream) {
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        stringBuilder = new StringBuilder();
        String inputString;

        try {
            while ((inputString = bufferedReader.readLine()) != null)
                stringBuilder.append(inputString);
        } catch (IOException e) {
        	log.error("Unable to read input String: " + e + " " + e.getClass() + " " + e.getMessage());	
            return null;
        }
        closeStream();
        return stringBuilder.toString();
    }

    public void closeStream(){
        try {
            bufferedReader.close();
        } catch (IOException e) {
        	log.error("Unable to close reader: " + e + " " + e.getClass() + " " + e.getMessage());
        }
    }

	public String getLoginURL() {
		return loginURL;
	}

	public void setLoginURL(String loginURL) {
		this.loginURL = loginURL;
	}

	public String getAuthURL() {
		return authURL;
	}

	public void setAuthURL(String authURL) {
		this.authURL = authURL;
	}

	public String getAccessTokenURL() {
		return accessTokenURL;
	}

	public void setAccessTokenURL(String accessTokenURL) {
		this.accessTokenURL = accessTokenURL;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRevokeUrl() {
		return revokeUrl;
	}

	public void setRevokeUrl(String revokeUrl) {
		this.revokeUrl = revokeUrl;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}

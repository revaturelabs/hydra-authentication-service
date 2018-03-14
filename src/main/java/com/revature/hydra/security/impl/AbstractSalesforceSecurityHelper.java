package com.revature.hydra.security.impl;

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
	// @Value("#{systemEnvironment['SALESFORCE_LOGIN_URL']}")
	// This needs to be the url of salesforce service
	protected String loginURL = "";
	// Using @Value annotation for this is very useless
	@Value("services/oauth2/authorize")
	protected String authURL;
	// Using @Value annotation for this is very useless
	@Value("services/oauth2/token")
	protected String accessTokenURL;
	// @Value("#{systemEnvironment['SALESFORCE_CLIENT_ID']}")
	// this needs to be the clientId of machine requesting
	protected String clientId = "";
	// @Value("#{systemEnvironment['SALESFORCE_CLIENT_SECRET']}")
	// This needs to be the client password. Should not be implemented this way imo.
	protected String clientSecret;
	// This needs to be the url to redirect from salesforce
	// @Value("#{systemEnvironment['SALESFORCE_REDIRECT_URI']}")
	protected String redirectUri = "";
	// @Value("#{systemEnvironment['CALIBER_PROJECT_URL']}")
	// This needs to be caliber url.
	protected String redirectUrl = "";
	// Using @Value annotation for this is very useless
	@Value("services/oauth2/revoke")
	protected String revokeUrl;
	// @Value("#{systemEnvironment['CALIBER_SERVER_URL']}")
	// This should Caliber direct endpoint to get the token.
	protected String baseUrl = "";
	// @Value("#{systemEnvironment['CALIBER_API_USERNAME']}")
	// This should be in a config file in a gitlab repo or pcf uaa.
	protected String username = "";
	// @Value("#{systemEnvironment['CALIBER_API_PASSWORD']}")
	// This should be in a config file in a gitlab repo or pcf uaa.
	protected String password = "";
	
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
        finally {
			closeStream();
        }
        return stringBuilder.toString();
    }

    public void closeStream(){
        try {
            bufferedReader.close();
        } catch (IOException e) {
        	log.error("Unable to close reader: " + e + " " + e.getClass() + " " + e.getMessage());
        }
    }

	// EnvVariable
    public String getLoginURL() {
		return loginURL;
	}

	public void setLoginURL(String loginURL) {
		this.loginURL = loginURL;
	}

	// This is service/oauth2/authorize
	public String getAuthURL() {
		return authURL;
	}

	public void setAuthURL(String authURL) {
		this.authURL = authURL;
	}

	// This is service/oauth2/token
	public String getAccessTokenURL() {
		return accessTokenURL;
	}

	public void setAccessTokenURL(String accessTokenURL) {
		this.accessTokenURL = accessTokenURL;
	}

	// EnvVariable
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	// EnvVariable
	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	// EnvVariable
	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	// EnvVariable
	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	
	// services/oauth2/revoke
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

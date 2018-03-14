package com.revature.hydra.security.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Salesforce user status.
 */
public class SalesforceUserStatus {
    @JsonProperty(value="created_date")
    private String createdDate;
    @JsonProperty(value="body")
    private String body;

    /**
     * Instantiates a new Salesforce user status.
     */
    public SalesforceUserStatus() {
    	super();
    }

    /**
     * Instantiates a new Salesforce user status.
     *
     * @param created_date the created date
     * @param body         the body
     */
    public SalesforceUserStatus(String createdDate, String body) {
        this.createdDate = createdDate;
        this.body = body;
    }

    /**
     * Gets created date.
     *
     * @return the created date
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets created date.
     *
     * @param created_date the created date
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "SalesforceUserStatus{" +
                "created_date='" + createdDate + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

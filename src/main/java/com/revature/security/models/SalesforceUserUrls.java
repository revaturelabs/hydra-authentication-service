package com.revature.security.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Salesforce user urls.
 */
public class SalesforceUserUrls {
    @JsonProperty(value="enterprise")
    private String enterprise;
    @JsonProperty(value="metadata")
    private String metadata;
    @JsonProperty(value="partner")
    private String partner;
    @JsonProperty(value="rest")
    private String rest;
    @JsonProperty(value="sobjects")
    private String sobjects;
    @JsonProperty(value="search")
    private String search;
    @JsonProperty(value="query")
    private String query;
    @JsonProperty(value="recent")
    private String recent;
    @JsonProperty(value="profile")
    private String profile;
    @JsonProperty(value="feeds")
    private String feeds;
    @JsonProperty(value="groups")
    private String groups;
    @JsonProperty(value="users")
    private String users;
    @JsonProperty(value="feed_items")
    private String feedItems;
    @JsonProperty(value="feed_elements")
    private String feedElements;
    @JsonProperty(value="custom_domain")
    private String customDomain;
	@JsonProperty(value="tooling_soap")
	private String toolingSoap;
	@JsonProperty(value="tooling_rest")
	private String toolingRest;

    /**
     * Instantiates a new Salesforce user urls.
     */
    public SalesforceUserUrls() {
    	super();
    }
	
    /**
     * Gets enterprise.
     *
     * @return the enterprise
     */
    public String getEnterprise() {
        return enterprise;
    }

    /**
     * Sets enterprise.
     *
     * @param enterprise the enterprise
     */
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Gets metadata.
     *
     * @return the metadata
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata.
     *
     * @param metadata the metadata
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets partner.
     *
     * @return the partner
     */
    public String getPartner() {
        return partner;
    }

    /**
     * Sets partner.
     *
     * @param partner the partner
     */
    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * Gets rest.
     *
     * @return the rest
     */
    public String getRest() {
        return rest;
    }

    /**
     * Sets rest.
     *
     * @param rest the rest
     */
    public void setRest(String rest) {
        this.rest = rest;
    }

    /**
     * Gets sobjects.
     *
     * @return the sobjects
     */
    public String getSobjects() {
        return sobjects;
    }

    /**
     * Sets sobjects.
     *
     * @param sobjects the sobjects
     */
    public void setSobjects(String sobjects) {
        this.sobjects = sobjects;
    }

    /**
     * Gets search.
     *
     * @return the search
     */
    public String getSearch() {
        return search;
    }

    /**
     * Sets search.
     *
     * @param search the search
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * Gets query.
     *
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets query.
     *
     * @param query the query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Gets recent.
     *
     * @return the recent
     */
    public String getRecent() {
        return recent;
    }

    /**
     * Sets recent.
     *
     * @param recent the recent
     */
    public void setRecent(String recent) {
        this.recent = recent;
    }

    /**
     * Gets profile.
     *
     * @return the profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets profile.
     *
     * @param profile the profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Gets feeds.
     *
     * @return the feeds
     */
    public String getFeeds() {
        return feeds;
    }

    /**
     * Sets feeds.
     *
     * @param feeds the feeds
     */
    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    /**
     * Gets groups.
     *
     * @return the groups
     */
    public String getGroups() {
        return groups;
    }

    /**
     * Sets groups.
     *
     * @param groups the groups
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * Gets users.
     *
     * @return the users
     */
    public String getUsers() {
        return users;
    }

    /**
     * Sets users.
     *
     * @param users the users
     */
    public void setUsers(String users) {
        this.users = users;
    }

    public String getFeedItems() {
		return feedItems;
	}

	public void setFeedItems(String feedItems) {
		this.feedItems = feedItems;
	}

	public String getFeedElements() {
		return feedElements;
	}

	public void setFeedElements(String feedElements) {
		this.feedElements = feedElements;
	}

	public String getCustomDomain() {
		return customDomain;
	}

	public void setCustomDomain(String customDomain) {
		this.customDomain = customDomain;
	}

	public String getToolingSoap() {
		return toolingSoap;
	}

	public void setToolingSoap(String toolingSoap) {
		this.toolingSoap = toolingSoap;
	}

	public String getToolingRest() {
		return toolingRest;
	}

	public void setToolingRest(String toolingRest) {
		this.toolingRest = toolingRest;
	}

	@Override
    public String toString() {
        return "SalesforceUserUrls{" +
                "enterprise='" + enterprise + '\'' +
                ", metadata='" + metadata + '\'' +
                ", partner='" + partner + '\'' +
                ", rest='" + rest + '\'' +
                ", sobjects='" + sobjects + '\'' +
                ", search='" + search + '\'' +
                ", query='" + query + '\'' +
                ", recent='" + recent + '\'' +
                ", profile='" + profile + '\'' +
                ", feeds='" + feeds + '\'' +
                ", groups='" + groups + '\'' +
                ", users='" + users + '\'' +
                ", feed_items='" + feedItems + '\'' +
                ", feed_elements='" + feedElements + '\'' +
                ", custom_domain='" + customDomain + '\'' +
                '}';
    }
}

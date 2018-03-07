package com.revature.hydra.security.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.revature.hydra.security.beans.Trainer;

/**
 * The type Salesforce user.
 */
public class SalesforceUser implements UserDetails {
	private static final long serialVersionUID = 8330084985503759701L;
	@JsonProperty(value = "id")
    private String id;
	@JsonProperty(value = "asserted_user")
    private boolean assertedUser;
	@JsonProperty(value = "user_id")
    private String userId;
	@JsonProperty(value = "organization_id")
    private String organizationId;
    @JsonProperty(value = "username")
    private String username;
    @JsonProperty(value = "nick_name")
    private String nickName;
    @JsonProperty(value = "display_name")
    private String displayName;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "email_verified")
    private boolean emailVerified;
    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "last_name")
    private String lastName;
    @JsonProperty(value = "timezone")
    private String timezone;
    @JsonProperty(value = "photos")
    private SalesforceUserPhotos photos;
    @JsonProperty(value = "addr_street")
    private String addrStreet;
    @JsonProperty(value = "addr_city")
    private String addrCity;
    @JsonProperty(value = "addr_state")
    private String addrState;
    @JsonProperty(value = "addr_country")
    private String addrCountry;
    @JsonProperty(value = "addr_zip")
    private String addrZip;
    @JsonProperty(value = "mobile_phone")
    private String mobilePhone;
    @JsonProperty(value = "mobile_phone_verified")
    private boolean mobilePhoneVerified;
    @JsonProperty(value = "status")
    private SalesforceUserStatus status;
    @JsonProperty(value = "urls")
    private SalesforceUserUrls urls;
    @JsonProperty(value = "active")
    private boolean active;
    @JsonProperty(value = "user_type")
    private String userType;
    @JsonProperty(value = "language")
    private String language;
    @JsonProperty(value = "locale")
    private String locale;
    @JsonProperty(value = "utcOffset")
    private long utcOffset;
    @JsonProperty(value = "last_modified_date")
    private String lastModifiedDate;
    @JsonProperty(value = "is_app_installed")
    private boolean isAppInstalled;
    @JsonProperty(value = "role")
    private String role;
	@JsonProperty(value = "is_lightning_login_user")
	private boolean isLightningLoginUser;

    @JsonProperty(value = "salesforceToken")
    private SalesforceToken salesforceToken;

    @JsonProperty(value = "caliberUser")
    private Trainer caliberUser;
    
    /**
     * Instantiates a new Salesforce user.
     */
    public SalesforceUser() {
    	super();
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isAssertedUser() {
		return assertedUser;
	}

	public void setAssertedUser(boolean assertedUser) {
		this.assertedUser = assertedUser;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public SalesforceUserPhotos getPhotos() {
		return photos;
	}

	public void setPhotos(SalesforceUserPhotos photos) {
		this.photos = photos;
	}

	public String getAddrStreet() {
		return addrStreet;
	}

	public void setAddrStreet(String addrStreet) {
		this.addrStreet = addrStreet;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrState() {
		return addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	public String getAddrCountry() {
		return addrCountry;
	}

	public void setAddrCountry(String addrCountry) {
		this.addrCountry = addrCountry;
	}

	public String getAddrZip() {
		return addrZip;
	}

	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public boolean isMobilePhoneVerified() {
		return mobilePhoneVerified;
	}

	public void setMobilePhoneVerified(boolean mobilePhoneVerified) {
		this.mobilePhoneVerified = mobilePhoneVerified;
	}

	public SalesforceUserStatus getStatus() {
		return status;
	}

	public void setStatus(SalesforceUserStatus status) {
		this.status = status;
	}

	public SalesforceUserUrls getUrls() {
		return urls;
	}

	public void setUrls(SalesforceUserUrls urls) {
		this.urls = urls;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public long getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(long utcOffset) {
		this.utcOffset = utcOffset;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public boolean isAppInstalled() {
		return isAppInstalled;
	}

	public void setAppInstalled(boolean isAppInstalled) {
		this.isAppInstalled = isAppInstalled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isLightningLoginUser() {
		return isLightningLoginUser;
	}

	public void setLightningLoginUser(boolean isLightningLoginUser) {
		this.isLightningLoginUser = isLightningLoginUser;
	}

	public SalesforceToken getSalesforceToken() {
		return salesforceToken;
	}

	public void setSalesforceToken(SalesforceToken salesforceToken) {
		this.salesforceToken = salesforceToken;
	}

	public Trainer getCaliberUser() {
		return caliberUser;
	}

	public void setCaliberUser(Trainer caliberUser) {
		this.caliberUser = caliberUser;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
        return username;
    }

    public String getPassword() {
        return null;
    }

    public boolean isAccountNonExpired() {
        return false;
    }

    public boolean isAccountNonLocked() {
        return false;
    }

    public boolean isCredentialsNonExpired() {
        return false;
    }

    public boolean isEnabled() {
        return true;
    }

    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(this.role));
        return authorities;
    }

    @Override
    public String toString() {
        return "SalesforceUser{" +
                "id='" + id + '\'' +
                ", asserted_user=" + assertedUser +
                ", user_id='" + userId + '\'' +
                ", organization_id='" + organizationId + '\'' +
                ", username='" + username + '\'' +
                ", nick_name='" + nickName + '\'' +
                ", display_name='" + displayName + '\'' +
                ", email='" + email + '\'' +
                ", email_verified=" + emailVerified +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", timezone='" + timezone + '\'' +
                ", photos=" + photos +
                ", addr_street='" + addrStreet + '\'' +
                ", addr_city='" + addrCity + '\'' +
                ", addr_state='" + addrState + '\'' +
                ", addr_country='" + addrCountry + '\'' +
                ", addr_zip='" + addrZip + '\'' +
                ", mobile_phone='" + mobilePhone + '\'' +
                ", mobile_phone_verified=" + mobilePhoneVerified +
                ", status=" + status +
                ", urls=" + urls +
                ", active=" + active +
                ", user_type='" + userType + '\'' +
                ", language='" + language + '\'' +
                ", locale='" + locale + '\'' +
                ", utcOffset=" + utcOffset +
                ", last_modified_date='" + lastModifiedDate + '\'' +
                ", is_app_installed=" + isAppInstalled +
                ", role='" + role + '\'' +
                ", salesforceToken=" + salesforceToken +
                '}';
    }
}
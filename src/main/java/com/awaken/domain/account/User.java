package com.awaken.domain.account;

import java.util.Set;

/**
 * App User Info
 */
public class User {

    private Principal principal;

    private Set<Credential> credentials;

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Set<Credential> getCredentials() {
        return credentials;
    }

    public void setCredentials(Set<Credential> credentials) {
        this.credentials = credentials;
    }
}

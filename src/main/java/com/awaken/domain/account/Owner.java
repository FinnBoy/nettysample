package com.awaken.domain.account;

import com.awaken.domain.community.org.Organization;

import java.util.Set;

public abstract class Owner {

    private Organization organization;

    private Set<Role> roles;

    private Level level;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

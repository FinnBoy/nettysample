package com.awaken.domain.account;

import com.awaken.domain.community.Company;

import java.util.Set;

public abstract class Owner {

    private Company company;

    private Set<Role> roles;

    private Level level;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

package com.awaken.domain.account;

import java.util.Set;

public abstract class Owner {

    private Set<Role> roles;

    private Level level;

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

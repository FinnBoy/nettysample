package com.awaken.domain.account;

import java.util.Set;

public class Group extends Owner {

    private Set<Principal> principals;

    public Set<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(Set<Principal> principals) {
        this.principals = principals;
    }
}

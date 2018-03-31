package com.awaken.domain.account;

import java.util.Set;

/**
 * 组
 */
public class Group extends Owner {

    /**
     * 人员
     */
    private Set<Principal> principals;

    public Set<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(Set<Principal> principals) {
        this.principals = principals;
    }
}

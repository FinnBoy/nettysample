package com.awaken.domain.account;

import java.util.Set;

public class Organization {

    private Set<Principal> principals;

    private Set<Organization> subordinates;

    private Organization superior;

    public Set<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(Set<Principal> principals) {
        this.principals = principals;
    }

    public Set<Organization> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Set<Organization> subordinates) {
        this.subordinates = subordinates;
    }

    public Organization getSuperior() {
        return superior;
    }

    public void setSuperior(Organization superior) {
        this.superior = superior;
    }
}

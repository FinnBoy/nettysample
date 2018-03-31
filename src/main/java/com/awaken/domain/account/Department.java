package com.awaken.domain.account;

import java.util.Set;

public class Department extends Owner {

    private Set<Principal> principals;

    private Set<Department> subordinates;

    private Department superior;

    public Set<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(Set<Principal> principals) {
        this.principals = principals;
    }

    public Set<Department> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Set<Department> subordinates) {
        this.subordinates = subordinates;
    }

    public Department getSuperior() {
        return superior;
    }

    public void setSuperior(Department superior) {
        this.superior = superior;
    }
}

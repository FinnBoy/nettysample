package com.awaken.domain.account;

import java.util.Set;

/**
 * 部门
 */
public class Department extends Owner {

    /**
     * 人员
     */
    private Set<Principal> principals;

    /**
     * 下级部门
     */
    private Set<Department> subordinates;

    /**
     * 上级部门
     */
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

package com.awaken.domain.account;

import java.util.Set;

/**
 * 当事人
 */
public class Principal extends Owner {

    private Department department;

    private Set<Department> adjunctDepts;

    private Set<Group> groups;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Department> getAdjunctDepts() {
        return adjunctDepts;
    }

    public void setAdjunctDepts(Set<Department> adjunctDepts) {
        this.adjunctDepts = adjunctDepts;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }
}

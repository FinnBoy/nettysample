package com.awaken.domain.account;

import java.util.Set;

public class Principal extends Owner {

    private Organization organization;

    private Set<Organization> adjunctOrganizations;

    private Set<Group> groups;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Set<Organization> getAdjunctOrganizations() {
        return adjunctOrganizations;
    }

    public void setAdjunctOrganizations(Set<Organization> adjunctOrganizations) {
        this.adjunctOrganizations = adjunctOrganizations;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }
}

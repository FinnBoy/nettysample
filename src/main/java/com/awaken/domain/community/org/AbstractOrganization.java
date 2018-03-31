package com.awaken.domain.community.org;

import com.awaken.domain.community.Location;

import java.util.Set;

/**
 * 组织
 */
public abstract class AbstractOrganization implements Organization {

    /**
     * 类型
     */
    private Integer form;

    /**
     * 地点
     */
    private Set<Location> locations;

    public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }
}

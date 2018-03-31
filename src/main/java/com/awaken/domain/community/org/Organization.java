package com.awaken.domain.community.org;

import com.awaken.domain.community.Location;

import java.util.Set;

public interface Organization {

    Integer getForm();

    void setForm(Integer form);

    Set<Location> getLocations();

    void setLocations(Set<Location> locations);
}

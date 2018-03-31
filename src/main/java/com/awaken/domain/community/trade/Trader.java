package com.awaken.domain.community.trade;

import com.awaken.domain.community.Location;
import com.awaken.domain.community.biz.Business;

/**
 * Transaction Owner
 */
public class Trader {

    private Business business;

    private Location location;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

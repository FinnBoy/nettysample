package com.awaken.domain.warehouse;

import java.util.Set;

/**
 * 平台
 */
public class Platform {

    private Warehouse warehouse;

    private Set<Station> stations;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Set<Station> getStations() {
        return stations;
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }
}

package com.awaken.domain.product;

import java.util.Set;

public class CompositeSku {

    private Set<Component> components;

    public Set<Component> getComponents() {
        return components;
    }

    public void setComponents(Set<Component> components) {
        this.components = components;
    }
}

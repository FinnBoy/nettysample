package com.awaken.domain.document;

import java.util.Set;

public abstract class Document<T extends Item> {

    private Set<T> items;

    public Set<T> getItems() {
        return items;
    }

    public void setItems(Set<T> items) {
        this.items = items;
    }
}

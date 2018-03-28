package com.awaken.domain.document;

import java.util.Set;

public interface Document<T extends Item> {

    Set<T> getItems();

    void setItems(Set<T> items);
}

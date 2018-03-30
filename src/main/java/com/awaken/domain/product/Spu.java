package com.awaken.domain.product;

import java.util.Set;

/**
 * Standard Product Unit
 * <p>例：iPhone7</p>
 */
public class Spu {

    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

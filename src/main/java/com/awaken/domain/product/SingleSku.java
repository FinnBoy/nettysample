package com.awaken.domain.product;

/**
 * 单 Product 品项.
 */
public class SingleSku extends Sku {

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package com.awaken.domain.product;

import com.awaken.domain.community.org.Organization;
import com.awaken.domain.strategy.Category;

import java.util.Set;

/**
 * 产品（商品）
 * <p>例：A公司/A企业/A店铺卖的iPhone7</p>
 */
public class Product {

    private Category category;

    private Organization organization;

    private Set<Sku> skus;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Set<Sku> getSkus() {
        return skus;
    }

    public void setSkus(Set<Sku> skus) {
        this.skus = skus;
    }
}

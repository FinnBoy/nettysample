package com.awaken.domain.product;

import com.awaken.domain.community.org.Organization;

import java.util.Set;

/**
 * 产品（商品）
 * <p>例：A公司/A企业/A店铺卖的iPhone7</p>
 */
public class Product {

    private Organization organization;

    private Set<Sku> skus;

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

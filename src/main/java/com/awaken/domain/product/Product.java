package com.awaken.domain.product;

import com.awaken.domain.community.Company;

import java.util.Set;

/**
 * 产品（商品）
 * <p>例：A公司/A企业/A店铺卖的iPhone7</p>
 */
public class Product {

    private Company company;

    private Set<Sku> skus;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<Sku> getSkus() {
        return skus;
    }

    public void setSkus(Set<Sku> skus) {
        this.skus = skus;
    }
}

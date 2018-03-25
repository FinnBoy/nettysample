package com.awaken.domain.strategy;

/**
 * 分类
 */
public class Category {

    /**
     * 分类
     */
    private Integer sort;

    /**
     * 分类描述
     */
    private String description;

    /**
     * 可作为特性使用
     */
    private Boolean featured;

    /**
     * 分类项
     */
    private Integer item;

    /**
     * 项名
     */
    private String name;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

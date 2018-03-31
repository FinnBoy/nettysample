package com.awaken.domain.strategy;

/**
 * 分类
 */
public class Category {

    /**
     * 上级分类
     * <p>
     * when {@link Division} is Product or Warehouse, this value will be not empty.
     * </p>
     */
    private Category superior;

    /**
     * 大划分
     *
     * @see Division
     */
    private Integer division;

    /**
     * 分类
     * <p>
     * when {@link Division} is Product or Warehouse, can choose {@link Scale} as sort value.
     * </p>
     *
     * @see Scale
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

    public Category getSuperior() {
        return superior;
    }

    public void setSuperior(Category superior) {
        this.superior = superior;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

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

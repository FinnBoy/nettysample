package com.awaken.domain.common;

import java.util.Set;

/**
 * 特性
 */
public class Feature {

    /**
     * 分类(warehouse, product, order, etc.)
     */
    private Integer division;

    /**
     * 分类描述
     */
    private String description;

    /**
     * 包含的同类特性
     */
    private Set<Feature> inclusions;

    /**
     * 互斥的同类特性
     */
    private Set<Feature> repulsions;

    /**
     * 特性
     */
    private Category item;

    /**
     * 特性项
     */
    private Integer number;

    /**
     * 特性名
     */
    private String name;

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Feature> getInclusions() {
        return inclusions;
    }

    public void setInclusions(Set<Feature> inclusions) {
        this.inclusions = inclusions;
    }

    public Set<Feature> getRepulsions() {
        return repulsions;
    }

    public void setRepulsions(Set<Feature> repulsions) {
        this.repulsions = repulsions;
    }

    public Category getItem() {
        return item;
    }

    public void setItem(Category item) {
        this.item = item;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.awaken.domain.strategy;

import java.util.Set;

/**
 * 特性
 */
public interface Feature {

    /**
     * get 包含特性
     *
     * @return
     */
    Set<Feature> getInclusions();

    /**
     * set 包含特性
     *
     * @param inclusions
     */
    void setInclusions(Set<Feature> inclusions);

    /**
     * get 互斥特性
     *
     * @return
     */
    Set<Feature> getRepulsions();

    /**
     * set 互斥特性
     *
     * @param repulsions
     */
    void setRepulsions(Set<Feature> repulsions);

    /**
     * get 类别
     *
     * @return division
     */
    Integer getDivision();

    /**
     * set 类别
     *
     * @param division
     */
    void setDivision(Integer division);

    /**
     * get code number
     *
     * @return code number
     */
    Integer getCode();

    /**
     * set code number
     *
     * @param code
     */
    void setCode(Integer code);

    /**
     * Prototype is category or not.
     *
     * @return
     */
    Boolean isCategoryItem();
}

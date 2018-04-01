package com.awaken.domain.strategy;

/**
 * 类别
 */
public interface Category {

    /**
     * get superior scale code
     *
     * @return superior
     */
    Category getSuperior();

    /**
     * set superior scale code
     *
     * @param superior
     */
    void setSuperior(Category superior);

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
     * get 规模等级
     *
     * @return
     */
    Integer getScale();

    /**
     * set 规模等级
     *
     * @param scale
     */
    void setScale(Integer scale);

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
     * whether set as feature.
     *
     * @return
     */
    Boolean isFeature();
}

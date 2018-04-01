package com.awaken.domain.strategy;

/**
 * 规模等级
 */
public enum Scale {

    /**
     * 一级
     */
    PRIMARY(101),
    /**
     * 二级
     */
    SECONDARY(102),
    /**
     * 三级
     */
    TERTIARY(103),
    /**
     * 四级
     */
    QUATERNARY(104),
    /**
     * 精细
     */
    ELABORATE(105);

    private Integer value;

    private Scale(Integer value) {
        this.value = value;
    }

    public Integer num() {
        return this.value;
    }

    public boolean judge(Integer value) {
        return value == null ? false : this.value.intValue() == value.intValue();
    }
}

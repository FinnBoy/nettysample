package com.awaken.domain.cargo;

/**
 * 批次
 * <p>需要有拆批功能，及自动隐性拆批</p>
 */
public class Batch extends Cargo {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

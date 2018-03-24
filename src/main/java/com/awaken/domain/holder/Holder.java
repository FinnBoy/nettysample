package com.awaken.domain.holder;

import com.awaken.domain.cargo.Cargo;

import java.util.Set;

/**
 * 货物所有权
 */
public abstract class Holder {

    private Set<Cargo> cargoes;

    public Set<Cargo> getCargoes() {
        return cargoes;
    }

    public void setCargoes(Set<Cargo> cargoes) {
        this.cargoes = cargoes;
    }
}

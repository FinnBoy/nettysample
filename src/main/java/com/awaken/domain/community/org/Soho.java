package com.awaken.domain.community.org;

import com.awaken.domain.account.Principal;

/**
 * Self-employed people
 */
public class Soho extends Organization {

    private Principal principal;

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}

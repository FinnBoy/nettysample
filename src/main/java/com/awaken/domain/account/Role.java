package com.awaken.domain.account;

import java.util.Set;

public class Role {

    private Set<Permission> permissions;

    /**
     * 依赖的角色（拥有当前角色的前提：必须先行拥有依赖角色）
     * <p>禁止互相依赖造成死循环</p>
     */
    private Set<Role> dependencies;

    /**
     * 包含的角色
     */
    private Set<Role> inclusions;

    /**
     * 被当前角色继承的祖先角色
     */
    private Role ancestor;

    /**
     * 互斥角色
     */
    private Role repulsion;

    /**
     * 角色可被分配的配额
     */
    private Integer quota;

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Role> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Set<Role> dependencies) {
        this.dependencies = dependencies;
    }

    public Set<Role> getInclusions() {
        return inclusions;
    }

    public void setInclusions(Set<Role> inclusions) {
        this.inclusions = inclusions;
    }

    public Role getAncestor() {
        return ancestor;
    }

    public void setAncestor(Role ancestor) {
        this.ancestor = ancestor;
    }

    public Role getRepulsion() {
        return repulsion;
    }

    public void setRepulsion(Role repulsion) {
        this.repulsion = repulsion;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }
}

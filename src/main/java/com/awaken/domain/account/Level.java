package com.awaken.domain.account;

public class Level {

    /**
     * Groups, Departments, Principals.
     */
    private Integer partition;

    private Integer grade;

    private Integer roleQuota;

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getRoleQuota() {
        return roleQuota;
    }

    public void setRoleQuota(Integer roleQuota) {
        this.roleQuota = roleQuota;
    }
}

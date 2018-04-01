package com.awaken.domain.strategy;

public class Dictionary {

    /**
     * @see Classification
     */
    private Integer classification;

    private String classificationDesc;

    /**
     * @see Division
     */
    private Integer division;

    private String divisionDesc;

    /**
     * {@link Classification} must be Category,
     * {@link Division} must be Product or Warehouse,
     * then see {@link Scale}.
     *
     * @see Scale
     */
    private Integer sort;

    private String sortDesc;

    /**
     * 分类项
     */
    private Integer code;

    /**
     * 项名
     */
    private String name;

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getClassificationDesc() {
        return classificationDesc;
    }

    public void setClassificationDesc(String classificationDesc) {
        this.classificationDesc = classificationDesc;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public String getDivisionDesc() {
        return divisionDesc;
    }

    public void setDivisionDesc(String divisionDesc) {
        this.divisionDesc = divisionDesc;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSortDesc() {
        return sortDesc;
    }

    public void setSortDesc(String sortDesc) {
        this.sortDesc = sortDesc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

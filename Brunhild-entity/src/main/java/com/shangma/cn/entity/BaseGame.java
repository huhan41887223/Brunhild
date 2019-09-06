package com.shangma.cn.entity;

public class BaseGame {
    private Integer baseId;

    private String baseCode;

    private Integer baseType;

    private String baseName;

    private String baseContent;



    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode == null ? null : baseCode.trim();
    }

    public Integer getBaseType() {
        return baseType;
    }

    public void setBaseType(Integer baseType) {
        this.baseType = baseType;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
    }

    public String getBaseContent() {
        return baseContent;
    }

    public void setBaseContent(String baseContent) {
        this.baseContent = baseContent == null ? null : baseContent.trim();
    }
}
package com.zking.P2PLoan.admin.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * create by CSQ on 2019-12-15
 */
public class SysrightModel  {

    private String rightCode;

    private String rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    private List<SysrightModel> childrens = new ArrayList<>();

    public List<SysrightModel> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<SysrightModel> childrens) {
        this.childrens = childrens;
    }

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(String rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysrightModel that = (SysrightModel) o;
        return Objects.equals(rightCode, that.rightCode) &&
                Objects.equals(rightParentCode, that.rightParentCode) &&
                Objects.equals(rightType, that.rightType) &&
                Objects.equals(rightText, that.rightText) &&
                Objects.equals(rightUrl, that.rightUrl) &&
                Objects.equals(rightTip, that.rightTip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rightCode, rightParentCode, rightType, rightText, rightUrl, rightTip);
    }
}

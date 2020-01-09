package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * 实名认证的类
 * create by CSQ on 2019-12-24
 */
@ToString
public class RealauthModel {
    private Integer id;
    private String realname;
    private Byte sex;
    private String bornDate;
    private String idNumber;
    private String address;
    private Byte state;
    private String image1;
    private String image2;
    private String remark;
    private Date auditTime;
    private Date applyTime;
    private Integer auditorId;
    private Integer applierId;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Integer getApplierId() {
        return applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealauthModel that = (RealauthModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(realname, that.realname) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(bornDate, that.bornDate) &&
                Objects.equals(idNumber, that.idNumber) &&
                Objects.equals(address, that.address) &&
                Objects.equals(state, that.state) &&
                Objects.equals(image1, that.image1) &&
                Objects.equals(image2, that.image2) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, realname, sex, bornDate, idNumber, address, state, image1, image2, remark, auditTime, applyTime, auditorId, applierId);
    }
}

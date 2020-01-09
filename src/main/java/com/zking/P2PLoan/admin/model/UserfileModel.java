package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * create by CSQ on 2019-12-24
 */
@ToString
public class UserfileModel {
    private Integer id;
    private Byte state;
    private String remark;
    private Timestamp auditTime;
    private Timestamp applyTime;
    private Integer auditorId;
    private Integer applierId;
    private Byte score;
    private String file;
    private Integer filetypeId;
    private String image;

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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    public Timestamp getApplyTime() {
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

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Integer filetypeId) {
        this.filetypeId = filetypeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserfileModel that = (UserfileModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(score, that.score) &&
                Objects.equals(file, that.file) &&
                Objects.equals(filetypeId, that.filetypeId) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, remark, auditTime, applyTime, auditorId, applierId, score, file, filetypeId, image);
    }
}

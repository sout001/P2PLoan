package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.util.Objects;

/**
 * create by CSQ on 2019-12-22
 */
@ToString
public class UserinfoModel {
    private Long id;
    private Integer version;
    private Long bitState;
    private String realName;
    private Integer score;
    private Long realAuthId;
    private String idNumber;
    private String phoneNumber;
    private Long incomeGradeId;
    private Long marriageId;
    private Long kidCountId;
    private Long educationBackgroundId;
    private Long houseConditionId;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getBitState() {
        return bitState;
    }

    public void setBitState(Long bitState) {
        this.bitState = bitState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getRealAuthId() {
        return realAuthId;
    }

    public void setRealAuthId(Long realAuthId) {
        this.realAuthId = realAuthId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getIncomeGradeId() {
        return incomeGradeId;
    }

    public void setIncomeGradeId(Long incomeGradeId) {
        this.incomeGradeId = incomeGradeId;
    }

    public Long getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Long marriageId) {
        this.marriageId = marriageId;
    }

    public Long getKidCountId() {
        return kidCountId;
    }

    public void setKidCountId(Long kidCountId) {
        this.kidCountId = kidCountId;
    }

    public Long getEducationBackgroundId() {
        return educationBackgroundId;
    }

    public void setEducationBackgroundId(Long educationBackgroundId) {
        this.educationBackgroundId = educationBackgroundId;
    }

    public Long getHouseConditionId() {
        return houseConditionId;
    }

    public void setHouseConditionId(Long houseConditionId) {
        this.houseConditionId = houseConditionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserinfoModel that = (UserinfoModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(bitState, that.bitState) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(score, that.score) &&
                Objects.equals(realAuthId, that.realAuthId) &&
                Objects.equals(idNumber, that.idNumber) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(incomeGradeId, that.incomeGradeId) &&
                Objects.equals(marriageId, that.marriageId) &&
                Objects.equals(kidCountId, that.kidCountId) &&
                Objects.equals(educationBackgroundId, that.educationBackgroundId) &&
                Objects.equals(houseConditionId, that.houseConditionId) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, bitState, realName, score, realAuthId, idNumber, phoneNumber, incomeGradeId, marriageId, kidCountId, educationBackgroundId, houseConditionId, email);
    }
}

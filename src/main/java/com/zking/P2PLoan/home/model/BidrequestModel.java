package com.zking.P2PLoan.home.model;

import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 借款模型
 * create by CSQ on 2020-01-06
 */
@ToString
public class BidrequestModel {
    private Integer id;
    private Integer version;
    private Integer returnType;
    private Byte bidRequestType;
    private Byte bidRequestState;
    private BigDecimal bidRequestAmount;
    private BigDecimal currentRate;
    private Byte monthes2Return;
    private Integer bidCount;
    private BigDecimal totalRewardAmount;
    private BigDecimal currentSum;
    private String title;
    private String description;
    private String note;
    private Date disableDate;
    private Integer createuserId;
    private Byte disableDays;
    private BigDecimal minBidAmount;
    private Date applyTime;
    private Date publishTime;

    /**
     * 一个借款可以对应多个标
     */
    private List<BidModel> bids = new ArrayList<>();

    public List<BidModel> getBids() {
        return bids;
    }

    public void setBids(List<BidModel> bids) {
        this.bids = bids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Byte getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Byte bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Byte getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Byte bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    public BigDecimal getBidRequestAmount() {
        return bidRequestAmount;
    }

    public void setBidRequestAmount(BigDecimal bidRequestAmount) {
        this.bidRequestAmount = bidRequestAmount;
    }

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(BigDecimal currentRate) {
        this.currentRate = currentRate;
    }

    public Byte getMonthes2Return() {
        return monthes2Return;
    }

    public void setMonthes2Return(Byte monthes2Return) {
        this.monthes2Return = monthes2Return;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public BigDecimal getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(BigDecimal totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(BigDecimal currentSum) {
        this.currentSum = currentSum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Date disableDate) {
        this.disableDate = disableDate;
    }

    public Integer getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Integer createuserId) {
        this.createuserId = createuserId;
    }

    public Byte getDisableDays() {
        return disableDays;
    }

    public void setDisableDays(Byte disableDays) {
        this.disableDays = disableDays;
    }

    public BigDecimal getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(BigDecimal minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BidrequestModel that = (BidrequestModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bidRequestType, that.bidRequestType) &&
                Objects.equals(bidRequestState, that.bidRequestState) &&
                Objects.equals(bidRequestAmount, that.bidRequestAmount) &&
                Objects.equals(currentRate, that.currentRate) &&
                Objects.equals(monthes2Return, that.monthes2Return) &&
                Objects.equals(bidCount, that.bidCount) &&
                Objects.equals(totalRewardAmount, that.totalRewardAmount) &&
                Objects.equals(currentSum, that.currentSum) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(note, that.note) &&
                Objects.equals(disableDate, that.disableDate) &&
                Objects.equals(createuserId, that.createuserId) &&
                Objects.equals(disableDays, that.disableDays) &&
                Objects.equals(minBidAmount, that.minBidAmount) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(publishTime, that.publishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, returnType, bidRequestType, bidRequestState, bidRequestAmount, currentRate, monthes2Return, bidCount, totalRewardAmount, currentSum, title, description, note, disableDate, createuserId, disableDays, minBidAmount, applyTime, publishTime);
    }
}

package com.zking.P2PLoan.home.model;

import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * 投标模型
 * create by CSQ on 2020-01-06
 */
@ToString
public class BidModel {
    private Integer id;
    private BigDecimal actualRate;
    private BigDecimal availableAmount;
    private Integer bidrequestId;
    private Integer bidUserId;
    private Date bidTime;
    private String bidRequestTitle;
    private Integer bidRequestState;

    private BidrequestModel bidrequestModel;

    public BidrequestModel getBidrequestModel() {
        return bidrequestModel;
    }

    public void setBidrequestModel(BidrequestModel bidrequestModel) {
        this.bidrequestModel = bidrequestModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getActualRate() {
        return actualRate;
    }

    public void setActualRate(BigDecimal actualRate) {
        this.actualRate = actualRate;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Integer getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Integer bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Integer getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(Integer bidUserId) {
        this.bidUserId = bidUserId;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BidModel bidModel = (BidModel) o;
        return Objects.equals(id, bidModel.id) &&
                Objects.equals(actualRate, bidModel.actualRate) &&
                Objects.equals(availableAmount, bidModel.availableAmount) &&
                Objects.equals(bidrequestId, bidModel.bidrequestId) &&
                Objects.equals(bidUserId, bidModel.bidUserId) &&
                Objects.equals(bidTime, bidModel.bidTime) &&
                Objects.equals(bidRequestTitle, bidModel.bidRequestTitle) &&
                Objects.equals(bidRequestState, bidModel.bidRequestState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actualRate, availableAmount, bidrequestId, bidUserId, bidTime, bidRequestTitle, bidRequestState);
    }
}

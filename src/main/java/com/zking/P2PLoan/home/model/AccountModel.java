package com.zking.P2PLoan.home.model;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * create by CSQ on 2020-01-06
 */
@ToString
public class AccountModel {
    private Integer id;
    private String tradePassword;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;
    private Integer version;
    private BigDecimal unReceiveInterest;
    private BigDecimal unReceivePrincipal;
    private BigDecimal unReturnAmount;
    private BigDecimal remainBorrowLimit;
    private BigDecimal borrowLimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUnReceiveInterest() {
        return unReceiveInterest;
    }

    public void setUnReceiveInterest(BigDecimal unReceiveInterest) {
        this.unReceiveInterest = unReceiveInterest;
    }

    public BigDecimal getUnReceivePrincipal() {
        return unReceivePrincipal;
    }

    public void setUnReceivePrincipal(BigDecimal unReceivePrincipal) {
        this.unReceivePrincipal = unReceivePrincipal;
    }

    public BigDecimal getUnReturnAmount() {
        return unReturnAmount;
    }

    public void setUnReturnAmount(BigDecimal unReturnAmount) {
        this.unReturnAmount = unReturnAmount;
    }

    public BigDecimal getRemainBorrowLimit() {
        return remainBorrowLimit;
    }

    public void setRemainBorrowLimit(BigDecimal remainBorrowLimit) {
        this.remainBorrowLimit = remainBorrowLimit;
    }

    public BigDecimal getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(BigDecimal borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountModel that = (AccountModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tradePassword, that.tradePassword) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount) &&
                Objects.equals(version, that.version) &&
                Objects.equals(unReceiveInterest, that.unReceiveInterest) &&
                Objects.equals(unReceivePrincipal, that.unReceivePrincipal) &&
                Objects.equals(unReturnAmount, that.unReturnAmount) &&
                Objects.equals(remainBorrowLimit, that.remainBorrowLimit) &&
                Objects.equals(borrowLimit, that.borrowLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tradePassword, usableAmount, freezedAmount, version, unReceiveInterest, unReceivePrincipal, unReturnAmount, remainBorrowLimit, borrowLimit);
    }
}

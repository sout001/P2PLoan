package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.util.Date;
import java.util.Objects;

/**
 * create by CSQ on 2019-12-16
 */
@ToString
public class IplogModel {

    private Integer id;

    private String ip;

    private Byte state;

    private String username;

    private Integer logininfoid;

    private Byte userType;

    private Date logintime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Integer logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IplogModel that = (IplogModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(state, that.state) &&
                Objects.equals(username, that.username) &&
                Objects.equals(logininfoid, that.logininfoid) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(logintime, that.logintime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, state, username, logininfoid, userType, logintime);
    }
}

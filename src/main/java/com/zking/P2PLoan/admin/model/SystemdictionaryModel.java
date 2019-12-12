package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * create by CSQ on 2019-12-12
 */
@ToString(exclude = "items")
public class SystemdictionaryModel {

    private Integer id;

    private String sn;

    private String title;

    private String intro;

    private List<SystemdictionaryitemModel> items = new ArrayList<>();

    public List<SystemdictionaryitemModel> getItems() {
        return items;
    }

    public void setItem(List<SystemdictionaryitemModel> items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemdictionaryModel that = (SystemdictionaryModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sn, that.sn) &&
                Objects.equals(title, that.title) &&
                Objects.equals(intro, that.intro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sn, title, intro);
    }
}

package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.util.Objects;

/**
 * create by CSQ on 2019-12-12
 */
@ToString
public class SystemdictionaryitemModel {
    private Integer id;
    private Integer parentId;
    private String title;
    private String tvalue;
    private Byte sequence;
    private String intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTvalue() {
        return tvalue;
    }

    public void setTvalue(String tvalue) {
        this.tvalue = tvalue;
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
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
        SystemdictionaryitemModel that = (SystemdictionaryitemModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(tvalue, that.tvalue) &&
                Objects.equals(sequence, that.sequence) &&
                Objects.equals(intro, that.intro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, title, tvalue, sequence, intro);
    }
}

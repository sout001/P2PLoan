package com.zking.P2PLoan.admin.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * create by CSQ on 2019-12-18
 */
@ToString
public class SysrightModel {

    private Integer id;

    private String nodeName;

    private String nodeUrl;

    private String nodeIcon;

    private String nodeType;

    private String nodeDesc;

    private Integer parentId;

    private List<SysrightModel> chilidren;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }



    public List<SysrightModel> getChilidren() {
        return chilidren;
    }

    public void setChilidren(List<SysrightModel> chilidren) {
        this.chilidren = chilidren;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeUrl() {
        return nodeUrl;
    }

    public void setNodeUrl(String nodeUrl) {
        this.nodeUrl = nodeUrl;
    }

    public String getNodeIcon() {
        return nodeIcon;
    }

    public void setNodeIcon(String nodeIcon) {
        this.nodeIcon = nodeIcon;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysrightModel that = (SysrightModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nodeName, that.nodeName) &&
                Objects.equals(nodeUrl, that.nodeUrl) &&
                Objects.equals(nodeIcon, that.nodeIcon) &&
                Objects.equals(nodeType, that.nodeType) &&
                Objects.equals(nodeDesc, that.nodeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeName, nodeUrl, nodeIcon, nodeType, nodeDesc);
    }
}

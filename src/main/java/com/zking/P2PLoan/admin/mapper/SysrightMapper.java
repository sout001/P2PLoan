package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.SysrightModel;

import java.util.List;

/**
 * create by CSQ on 2019-12-18
 */
public interface SysrightMapper {

    /**
     * 查询父级节点
     * @return
     */
    List<SysrightModel> getNodeTree();


    /**
     * 查询子级节点
     * @param id
     * @return
     */
    List<SysrightModel> listChild(int id);

}

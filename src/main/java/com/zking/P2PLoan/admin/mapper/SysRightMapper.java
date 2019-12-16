package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.SysrightModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create by CSQ on 2019-12-15
 */
public interface SysRightMapper {

    /**
     * 通过权限代码获取菜单
     * @param rightParentCode
     * @return
     */
    List<SysrightModel> menuByCode(@Param("rightParentCode") String rightParentCode);
}

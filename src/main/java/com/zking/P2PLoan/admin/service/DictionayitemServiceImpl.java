package com.zking.P2PLoan.admin.service;

import com.github.pagehelper.PageHelper;
import com.zking.P2PLoan.admin.mapper.DictionayitemMapper;
import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import com.zking.P2PLoan.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by CSQ on 2019-12-19
 */
@Service
public class DictionayitemServiceImpl implements DictionayitemService {

    @Resource
    private DictionayitemMapper dictionayitemMapper;

    /**
     * 模糊查询的方法
     * @param pageBean
     * @param systemdictionaryitemModel
     * @return
     */
    @Override
    public List<SystemdictionaryitemModel> getItemList(PageBean pageBean,SystemdictionaryitemModel systemdictionaryitemModel){
        if(pageBean!=null && pageBean.isPagination()){
            //设置的分页参数最终是保持在线程绑定变量中
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        return dictionayitemMapper.itemByParentId(systemdictionaryitemModel);
    }

    /**
     * 添加数据字典明细的方法
     * @param systemdictionaryitemModel 对象
     * @return 受影响的行数
     */
    @Override
    public int addItem(SystemdictionaryitemModel systemdictionaryitemModel){
        return dictionayitemMapper.addItem(systemdictionaryitemModel);
    }

    /**
     * 删除数据字典明细的方法
     * @param id 要删除的id
     * @return 受影响的行数
     */
    @Override
    public int delItem(int id){
        return dictionayitemMapper.delItem(id);
    }

    /**
     * 修改数据字典的方法
     * @param systemdictionaryitemModel 对象
     * @return 受影响的行数
     */
    @Override
    public int update(SystemdictionaryitemModel systemdictionaryitemModel){
        return dictionayitemMapper.updateItem(systemdictionaryitemModel);
    }

}

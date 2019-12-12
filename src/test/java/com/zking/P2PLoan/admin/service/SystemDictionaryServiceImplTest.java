package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-12
 */
public class SystemDictionaryServiceImplTest extends BaseTest{

    @Resource
    private SystemDictionaryService dictionaryService;

    @Test
    public void list() {
        Map<String,Object> ParamMap = new HashMap<>();
        ParamMap.put("title","月收入");
        List<SystemdictionaryModel> list = dictionaryService.list(ParamMap);
        for (SystemdictionaryModel s : list){
            System.out.println(s);
            System.out.println("------------------");
            for (SystemdictionaryitemModel i : s.getItems()){
                System.out.println(i);
            }
        }
    }
}
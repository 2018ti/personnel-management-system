package com.pms.service.MybatisService;


import com.pms.mapper.AccessmentMapper;
import com.pms.po.Accessment;
import com.pms.po.AccessmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessService {

    @Autowired
    AccessmentMapper accessmentMapper;

    AccessmentExample accessmentExample=new AccessmentExample();

    public List<String> showAllAccessment(){
        List<Accessment> accessments = accessmentMapper.selectByExample(accessmentExample);
        List<String> list=new ArrayList<>();
        for (Accessment accessment:accessments){
            list.add(accessment.getA_name());
        }

        return list;
    }

    public String getAccessnameById(int id){
        Accessment accessment = accessmentMapper.selectByPrimaryKey(id);
        if (accessment!=null){
            return accessment.getA_name();
        }
        return null;
    }

    public Integer selectIdByName(String name){
        accessmentExample.createCriteria().andA_nameEqualTo(name);
        List<Accessment> accessments = accessmentMapper.selectByExample(accessmentExample);
        if (accessments!=null){
            return accessments.get(0).getA_id();
        }
        return null;
    }
}
package com.pms.service.MybatisService;


import com.pms.mapper.ManagerMapper;
import com.pms.po.Manager;
import com.pms.po.ManagerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    ManagerExample managerExample=new ManagerExample();

    public Manager selectByPrimaryId(int id){
        return managerMapper.selectByPrimaryKey(id);
    }

    public Manager selectByName(String name){
        managerExample.createCriteria().andU_nameEqualTo(name);
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        Manager manager=null;
        if (managers!=null && managers.size()!=0){
            manager=managers.get(0);
        }
        return manager;
    }

    public Integer selectIdByName(String name){
        managerExample.createCriteria().andU_nameEqualTo(name);
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        if (managers!=null && managers.size()!=0){
            return managers.get(0).getU_id();
        }
        return null;
    }
}

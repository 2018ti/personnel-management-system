package com.pms.service.MybatisService;


import com.pms.mapper.EmpwariningMapper;
import com.pms.po.Empwarining;
import com.pms.po.EmpwariningExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpwarningService {

    @Autowired
    EmpwariningMapper empwarningMapper;

    EmpwariningExample empwariningExample=new EmpwariningExample();

    public Empwarining selectById(int id){
        return empwarningMapper.selectByPrimaryKey(id);
    }

    public void update(Empwarining empwarining){
        empwarningMapper.updateByPrimaryKeySelective(empwarining);
    }

    public void insert(Empwarining empwarining){
        empwarningMapper.insert(empwarining);
    }

}

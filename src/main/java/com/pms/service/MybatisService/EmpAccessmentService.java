package com.pms.service.MybatisService;



import com.pms.mapper.empAccessMapper;
import com.pms.po.empAccess;
import com.pms.po.empAccessExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpAccessmentService {

    @Autowired
    empAccessMapper empAccessMapper;


    empAccessExample empAccessExample=new empAccessExample();

    public void insert(empAccess empAccess){
        empAccessMapper.insertSelective(empAccess);
    }

    public List<empAccess> selectByEmpId(int id){
        empAccessExample.createCriteria().andE_idEqualTo(id);
        List<empAccess> empAccesses = empAccessMapper.selectByExample(empAccessExample);
        return empAccesses;
    }

    public void update(empAccess empAccess){
        empAccessMapper.updateByPrimaryKey(empAccess);
    }

    /**
     * @param empId 员工id
     * @param accessId 考核id
     * @param date 考核时间
     * @return
     */
    public empAccess selectByPrimaryKey(int empId, int accessId, Date date){
        empAccessExample.createCriteria().andE_idEqualTo(empId).andA_idEqualTo(accessId).andAccess_dateEqualTo(date);
        List<empAccess> empAccesses = empAccessMapper.selectByExample(empAccessExample);
        if (empAccesses!=null && empAccesses.size()!=0){
            return empAccesses.get(0);
        }
        return null;
    }

    public void insertList(List<empAccess> list){
        for (empAccess access:list){
            empAccessMapper.insertSelective(access);
        }
    }

}

package com.pms.service.MybatisService;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pms.mapper.EmployeeMapper;
import com.pms.po.Employee;
import com.pms.po.EmployeeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    EmployeeExample employeeExample=new EmployeeExample();

    public Employee selectByEId(int id){
        employeeExample.createCriteria().andE_idEqualTo(id);
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        return employees.get(0);
    }

    public Integer selectIdByName(String name){
        employeeExample.createCriteria().andE_nameEqualTo(name);
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);

        if (employees!=null && employees.size()!=0){
            return employees.get(0).getE_id();
        }
        return null;
    }

    public void updateEmp(Employee employee){
        employeeExample.createCriteria().andE_idEqualTo(employee.getE_id());
        employeeMapper.updateByExample(employee,employeeExample);
    }


    public PageInfo listAll(int pagenum,int pagesize){
        PageHelper.startPage(pagenum,pagesize);
        List<Employee> employees=employeeMapper.selectByExample(employeeExample);
        PageInfo pageInfo=new PageInfo(employees);
        return pageInfo;
    }

    public void insertEmp(Employee employee){
        employeeMapper.insertSelective(employee);
    }







}

package com.pms.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pms.mapper.EmployeeMapper;
import com.pms.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
* @description: 员工管理
*
* @author: 梁山
*
* @date: 2019年11月23日
**/
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;


   public List<Employee> listAll(){
       List<Employee> employees = employeeMapper.listAll();
       return employees;
   }


}

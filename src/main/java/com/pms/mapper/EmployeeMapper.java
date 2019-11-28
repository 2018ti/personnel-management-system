package com.pms.mapper;

import com.pms.po.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer eId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> listAll();
}
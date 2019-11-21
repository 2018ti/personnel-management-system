package com.pms.mapper;

import com.pms.po.Salary;

public interface SalaryMapper {
    int insert(Salary record);

    int insertSelective(Salary record);
}
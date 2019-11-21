package com.pms.mapper;

import com.pms.po.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}
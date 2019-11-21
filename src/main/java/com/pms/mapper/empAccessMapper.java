package com.pms.mapper;

import com.pms.po.empAccess;
import com.pms.po.empAccessKey;

public interface empAccessMapper {
    int deleteByPrimaryKey(empAccessKey key);

    int insert(empAccess record);

    int insertSelective(empAccess record);

    empAccess selectByPrimaryKey(empAccessKey key);

    int updateByPrimaryKeySelective(empAccess record);

    int updateByPrimaryKey(empAccess record);
}
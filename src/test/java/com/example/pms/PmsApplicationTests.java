package com.example.pms;

import com.github.pagehelper.PageInfo;
import com.pms.PersonnelManagementSystemApplication;
import com.pms.mapper.EmployeeMapper;
import com.pms.mapper.ManagerMapper;
import com.pms.po.Manager;
import com.pms.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PersonnelManagementSystemApplication.class})
public class PmsApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test1(){
        System.out.println(employeeMapper.listAll());
    }

}

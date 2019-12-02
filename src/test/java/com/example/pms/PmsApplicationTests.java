package com.example.pms;

import com.github.pagehelper.PageInfo;
import com.pms.PersonnelManagementSystemApplication;
import com.pms.dto.EmployeeTestResult;
import com.pms.mapper.EmpwariningMapper;
import com.pms.po.Employee;
import com.pms.po.Empwarining;
import com.pms.po.empAccess;
import com.pms.service.MybatisService.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PersonnelManagementSystemApplication.class})
public class PmsApplicationTests {

    @Autowired
    ManagerService managerService;

    @Autowired
    AccessService accessService;

    @Autowired
    EmpAccessmentService empAccessmentService;

    @Autowired
    MapperUtils mapperUtils;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmpwariningMapper empwarningMapper;


    @Test
    public void test07(){
        Empwarining empwarining = empwarningMapper.selectByPrimaryKey(1);
        empwarining.setWarning_times(2);
        empwarningMapper.updateByPrimaryKey(empwarining);
//        System.out.println(empwarining);
    }

    @Test
    public void contextLoads() {
        Employee employee = employeeService.selectByEId(1);
        System.out.println(employee.getE_name());
//        System.out.println(employeeService);
    }

    @Test
    public void test01(){
//        System.out.println(accessService.getAccessnameById(1));
        List<empAccess> empAccesses = empAccessmentService.selectByEmpId(1);
        for (empAccess accesses:empAccesses){
            System.out.println(accesses.getE_id());
        }
    }

    @Test
    public void test02(){
        List<String> accessments = accessService.showAllAccessment();
        if (accessments!=null){
            System.out.println(accessments);
        }
    }

    @Test
    public void test03(){
        EmployeeTestResult result=new EmployeeTestResult("Marry","70","70","90",null,"Lancer");
//        mapperUtils.insertAttendScore(1,70,2);
        mapperUtils.insertScore(result);
    }

    @Test
    public void test04(){
        List<empAccess> list=new ArrayList<>();
        empAccess access1=new empAccess();
        access1.setE_id(1);
        access1.setAccess_date(new Date());
        access1.setA_id(1);
        access1.setManager_id(2);
        access1.setScore(70.0);

        empAccess access2=new empAccess();
        access2.setScore(80.0);
        access2.setE_id(1);
        access2.setA_id(2);
        access2.setAccess_date(new Date());
        access2.setManager_id(2);

        list.add(access1);
        list.add(access2);
        empAccessmentService.insertList(list);
    }

    @Test
    public void test05(){
        Employee employee = employeeService.selectByEId(1);
        employee.setE_firewarning("警告");
        employeeService.updateEmp(employee);
    }

    @Test
    public void test06(){
        PageInfo pageInfo=employeeService.listAll(1,2);

    }
}

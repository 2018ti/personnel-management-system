package com.pms.controller;

import com.github.pagehelper.PageInfo;
import com.pms.po.Employee;
import com.pms.response.ResponseData;
import com.pms.service.MybatisService.EmployeeService;
import com.pms.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/listAll")
    public ResponseData listAll(@RequestParam(defaultValue = "1")int pagenum,@RequestParam(defaultValue = "5") int pagesize){
        PageInfo pageInfo = employeeService.listAll(pagenum, pagesize);

        return ResponseUtil.buildSuccess(pageInfo);
    }

    @RequestMapping("/update")
    public ResponseData updateEmp(@RequestParam("Employee")Employee employee){
        employeeService.updateEmp(employee);
        return ResponseUtil.buildSuccess();
    }

    @RequestMapping("/insert")
    public ResponseData insertEmp(@RequestParam("Employee")Employee employee){
        employeeService.insertEmp(employee);
        return ResponseUtil.buildSuccess();
    }


}

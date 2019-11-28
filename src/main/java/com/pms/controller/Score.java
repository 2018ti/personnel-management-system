package com.pms.controller;



import com.pms.dto.EmployeeTestResult;
import com.pms.service.MybatisService.AccessService;
import com.pms.service.MybatisService.EmpAccessmentService;
import com.pms.service.MybatisService.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Score {

    @Autowired
    AccessService accessService;

    @Autowired
    EmpAccessmentService empAccessmentService;

    @Autowired
    MapperUtils mapperUtils;

    @RequestMapping("/giveScore")
    public void score(@ModelAttribute EmployeeTestResult employeeTestResult){
        mapperUtils.insertScore(employeeTestResult);
    }

    @RequestMapping("/showallAccessment")
    public List<String> showAllAccessment(){
        return accessService.showAllAccessment();
    }
}

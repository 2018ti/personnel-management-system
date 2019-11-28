package com.pms.service.MybatisService;


import com.pms.dto.EmployeeTestResult;
import com.pms.po.Employee;
import com.pms.po.Empwarining;
import com.pms.po.empAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MapperUtils {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmpAccessmentService empAccessmentService;

    @Autowired
    AccessService accessService;

    @Autowired
    ManagerService managerService;

    @Autowired
    EmpwarningService empwarningService;

    public void insertScore(EmployeeTestResult result){
        List<empAccess> list = getList(result);
        empAccessmentService.insertList(list);
    }

    public void givewarning(int empId,boolean isPass){

        Empwarining empwarining = empwarningService.selectById(empId);
        int warningTimes=empwarining.getWarning_times();

        if (warningTimes>=3){
            Employee employee = employeeService.selectByEId(empId);
            employee.setE_firewarning("警告");
            employeeService.updateEmp(employee);
        }
        else if (isPass){
            if (empwarining.getWarning_times()!=0){
                empwarining.setWarning_times(0);
                empwarningService.update(empwarining);
            }
        }

        else {
            empwarining.setWarning_times(warningTimes+1);
            empwarningService.update(empwarining);
        }

    }

    private List<empAccess> getList(EmployeeTestResult result){
        Integer empId = employeeService.selectIdByName(result.getName());
        Integer managerId = managerService.selectIdByName(result.getManagerName());

        double attendenceScore = Double.parseDouble(result.getAttendenceScore());
        double performScore = Double.parseDouble(result.getPerformScore());
        double benefitScore = Double.parseDouble(result.getBenefitScore());

        givewarning(empId,isPass(attendenceScore,performScore,benefitScore));

        List<empAccess> list = getList(empId, managerId, attendenceScore, performScore, benefitScore);
        return list;
    }

    public boolean isPass(double attendScore,double performScore,double benefitScore){
        int base=60;
        int size=3;
        if ((attendScore+performScore+benefitScore/size)<base){
            return false;
        }else {
            return true;
        }
    }


    public empAccess getempAccess(int empId, int accessId, int managerId,double score,Date date){
        empAccess empAccess=new empAccess();
        empAccess.setE_id(empId);
        empAccess.setScore(score);
        empAccess.setA_id(accessId);
        empAccess.setAccess_date(date);
        empAccess.setManager_id(managerId);
        return empAccess;
    }

    private List<empAccess> getList(int empId,int managerId,double attendenceScore,double performScore,double benefitScore){
        List<empAccess> list=new ArrayList<>();
        list.add(getempAccess(empId,1,managerId ,attendenceScore,new Date()));
        list.add(getempAccess(empId,2,managerId,performScore,new Date()));
        list.add(getempAccess(empId,3,managerId,performScore,new Date()));
        return list;
    }
}

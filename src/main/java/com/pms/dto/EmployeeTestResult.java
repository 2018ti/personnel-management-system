package com.pms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class EmployeeTestResult {

    private String name;
    private String attendenceScore;
    private String performScore;
    private String benefitScore;
    private Date date;
    private String managerName;
}

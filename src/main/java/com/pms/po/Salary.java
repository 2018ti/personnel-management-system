package com.pms.po;

import lombok.Data;

import java.util.Date;

@Data
public class Salary {
    private Integer eId;

    private Double attendanceSalary;

    private Double achievementSalary;

    private Double benefitSalary;

    private Double sSalary;

    private Date sDate;

}
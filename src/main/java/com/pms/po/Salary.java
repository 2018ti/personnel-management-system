package com.pms.po;

import java.util.Date;

public class Salary {
    private Integer eId;

    private Double attendanceSalary;

    private Double achievementSalary;

    private Double benefitSalary;

    private Double sSalary;

    private Date sDate;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Double getAttendanceSalary() {
        return attendanceSalary;
    }

    public void setAttendanceSalary(Double attendanceSalary) {
        this.attendanceSalary = attendanceSalary;
    }

    public Double getAchievementSalary() {
        return achievementSalary;
    }

    public void setAchievementSalary(Double achievementSalary) {
        this.achievementSalary = achievementSalary;
    }

    public Double getBenefitSalary() {
        return benefitSalary;
    }

    public void setBenefitSalary(Double benefitSalary) {
        this.benefitSalary = benefitSalary;
    }

    public Double getsSalary() {
        return sSalary;
    }

    public void setsSalary(Double sSalary) {
        this.sSalary = sSalary;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }
}
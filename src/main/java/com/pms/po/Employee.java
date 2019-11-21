package com.pms.po;

import java.util.Date;

public class Employee {
    private Integer eId;

    private String eName;

    private String eSex;

    private Date eBirthday;

    private Date eEntrydate;

    private Integer eDepartmentid;

    private Integer eSalarylevel;

    private String eFirewarning;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex == null ? null : eSex.trim();
    }

    public Date geteBirthday() {
        return eBirthday;
    }

    public void seteBirthday(Date eBirthday) {
        this.eBirthday = eBirthday;
    }

    public Date geteEntrydate() {
        return eEntrydate;
    }

    public void seteEntrydate(Date eEntrydate) {
        this.eEntrydate = eEntrydate;
    }

    public Integer geteDepartmentid() {
        return eDepartmentid;
    }

    public void seteDepartmentid(Integer eDepartmentid) {
        this.eDepartmentid = eDepartmentid;
    }

    public Integer geteSalarylevel() {
        return eSalarylevel;
    }

    public void seteSalarylevel(Integer eSalarylevel) {
        this.eSalarylevel = eSalarylevel;
    }

    public String geteFirewarning() {
        return eFirewarning;
    }

    public void seteFirewarning(String eFirewarning) {
        this.eFirewarning = eFirewarning == null ? null : eFirewarning.trim();
    }
}
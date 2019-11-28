package com.pms.po;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Integer eId;

    private String eName;

    private String eSex;

    private Date eBirthday;

    private Date eEntrydate;

    private Integer eDepartmentid;

    private Integer eSalarylevel;

    private String eFirewarning;

}
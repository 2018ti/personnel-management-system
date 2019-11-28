package com.pms.po;

import lombok.Data;

import java.util.Date;

@Data
public class empAccessKey {
    private Integer eId;

    private Integer aId;

    private Date accessDate;
}
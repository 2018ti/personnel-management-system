package com.pms.po;

import lombok.Data;

@Data
public class empAccess extends empAccessKey {
    private Double score;

    private Integer managerId;

}
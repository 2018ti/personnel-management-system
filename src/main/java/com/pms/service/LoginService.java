package com.pms.service;

import com.pms.mapper.ManagerMapper;
import com.pms.po.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService  {

    @Autowired
    private ManagerMapper managerMapper;

    public Manager checkLogin(String name, String password) {
        return null;
    }

    public Manager checkName(String name) {
        return null;
    }
}

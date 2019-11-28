package com.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Test {

    @RequestMapping("test")
    @ResponseBody
    public List<Integer> testException(){
        int i=9/0;
        return new ArrayList<>();
    }
}

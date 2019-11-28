package com.pms.interceptor;


import com.pms.po.Manager;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Manager manager=(Manager) request.getSession().getAttribute("manager");
        if(manager==null){
            response.sendRedirect("login.html");
            return false;
        }else if(manager.getUCategory().equals("系统管理员")){
            response.sendRedirect("/page/system-manager.html");
            return true;
        }else if(manager.getUCategory().equals("员工管理")){
            response.sendRedirect("/page/employeeManage.html");
            return true;
        }else if(manager.getUCategory().equals("人事考核")){
            response.sendRedirect("/page/personnel-assessment.html");
            return true;
        }else
            response.sendRedirect("/page/salaryManage.html");
            return true;
    }
}

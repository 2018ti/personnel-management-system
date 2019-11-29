package com.pms.controller;


import com.pms.response.ResponseBo;
import com.pms.utils.CodeUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Login {


    @GetMapping("/")
    public String toLogin(){
        return "login1";
    }


    //注意这里需要加上@ResponseBody注解来返回Json数据
    @PostMapping("/login")
    @ResponseBody
    public ResponseBo postlogin(String username, String password, HttpServletRequest request){

        if (!CodeUtil.checkVerifyCode(request)) {
//            request.setAttribute("codeErr", "验证码有误!");
            return ResponseBo.error("验证码错误");
        }

        System.out.println(username+" "+password);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);

        try {
            subject.login(token);
            return ResponseBo.ok();
        } catch (UnknownAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return ResponseBo.error(e.getMessage());
        } catch (LockedAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (AuthenticationException e) {
            return ResponseBo.error("认证失败！");
        }
    }

    @RequestMapping("/success")
    public String success(){

        return "success";
    }



}

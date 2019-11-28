package com.pms.handler;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*
* @description: Controller异常处理器
*
* @author: 梁山
*
* @date: 2019年11月21日 20:17:28
**/
@ControllerAdvice
public class ControllerExceptionHandler  {

    @ExceptionHandler(Exception.class)
    public ModelAndView defultExcepitonHandler(Exception e,HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error");
        return modelAndView;
    }
}

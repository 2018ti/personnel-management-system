package com.pms.handler;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
*
* @description: Controller异常处理器
*
* @author: 梁山
*
* @date: 2019年11月21日 20:17:28
**/
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHander(HttpServletRequest request, Exception e) throws Exception {

        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("/error");
        return mv;
    }

}

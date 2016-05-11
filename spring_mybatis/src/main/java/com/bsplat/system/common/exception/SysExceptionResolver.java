package com.bsplat.system.common.exception;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExceptionResolver implements HandlerExceptionResolver{
	 
    

    /**

     * 处理异常跳转

     */
@Override
public ModelAndView resolveException(HttpServletRequest request,  HttpServletResponse response, Object handler, Exception ex) {  

//        log.error("异常: "+handler.toString(), ex);
        ex.printStackTrace();
//        log.info("msg="+ex.getCause());
        ModelAndView modelAndView =  new ModelAndView("/exception").addObject("exception",ex);

          return modelAndView;  

}  

}

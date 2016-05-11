package com.zjs.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zjs.common.domain.User;
import com.zjs.common.service.IUserService;


@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;   
	
	@RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.selectByPrimaryKey(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  

}

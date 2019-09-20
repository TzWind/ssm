package com.how2java.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("login")
	public String login(String name) {
		
		return "login";
	}
	
	@RequestMapping("register")
	public String register(String name) {
		
		return "register";
	}
	
	
	

}

package com.how2java.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="log_in",method = RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) {
		
		//if(username!=null&&username!=""&&password!=null&&password!="") {
			//if(username.equals("admin")&&password.equals("admin")) {
			//if(username=="admin"&&password=="admin") { 不能用==
		
		HttpSession session = request.getSession();
		if(categoryService.queryUser(username) != null) {
			if(categoryService.queryUser(username).getPassword().equals(password)) {
				
				session.setAttribute("info","登录成功，欢迎"+username);
				//System.out.print("登录成功，欢迎"+username);
				return "index";
			}else {
				session.setAttribute("info","密码错误，请重新输入！");
				//System.out.print("密码错误，请重新输入！");
				return "login";
			}
		}else {
			session.setAttribute("info","没有这个用户，请注册！");
			//System.out.print("没有这个用户，请注册！");
			return "login";
		}
		
		
	}
	
	
	

}

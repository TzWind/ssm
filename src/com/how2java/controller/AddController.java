package com.how2java.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Controller
@RequestMapping("")
public class AddController {
	@Autowired
	CategoryService categoryService;
	
	//后台取值方法1
	@RequestMapping("addData")
	public String addData(String name) {
		if(name!=null) {
			Category c=new Category();
			c.setName(name);
			int count= categoryService.addData(c);
		}
		return "addData";
	}
	
	//后台取值方法2
//	@RequestMapping("addData")
//	public String addData(HttpServletRequest request) {
//		if(name!=null) {
//			Category c=new Category();
//			c.setName(name);
//			int count= categoryService.addData(c);
//		}
//		return "addData";
//	}
	
	
//	public ModelAndView addData(HttpServletRequest request){
//		ModelAndView mav = new ModelAndView();
//		
//		Category c=new Category();
//		c.setName(request.getParameter("name"));
//		int count= categoryService.addData(c);
//		
//		mav.addObject("count", count);
//		//mav.setViewName("showData");
//		return mav;
//	}

}

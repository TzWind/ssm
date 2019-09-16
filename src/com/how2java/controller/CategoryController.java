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
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("showData")
	public ModelAndView showData(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		
		mav.addObject("cs", cs);
		mav.setViewName("showData");
		return mav;
	}

}

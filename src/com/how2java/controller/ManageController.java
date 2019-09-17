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
public class ManageController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("manageData")
	public String manageData() {
		
		return "manageData";
	}
	
	//ÐÞ¸Ä
	@RequestMapping("modify")
	public String modifyData(String id,String name) {
		if(id!=null&&id!="") {
			Category c=new Category();
			c.setId(Integer.parseInt(id));
			c.setName(name);
			categoryService.modifyData(c);
		}
		return "manageData";
	}
	
	//É¾³ý
		@RequestMapping("delete")
		public String deleteData(String id) {
			if(id!=null&&id!="") {
				categoryService.deleteData(Integer.parseInt(id));
			}
			return "manageData";
		}
	
	@RequestMapping("show2")
	public ModelAndView showData(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		
		mav.addObject("cs", cs);
		mav.setViewName("showData");
		return mav;
	}
	
	

}

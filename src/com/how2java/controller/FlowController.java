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
public class FlowController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("dingdanzhongxin")
	public String dingdanzhongxin(String name) {
		
		return "dingdanzhongxin";
	}
	
	@RequestMapping("gouwuche")
	public String gouwuche(String name) {
		
		return "gouwuche";
	}
	
	@RequestMapping("index")
	public String index(String name) {
		
		return "index";
	}
	
	@RequestMapping("liebiao")
	public String liebiao(String name) {
		
		return "liebiao";
	}
	@RequestMapping("self_info")
	public String self_info(String name) {
		
		return "self_info";
	}
	@RequestMapping("xiangqing")
	public String xiangqing(String name) {
		
		return "xiangqing";
	}
	
	

}

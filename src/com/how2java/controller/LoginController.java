package com.how2java.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.how2java.pojo.User;
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
	
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public String regist(String username,String password,String repassword,String tel,HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(username!=null&&username!=""&&password!=null&&password!=""&&repassword!=null&&repassword!=""&&tel!=null&&tel!=""){
		
			if(password.equals(repassword)) {
				//这里需要new？
				User user=new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setTelphone(tel);
				categoryService.userAdd(user);
				return "login";
				
			}else {
				session.setAttribute("registinfo", "两次密码不相同！");
				return "register";
			}
		}else {
			session.setAttribute("registinfo", "内容不能为空");
			return "register";
		}
	}
	
	
	

}

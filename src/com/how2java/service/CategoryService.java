package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.pojo.User;

public interface CategoryService {

	List<Category> list();
	
	int  addData(Category c);
	
	void deleteData(int id);
	
	void modifyData(Category c);
	
	Category queryData(int id);
	
	User queryUser(String username) ;
	
	int userAdd(User user);
	
 
}

package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.User;
import com.how2java.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


	@Override
	public int addData(Category c) {
		
//		Category c1=new Category();
//		c1.setName("test");
		return categoryMapper.add(c);
	}


	@Override
	public void deleteData(int id) {
		categoryMapper.delete(id);
	}


	@Override
	public void modifyData(Category c) {
		categoryMapper.update(c);
	}


	@Override
	public Category queryData(int id) {
		return categoryMapper.get(id);
	}


	@Override
	public User queryUser(String username) {
		
		return categoryMapper.queryuser(username);
	}


	@Override
	public int userAdd(User user) {
		
		return categoryMapper.useradd(user);
	}

}

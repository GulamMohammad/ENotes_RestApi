package com.path.becoder.service;

import java.util.List;

import com.path.becoder.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(Category category);
	public List<Category> getAllCategory();

}

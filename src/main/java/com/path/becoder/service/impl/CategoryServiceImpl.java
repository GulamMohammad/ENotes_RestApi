package com.path.becoder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.path.becoder.repository.CategoryRepository;
import com.path.becoder.entity.Category;
import com.path.becoder.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;

	@Override
	public Boolean saveCategory(Category category) {
		category.setIsDeleted(false);
		category = categoryRepo.save(category);
		
		if(ObjectUtils.isEmpty(category)) {
			return false;
		}
		
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}

}

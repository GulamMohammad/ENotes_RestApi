package com.path.becoder.controller;

import org.springframework.web.bind.annotation.RestController;

import com.path.becoder.entity.Category;
import com.path.becoder.service.CategoryService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
	
	private CategoryService categoryService;
	
	@PostMapping("/saveCategory")
	public ResponseEntity<?> saveCategory(@RequestBody Category category){
		
		Boolean saveCategory = categoryService.saveCategory(category);
		if(saveCategory) {
			return new ResponseEntity<>("Save Success",HttpStatus.CREATED);
		}
		return new ResponseEntity<>("Not Saved",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	public ResponseEntity<?> getAllCategory(){
		
		List<Category> allCategory = categoryService.getAllCategory();
		
		if(CollectionUtils.isEmpty(allCategory)) {
			return ResponseEntity.noContent().build();
		}else {
			return new ResponseEntity<>(allCategory,HttpStatus.OK);
		}
	}

}

package com.path.becoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.path.becoder.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	

}

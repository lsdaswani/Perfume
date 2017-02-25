package com.perfume.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfume.daoimpl.CategoryDaoImpl;
import com.perfume.entity.Category;

@Service
@Transactional
public class CategoryServiceImpl{

	@Autowired
	private CategoryDaoImpl categoryDaoImpl;
	
	public void setCategoryDao(CategoryDaoImpl categoryDaoImpl) {
		this.categoryDaoImpl = categoryDaoImpl;
	}
	
	public void addCategory(Category category) {
		
		this.categoryDaoImpl.addCategory(category);
	}

	public void updateCategory(Category category) {
		
		this.categoryDaoImpl.updateCategory(category);
	}

	
	public List<Category> listCategorys() {
		
		return this.categoryDaoImpl.listCategorys();
		
	}
	
	public Category getCategoryById(int categoryId) {
	
		return this.categoryDaoImpl.getCategoryById(categoryId);
	}

	public void deleteCategory(int categoryId) {
		
		this.categoryDaoImpl.deleteCategory(categoryId);
	}
	
	public Category getCategoryByName(String category) 
	{
		 return categoryDaoImpl.getCategoryByName(category);
	}
}

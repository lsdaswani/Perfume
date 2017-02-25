package com.perfume.dao;
import java.util.List;

import com.perfume.entity.Category;

public interface CategoryDao {
	
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public List<Category> listCategorys();
	public Category getCategoryById(int categoryId);
	public void deleteCategory(int categoryId);
	public Category getCategoryByName(String category);
	
}

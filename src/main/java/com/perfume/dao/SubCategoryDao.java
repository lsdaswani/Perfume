package com.perfume.dao;

import java.util.List;

import com.perfume.entity.SubCategory;

public interface SubCategoryDao {

	public void addSubCategory(SubCategory sc);
	public void updateSubCategory(SubCategory usc);
	public List<SubCategory> listSubCategorys();
	//public SubCategory getSubCategoryById(int scid);
	public void removeSubCategory(SubCategory rsc);
	public SubCategory getSubCategoryByName(String subCategoryName);
}

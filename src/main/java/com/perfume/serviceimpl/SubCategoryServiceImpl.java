package com.perfume.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfume.daoimpl.SubCategoryDaoImpl;
import com.perfume.entity.SubCategory;

@Service

public class SubCategoryServiceImpl {

	@Autowired
	private SubCategoryDaoImpl subCategoryDaoImpl;

	@Transactional
	public void setCategoryDao(SubCategoryDaoImpl subCategoryDaoImpl) {
		this.subCategoryDaoImpl = subCategoryDaoImpl;
	}

	@Transactional
	public void addSubCategory(SubCategory sc) {

		this.subCategoryDaoImpl.addSubCategory(sc);
	}

	@Transactional
	public void updateSubCategory(SubCategory sc) {

		this.subCategoryDaoImpl.updateSubCategory(sc);
	}

	@Transactional
	public List<SubCategory> listSubCategorys() {

		return this.subCategoryDaoImpl.listSubCategorys();

	}

	/*
	 * @Transactional public SubCategory getSubCategoryById(int scid) {
	 * 
	 * return this.subCategoryDaoImpl.getSubCategoryById(scid); }
	 */

	@Transactional
	public void removeSubCategory(SubCategory rsc) {

		this.subCategoryDaoImpl.removeSubCategory(rsc);
	}
	
	@Transactional
	public SubCategory getSubCategoryByName(String subCategoryName) {
		return subCategoryDaoImpl.getSubCategoryByName(subCategoryName);
	}
}

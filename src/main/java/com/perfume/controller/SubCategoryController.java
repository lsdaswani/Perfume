package com.perfume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perfume.entity.Category;
import com.perfume.entity.SubCategory;
import com.perfume.serviceimpl.CategoryServiceImpl;
import com.perfume.serviceimpl.SubCategoryServiceImpl;

@Controller

public class SubCategoryController {

	@Autowired
	SubCategoryServiceImpl subCategoryServiceImpl;
	@Autowired
	CategoryServiceImpl categoryServiceImpl;

	@RequestMapping("/subcategory")
	public String getSubCategory(Model model) {

		model.addAttribute("subcategory", new SubCategory());
		model.addAttribute("category", new Category());
		model.addAttribute("subcategorylist", subCategoryServiceImpl.listSubCategorys());
		model.addAttribute("categorylist", categoryServiceImpl.listCategorys());
		return "SubCategoryForm";
	}

	@RequestMapping("/addsubcategory")
	@Transactional
	public String addSubCategory(@ModelAttribute("subcategory") SubCategory subcategory) {
		Category category = categoryServiceImpl.getCategoryByName(subcategory.getCategory().getCategoryName());
		categoryServiceImpl.addCategory(category);
		subcategory.setCategory(category);
		subcategory.setCategoryId(category.getCategoryId());
		subCategoryServiceImpl.addSubCategory(subcategory);
		return "redirect:/subcategory";
	}

	@RequestMapping("/updatesubcategory")
	public String updateSubCategory(@ModelAttribute("subcategory") SubCategory subcategory) {
		subCategoryServiceImpl.updateSubCategory(subcategory);

		return "redirect:/subcategory";
	}

	/*
	 * @RequestMapping("/getsubcategorybyid") public String
	 * getSubCategoryById(@ModelAttribute("subcategory") SubCategory
	 * subcategory) {
	 * subCategoryServiceImpl.getSubCategoryById(subcategory.getSubCategoryId())
	 * ;
	 * 
	 * return "redirect:/subcategory"; }
	 */

	@RequestMapping("/removesubcategory")
	public String removeCategory(@ModelAttribute("subcategory") SubCategory subcategory) {
		subCategoryServiceImpl.removeSubCategory(subcategory);

		return "redirect:/subcategory";
	}

}

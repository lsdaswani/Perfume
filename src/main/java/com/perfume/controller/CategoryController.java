package com.perfume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.perfume.entity.Category;
import com.perfume.serviceimpl.CategoryServiceImpl;
@Controller
public class CategoryController {
	@Autowired
	CategoryServiceImpl categoryServiceImpl;
	
	@RequestMapping("/category")
	public String getCategory(Model model) {

		model.addAttribute("category",new Category());
		model.addAttribute("categorylist", categoryServiceImpl.listCategorys());
		
		return "CategoryForm";
	}
	
	@RequestMapping("/addcategory")
	public String addCategory(@ModelAttribute("category") Category category) {
		categoryServiceImpl.addCategory(category);
	
		return "redirect:/category";
	}

	@RequestMapping("updateCategory-{categoryId}")
	public String updateCategory(@PathVariable("categoryId") int categoryId, Model model)
	{
		model.addAttribute("category",categoryServiceImpl.getCategoryById(categoryId));
		return "CategoryForm";
	}
	
	/*@RequestMapping("/getcategorybyid")
	public String getCategoryById(@ModelAttribute("category") Category category) {
		categoryServiceImpl.getCategoryById(category.getCategoryId());
		
		return "redirect:/category";
	}*/
	
	@RequestMapping("/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId") int categoryId) {
		categoryServiceImpl.deleteCategory(categoryId);
		
		return "redirect:/category";
	}
	
	

}

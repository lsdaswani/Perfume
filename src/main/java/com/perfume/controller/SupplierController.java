package com.perfume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perfume.entity.Supplier;
import com.perfume.serviceimpl.SupplierServiceImpl;

@Controller
public class SupplierController {
	@Autowired
	SupplierServiceImpl supplierServiceImpl;
	
	@RequestMapping("/supplier")
	public String getSupplier(Model model) {

		model.addAttribute("supplier",new Supplier());
		model.addAttribute("supplierlist", supplierServiceImpl.listSuppliers());
		
		return "SupplierForm";
	}
	
	@RequestMapping("/addsupplier")
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierServiceImpl.addSupplier(supplier);
	
		return "redirect:/supplier";
	}

	@RequestMapping("/updatesupplier")
	public String updateSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierServiceImpl.updateSupplier(supplier);
		
		return "redirect:/supplier";
	}
	
	/*@RequestMapping("/getcategorybyid")
	public String getCategoryById(@ModelAttribute("category") Category category) {
		categoryServiceImpl.getCategoryById(category.getCategoryId());
		
		return "redirect:/category";
	}*/
	
	@RequestMapping("/removesupplier")
	public String removeSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierServiceImpl.removeSupplier(supplier);
		
		return "redirect:/supplier";
	}


}

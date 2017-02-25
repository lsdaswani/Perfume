package com.perfume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perfume.entity.Category;
import com.perfume.entity.Product;
import com.perfume.entity.SubCategory;
import com.perfume.entity.Supplier;
import com.perfume.serviceimpl.CategoryServiceImpl;
import com.perfume.serviceimpl.ProductServiceImpl;
import com.perfume.serviceimpl.SubCategoryServiceImpl;
import com.perfume.serviceimpl.SupplierServiceImpl;
@Controller
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	@Autowired
	CategoryServiceImpl categoryServiceImpl;
	@Autowired
	SubCategoryServiceImpl subCategoryServiceImpl;
	@Autowired
	SupplierServiceImpl supplierServiceImpl;
	
	@RequestMapping("/product")
	public String getProduct(Model model) {

		model.addAttribute("product",new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("subCategory",new SubCategory());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productlist", productServiceImpl.listProducts());
		model.addAttribute("categorylist",categoryServiceImpl.listCategorys());
		model.addAttribute("subcategorylist",subCategoryServiceImpl.listSubCategorys());
		model.addAttribute("supplierlist", supplierServiceImpl.listSuppliers());
		return "ProductForm";
	}
	
	@RequestMapping("/addproduct")
	@Transactional
	public String addProduct(@ModelAttribute("product") Product product) {
	
		Category category=categoryServiceImpl.getCategoryByName(product.getCategory().getCategoryName());
		categoryServiceImpl.addCategory(category);
		product.setCategory(category);
		product.setCategoryId(category.getCategoryId());
		
		SubCategory subCategory=subCategoryServiceImpl.getSubCategoryByName(product.getSubCategory().getSubCategoryName());
		subCategoryServiceImpl.addSubCategory(subCategory);
		product.setSubCategory(subCategory);
		product.setSubCategoryId(subCategory.getSubCategoryId());
		
		Supplier supplier = supplierServiceImpl.getSupplierByName(product.getSupplier().getSupplierName());
		supplierServiceImpl.addSupplier(supplier);
		product.setSupplier(supplier);
		product.setSupplierId(supplier.getSupplierId());
		productServiceImpl.addProduct(product);
		
		return "redirect:/product";
	}

	@RequestMapping("/updateproduct")
	public String updateProduct(@ModelAttribute("product") Product product) {
		productServiceImpl.updateProduct(product);
		
		return "redirect:/product";
	}
	
	/*@RequestMapping("/getproductbyid")
	public String getProductById(@ModelAttribute("supplier") Supplier supplier) {
		productServiceImpl.getProductById(supplier.getSupplierId());
		
		return "redirect:/supplier";
	}*/
	
	@RequestMapping("/removeproduct")
	public String removeProduct(@ModelAttribute("product") Product product) {
		productServiceImpl.removeProduct(product);
		
		return "redirect:/product";
	}

}

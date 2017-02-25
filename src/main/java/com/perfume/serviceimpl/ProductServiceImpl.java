package com.perfume.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.perfume.daoimpl.ProductDaoImpl;
import com.perfume.entity.Product;

@Service
@Transactional
public class ProductServiceImpl {
	
	@Autowired
	private ProductDaoImpl productDaoImpl;
	
	public void setProductDao(ProductDaoImpl productDaoImpl) {
		this.productDaoImpl = productDaoImpl;
	}

	public void addProduct(Product p) {

		this.productDaoImpl.addProduct(p);
	}

	
	public void updateProduct(Product up) {

		this.productDaoImpl.updateProduct(up);
	}

	
	public List<Product> listProducts() {

		return this.productDaoImpl.listProducts();

	}

	/*
	 * @Transactional public SubCategory getSubCategoryById(int scid) {
	 * 
	 * return this.subCategoryDaoImpl.getSubCategoryById(scid); }
	 */

	
	public void removeProduct(Product rp) {

		this.productDaoImpl.removeProduct(rp);
	}

	public Product getProductByName(String pn) {
		return productDaoImpl.getProductByName(pn);
	}
	

}

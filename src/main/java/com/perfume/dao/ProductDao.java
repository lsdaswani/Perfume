package com.perfume.dao;

import java.util.List;

import com.perfume.entity.Product;

public interface ProductDao {
	
	public void addProduct(Product p);
	public void updateProduct(Product up);
	public List<Product> listProducts();
	public void removeProduct(Product rp);
	public Product getProductByName(String pn);

}

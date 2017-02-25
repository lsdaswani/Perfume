package com.perfume.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Product{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;
private int categoryId;
private int subCategoryId;
private int supplierId;
private String productName;
private String productDescription;
/*private double productPrice;*/
/*private int productQuantity;*/
/*private Date productMfg;*/

@ManyToOne
@JoinColumn(name="categoryId",updatable=false,insertable=false,nullable=false)
private Category category;

@ManyToOne
@JoinColumn(name="subCategoryId",updatable=false,insertable=false,nullable=false)
private SubCategory subCategory;

@ManyToOne
@JoinColumn(name="supplierId",updatable=false,insertable=false,nullable=false)
private Supplier supplier;


public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public SubCategory getSubCategory() {
	return subCategory;
}
public void setSubCategory(SubCategory subCategory) {
	this.subCategory = subCategory;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
/*public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}*/
/*public double getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}*/
/*public Date getProductMfg() {
	return productMfg;
}
public void setProductMfg(Date productMfg) {
	this.productMfg = productMfg;
}*/
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public int getSubCategoryId() {
	return subCategoryId;
}
public void setSubCategoryId(int subCategoryId) {
	this.subCategoryId = subCategoryId;
}

}

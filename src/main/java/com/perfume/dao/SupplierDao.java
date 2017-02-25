package com.perfume.dao;

import java.util.List;

import com.perfume.entity.Supplier;

public interface SupplierDao {
	
	public void addSupplier(Supplier s);
	public void updateSupplier(Supplier us);
	public List<Supplier> listSuppliers();
	//public Supplier getSupplierById(int cid);
	public void removeSupplier(Supplier rs);
	public Supplier getSupplierByName(String sn);

}

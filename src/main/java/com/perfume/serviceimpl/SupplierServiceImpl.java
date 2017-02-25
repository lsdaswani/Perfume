package com.perfume.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.perfume.daoimpl.SupplierDaoImpl;
import com.perfume.entity.Supplier;

@Service
@Transactional
public class SupplierServiceImpl {
	@Autowired
	private SupplierDaoImpl supplierDaoImpl;
	
	public void setSupplierDao(SupplierDaoImpl supplierDaoImpl) {
		this.supplierDaoImpl = supplierDaoImpl;
	}
	
	public void addSupplier(Supplier supplier) {
		
		this.supplierDaoImpl.addSupplier(supplier);
	}

	public void updateSupplier(Supplier us) {
		
		this.supplierDaoImpl.updateSupplier(us);
	}

	
	public List<Supplier> listSuppliers() {
		
		return this.supplierDaoImpl.listSuppliers();
		
	}

	/*
	public Category getCategoryById(int cid) {
	
		return this.categoryDaoImpl.getCategoryById(cid);
	}*/

	public void removeSupplier(Supplier rs) {
		
		this.supplierDaoImpl.removeSupplier(rs);
	}
	
	public Supplier getSupplierByName(String supplierName) 
	{
		 return supplierDaoImpl.getSupplierByName(supplierName);
	}

}

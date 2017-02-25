package com.perfume.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.perfume.dao.ProductDao;
import com.perfume.entity.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
@Autowired
SessionFactory sessionFactory;
	public void addProduct(Product p) {
		
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(p);
		tran.commit();
		session.close();	
	}

	public void updateProduct(Product up) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(up);
	}

	public List<Product> listProducts() {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
	
		List<Product> productsList = session.createQuery("from Product").getResultList();
		tran.commit();
		session.close();
		return productsList;
	}

	public void removeProduct(Product rp) {
		Session session = sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(null));
		if(null != p){
			session.delete(p);
		}
		
	}

	public Product getProductByName(String productName) {
		Session session = sessionFactory.getCurrentSession();
		String str = "from Product where productName=" + "'" + productName + "'";
		List<Product> plist = session.createQuery(str).getResultList();
		return plist.get(0);

	}



}

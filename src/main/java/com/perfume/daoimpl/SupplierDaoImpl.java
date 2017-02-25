package com.perfume.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perfume.dao.SupplierDao;
import com.perfume.entity.Category;
import com.perfume.entity.Supplier;
@Repository
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	SessionFactory sessionFactory;

	public void addSupplier(Supplier s) {
		
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(s);
		tran.commit();
		session.close();

	}

	public void updateSupplier(Supplier us) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(us);

	}

	public List<Supplier> listSuppliers() {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<Supplier> suppliersList = session.createQuery("from Supplier").getResultList();
		tran.commit();
		session.close();
		return suppliersList;
	}

	public void removeSupplier(Supplier rs) {
		Session session = sessionFactory.getCurrentSession();
		Supplier s = (Supplier) session.load(Supplier.class, new Integer(null));
		if (null != s) {
			session.delete(s);
		}
	}

	public Supplier getSupplierByName(String sn) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		List<Supplier> suppliersList = session.createQuery("from Supplier where supplierName=" + "'" + sn + "'").getResultList();
		tran.commit();
		session.close();
		return suppliersList.get(0);
	}

}

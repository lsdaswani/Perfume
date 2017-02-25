package com.perfume.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perfume.dao.SubCategoryDao;
import com.perfume.entity.SubCategory;

@Repository
public class SubCategoryDaoImpl implements SubCategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addSubCategory(SubCategory sc) {

		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(sc);
		tran.commit();
		session.close();
	}

	public void updateSubCategory(SubCategory usc) {

		Session session = this.sessionFactory.getCurrentSession();
		session.update(usc);
	}

	public List<SubCategory> listSubCategorys() {

		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<SubCategory> subCategorysList = session.createQuery("from SubCategory").getResultList();
		tran.commit();

		return subCategorysList;

	}

	/*
	 * public SubCategory getSubCategoryById(int scid) {
	 * 
	 * Session session = this.sessionFactory.getCurrentSession(); SubCategory sc
	 * = (SubCategory) session.load(SubCategory.class, new Integer(scid));
	 * return sc; }
	 */

	public void removeSubCategory(SubCategory rsc) {

		Session session = this.sessionFactory.getCurrentSession();
		SubCategory sc = (SubCategory) session.load(SubCategory.class, new Integer(null));
		if (null != sc) {
			session.delete(sc);
		}
	}

	public SubCategory getSubCategoryByName(String subCategoryName) {
		
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<SubCategory> subCategorysList = session.createQuery("from SubCategory where subCategoryName=" + "'" + subCategoryName + "'").getResultList();
		tran.commit();
		session.close();
		return subCategorysList.get(0);

	}

}

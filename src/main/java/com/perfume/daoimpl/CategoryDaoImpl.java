package com.perfume.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.perfume.dao.CategoryDao;
import com.perfume.entity.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category category) {

		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(category);
		tran.commit();
		session.close();

	}

	public void updateCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);

	}

	public List<Category> listCategorys() {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<Category> categorysList = session.createQuery("from Category").getResultList();
		tran.commit();
		session.close();
		return categorysList;
	}

	
	  @SuppressWarnings("unchecked")
	public Category getCategoryById(int categoryId) 
	  { 
		  Session session = sessionFactory.openSession();
			@SuppressWarnings("unused")
			Transaction tran = session.beginTransaction();
			List<Category> categorysList = session.createQuery("from Category where categoryId="  + categoryId).getResultList();
			return categorysList.get(0); 

			
	}
	 

	public void deleteCategory(int categoryId) {
		/*Category c=getCategoryById(categoryId);
		sessionFactory.getCurrentSession().delete(c);*/

		Category categorytodelete=new Category();
		categorytodelete.setCategoryId(categoryId);
		sessionFactory.openSession().delete(categorytodelete);
	}

	@SuppressWarnings("unchecked")
	public Category getCategoryByName(String category) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<Category> categorysList = session.createQuery("from Category where categoryName=" + "'" + category + "'").getResultList();
		tran.commit();
		session.close();
		return categorysList.get(0);

	}

}

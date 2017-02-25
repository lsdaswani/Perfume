package com.perfume.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perfume.dao.UserRegDao;
import com.perfume.entity.UserReg;

@Repository
public class UserRegDaoImpl implements UserRegDao{
	@Autowired
	SessionFactory sessionFactory;

	public void addUserReg(UserReg au) {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(au);
		tran.commit();
		session.close();

		
	}


	/*public void updateUserReg(UserReg up) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(up);
		
	}

	public void removeUserReg(UserReg ru) {
		
		Session session = this.sessionFactory.getCurrentSession();
		SubCategory sc = (SubCategory) session.load(SubCategory.class, new Integer(null));
		if (null != sc) {
			session.delete(sc);
		}
		
	}
*/
	public List<UserReg> listUsers() {
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();

		List<UserReg> userRegsList = session.createQuery("from UserReg").getResultList();
		tran.commit();

		return userRegsList;
		
	}


	/*public UserReg getUserRegById(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserReg getUserRegByName(String userRegName) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	
}

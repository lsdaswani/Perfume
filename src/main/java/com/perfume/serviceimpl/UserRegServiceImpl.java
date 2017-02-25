package com.perfume.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfume.dao.UserRegDao;
import com.perfume.daoimpl.UserRegDaoImpl;
import com.perfume.entity.UserReg;

@Service
@Transactional
public class UserRegServiceImpl {
	@Autowired
	private UserRegDaoImpl userRegDaoImpl;

	public void addUserReg(UserReg ua) {
		this.userRegDaoImpl.addUserReg(ua);

	}

	public List<UserReg> listUsers() {
		
		return this.userRegDaoImpl.listUsers();
	}

	public void setUserRegDaoImpl(UserRegDaoImpl userRegDaoImpl) {
		this.userRegDaoImpl = userRegDaoImpl;
	}

}

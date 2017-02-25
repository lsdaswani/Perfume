package com.perfume.dao;

import java.util.List;

import com.perfume.entity.UserReg;

public interface UserRegDao {

	public void addUserReg(UserReg ua);
	/*public void updateUserReg(UserReg up);
	public void removeUserReg(UserReg ru);*/
	public List<UserReg> listUsers();
	/*public UserReg getUserRegById(int uid);
	public UserReg getUserRegByName(String userRegName);*/
}

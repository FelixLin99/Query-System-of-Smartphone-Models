package com.service.serviceImp;

import java.sql.SQLException;

import com.bean.T_user;
import com.dao.T_userDao;
import com.dao.Imp.T_userDaoImp;
import com.service.T_userService;

public class T_userServiceImp implements T_userService {
      
	@Override
	public T_user LoginT_user(String username, String password) throws SQLException {
		T_userDao ad=new T_userDaoImp();
		return	ad.LoginT_user(username, password); 
	} 
	@Override
	public T_user ajaxlogin(String username) throws SQLException {
		T_userDao ad=new T_userDaoImp();
		return ad.ajaxlogin(username); 
	}
	 
}

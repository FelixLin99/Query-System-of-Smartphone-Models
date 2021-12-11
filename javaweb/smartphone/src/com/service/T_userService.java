package com.service;

import java.sql.SQLException;
import java.util.List;

import com.bean.PageBean;
import com.bean.T_smtph;
import com.bean.T_user; 

public interface T_userService {
	  
	public T_user LoginT_user(String username,String password) throws SQLException;
	public T_user ajaxlogin(String username ) throws SQLException ; 
}

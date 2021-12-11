package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.bean.T_user; 

public interface T_userDao {
	int  PAGE_SIZE=20;
	public T_user LoginT_user(String username,String password) throws SQLException;
	public T_user ajaxlogin(String username ) throws SQLException ; 
}

package com.dao.Imp;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.bean.T_user;
import com.dao.T_userDao;
import com.util.JDBCUtil;

public class T_userDaoImp implements T_userDao {
	@Override
	public T_user LoginT_user(String username, String password) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource());
		return qr.query("select * from t_user where username=? and password=?", new BeanHandler<T_user>(T_user.class),username,password);
	}
	@Override
	public T_user ajaxlogin(String s_name) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		return qr.query("select * from t_user where username=? ", new BeanHandler<T_user>(T_user.class),s_name);
	}
	
	


	 
}

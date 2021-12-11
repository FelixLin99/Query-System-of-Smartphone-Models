package com.dao.Imp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
 
import com.bean.T_smtph; 
import com.dao.T_smtphDao;
import com.util.JDBCUtil;
import com.util.TextUtils;

public class T_smtphDaoImp implements T_smtphDao {
	 
	
	@Override
	public List<T_smtph> FindT_smtphByPage(int currentPage) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true); 
		 return qr.query("select *  from t_smtph   LIMIT ?,? ",new BeanListHandler<T_smtph>(T_smtph.class)
				 ,(currentPage-1)*PAGE_SIZE, PAGE_SIZE);
	}
	@Override
	public int FindCount() throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true); 
		int  result =Integer.parseInt(qr.query("SELECT COUNT(*) FROM T_smtph" , new ScalarHandler()).toString()); 
		return  result;
	}
	@Override
	public void DeleteT_smtph(int id) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		 qr.update("delete from t_smtph where id=?",id);
	}
	@Override
	public void ADDT_smtph(T_smtph t_smtph) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		 qr.update("insert into t_smtph(name,brand,price,battery,release_date)  values(?,?,?,?,?)"   
				 ,t_smtph.getName()
				 ,t_smtph.getBrand()
				 ,t_smtph.getPrice()
				 ,t_smtph.getBattery()
				 ,t_smtph.getRelease_date() ); 
	}
	
	@Override
	public void UpdateT_smtph(T_smtph t_smtph) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		qr.update("update t_smtph set id=?,name=?,brand=?,price=?,battery=?,release_date=?    where id=? "  
				,t_smtph.getId()
				,t_smtph.getName()
				 ,t_smtph.getBrand()
				 ,t_smtph.getPrice()
				 ,t_smtph.getBattery()
				 ,t_smtph.getRelease_date()
				 ,t_smtph.getId());
	}
	@Override
	public T_smtph SelectT_smtph(int id) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		return qr.query("select *  from t_smtph where id=?", new BeanHandler<T_smtph>(T_smtph.class),id);
	}
	 
	@Override
	public List<T_smtph> FindAllT_smtph() throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtil.getDataSource(),true);
		return qr.query("select * from t_smtph order by id desc", new BeanListHandler<T_smtph>(T_smtph.class)); 
	}
	 
	
	
	


	 
}

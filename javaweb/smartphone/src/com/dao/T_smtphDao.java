package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.bean.T_smtph;
import com.bean.T_user; 

public interface T_smtphDao {
	int  PAGE_SIZE=20; 
	public List<T_smtph> FindAllT_smtph() throws SQLException;
	List<T_smtph> FindT_smtphByPage(int currentPage) throws SQLException ;
	int FindCount() throws SQLException;
	public  void DeleteT_smtph(int id) throws SQLException;
	public  void ADDT_smtph(T_smtph t_smtph) throws SQLException;
	public  void UpdateT_smtph(T_smtph t_smtph) throws SQLException;
	public  T_smtph SelectT_smtph(int id) throws SQLException; 
}

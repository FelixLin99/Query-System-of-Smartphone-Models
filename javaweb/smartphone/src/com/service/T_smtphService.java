package com.service;

import java.sql.SQLException;
import java.util.List;
 
import com.bean.PageBean;
import com.bean.T_smtph; 

public interface T_smtphService {
	  
		public List<T_smtph> FindAllT_smtph() throws SQLException;  
		PageBean FindT_smtphByPage(int currentPage) throws SQLException ; 
		public  void ADDT_smtph(T_smtph t_smtph) throws SQLException;  
		public  void DeleteT_smtph(int id) throws SQLException; 
		public  T_smtph SelectT_smtph(int id) throws SQLException;
		public  void UpdateT_smtph(T_smtph t_smtph) throws SQLException; 
}

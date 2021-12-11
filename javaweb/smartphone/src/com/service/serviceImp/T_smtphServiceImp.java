package com.service.serviceImp;

import java.sql.SQLException;
import java.util.List;

import com.bean.PageBean;
import com.bean.T_smtph;
import com.dao.T_smtphDao;
import com.dao.Imp.T_smtphDaoImp;
import com.service.T_smtphService;

public class T_smtphServiceImp implements T_smtphService {
      
	
	@Override
	public PageBean FindT_smtphByPage(int currentPage) throws SQLException {
		PageBean<T_smtph> pbstu = new PageBean<T_smtph>();
		pbstu.setCurrentPage(currentPage);   //1
		int pageSize = T_smtphDao.PAGE_SIZE ;  
		pbstu.setPageSize(pageSize);         //2
		T_smtphDao ad=new T_smtphDaoImp();
	    List<T_smtph> ls=ad.FindT_smtphByPage(currentPage);
	    pbstu.setList(ls);                   //3
	    int count=ad.FindCount();
	    pbstu.setTotalSize(count);           //4
	    pbstu.setTotalPage(count % pageSize==0 ? count / pageSize : (count / pageSize) + 1);
		return pbstu;
	}
	 
	@Override
	public void ADDT_smtph(T_smtph t_smtph) throws SQLException {
		T_smtphDao ad=new T_smtphDaoImp();
		ad.ADDT_smtph(t_smtph);
	}
	 
	@Override
	public List<T_smtph> FindAllT_smtph() throws SQLException {
		T_smtphDao ad=new T_smtphDaoImp();
		return ad.FindAllT_smtph();
	}

	@Override
	public void DeleteT_smtph(int id) throws SQLException {
		T_smtphDao ad=new T_smtphDaoImp();
		ad.DeleteT_smtph(id);
		
	}

	@Override
	public T_smtph SelectT_smtph(int id) throws SQLException {
		T_smtphDao ad=new T_smtphDaoImp();
		return ad.SelectT_smtph(id);
	}

	@Override
	public void UpdateT_smtph(T_smtph t_smtph) throws SQLException {
		T_smtphDao ad=new T_smtphDaoImp();
		  ad.UpdateT_smtph(t_smtph);
		
	}
	 
}

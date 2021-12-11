package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.PageBean;
import com.service.T_smtphService;
import com.service.serviceImp.T_smtphServiceImp;

 
@WebServlet("/PageT_smtphServlet")
public class PageT_smtphServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
                       int  cp=Integer.parseInt(request.getParameter("currentPage"));
                       T_smtphService as=new T_smtphServiceImp(); 
                       PageBean  PageBean =as.FindT_smtphByPage(cp);
						request.setAttribute("PageBean", PageBean);
					request.getRequestDispatcher("success.jsp").forward(request, response);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                       
	
	}  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

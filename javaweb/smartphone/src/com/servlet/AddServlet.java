package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.T_smtph;
import com.service.T_smtphService;
import com.service.serviceImp.T_smtphServiceImp; 

 
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); try {  
		String name=request.getParameter("name");
		String brand=request.getParameter("brand");
		String price=request.getParameter("price");
		String battery=request.getParameter("battery"); 
		String release_date=request.getParameter("release_date"); 
		T_smtph t_smtph=new  T_smtph(name,brand,price,battery,release_date);
		T_smtphService as = new T_smtphServiceImp();
		as.ADDT_smtph(t_smtph);
		response.sendRedirect("FindAllServlet"); 
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

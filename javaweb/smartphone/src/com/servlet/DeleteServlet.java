package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.T_smtphService;
import com.service.serviceImp.T_smtphServiceImp;

 
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	               try {
	            	   int id= Integer.parseInt(request.getParameter("id"));
	            	   T_smtphService as = new T_smtphServiceImp();
					   as.DeleteT_smtph(id);
					   response.sendRedirect("FindAllServlet"); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

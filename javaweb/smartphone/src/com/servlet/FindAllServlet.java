package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.T_smtph;
import com.service.T_smtphService;
import com.service.serviceImp.T_smtphServiceImp;

/**
 *  
 */
@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			T_smtphService as = new T_smtphServiceImp();
			List<T_smtph> list = as.FindAllT_smtph();
			request.setAttribute("list", list); 
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

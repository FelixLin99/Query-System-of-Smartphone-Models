package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.T_user;
import com.service.T_userService;
import com.service.serviceImp.T_userServiceImp;


@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
        	 request.setCharacterEncoding("UTF-8");
        	 String username=request.getParameter("username");  
        	 T_userService as=new T_userServiceImp(); 
        	 T_user Login=as.ajaxlogin(username);
             if(Login!=null){  
            	 response.getWriter().print(1); 
             }else{ 
            	 response.getWriter().print(2);
             }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

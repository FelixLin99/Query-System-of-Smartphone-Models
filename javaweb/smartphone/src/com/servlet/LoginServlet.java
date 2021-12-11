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

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         try {
        	 request.setCharacterEncoding("UTF-8");
        	 String name=request.getParameter("username");
             String pw=request.getParameter("password");
             T_userService as=new T_userServiceImp();
             T_user Login=as.LoginT_user(name, pw);
             if(Login!=null){  
			 request.getSession().setAttribute("Login", Login);
			 request.getRequestDispatcher("success.jsp").forward(request, response);
             }else{ 
            	
            	 response.setCharacterEncoding("utf-8");
                 request.getRequestDispatcher("login.jsp").forward(request, response);
             }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

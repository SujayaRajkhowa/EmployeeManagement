package com.cognizant.employeemanagemntsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.service.LoginService;
import com.cognizant.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
      
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("user_id");
		String password=request.getParameter("password");
		/*if(("admin").equals(userName)&&("admin").equals(password))
		{
			System.out.println("User Name:"+userName+"\nPassword:"+password);
		}
		*/
		
		LoginBean bean=new LoginBean();
		bean.setUser_id(userName);
		bean.setPassword(password);
		LoginService loginService=new LoginServiceImpl();
		if(loginService.authenticate(bean))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

}

package com.cognizant.employeemanagemntsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
import com.cognizant.employeemanagementsystem.service.EmployeeService;
import com.cognizant.employeemanagementsystem.service.EmployeeServiceImpl;

public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeeRegistrationServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeID=request.getParameter("employeeID");
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		int eSal=Integer.parseInt(request.getParameter("eSal"));
		String eDesg=request.getParameter("eDesg");
		String password=request.getParameter("password");
		EmployeeBean employeeBean=new EmployeeBean(employeeID, fName, lName, eSal, eDesg, password);
		System.out.println(employeeBean.toString());
		EmployeeService employeeService=new EmployeeServiceImpl();
		if(employeeService.insertEmployee(employeeBean))
		{
			System.out.println("Record Inserted");
		}
		else
		{
			System.out.println("Error");
		}
		
		
	}

}

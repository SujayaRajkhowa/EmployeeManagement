package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
import com.cognizant.employeemanagementsystem.dao.EmployeeDAO;
import com.cognizant.employeemanagementsystem.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean insertEmployee(EmployeeBean employeeBean) {
		EmployeeDAO employeeDAO=new EmployeeDAOImpl();
		return employeeDAO.insertEmployee(employeeBean);
		
	}

	@Override
	public EmployeeBean getEmployeeDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

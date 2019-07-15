package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;

public interface EmployeeService {
	public boolean insertEmployee(EmployeeBean employeeBean);
	public EmployeeBean getEmployeeDetails(int id);
}

package com.cognizant.employeemanagementsystem.dao;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;

public interface EmployeeDAO {
	public boolean insertEmployee(EmployeeBean employeeBean);
	public EmployeeBean getEmployeeDetails(int id);

}

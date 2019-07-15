package com.cognizant.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
import com.cognizant.employeemanagementsystem.util.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean insertEmployee(EmployeeBean employeeBean) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = DBUtils.getConnection();
		String insertQuery = "insert into employee_details (eid , fname , lname, eSal , eDesg, password) values(?, ?, ?, ?, ?, ?) ";
		try {
			preparedStatement= connection.prepareStatement(insertQuery); 
			preparedStatement.setString(1, employeeBean.getEmp_id());
			preparedStatement.setString(2, employeeBean.getFname());
			preparedStatement.setString(3, employeeBean.getLname());
			preparedStatement.setInt(4, employeeBean.getEsal());
			preparedStatement.setString(5, employeeBean.getEdesg());
			preparedStatement.setString(6, employeeBean.getPassword());
			preparedStatement.executeUpdate(); 
			connection.commit();
			} catch (SQLException e) {
			try {
				connection.rollback();
				return false;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			DBUtils.closeConnection(connection);;
		}
		return true;
		
	} 
	

	@Override
	public EmployeeBean getEmployeeDetails(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = DBUtils.getConnection();
		String insertQuery = "select * from employee_details where eid=?";
		try {
			preparedStatement=connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}

package com.cognizant.employeemanagementsystem.dao;

import java.sql.Connection;

import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.util.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAOImpl implements LoginDAO {
	
	@Override
	public String insertLogin(LoginBean loginBean) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		String insertQuery="insert into Login (user_id,password) values(?,?)";
		try {
			preparedStatement=connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, loginBean.getUser_id());
			preparedStatement.setString(2, loginBean.getPassword());
			connection.commit();
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			try {
				connection.rollback();
				return "fail";
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}finally {
			DBUtils.closeConnection(connection);
		}
		return "success";
	}

	@Override
	public boolean authenticate(LoginBean loginBean) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		String insertQuery="select * from Login where user_id=? and password=?";
		ResultSet resultSet=null;
		try {
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, loginBean.getUser_id());
			preparedStatement.setString(2, loginBean.getPassword());
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return true;
			}
		} catch (SQLException e) {
			return false;
		}		return false;
	}

	/*@Override
	public LoginBean getLoginDetail(LoginBean loginBean) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		String insertQuery="select * from Login where user_id=? and password=?";
		ResultSet resultSet=null;
		try {
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, loginBean.getUser_id());
			preparedStatement.setString(2, loginBean.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}*/

}

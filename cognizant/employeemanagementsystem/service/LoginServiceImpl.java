package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.dao.LoginDAO;
import com.cognizant.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	@Override
	public String insertLogin(LoginBean loginBean) {
		LoginDAO loginDAO=new LoginDAOImpl();
		loginDAO.insertLogin(loginBean);
		return null;
	}

	@Override
	public boolean authenticate(LoginBean loginBean) {
		LoginDAO loginDAO=new LoginDAOImpl();
		return loginDAO.authenticate(loginBean);
	}

}

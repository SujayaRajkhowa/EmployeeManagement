package com.cognizant.employeemanagementsystem.dao;

import com.cognizant.employeemanagementsystem.bean.LoginBean;

public interface LoginDAO {
	public String insertLogin(LoginBean loginBean);
	/*public LoginBean getLoginDetail(LoginBean loginBean);*/
	public boolean authenticate(LoginBean loginBean);

}

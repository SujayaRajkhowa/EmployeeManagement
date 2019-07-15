package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.bean.LoginBean;

public interface LoginService {
	public String insertLogin(LoginBean loginBean);
	/*public LoginBean getLoginDetail(LoginBean loginBean);*/
	public boolean authenticate(LoginBean bean);
}

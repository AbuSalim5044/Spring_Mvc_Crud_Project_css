package com.dineshonjava.service;

import com.dineshonjava.bean.LoginBean;

public interface LoginService {
	
	public boolean getLogin(LoginBean loginBean);
	
	public int loginRegister(LoginBean loginBean);

}

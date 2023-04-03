package com.dineshonjava.dao;

import com.dineshonjava.bean.LoginBean;

public interface LoginDao {
	
	public boolean getLogin(LoginBean loginBean);
	
	public int loginRegister(LoginBean loginBean);


}

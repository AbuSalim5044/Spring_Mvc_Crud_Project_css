package com.dineshonjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dineshonjava.bean.LoginBean;
import com.dineshonjava.dao.LoginDao;

@Component
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean getLogin(LoginBean loginBean) {
		System.out.println("service..............value."+loginBean.getName()+"!!"+loginBean.getPassword());
		
		return loginDao.getLogin(loginBean);
	}

	@Override
	public int loginRegister(LoginBean loginBean) {
		System.out.println("servic value......"+loginBean.getName()+"$$"+loginBean.getPassword());
		
		
		return loginDao.loginRegister(loginBean);			
	}

}

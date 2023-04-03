package com.dineshonjava.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.bean.LoginBean;
import com.dineshonjava.model.Login;

@Component
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	Login login=new Login();
	
	@Override
	public boolean getLogin(LoginBean loginBean) {
		System.out.println("Dao............"+loginBean.getName()+"//"+loginBean.getPassword());
		boolean loginStatus=false;
		Session session=sessionFactory.openSession();
		String sqlQuery="from Login u where u.name=? and u.pass=?";
		
		Query query= session.createQuery(sqlQuery);	
		query.setParameter(0, loginBean.getName());
		query.setParameter(1, loginBean.getPassword());
		
		List userList=query.list();
		
		if((userList!=null)&&(userList.size()>0)) {
			loginStatus=true;
			System.out.println("...........Valid user...");
		}
		else {
			System.out.println("...........Not valid user...");
		}
		return loginStatus;
	}

	
	
	@Override
	@Transactional
	public int loginRegister(LoginBean loginBean) {
		int regiterStatus=0;
		System.out.println("dao value........"+loginBean.getName()+"$$"+loginBean.getPassword());
		
		if(!"".equals(loginBean.getName()) &&(!"".equals(loginBean.getPassword()))) { 
		Login login=new Login();
		login.setName(loginBean.getName());
		login.setPass(loginBean.getPassword());
		Session session=sessionFactory.openSession();
		regiterStatus =(Integer)session.save(login);
		System.out.println("insert...........");
		}else {
			System.out.println("not insert........");
		}
		/*
		 * if(regiterStatus>0) { return regiterStatus; }else { return regiterStatus; }
		 */
		return regiterStatus;
	       
	}
	       
}

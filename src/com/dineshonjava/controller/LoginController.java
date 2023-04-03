package com.dineshonjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dineshonjava.bean.LoginBean;
import com.dineshonjava.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login")
	public String display() {

		System.out.println("welcome to login page.............");

		return "login";
	}

	@RequestMapping(value = "/loginpost", method = RequestMethod.POST)
	public String getlogin(@RequestParam(value = "name") String name, @RequestParam(value = "pass") String pass,
			LoginBean loginBean, Model model) {
		System.out.println("!!!!!!!!!!!" + name + "''" + pass);
		loginBean.setName(name);
		loginBean.setPassword(pass);

		System.out.println("second........." + loginBean.getName() + " " + loginBean.getPassword());

		boolean LoginStatus = loginService.getLogin(loginBean);

		if (LoginStatus) {
			return "index";
		} else {
			model.addAttribute("msg3","Not valid user........");
			return "login";
		}
	}

	@RequestMapping(value = "/registeration")
	public String welcomeRegister() {
		System.out.println("welcome to register page.....");

		return "registeration";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String loginRegister(@RequestParam(value = "name") String name, @RequestParam(value = "pass") String pass,
			LoginBean loginBean, Model model) {
		System.out.println("controller..............");
		System.out.println("controller value......" + name + "$$$" + pass);
		loginBean.setName(name);
		loginBean.setPassword(pass);
		int loginstatus = loginService.loginRegister(loginBean);

		if (loginstatus > 0) {
			// User Registered sucessfully
			System.out.println("massage........");
			model.addAttribute("msg", "successfull value insert.....");
			return "registeration";
		} else {

			model.addAttribute("msg2", "unsuccessfull value......");
			return "registeration";

		}
	}
}

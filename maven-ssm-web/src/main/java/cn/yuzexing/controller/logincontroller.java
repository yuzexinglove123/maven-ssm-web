package cn.yuzexing.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.yuzexing.domain.User;
import cn.yuzexing.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class logincontroller {
	@Autowired
	@Qualifier("userimpl")
	private UserServiceImpl uservice;

	@RequestMapping("/login")
	public ModelAndView helloMvc(String loginname, String password, ModelAndView mv, HttpSession session) {
		User user = uservice.login(loginname, password);
		if (user != null) {
			// 登陆成功
			// 登录成功，将user对象设置到HttpSession作用范围域中
			session.setAttribute("user", user);
			// 转发到main请求
			// mv.setView(new RedirectView("home"));
			mv.setViewName("success");

		} else {
			// 登录失败，设置失败信息，并调转到登录页面

			// mv.addObject("message", "登录名和密码错误，请重新输入");
			mv.setViewName("error");
		}
		return mv;
		// return "home";
	}
}

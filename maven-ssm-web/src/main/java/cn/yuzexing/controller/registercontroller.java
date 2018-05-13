package cn.yuzexing.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.yuzexing.service.UserRegisterServiceImpl;

@Controller
@RequestMapping("/user")
public class registercontroller {
	@Autowired
	@Qualifier("userregisterimpl")
	private UserRegisterServiceImpl userregis;
//	@Qualifier("userimpl")
//	private UserServiceImpl uservice;

	@RequestMapping("/register")
	public ModelAndView helloMvc(String username, String password1, String email, ModelAndView mv,
			HttpSession session) {
		//这里要先验证用户是否存在！
//		User user = uservice.login(username, password1);
//		if (user != null) {
//			mv.setViewName("yonghuyijingcunzai");
//		} else {
//			userregis.register(username, password1, email);
//
//			mv.setViewName("registersuccess!");
//		}
		
		userregis.register(username, password1, email);
		//这里如果数据库insert失败，则放回一个注册失败页面；
		mv.setViewName("registersuccess");
	
		return mv;
		// return "home";
	}
}

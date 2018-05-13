package cn.yuzexing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yuzexing.mapper.UserRegisterMapper;

@Service("userregisterimpl")
public class UserRegisterServiceImpl implements UserRegister {
	@Autowired
	private UserRegisterMapper userm;

	@Override
	public void register(String username, String password1, String email) {
		// TODO Auto-generated method stub
		userm.insertTableLogin(username, password1, email);
	}

}

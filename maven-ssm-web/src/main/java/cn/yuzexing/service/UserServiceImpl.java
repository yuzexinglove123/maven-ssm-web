package cn.yuzexing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yuzexing.domain.User;
import cn.yuzexing.mapper.UserLoginMapper;

@Service("userimpl")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserLoginMapper userLoginMapper;

	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub
		return userLoginMapper.findWithLoginAndPassword(loginname, password);
	}

}
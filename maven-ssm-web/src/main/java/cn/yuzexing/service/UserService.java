package cn.yuzexing.service;

import cn.yuzexing.domain.User;
public interface UserService {
	User login(String loginname, String password);
}

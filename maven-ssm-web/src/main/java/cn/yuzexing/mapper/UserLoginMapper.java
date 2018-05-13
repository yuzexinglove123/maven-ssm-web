package cn.yuzexing.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.yuzexing.domain.User;

public interface UserLoginMapper {
	@Select("select * from login where uname=#{loginname} and password=#{password}")
	User findWithLoginAndPassword(@Param("loginname") String loginname, @Param("password") String password);
}
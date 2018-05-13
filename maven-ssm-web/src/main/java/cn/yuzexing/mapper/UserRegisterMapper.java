package cn.yuzexing.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserRegisterMapper {
	@Insert("insert into login"+"("+"uname,password,email"+")"+" values"+"("+"#{username }"+","+"#{ password }"+","+"#{email}"+")")
	void insertTableLogin(@Param("username") String username, @Param("password") String password,
			@Param("email") String email);

}

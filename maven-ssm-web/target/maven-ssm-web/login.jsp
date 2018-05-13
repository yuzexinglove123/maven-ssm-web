
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<form action="user/login" method="post">
		<table>  
	   <tr><td>账号:</td><td><input style="line-height: 28px;" type="text" name="loginname" /></td></tr>  
	  <tr><td>密码:</td><td><input style="line-height: 28px;" type="password" name="password" /></td></tr>  
	   <tr><td> <a href="register.jsp" >注册</a></td><td><input id="login_in" type="submit" value=" 登录 "></td></tr>  
	  </table> 
	</form>
</body>
</html>

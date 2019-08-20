<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <a href="helloSpringMVC">HelloSpringMVC</a><br/>
  <a href="paramUrl/zhangsan">提交动态参数</a><br/><br/>
  <form action="paramRequest" method="post">
    <label>用户名</label><input name="username"/><br>
    <label>密码</label><input type="password" name="password"/><br>
    <input type="submit" value="提交"> 
  </form><br><br>
  <a href="paramRequest2?username=zhangsan&password=111111">新的参数提交方式</a>
</body>

<!-- 只要参数带key 是不是就可以直接取到？ -->
</html>
<%--
  Created by IntelliJ IDEA.
  User: yuyu
  Date: 2016/10/19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>

<form action="login" method="post" id="login_form">
    <p>用户名：</p>
    <input type="text" id="username" placeholder="用户名" name="username">
    <p>密码：</p>
    <input type="text" id="password" placeholder="密码" name="password">
    <p>登陆：</p>
    <input type="submit" value="登录" id="login_submit">
</form>

<a href="/tomutipart">multipart</a>

</body>
</html>

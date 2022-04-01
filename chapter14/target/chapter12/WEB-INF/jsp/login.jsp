<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/1 6:01 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
</head>
<body>
    <span style="color: Red;">${msg}</span>
    <form action="${pageContext.request.contextPath}/login" method="post">
        登录名：<label for="username"></label><input type="text" name="username" id="username"/><br/>
        密&nbsp;&nbsp;&nbsp;码：<label for="password"></label><input type="password" name="password" id="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/3/31 3:09 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/registerUser" method="post">
        用户名：<input type="text" name="username"/><br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
        <input type="submit" value="注册">
    </form>
</body>
</html>

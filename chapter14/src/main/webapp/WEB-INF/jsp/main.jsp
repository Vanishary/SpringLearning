<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/1 5:59 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>管理主页</title>
</head>
<body>
    当前用户信息：${user_session.username}
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>

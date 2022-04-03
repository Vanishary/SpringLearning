<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/2 12:38 上午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户信息</title>
</head>
<body>
    <table>
        <tr>
            <td>用户ID:</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>用户姓名:</td>
            <td>${user.username}</td>
        </tr>
    </table>
</body>
</html>

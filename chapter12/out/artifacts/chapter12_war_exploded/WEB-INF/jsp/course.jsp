<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/3/31 3:58 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>课程列表</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/deleteCourse" method="post">
        <table>
            <tr>
                <td>选择</td>
                <td>课程名</td>
            </tr>
            <tr>
                <td><input name="ids" value="1" type="checkbox"></td>
                <td>JAVA程序设计</td>
            </tr>
            <tr>
                <td><input name="ids" value="2" type="checkbox"></td>
                <td>MySQL数据库</td>
            </tr>
            <tr>
                <td><input name="ids" value="3" type="checkbox"></td>
                <td>JavaEE应用开发</td>
            </tr>
        </table>
        <input type="submit" value="删除">
    </form>
</body>
</html>

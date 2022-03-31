<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/3/31 3:42 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生查询</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/findStudentWithBanji" method="post">
    学生编号：<input type="text" name="stu_id"/><br/>
    所属班级：<input type="text" name="banji.banji_name"/><br/>
    <input type="submit" value="查询">
</form>
</body>
</html>

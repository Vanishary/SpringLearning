<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/12 5:41 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改新闻类别名称</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li>></li>
        <li>编辑新闻类别</li>
    </ul>
</div>
<div class="formbody">
    <div class="formtitle"><span>修改新闻类别</span></div>
    <form action="${pageContext.request.contextPath}/editCategory.action" name="ff" method="post">
        <ul class="forminfo">
            <input id="categoryId" name="categoryId" value="${category.categoryId}" type="hidden" />
            <li>
                <label style="width:150px;">类别名称（<font style="color:Red;font-weight:bolder;">*</font>）：</label><input id="categoryName" name="categoryName"  value="${category.categoryName}" type="text" class="dfinput" /><i></i>
            </li>

            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改"/>
                &nbsp;&nbsp;<input name="" type="button" onclick="goback();"class="btn" value="返回列表"/></li>
        </ul>
    </form>
</div>
<script>
    function goback(){
        window.location.href="${pageContext.request.contextPath}/findCategoryList.action";
    }
</script>
</body>
</html>

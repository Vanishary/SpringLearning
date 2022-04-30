<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/13 11:31 上午 
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
    <title>添加新闻类别</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li>></li>
        <li>添加新闻类别</li>
    </ul>
</div>
<div class="formbody">
    <div class="formtitle"><span>添加新闻类别</span></div>
    <form action="${pageContext.request.contextPath}/addCategory.action" name="ff" method="post"onsubmit="return checkValue()">
        <ul class="forminfo">
            <li><label style="width:150px;">类别名称（<font style="color:Red;font-weight:bolder;">*</font>）：</label><input
                    id="categoryName" name="categoryName" value="${category.categoryName}" type="text" class="dfinput"/><i>&nbsp;<font
                    style="color:Red;">${checkCategoryNameMsg}</font></i></li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认添加"/>
                &nbsp;&nbsp;<input name="" type="button" onclick="goback();" class="btn" value="返回列表"/></li>
        </ul>
    </form>
</div>
<script>
    function goback() {
        window.location.href = "${pageContext.request.contextPath}/findCategoryList.action";
    }

    function checkValue() {
        var str = document.getElementById("categoryName").value;
        if (str.length < 1) {
            alert("请输入内容");
            document.getElementById("categoryName").focus();
            return false;
        }
        return true;
    }
</script>
</body>
</html>

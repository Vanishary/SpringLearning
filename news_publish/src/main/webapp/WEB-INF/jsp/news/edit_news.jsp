<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/11 5:02 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>修改新闻</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li>></li>
        <li>修改新闻</li>
    </ul>
</div>
<div class="formbody">
    <div class="formtitle"><span>修改新闻</span></div>
    <form action="${pageContext.request.contextPath}/editNews.action" name="ff" method="post" onsubmit="return checkValue()">
        <input id="newsId" name="newsId" value="${news.newsId}" type="hidden" />
        <ul class="forminfo">
            <li><label style="width:150px;">新闻标题（<font style="color:Red;font-weight:bolder;">*</font>）：</label><input id="title" name="title" value="${news.title}" type="text" class="dfinput" /><i></i></li>
            <li><label style="width:150px;">新闻类别（<font style="color:Red;font-weight:bolder;">*</font>）：</label>
                <select name="categoryId" id="categoryId"  class="dfinput">
                    <option value="">--请选择--</option>
                    <c:forEach items="${categoryList}" var="c">
                        <option value="${c.categoryId}" <c:if test="${c.categoryId eq news.categoryId }">selected="selected"</c:if>>${c.categoryName}</option>
                    </c:forEach>
                </select>
                <i></i></li>
            <li><label style="width:150px;">内容页标题（<font style="color:Red;font-weight:bolder;">*</font>）：</label><input id="contentTitle" name="contentTitle" value="${news.contentTitle}" type="text" class="dfinput" /><i></i></li>
            <li><label style="width:150px;">内容摘要：</label><textarea id="contentAbstract" name="contentAbstract" cols="100" rows="2" style="width:800px;height:50px;"  class="dfinput">${news.contentAbstract}</textarea><i></i></li>
            <li><label style="width:150px;">内容：（<font style="color:Red;font-weight:bolder;">*</font>）</label><textarea id="content" name="content" cols="100" rows="4" style="width:800px;height:100px;"  class="dfinput">${news.content}</textarea><i></i></li>
            <li><label style="width:150px;">关键词：</label><input id="keywords" name="keywords"  value="${news.keywords}" type="text" class="dfinput" /><i></i></li>
            <li><label style="width:150px;">作者/来源：</label><input id="author" name="author"  value="${news.author}" type="text" class="dfinput" /><i></i></li>

            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改"/>
                &nbsp;&nbsp;<input name="" type="button" onclick="goback();"class="btn" value="返回列表"/></li>
        </ul>
    </form>
</div>
<script>
    function goback(){
        window.location.href="${pageContext.request.contextPath}/findNewsByPage.action";
    }
    function checkValue() {
        var str = document.getElementById("title").value;
        if (str.length < 1) {
            alert("新闻标题");
            document.getElementById("title").focus();
            return false;
        }
        str = document.getElementById("categoryId").value;
        if (str == '') {
            alert("请选择新闻类别");
            return false;
        }
        str = document.getElementById("contentTitle").value;
        if (str.length < 1) {
            alert("新闻内容页标题");
            document.getElementById("contentTitle").focus();
            return false;
        }
        str = document.getElementById("content").value;
        if (str.length < 1) {
            alert("请输入新闻内容");
            document.getElementById("content").focus();
            return false;
        }
        return true;
    }
</script>
</body>
</html>

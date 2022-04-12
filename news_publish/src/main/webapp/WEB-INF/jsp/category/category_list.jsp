<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/11 6:05 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">新闻类别列表</a></li>
    </ul>
</div>
<div class="rightinfo">
    <div class="tools">
        <ul class="toolbar">
            <li class="click"><a href="${pageContext.request.contextPath}/toAddCategory.action"><span><img
                    src="images/t01.png"/></span>添加类别</a></li>
        </ul>
    </div>
    <form action="${pageContext.request.contextPath}/findCategoryList.action" id="categoryListForm"
          name="ff" method="post">
        <ul class="seachform">
            <li><label>&nbsp;&nbsp;&nbsp;&nbsp;搜索关键词:</label>
                <input name="keywords" value="${keywords}" placeholder="这里输入关键词" type="text" style="width: 400px;"
                       class="scinput"/></li>
            <li><label>&nbsp;</label><input name="" type="submit"
                                            class="scbtn" value="查询"/></li>
        </ul>
    </form>

    <table class="tablelist">
        <thead>
        <tr>
            <th style="width:100px;text-align:center;">类别名称</th>
            <th style="width:200px;text-align:center;">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${!empty categoryList}">
            <c:forEach items="${categoryList}" var="category">
                <tr>
                    <td align="center">${category.categoryName}</td>
<%--                    <td align="center"><fmt:formatDate value="${categoryName.registerTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>
<%--                    <td align="center">--%>
<%--                        <c:if test="${user.status=='2'}" var="flag">--%>
<%--                            已启用--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${not flag}">--%>
<%--                            未启用或被禁用--%>
<%--                        </c:if>--%>
<%--                    </td>--%>
                    <td align="center">
                        <a href="${pageContext.request.contextPath}/toEditCategory.action?categoryId=${category.categoryId}">修改</a>
<%--                        <c:if test="${user.loginName!='admin'}">--%>
<%--                            <c:if test="${category.status=='2'}" var="status_flag">--%>
<%--                                &nbsp;|&nbsp;<a href='#' onclick="disableUser(${category.categoryId})">禁用</a>--%>
<%--                            </c:if>--%>
<%--                            <c:if test="${not status_flag}">--%>
<%--                                &nbsp;|&nbsp;<a href='#' onclick="enableUser(${category.categoryId})">启用</a>--%>
<%--                            </c:if>--%>
                            &nbsp;|&nbsp;<a href='#' onclick="del(${category.categoryId})">删除</a>
<%--                        </c:if>--%>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty categoryList}">
            <div>
                <tr>
                    <td colspan="7" align="center">
                        暂无分类
                    </td>
                </tr>
            </div>
        </c:if>
        </tbody>
    </table>
    <script type="text/javascript">
        function del(categoryId) {
            if (window.confirm("您确定要删除吗？")) {
                $.ajax({
                    url: "${pageContext.request.contextPath }/delCategory.action",
                    type: "post",
                    //data表示发送的数据
                    data: JSON.stringify({categoryId: categoryId}),
                    // 定义发送请求的数据格式为JSON字符串
                    contentType: "application/json;charset=UTF-8",
                    //定义回调响应的数据格式为JSON字符串，该属性可以省略
                    dataType: "json",
                    //成功响应的结果
                    success: function (data) {
                        if (data != null) {
                            if (data.categoryId > 0) {
                                alert("删除成功！");
                                window.location.reload();
                            } else {
                                alert("删除失败！");
                                window.location.reload();
                            }
                        }
                    }
                });
            }
        }
    </script>
</div>
<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>

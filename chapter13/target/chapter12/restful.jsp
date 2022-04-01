<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/4/1 11:00 上午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function search() {
            var id=$("#number").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/customer/"+id,
                tyepe:"GET",
                dataType:"json",
                success:function (data) {
                    if(data.loginname!=null) {
                        alert("您查询的客户登录名为："+data.loginname);
                    }else {
                        alert("没有找到id为:"+id+"的客户！");
                    }
                }
            })
        }
    </script>
</head>
<body>
    客户编号：<input type="text" name="number" id="number"/><br/>
    <input type="button" value="查询" onclick="search()"/>
</body>
</html>

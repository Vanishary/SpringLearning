<%--
  Created by IntelliJ IDEA.
  User: GuoTao Li
  Date: 2022/3/31 6:28 下午 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试JSON交互</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function testJson() {
            //获得输入的客户信息
            var loginname = $("#loginname").val();
            var password = $("#password").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/testJson",
                type: "post",
                //data表示发送的数据
                data: JSON.stringify({loginname: loginname, password: password}),
                //定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串，该属性可以省略
                dataType: "json",
                //成功响应的结果
                success: function (data) {
                    if (data != null) {
                        alert("您输入的登录名为：" + data.loginname + "  密码为：" + data.password);
                    }
                }
            });
        }
    </script>
</head>
<body>
<form>
    登录名：<input type="text" name="loginname" id="loginname"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" id="password"/><br/>
    <input type="button" value="测试JSON交互" onclick="testJson()"/>
</form>
</body>
</html>

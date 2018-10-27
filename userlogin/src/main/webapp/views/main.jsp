<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="css1.css"/>"/>
    <title>主页</title>
</head>
<body>
<h3>主页面</h3>
<div id="top-div">
    <h3>欢迎你，${name}</h3>
</div>
<div>
    <a href="/toUpdate">修改密码</a><br>
    <a href="/outLogin">退出登陆</a>
</div>
</body>
</html>

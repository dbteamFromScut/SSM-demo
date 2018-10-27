<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="../statics/css1.css"/>"/>
    <title>登陆</title>
</head>
<body>
<div id="top-div"><h3>登陆页面</h3></div>
<div id="form">
    <form action="login" method="post">
        <table>
            <tr>
                <td><label>登录名：</label></td>
                <td><input type="text" id="id" name="id"></td>
            </tr>
            <tr>
                <td><label>密码：</label></td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td><input id="login" type="submit" name="submit_name" value="登陆"></td>
                <td><input id="register" type="submit" name="submit_name" value="注册"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>

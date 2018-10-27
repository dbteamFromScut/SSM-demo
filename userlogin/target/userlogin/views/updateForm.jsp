<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="../statics/css1.css"/>"/>
    <title>更改密码</title>
</head>
<body>
<div id="top-div"><h3>改密码界面</h3></div>
<div id="form"><form action="update" method="post">
    <table>
        <tr>
            <td><label>原密码：</label></td>
            <td><input type="password" id="oldpassword" name="oldpassword"></td>
        </tr>
        <tr>
            <td><label>新密码：</label></td>
            <td><input type="password" id="newpassword" name="newpassword"></td>
        </tr>

        <tr>
            <td><input id="register" type="submit" name="submit_name" value="修改"></td>
            <td><input id="login" type="submit" name="submit_name" value="返回"></td>
        </tr>
    </table>
</form></div>


</body>
</html>

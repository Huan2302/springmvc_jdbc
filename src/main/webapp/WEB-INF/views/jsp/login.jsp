<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/18/21
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>login</h1>
<c:if test="${not empty msg}">
    <p style="color: red">${msg}</p>
</c:if>
<form action="<%=request.getContextPath()%>/login" method="post">
    <lable>Username:</lable>
    <input type="text" name="name">
    <br>
    <lable>Password:</lable>
    <input type="password" name="pass">
    <br>
    <input type="submit">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2 style="color:black">Rate=<%=request.getAttribute("rate")%></h2>
    <h2 style="color:black">USD=<%=request.getAttribute("usd")%></h2>
    <h2 style="color: red">ChangeCurreny=<%=request.getAttribute("resultCurrency")%></h2>
</body>
</html>

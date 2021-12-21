<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/21/2021
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Company</th>
        <th>Contact</th>
        <th>Country</th>
    </tr>
 <c:forEach items="homeworkerList" var="a">
    <tr>
        <td><c:out value="${a.id}"/></td>
        <td><c:out value="${a.name}"/></td>
        <td><c:out value="${a.email}"/></td>
        <td><c:out value="${a.phoneNumber}"/></td>
    </tr>
 </c:forEach>
</table>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone Number</th>
        <th>Picture</th>
    </tr>
    <c:forEach items="${customer}" var="i">
    <tr>
        <td>${i.id}</td>
        <td>${i.name}</td>
        <td>${i.email}</td>
        <td>${i.address}</td>
        <td>${i.phoneNumber}</td>
        <td><img src="${i.pictureLink}" width="100" height="80"></td>
    </tr>
    </c:forEach>
</table>
<%--<div>--%>
<%--    <ul>--%>
<%--        <li>--%>
<%--            <p>Id</p>--%>
<%--            <p>Name</p>--%>
<%--            <p>Email</p>--%>
<%--            <p>Address</p>--%>
<%--            <p>Phone Number</p>--%>
<%--            <p>Pícture</p>--%>
<%--        </li>--%>
<%--        <c:forEach items="${customer}" var="i">--%>
<%--            <li class='list-group-item'>--%>
<%--                <p> ${i.getId()}</p>--%>
<%--                <p> ${i.name}${i.address}</p>--%>
<%--                <p> ${i.email}</p>--%>
<%--                <p> ${i.address}</p>--%>
<%--                <p> ${i.phoneNumber}</p>--%>
<%--            </li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>
<%--</div>--%>
</body>
</html>
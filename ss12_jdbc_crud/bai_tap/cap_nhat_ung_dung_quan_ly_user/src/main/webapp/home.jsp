<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/27/2021
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
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

<h2>HTML Table</h2>

<table>

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${listC}" var="c">
    <tr>
        <td><c:out value="${c.id}"/></td>
        <td>
            <a href="/customer?actionUser=view&vid=${c.id}"/><c:out value="${c.name}"/>
        </td>
        <td><c:out value="${c.email}"/></td>
        <td><c:out value="${c.country}"/></td>
        <td>
            <a href="/customer?actionUser=edit&uid=${c.id}">Update</a>
            <a href="/customer?actionUser=delete&did=${c.id}">Delete</a>
        </td>
    </tr>
    </c:forEach>
</table>
<a href="/customer?actionUser=create">Create Customer</a>
<form action="/customer?actionUser=search" method="post">
    <p>Search: </p>

    <input type="text" name="search" placeholder="Enter Keyword">
    <input type="submit" value="Search">
</form>
<form action="/customer?actionUser=sort" method="post">
    <p>Sort By Name: </p>
    <input type="submit" name="byName" value="Sort By Name">
<%--    <input type="submit" value="Search">--%>
</form>
// sử dụng c:if nếu không muốn thẻ a hiện lên tại trang chủ customer
<a href="/customer">Go back home</a>
</body>
</html>
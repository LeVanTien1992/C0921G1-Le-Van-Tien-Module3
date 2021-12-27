<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<table>

    <tr>
        <td>Id: </td>
        <td>${vCustomer.id}</td>
    </tr>

    <tr>
        <td>Name: </td>
        <td>${vCustomer.name}</td>
    </tr>

    <tr>
        <td>Email: </td>
        <td>${vCustomer.email}</td>
    </tr>

    <tr>
        <td>Country: </td>
        <td>${vCustomer.country}</td>
    </tr>

</table>
</body>
</html>
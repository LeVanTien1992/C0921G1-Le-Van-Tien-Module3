<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/student">Back to student list</a>
</p>
<table>

    <tr>
        <td>Id: </td>
        <td>${list.id}</td>
    </tr>

    <tr>
        <td>Name: </td>
        <td>${list.name}</td>
    </tr>

    <tr>
        <td>Gender: </td>
        <td>${list.gender}</td>
    </tr>

    <tr>
        <td>Age: </td>
        <td>${list.age}</td>
    </tr>
        <tr>
            <td>Address: </td>
            <td>${list.address}</td>
        </tr>
        <tr>
            <td>Grade: </td>
            <td>${list.grade}</td>
        </tr>

</table>
</body>
</html>
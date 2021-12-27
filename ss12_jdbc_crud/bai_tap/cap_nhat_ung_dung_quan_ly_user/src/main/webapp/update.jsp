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
<form method="post" action="/customer?actionUser=update">
    <tr>
        <td>Id: </td>
        <td><input type="text" name="id" value="${cl.id} " readonly></td>
    </tr>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name" value="${cl.name} " ></td>
    </tr>
    <tr>
        <td>Email: </td>
        <td><input type="text" name="email" value="${cl.email} " ></td>
    </tr>
    <tr>
        <td>Country: </td>
        <td><input type="text" name="country" value="${cl.country} " ></td>
    </tr>
    <tr>
        <td><input type="submit" value="Update Custoner" ></td>
    </tr>

</form>
</body>
</html>
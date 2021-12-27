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
<form method="post" action="/customer">
    <input type="hidden" name="actionUser" value="create">
    <tr>
        <td>Name: </td>
        <td><input type="text" name="nameCustomer" ></td>
    </tr>
    <tr>
        <td>Email: </td>
        <td><input type="text" name="emailCustomer" ></td>
    </tr>
    <tr>
        <td>Country: </td>
        <td><input type="text" name="countryCustomer"  ></td>
    </tr>
    <tr>
        <td><input type="submit" value="Add Custoner" ></td>
    </tr>

</form>
</body>
</html>
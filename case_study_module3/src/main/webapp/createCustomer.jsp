
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
        <td><input type="text" name="customerName" ></td>
    </tr>
    <tr>
        <td>Date Of Birth: </td>
        <td><input type="text" name="customerDateOfBirth" ></td>
    </tr>

    <tr>
        <td>Gender: </td>
        <td><input type="text" name="customerGender"  ></td>
    </tr>
    <tr>
        <td>Id Card: </td>
        <td><input type="text" name="customerIdCard"  ></td>
    </tr>
    <tr>
        <td>Phone Number : </td>
        <td><input type="text" name="customerPhoneNumber"  ></td>
    </tr>
    <tr>
        <td>Email : </td>
        <td><input type="text" name="customerEmail"  ></td>
    </tr>
    <tr>
        <td>Address : </td>
        <td><input type="text" name="customerAddress"  ></td>
    </tr>
    <tr>
        <td>Customer Type Id : </td>
        <td><input type="text" name="customerTypeId"  ></td>
    </tr>
    <tr>
        <td><input type="submit" value="Add Custoner" ></td>
    </tr>

</form>
</body>
</html>

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
    <td>Customer Id: </td>
    <td><input type="text" name="customerId" value="${cl.customerId}" readonly></td>
  </tr>

  <tr>
    <td>Name: </td>
    <td><input type="text" name="customerName" value="${cl.customerName}"></td>
  </tr>

  <tr>
    <td>Date Of Birth: </td>
    <td><input type="text" name="customerDateOfBirth" value="${cl.customerDateOfBirth}" ></td>
  </tr>

  <tr>
    <td>Gender: </td>
    <td><input type="text" name="customerGender" value="${cl.customerGender}" ></td>
  </tr>

  <tr>
    <td>Id Card: </td>
    <td><input type="text" name="customerIdCard" value="${cl.customerIdCard}" ></td>
  </tr>

  <tr>
    <td>Phone Number : </td>
    <td><input type="text" name="customerPhoneNumber" value="${cl.customerPhoneNumber}" ></td>
  </tr>

  <tr>
    <td>Email : </td>
    <td><input type="text" name="customerEmail" value="${cl.customerEmail}" ></td>
  </tr>

  <tr>
    <td>Address : </td>
    <td><input type="text" name="customerAddress" value="${cl.customerAddress}" ></td>
  </tr>

  <tr>
    <td>Customer Type Id : </td>
    <td><input type="text" name="customerTypeId" value="${cl.customerType.customerTypeId}" ></td>
  </tr>

  <tr>
    <td><input type="submit" value="Update Custoner" ></td>
  </tr>

</form>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
<p>
    <a href="/home.jsp"> Go back to home page</a>
</p>
<p>
    <a href="/customer?actionUser=showFormCustomer">Create Customer</a>
</p>

<form action="/customer?actionUser=search" method="post">
    <p>Search: </p>
    <input type="text" name="search" placeholder="Enter Keyword">
    <input type="submit" value="Search">
</form>

<table id="tableStudent" class="table table-striped table-bordered" style="width:100%">
   <thead>
       <tr>
           <th>Customer Id</th>
           <th>Customer Name</th>
           <th>Customer Dat Of Birth</th>
           <th>Customer Gender</th>
           <th>Customer Id Card</th>
           <th>Customer Phone</th>
           <th>Customer Email</th>
           <th>Customer Address</th>
           <th>Customer Type Id </th>
           <th>Customer Type Name</th>
           <th>Action</th>
       </tr>
   </thead>
    <c:forEach items="${cList}" var="c">
        <tr>
            <td><c:out value="${c.customerId}"/></td>
            <td><c:out value="${c.customerName}"/></td>
            <td><c:out value="${c.customerDateOfBirth}"/></td>
            <td>
                <c:if test="${c.customerGender==1}">
                    Male
                </c:if>
                <c:if test="${c.customerGender==0}">
                    Female
                </c:if>
            </td>
            <td><c:out value="${c.customerIdCard}"/></td>
            <td><c:out value="${c.customerPhoneNumber}"/></td>
            <td><c:out value="${c.customerEmail}"/></td>
            <td><c:out value="${c.customerAddress}"/></td>
            <td><c:out value="${c.customerType.customerTypeId}"/></td>
            <td><c:out value="${c.customerType.customerTypeName}"/></td>
            <td>
                <a href="/customer?actionUser=delete&did=${c.customerId}">Delete</a>
                <a href="/customer?actionUser=formUpdateById&uid=${c.customerId}">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function() {
        $('#tableStudent').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div style="text-align: center">
    <form  action="/account" method="post">
      <h2>Login</h2>
      <br>
      <input class="form-control" type="text" name="username" placeholder="username">
      <input class="form-control" type="password" name="password" placeholder="password">
      <input type="submit" class="btn btn-primary" value="Login">
    </form>
    <h1>${customer}</h1>
  </div>
  </body>
</html>

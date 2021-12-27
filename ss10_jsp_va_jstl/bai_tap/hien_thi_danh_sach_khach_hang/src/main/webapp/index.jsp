<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Bootstrap Simple Login Form</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <style>
    .login-form {
      width: 340px;
      margin: 50px auto;
      font-size: 15px;
    }
    .login-form form {
      margin-bottom: 15px;
      background: #f7f7f7;
      box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
      padding: 30px;
    }
    .login-form h2 {
      margin: 0 0 15px;
    }
    .form-control, .btn {
      min-height: 38px;
      border-radius: 2px;
    }
    .btn {
      font-size: 15px;
      font-weight: bold;
    }
  </style>
</head>
<body>
<div class="login-form">
  <form action="/account" method="post">
    <h2 class="text-center">Log in</h2>
    <div class="form-group">
      <input type="text" class="form-control" placeholder="Username" name="username" required="required">
    </div>
    <div class="form-group">
      <input type="password" class="form-control" placeholder="Password" name="password" required="required">
    </div>
    <div class="form-group">
      <button type="submit" class="btn btn-primary btn-block" value="Login">Log in</button>
    </div>
    <div class="clearfix">
      <label class="float-left form-check-label"><input type="checkbox"> Remember me</label>
      <a href="#" class="float-right">Forgot Password?</a>
    </div>
  </form>
  <h1>${customer}</h1>
  <p class="text-center"><a href="#">Create an Account</a></p>
</div>
</body>
</html>
<%--<html>--%>
<%--  <head>--%>
<%--    <title>$Title$</title>--%>
<%--  </head>--%>
<%--  <body>--%>
<%--  <div style="text-align: center">--%>
<%--    <form  action="/account" method="post">--%>
<%--      <h2>Login</h2>--%>
<%--      <br>--%>
<%--      <input class="form-control" type="text" name="username" placeholder="username">--%>
<%--      <input class="form-control" type="password" name="password" placeholder="password">--%>
<%--      <input type="submit" class="btn btn-primary" value="Login">--%>
<%--    </form>--%>
<%--    <h1>${customer}</h1>--%>
<%--  </div>--%>
<%--  </body>--%>
<%--</html>--%>
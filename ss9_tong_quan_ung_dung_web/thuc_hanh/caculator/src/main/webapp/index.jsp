<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/18/2021
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
  </head>
  <body>
  <form method="post", action="/Caculator">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30" />
      <input type="text" name="password" size="30" />
<%--      <select name="addition">--%>
<%--        <option value="+">+</option>--%>
<%--        <option value="-">-</option>--%>
<%--        <option value="*">*</option>--%>
<%--        <option value="/">/</option>--%>
<%--      </select>--%>
      <input type="submit" name="caculator" size="30" value="+" />
      <input type="submit" name="caculator" size="30" value="-" />
      <input type="submit" name="caculator" size="30" value="*" />
      <input type="submit" name="caculator" size="30" value="/" />
    </div>
  </form>
  </body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Add user! " %></h1>
<br/>
<form action="user-register" method="post">
  <table>
    <tr>
      <td>first Name</td>
      <td><input type="text" name="fname"></td>
    </tr>
    <tr>
      <td>last Name</td>
      <td><input type="text" name="lname"></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="email"></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="password" name="x"></td>
    </tr>
    <tr>
      <td>Submit</td>
      <td><input type="submit" value="UserRegister"></td>
    </tr>
  </table>
</form>
</body>
</html>
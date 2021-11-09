<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Add User</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
  </head>
  <body>
    <div class="container">
      <hr />
      <h2>Escolha seu plano</h2>
      <c:forEach items="${plans}" var="plan">
        <span>${plan.name}></span>
      </c:forEach>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Add User</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid">
        <div class="d-flex justify-content-center">
          <a class="navbar-brand" href="#">
            <img src="resources/img/logo.png" alt="" width="100%" height="30px" />
          </a>
        </div>
      </div>
    </nav>
    <div class="progress">
      <div class="progress-bar bg-danger" role="progressbar" style="width: 60%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="container">
      <h2 class="mt-3 text-center">Escolha seu plano</h2>

      <div class="d-flex mt-5 justify-content-center">
        <div class="row">
          <div class="col">
            <c:forEach items="${plans}" var="plan">
              <div class="card p-3 m-3">
                <h3 class="card-title text-center">${plan.description}</h3>
                <span>${plan.description}></span>
              </div>
            </c:forEach>
          </div>
        </div>
      </div>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
    <script src="resources/js/validate-form.js"></script>
  </body>
</html>

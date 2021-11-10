<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>iFood - Escolha seu plano</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
    <jsp:include page="/_includes/header.jsp">
      <jsp:param name="title" value="This is the page title" />
    </jsp:include>
    <div class="progress">
      <div class="progress-bar bg-danger" role="progressbar" style="width: 60%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="container">
      <h2 class="mt-3 text-center">Escolha seu plano</h2>
      <div class="d-flex mt-5 justify-content-center">
        <div class="row">
            <c:forEach items="${plans}" var="plan">
                <div class="col-sm"></div>
                  <div class="card p-3 m-3">
                    <h3 class="card-title text-center">${plan.name}</h3>
                    ${plan.description}
                    <p><span>${plan.commission * 100}</span></p>
                    <p><span>${plan.tax * 100}</span></p>
                    <p>R$<span>plan.price</span></p>
                  </div>
              </div>
            </c:forEach>
        </div>
      </div>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
    <script src="resources/js/validate-form.js"></script>
  </body>
</html>

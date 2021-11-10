<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>iFood - registrar informações da loja</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
  <body>
    <jsp:include page="/_includes/header.jsp" >
        <jsp:param name="title" value="This is the page title"/>
    </jsp:include>
    <div class="progress">
      <div class="progress-bar bg-danger" role="progressbar" style="width: 90%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="container">
      <div class="d-flex mt-5 justify-content-center">
        <div class="row">
        <div class="col">
          <div class="card p-3 m-3">
            <div>
              <h3 class="card-title text-center">Informações da loja</h3>
            </div>
            <div class="card-body">
              <form class="needs-validation" action="registerstore" method="post" novalidate>
                <jsp:include page="/_includes/form-control-store.jsp" >
                  <jsp:param name="title" value="This is the page title"/>
                </jsp:include>
                <div class="d-grid gap-2">
                  <button class="btn btn-danger" type="submit">Concluir</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      </div>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
    <script src="resources/js/validate-form.js"></script>

  </body>
</html>

<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Add User</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
    <jsp:include page="/_includes/header.jsp" >
        <jsp:param name="title" value="This is the page title"/>
    </jsp:include>
    <div class="progress">
      <div class="progress-bar bg-danger" role="progressbar" style="width: 50%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="container">
      <div class="d-flex mt-5 justify-content-center">
        <div class="row">
          <div class="col">
          <div class="card p-3 m-3">
              <h3 class="card-title text-center">Responsável legal da loja</h3>
              <h6 class="card-subtitle mb-2 text-muted">
                <p>Informe os dados da pessoa que tem o nome no contato social da empresa, </p>
                <p>seja como dona, sócia ou sócia administrativa.</p>
              </h6>
          <div class="card-body">
            <form class="needs-validation" action="registerresponsible" method="post" novalidate>
                <jsp:include page="/_includes/form-control-responsible.jsp" >
                    <jsp:param name="title" value="This is the page title"/>
                </jsp:include>
                <div class="d-grid gap-2">
                  <button class="btn btn-danger" type="submit">Continuar</button>
                </div>
            </form>
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

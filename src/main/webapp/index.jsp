<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>iFood - Parceiros</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/index.css" />
  </head>
  <body>

    </nav>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid ">
        <a class="navbar-brand" href="#">
          <img src="resources/img/logo.png" alt="" width="100%" height="30px" />
        </a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNavAltMarkup"
          aria-controls="navbarNavAltMarkup"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav ">
            <a class="nav-link active" href="#" aria-disabled="true">Cadastrar mercado</a>
            <a class="nav-link" href="#" aria-disabled="true">Como funciona</a>
            <a class="nav-link" href="#" aria-disabled="true">Ajuda</a>
            <a class="nav-link" href="#" aria-disabled="true">Portal do parceiro</a>
          </div>
        </div>
      </div>
    </nav>
    <div class="container d-flex h-100">
      <div class="row">
        <div class="col">
          <div class="card p-3 m-3">
            <div>
              <h3 class="card-title text-center">Cadastre sua loja</h3>
            </div>
            <div class="card-body">
              <form class ="needs-validation" action="registercontact" method="post" novalidate>
                <jsp:include page="/_includes/form-control-contact.jsp">
                  <jsp:param name="title" value="This is the page title" />
                </jsp:include>
                <div class="d-grid gap-2">
                  <button class="btn btn-danger" type="submit">Cadastrar Agora</button>
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

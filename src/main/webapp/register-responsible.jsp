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
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid">
        <div class="d-flex justify-content-center">
          <div></div>
          <a class="navbar-brand" href="#">
            <img src="resources/img/logo.png" alt="" width="100%" height="30px" />
          </a>
        </div>
      </div>
    </nav>
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
                <div class="has-validation mb-3">
                  <label for="userName">Nome Completo</label>
                  <input class="form-control" type="text" name="name" id="userName" required/>
                  <div class="invalid-feedback">Campo obrigatório</div>

                </div>
                <div class="has-validation mb-3">
                  <label for="cpf">CPF</label>
                  <input class="form-control" type="number" name="cpf" id="cpf" required/>
                  <div class="invalid-feedback">Campo obrigatório</div>

                </div>
                <div class="has-validation mb-3">
                  <label for="rg">RG</label>
                  <input class="form-control" type="number" name="rg" id="rg" required/>
                  <div class="invalid-feedback">Campo obrigatório</div>

                </div>
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
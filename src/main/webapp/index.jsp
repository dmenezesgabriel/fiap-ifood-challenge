<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>ifood - Parceiros</title>
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
                <div class="has-validation mb3">
                  <label class="form-label" for="userName">Nome Completo</label>
                  <input class="form-control" type="text" name="name" id="userName" placeholder="João da Silva" required/>
                  <div class="invalid-feedback">
                    Campo obrigatório
                  </div>
                </div>
                <div class="has-validation mb3">
                  <label class="form-label" for="email">E-mail</label>
                  <input class="form-control" type="email" name="email" id="email" placeholder="email@email.com.br" required/>
                  <div class="invalid-feedback">
                    Campo obrigatório
                  </div>
                </div>
                <div class="has-validation mb-3">
                  <label class="form-label" for="phone">Celular (com DDD)</label>
                  <input class="form-control" type="tel" required="required" maxlength="15" name="phone" placeholder="(00) 00000-0000" required/>
                  <div class="invalid-feedback">
                    Campo obrigatório
                  </div>
                </div>
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
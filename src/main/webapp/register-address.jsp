<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>ifood - Parceiros</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
    <jsp:include page="/_includes/header.jsp">
      <jsp:param name="title" value="This is the page title" />
    </jsp:include>
    <div class="progress">
      <div class="progress-bar bg-danger" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
    </div>
    <div class="container">
      <div class="d-flex mt-5 justify-content-center">
        <div class="row">
          <div class="col">
            <div class="card p-3 m-3">
              <h3 class="card-title text-center">Endereço da loja</h3>
              <h6s class="card-subtitle mb-2 text-muted">Preencha as informações de endereço de sua loja</h6s>

              <div class="card-body">
                <form class="needs-validation" action="registeraddress" method="post" novalidate>
                  <div class="has-validation mb-3">
                    <label for="zip">CEP</label>
                    <input class="form-control" id="zip" name="zip" type="text" inputmode="numeric" required />
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="state">Estado</label>
                    <select class="form-select" id="state" name="state">
                      <!-- includes -->
                      <jsp:include page="/_includes/state-opt.jsp">
                        <jsp:param name="title" value="This is the page title" />
                      </jsp:include>
                      <!-- includes -->
                    </select>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="city">Cidade</label>
                    <select class="form-select" id="city" name="city" required>
                      <!-- includes -->
                      <jsp:include page="/_includes/city-opt.jsp">
                        <jsp:param name="title" value="This is the page title" />
                      </jsp:include>
                      <!-- includes -->
                    </select>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="address">Endereço</label>
                    <input class="form-control" type="text" name="address" id="address" required />
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="district">Bairro</label>
                    <input class="form-control" type="text" name="district" id="district" required />
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="number">Número</label>
                    <input class="form-control" type="number" name="number" id="number" required />
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="adjunct">Complemento</label>
                    <input class="form-control" type="text" name="adjunct" id="adjunct" required />
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
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
    <script src="resources/js/validate-form.js"></script>
  </body>
</html>

<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>iFood- Editar informaçõess da Loja</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/css/global.css" />
  </head>
  <body>
  <jsp:include page="/_includes/header.jsp" >
      <jsp:param name="title" value="This is the page title"/>
  </jsp:include>
    <div class="container">
      <div>
          <div class="card p-3 m-3">
              <h1 class="card-title text-center text-danger">Editar loja</h1>
          <div class="card-body">
            <form class="needs-validation" action="definir" method="post" novalidate>
              <div class="row">
                <!-- Col -->
                <div class="col-sm">
                  <h3 class="text-muted">Loja</h3>
                  <hr>
                  <jsp:include page="/_includes/form-control-store.jsp" >
                    <jsp:param name="title" value="This is the page title"/>
                  </jsp:include>
                </div>
                <!-- Col -->
                <div class="col-sm">
                  <h3 class="text-muted">Responsável Legal</h3>
                  <hr>
                  <jsp:include page="/_includes/form-control-responsible.jsp" >
                      <jsp:param name="title" value="This is the page title"/>
                  </jsp:include>
                </div>
                <div class="row">
                  <div class="col">
                  <h3 class="text-muted">Contato</h3>
                  <hr>
                  <jsp:include page="/_includes/form-control-contact.jsp">
                    <jsp:param name="title" value="This is the page title" />
                  </jsp:include>
                </div>
                </div>
                <div class="row">
                <!-- Col -->
                <div class="col-sm">
                  <h3 class="text-muted">Endereço</h3>
                  <hr>
                  <jsp:include page="/_includes/form-control-address.jsp">
                    <jsp:param name="title" value="This is the page title" />
                  </jsp:include>
                  <div>
                    <button class="btn btn-danger" type="submit">Salvar</button>
                    <button class="btn btn-secondary" type="submit">Cancelar</button>
                  </div>
            </form>
          </div>
      </div>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
    <script src="resources/js/validate-form.js"></script>
  </body>
</html>

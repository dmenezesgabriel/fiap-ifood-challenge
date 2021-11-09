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
      <h2>Responsável legal da loja</h2>
      <h3>
        Informe os dados da pessoa que tem o nome no contato social da empresa,
        seja como dona, sócia ou sócia administrativa.
      </h3>

      <form action="registerresponsible" method="post">
        <fieldset>
          <div>
            <label for="userName">Nome Completo</label>
            <input type="text" name="name" id="userName" />
          </div>
          <div>
            <label for="cpf">CPF</label>
            <input type="number" name="cpf" id="cpf" />
          </div>
          <div>
            <label for="rg">RG</label>
            <input type="number" name="rg" id="rg" />
          </div>
          <input type="submit" value="Continuar" />
        </fieldset>
      </form>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

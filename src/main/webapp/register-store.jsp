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
      <h2>Cadastre sua loja</h2>

      <form action="registercontact" method="post">
        <fieldset>
          <div>
            <label for="userName">Nome</label>
            <input type="text" name="name" id="userName" />
          </div>
          <div>
            <label for="email">E-mail</label>
            <input type="email" name="email" id="email" />
          </div>
          <div>
            <label for="phone">Celular</label>
            <input type="tel" required="required" maxlength="15" name="phone" />
          </div>
          <input type="submit" value="Salvar" />
        </fieldset>
      </form>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

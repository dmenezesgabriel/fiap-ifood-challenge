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
      <h2>Informações da loja</h2>

      <form action="registerstore" method="post">
        <fieldset>
          <div>
            <label for="cnpj">CNPJ</label>
            <input type="number" name="cnpj" id="cnpj" />
          </div>
          <div>
            <label for="companyName">Razão social</label>
            <input type="text" name="companyName" id="companyName" />
          </div>
          <div>
            <label for="name">Nome da loja</label>
            <input type="text" name="name" id="name" />
          </div>
          <div>
            <label for="phone">Telefone ou Celular da loja</label>
            <input type="tel" required="required" maxlength="15" name="phone" />
          </div>
          <label for="specialty">Especialidade</label>
          <select id="specialty">
            <option value="Acai">Acai</option>
          </select>
          <input type="submit" value="Avançar" />
        </fieldset>
      </form>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

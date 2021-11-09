<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page isELIgnored="false" %>
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
      <h2>Cadastro de Produto</h2>

      <form action="registeruser" method="post">
        <fieldset>
          <div>
            <label for="userName">Nome</label>
            <input type="text" name="name" id="userName" />
          </div>
          <div>
            <label for="birthDate">Data de Nascimento</label>
            <input type="date" name="birthDate" id="birthDate" />
          </div>
          <div>
            <label for="gender">Gênero</label>
            <select name="gender" id="gender">
              <option value="Masculino">Masculino</option>
              <option value="Feminino">Feminino</option>
            </select>
          </div>
          <div>
            <label for="email">Email</label>
            <input type="text" name="email" id="email" />
          </div>
          <div>
            <label for="password">Senha</label>
            <input type="password" name="password" id="password" />
          </div>
          <input type="submit" value="Salvar" />
        </fieldset>
      </form>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

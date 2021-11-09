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
            <label for="zip">CEP</label>
            <input id="zip" name="zip" type="text" inputmode="numeric" />
          </div>
          <div>
            <label for="state">Estado</label>
            <select id="state">
              <option value="Acre">Acre</option>
              <option value="Alagoas">Alagoas</option>
              <option value="Amapá">Amapá</option>
              <option value="Amazonas">Amazonas</option>
              <option value="Bahia">Bahia</option>
              <option value="Ceará">Ceará</option>
              <option value="Espírito Santo">Espírito Santo</option>
              <option value="Goiás">Goiás</option>
              <option value="Maranhão">Maranhão</option>
              <option value="Mato Grosso">Mato Grosso</option>
              <option value="Mato Grosso do Sul">Mato Grosso do Sul</option>
              <option value="Minas Gerais">Minas Gerais</option>
              <option value="Pará">Pará</option>
              <option value="Paraíba">Paraíba</option>
              <option value="Paraná">Paraná</option>
              <option value="Pernambuco">Pernambuco</option>
              <option value="Piauí">Piauí</option>
              <option value="Rio de Janeiro">Rio de Janeiro</option>
              <option value="Rio Grande do Norte">Rio Grande do Norte</option>
              <option value="Rio Grande do Sul">Rio Grande do Sul</option>
              <option value="Rondônia">Rondônia</option>
              <option value="Roraima">Roraima</option>
              <option value="Santa Catarina">Santa Catarina</option>
              <option value="São Paulo">São Paulo</option>
              <option value="Sergipe">Sergipe</option>
              <option value="Tocantins">Tocantins</option>
              <option value="Distrito Federal">Distrito Federal</option>
            </select>
          </div>
          <div>
            <label for="city">Cidade</label>
            <select id="city">
              <option value="volvo">Volvo</option>
              <option value="saab">Saab</option>
              <option value="opel">Opel</option>
              <option value="audi">Audi</option>
            </select>
          </div>
          <div>
            <label for="district">Bairro</label>
            <input type="text" name="district" id="district" />
          </div>
          <div>
            <label for="address">Endereço</label>
            <input type="text" name="address" id="address" />
          </div>
          <div>
            <label for="number">Número</label>
            <input type="number" name="number" id="number" />
          </div>
          <div>
            <label for="adjunct">Complemento</label>
            <input type="text" name="adjunct" id="adjunct" />
          </div>
          <input type="submit" value="Salvar" />
        </fieldset>
      </form>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/jquery-3.6.0.min.js"></script>
  </body>
</html>

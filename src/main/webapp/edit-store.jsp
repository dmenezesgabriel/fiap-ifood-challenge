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
                  <div class="has-validation mb-3">
                    <label for="cnpj">CNPJ</label>
                    <input class="form-control" type="number" name="cnpj" id="cnpj" required/>
                  </div>
                  <div class="invalid-feedback">Campo obrigatório</div>
                  <div class="has-validation mb-3">
                    <label for="companyName">Razão social</label>
                    <input class="form-control" type="text" name="companyName" id="companyName" required/>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="name">Nome da loja</label>
                    <input class="form-control" type="text" name="name" id="name" required/>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                      <label for="phone">Telefone ou Celular da loja</label>
                      <input class="form-control" type="tel" required="required" maxlength="15" name="phone" required/>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="specialty">Especialidade</label>
                    <select class="form-control" id="specialty">
                      <option value="Acai">Acai</option>
                    </select>
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                </div>
                <!-- Col -->
                <div class="col-sm">
                  <h3 class="text-muted">Responsável Legal</h3>
                  <hr>
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
                </div>
                <div class="row">
                  <div class="col">
                  <h3 class="text-muted">Contato</h3>
                  <hr>
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
                </div>
                </div>
                <div class="row">
                <!-- Col -->
                <div class="col-sm">
                  <h3 class="text-muted">Endereço</h3>
                  <hr>
                  <div class="has-validation mb-3">
                    <label for="zip">CEP</label>
                    <input class="form-control" id="zip" name="zip" type="text" inputmode="numeric" required />
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="state">Estado</label>
                    <select class="form-select" id="state" name="state">
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
                    <div class="invalid-feedback">Campo obrigatório</div>
                  </div>
                  <div class="has-validation mb-3">
                    <label for="city">Cidade</label>
                    <select class="form-select" id="city" name="city" required>
                      <option value="São Paulo">São Paulo</option>
                      <option value="Rio de Janeiro">Rio de Janeiro</option>
                      <option value="Salvador">Salvador</option>
                      <option value="Brasília">Brasília</option>
                      <option value="Fortaleza">Fortaleza</option>
                      <option value="Belo Horizonte">Belo Horizonte</option>
                      <option value="Manaus">Manaus</option>
                      <option value="Curitiba">Curitiba</option>
                      <option value="Recife">Recife</option>
                      <option value="Porto Alegre">Porto Alegre</option>
                      <option value="Belém">Belém</option>
                      <option value="Goiânia">Goiânia</option>
                      <option value="Guarulhos">Guarulhos</option>
                      <option value="Campinas">Campinas</option>
                      <option value="São Luís">São Luís</option>
                      <option value="São Gonçalo">São Gonçalo</option>
                      <option value="Maceió">Maceió</option>
                      <option value="Duque de Caxias">Duque de Caxias</option>
                      <option value="Natal">Natal</option>
                      <option value="Campo Grande">Campo Grande</option>
                      <option value="Teresina">Teresina</option>
                      <option value="São Bernardo do Campo">São Bernardo do Campo</option>
                      <option value="Nova Iguaçu">Nova Iguaçu</option>
                      <option value="João Pessoa">João Pessoa</option>
                      <option value="Santo André">Santo André</option>
                      <option value="Osasco">Osasco</option>
                      <option value="São José dos Campos">São José dos Campos</option>
                      <option value="Jaboatão dos Guararapes">Jaboatão dos Guararapes</option>
                      <option value="Ribeirão Preto">Ribeirão Preto</option>
                      <option value="Uberlândia">Uberlândia</option>
                      <option value="Contagem">Contagem</option>
                      <option value="Sorocaba">Sorocaba</option>
                      <option value="Aracaju">Aracaju</option>
                      <option value="Feira de Santana">Feira de Santana</option>
                      <option value="Cuiabá">Cuiabá</option>
                      <option value="Joinville">Joinville</option>
                      <option value="Juiz de Fora">Juiz de Fora</option>
                      <option value="Londrina">Londrina</option>
                      <option value="Aparecida de Goiânia">Aparecida de Goiânia</option>
                      <option value="Ananindeua">Ananindeua</option>
                      <option value="Niterói">Niterói</option>
                      <option value="Porto Velho">Porto Velho</option>
                      <option value="Campos dos Goytacazes">Campos dos Goytacazes</option>
                      <option value="Belford Roxo">Belford Roxo</option>
                      <option value="Serra">Serra</option>
                      <option value="Caxias do Sul">Caxias do Sul</option>
                      <option value="Vila Velha">Vila Velha</option>
                      <option value="Florianópolis">Florianópolis</option>
                      <option value="São João de Meriti">São João de Meriti</option>
                      <option value="Mauá">Mauá</option>
                      <option value="Macapá">Macapá</option>
                      <option value="São José do Rio Preto">São José do Rio Preto</option>
                      <option value="Santos">Santos</option>
                      <option value="Mogi das Cruzes">Mogi das Cruzes</option>
                      <option value="Betim">Betim</option>
                      <option value="Diadema">Diadema</option>
                      <option value="Campina Grande">Campina Grande</option>
                      <option value="Jundiaí">Jundiaí</option>
                      <option value="Maringá">Maringá</option>
                      <option value="Montes Claros">Montes Claros</option>
                      <option value="Carapicuíba">Carapicuíba</option>
                      <option value="Olinda">Olinda</option>
                      <option value="Piracicaba">Piracicaba</option>
                      <option value="Cariacica">Cariacica</option>
                      <option value="Bauru">Bauru</option>
                      <option value="Rio Branco">Rio Branco</option>
                      <option value="Anápolis">Anápolis</option>
                      <option value="São Vicente">São Vicente</option>
                      <option value="Vitória">Vitória</option>
                      <option value="Caucaia">Caucaia</option>
                      <option value="Itaquaquecetuba">Itaquaquecetuba</option>
                      <option value="Caruaru">Caruaru</option>
                      <option value="Pelotas">Pelotas</option>
                      <option value="Vitória da Conquista">Vitória da Conquista</option>
                      <option value="Canoas">Canoas</option>
                      <option value="Franca">Franca</option>
                      <option value="Ponta Grossa">Ponta Grossa</option>
                      <option value="Blumenau">Blumenau</option>
                      <option value="Petrolina">Petrolina</option>
                      <option value="Paulista">Paulista</option>
                      <option value="Ribeirão das Neves">Ribeirão das Neves</option>
                      <option value="Uberaba">Uberaba</option>
                      <option value="Boa Vista">Boa Vista</option>
                      <option value="Cascavel">Cascavel</option>
                      <option value="Guarujá">Guarujá</option>
                      <option value="Taubaté">Taubaté</option>
                      <option value="Petrópolis">Petrópolis</option>
                      <option value="Limeira">Limeira</option>
                      <option value="Praia Grande">Praia Grande</option>
                      <option value="São José dos Pinhais">São José dos Pinhais</option>
                      <option value="Santarém">Santarém</option>
                      <option value="Mossoró">Mossoró</option>
                      <option value="Suzano">Suzano</option>
                      <option value="Camaçari">Camaçari</option>
                      <option value="Governador Valadares">Governador Valadares</option>
                      <option value="Santa Maria">Santa Maria</option>
                      <option value="Gravataí">Gravataí</option>
                      <option value="Taboão da Serra">Taboão da Serra</option>
                      <option value="Várzea Grande">Várzea Grande</option>
                      <option value="Palmas">Palmas</option>
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

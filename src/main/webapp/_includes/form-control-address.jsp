<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->
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

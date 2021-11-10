<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->
<div class="has-validation mb-3">
  <label for="cnpj">CNPJ</label>
  <input class="form-control" type="number" name="storeCnpj" id="cnpj" maxlength="14" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="companyName">Razão social</label>
  <input class="form-control" type="text" name="companyName" id="companyName" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="name">Nome da loja</label>
  <input class="form-control" type="text" name="storeName" id="name" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="phone">Telefone ou Celular da loja</label>
  <input class="form-control" type="tel" required="required" maxlength="15" name="storePhone" required />
  <div class="invalid-feedback">Campo obrigatório</div>
  <div class="has-validation mb-3">
    <label for="specialty">Especialidade</label>
    <select class="form-control" name="specialty" id="specialty">
      <option value="Acai">Acai</option>
    </select>
    <div class="invalid-feedback">Campo obrigatório</div>
  </div>
</div>

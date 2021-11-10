<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->
<div class="has-validation mb-3">
  <label for="userName">Nome Completo</label>
  <input class="form-control" type="text" name="name" id="userName" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="cpf">CPF</label>
  <input class="form-control" type="number" name="cpf" id="cpf" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="rg">RG</label>
  <input class="form-control" type="number" name="rg" id="rg" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>

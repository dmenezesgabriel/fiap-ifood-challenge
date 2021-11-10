<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->
<div class="has-validation mb-3">
  <label for="userName">Nome Completo</label>
  <input class="form-control" type="text" name="responsibleName" id="userName" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="cpf">CPF</label>
  <input class="form-control" type="number" name="responsibleCpf" id="cpf" maxlength="12" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label for="rg">RG</label>
  <input class="form-control" type="number" name="responsibleRg" id="rg" maxlength="9" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>

<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%> <%@ page isELIgnored="false" %> -->
<div class="has-validation mb3">
  <label class="form-label" for="userName">Nome Completo</label>
  <input class="form-control" type="text" name="name" id="userName" placeholder="João da Silva" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb3">
  <label class="form-label" for="email">E-mail</label>
  <input class="form-control" type="email" name="email" id="email" placeholder="email@email.com.br" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="has-validation mb-3">
  <label class="form-label" for="phone">Celular (com DDD)</label>
  <input class="form-control" type="tel" required="required" maxlength="15" name="phone" placeholder="(00) 00000-0000" required />
  <div class="invalid-feedback">Campo obrigatório</div>
</div>
<div class="d-grid gap-2">
  <button class="btn btn-danger" type="submit">Cadastrar Agora</button>
</div>

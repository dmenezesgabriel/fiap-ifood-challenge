UPDATE T_IFD_LOJA
  SET nm_loja = ?,
	ds_razao_social = ?,
  nr_cnpj = ?,
  nr_telefone = ?,
  cd_especialidade = ?,
  cd_contato = ?,
  cd_endereco = ?,
  cd_responsavel = ?,
  cd_plano = ?
WHERE cd_loja = ?

SELECT
	cd_loja,
	nm_loja,
	ds_razao_social,
  nr_cnpj,
  nr_telefone,
  cd_especialidade,
  cd_contato,
  cd_endereco,
  cd_responsavel,
  cd_plano,
FROM T_IFD_LOJA
WHERE
	cd_loja = ?
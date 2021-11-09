SELECT
	cd_responsavel,
	nm_responsavel,
  nr_cpf,
  nr_rg
FROM T_IFD_RESPONSAVEL

WHERE
	cd_responsavel = ?
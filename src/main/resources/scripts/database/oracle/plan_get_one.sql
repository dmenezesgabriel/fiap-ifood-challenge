SELECT
	cd_plano,
	nm_plano,
  ds_plano,
  vl_comissao,
  vl_taxa,
  vl_preco
FROM T_IFD_PLANO
WHERE
	cd_plano = ?
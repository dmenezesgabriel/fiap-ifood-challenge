INSERT INTO T_IFD_PLANO (
  cd_plano,
  nm_plano,
  ds_plano,
  vl_comissao,
  vl_taxa,
  vl_preco
)
VALUES (
  SEQ_IFD_PLANO.NEXTVAL,
  ?,
  ?,
  ?,
  ?,
  ?
  )
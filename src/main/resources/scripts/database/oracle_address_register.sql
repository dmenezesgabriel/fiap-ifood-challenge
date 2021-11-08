INSERT INTO T_IFD_ENDERECO (
	cd_endereco,
	nm_estado,
  nm_cidade,
  nm_bairro,
  ds_endereco,
  nr_numero,
  ds_complemento
)
VALUES (
  SEQ_IFD_ENDERECO.NEXTVAL,
  ?,
  ?,
  ?,
  ?,
  ?,
  ?,
  ?
  )
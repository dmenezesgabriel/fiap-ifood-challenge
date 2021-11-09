INSERT INTO T_IFD_RESPONSAVEL (
	cd_responsavel,
	nm_responsavel,
  nr_cpf,
  nr_rg
)
VALUES (
  SEQ_IFD_RESPONSAVEL.NEXTVAL,
  ?,
  ?,
  ?
  )
INSERT INTO T_IFD_USUARIO (
  cd_usuario,
  nm_usuario,
  dt_nascimento,
  ds_genero,
  ds_email,
  ds_senha
)
VALUES (
  SEQ_IFD_USUARIO.NEXTVAL,
  ?,
  TO_DATE(?, 'DD/MM/YYYY'),
  UPPER(?),
  ?,
  ?
  )
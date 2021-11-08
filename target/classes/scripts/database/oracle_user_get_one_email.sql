SELECT
	cd_usuario,
	nm_usuario,
	dt_nascimento,
	ds_genero,
	ds_email,
	ds_senha
FROM T_IFD_USUARIO
WHERE
	ds_email = ?
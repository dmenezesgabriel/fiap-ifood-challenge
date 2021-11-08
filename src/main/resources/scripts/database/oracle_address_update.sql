UPDATE T_IFD_ENDERECO
  SET cd_cep = ?,
	nm_estado = ?,
  nm_cidade = ?,
  nm_bairro = ?,
  ds_endereco = ?,
  nr_numero = ?,
  ds_complemento = ?
WHERE cd_endereco = ?

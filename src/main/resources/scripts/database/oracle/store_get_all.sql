SELECT
	T_IFD_LOJA.cd_loja,
	T_IFD_LOJA.nm_loja,
	T_IFD_LOJA.ds_razao_social,
  T_IFD_LOJA.nr_cnpj,
  T_IFD_LOJA.nr_telefone,
  T_IFD_LOJA.cd_especialidade,
  T_IFD_LOJA.cd_contato,
  T_IFD_LOJA.cd_endereco,
  T_IFD_LOJA.cd_responsavel,
  T_IFD_LOJA.cd_plano,
  T_IFD_ENDERECO.cd_cep,
	T_IFD_ENDERECO.nm_estado,
  T_IFD_ENDERECO.nm_cidade,
  T_IFD_ENDERECO.nm_bairro,
  T_IFD_ENDERECO.ds_endereco,
  T_IFD_ENDERECO.nr_numero,
  T_IFD_ENDERECO.ds_complemento,
	T_IFD_CONTATO.nm_contato,
  T_IFD_CONTATO.ds_email,
  T_IFD_CONTATO.nr_celular,
	T_IFD_PLANO.nm_plano,
  T_IFD_PLANO.ds_plano,
  T_IFD_PLANO.vl_comissao,
  T_IFD_PLANO.vl_taxa,
  T_IFD_PLANO.vl_preco,
  T_IFD_RESPONSAVEL.cd_responsavel,
	T_IFD_RESPONSAVEL.nm_responsavel,
  T_IFD_RESPONSAVEL.nr_cpf,
  T_IFD_RESPONSAVEL.nr_rg,
  T_IFD_ESPECIALIDADE.cd_especialidade,
	T_IFD_ESPECIALIDADE.nm_especialidade
FROM T_IFD_LOJA
  LEFT JOIN T_IFD_ENDERECO ON T_IFD_LOJA.cd_endereco = T_IFD_ENDERECO.cd_endereco
  LEFT JOIN T_IFD_CONTATO ON T_IFD_LOJA.cd_contato = T_IFD_CONTATO.cd_contato
  LEFT JOIN T_IFD_PLANO ON T_IFD_LOJA.cd_plano = T_IFD_PLANO.cd_plano
  LEFT JOIN T_IFD_RESPONSAVEL ON T_IFD_LOJA.cd_responsavel = T_IFD_RESPONSAVEL.cd_responsavel
  LEFT JOIN T_IFD_ESPECIALIDADE ON T_IFD_LOJA.cd_especialidade = T_IFD_ESPECIALIDADE.cd_especialidade




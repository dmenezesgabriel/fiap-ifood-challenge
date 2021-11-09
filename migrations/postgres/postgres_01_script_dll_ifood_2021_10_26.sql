-- DDL
-------------------------------------------------------------------------------
-- Delete tables and sequences
-------------------------------------------------------------------------------
  DROP TABLE IF EXISTS T_IFD_LOJA CASCADE;
  DROP TABLE IF EXISTS T_IFD_ENDERECO CASCADE;
  DROP TABLE IF EXISTS T_IFD_CONTATO CASCADE;
  DROP TABLE IF EXISTS T_IFD_RESPONSAVEL CASCADE;
  DROP TABLE IF EXISTS T_IFD_PLANO CASCADE;
  DROP TABLE IF EXISTS T_IFD_ESPECIALIDADE CASCADE;
-------------------------------------------------------------------------------
-- CREATE TABLE IF NOT EXISTSs and constraints
-------------------------------------------------------------------------------
-------------------------------------------------------------------------------
-- T_IFD_LOJA
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_LOJA (
	cd_loja SERIAL,
	nm_loja VARCHAR NOT NULL,
	ds_razao_social VARCHAR NOT NULL,
  nr_cnpj INT NOT NULL,
  nr_telefone INT NOT NULL,
  cd_especialidade INT NOT NULL,
  cd_contato INT NOT NULL,
  cd_endereco INT NOT NULL,
  cd_responsavel INT NOT NULL,
  cd_plano INT NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT PK_HT_LOJA PRIMARY KEY (cd_loja);
-------------------------------------------------------------------------------
-- T_IFD_ENDERECO
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_ENDERECO (
  cd_endereco SERIAL,
  cd_cep INT NOT NULL,
  nm_estado VARCHAR NOT NULL,
  nm_cidade VARCHAR NOT NULL,
  nm_bairro VARCHAR NOT NULL,
  ds_endereco VARCHAR NOT NULL,
  nr_numero VARCHAR NOT NULL,
  ds_complemento VARCHAR  NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_ENDERECO
	ADD CONSTRAINT PK_HT_ENDERECO PRIMARY KEY (cd_endereco);
-------------------------------------------------------------------------------
-- T_IFD_ESPECIALIDADE
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_ESPECIALIDADE (
  cd_especialidade SERIAL,
  nm_especialidade VARCHAR NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_ESPECIALIDADE
	ADD CONSTRAINT PK_HT_ESPECIALIDADE PRIMARY KEY (cd_especialidade);
-------------------------------------------------------------------------------
-- T_IFD_PLANO
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_PLANO (
  cd_plano SERIAL,
  nm_plano VARCHAR NOT NULL,
  ds_plano VARCHAR NOT NULL,
  vl_comissao FLOAT NOT NULL,
  vl_taxa FLOAT NOT NULL,
  vl_preco FLOAT NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_PLANO
	ADD CONSTRAINT PK_HT_PLANO PRIMARY KEY (cd_plano);
-------------------------------------------------------------------------------
-- T_IFD_CONTATO
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_CONTATO (
  cd_contato SERIAL,
  nm_contato VARCHAR NOT NULL,
  ds_email VARCHAR NOT NULL,
  nr_celular INT NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_CONTATO
	ADD CONSTRAINT PK_HT_CONTATO PRIMARY KEY (cd_contato);
-------------------------------------------------------------------------------
-- T_IFD_RESPONSAVEL
-------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS T_IFD_RESPONSAVEL (
  cd_responsavel SERIAL,
  nm_responsavel VARCHAR NOT NULL,
  nr_cpf INT  NOT NULL,
  nr_rg INT NOT NULL,
  dt_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_RESPONSAVEL
	ADD CONSTRAINT PK_HT_RESPONSAVEL PRIMARY KEY (cd_RESPONSAVEL);
-------------------------------------------------------------------------------
-- Create relationships
-------------------------------------------------------------------------------
ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT FK_IFD_LOJA_ESPECIALIDADE FOREIGN KEY (cd_especialidade)
	REFERENCES T_IFD_ESPECIALIDADE (cd_especialidade)
	ON DELETE SET NULL;

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT FK_IFD_LOJA_CONTATO FOREIGN KEY (cd_contato)
	REFERENCES T_IFD_CONTATO (cd_contato)
	ON DELETE SET NULL;

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT FK_IFD_LOJA_ENDERECO FOREIGN KEY (cd_endereco)
	REFERENCES T_IFD_ENDERECO (cd_endereco)
	ON DELETE SET NULL;

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT FK_IFD_LOJA_RESPONSAVEL FOREIGN KEY (cd_responsavel)
	REFERENCES T_IFD_RESPONSAVEL (cd_responsavel)
	ON DELETE SET NULL;

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT FK_IFD_LOJA_PLANO FOREIGN KEY (cd_plano)
	REFERENCES T_IFD_PLANO (cd_plano)
	ON DELETE SET NULL;
-------------------------------------------------------------------------------
-- DML
-------------------------------------------------------------------------------
INSERT INTO T_IFD_PLANO (
  nm_plano,
  ds_plano,
  vl_comissao,
  vl_taxa,
  vl_preco
)
VALUES (
  'Básico',
  'Plano Básico',
  0.12,
  0.035,
  100.0
  );
INSERT INTO T_IFD_PLANO (
  nm_plano,
  ds_plano,
  vl_comissao,
  vl_taxa,
  vl_preco
)
VALUES (
  'Entrega',
  'Plano Entrega',
  0.13,
  0.036,
  101.0
  );
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Acai'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Marmita'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Bebidas'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Carnes'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Brasileira'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Lanches'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Congelados'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Pastel'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Indiana'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Arabe'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Doces'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Salgados'
);
INSERT INTO T_IFD_ESPECIALIDADE (
  nm_especialidade
)
VALUES (
  'Italiana'
);

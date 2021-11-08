-- DDL
-------------------------------------------------------------------------------
-- Create tables and constraints
-------------------------------------------------------------------------------
-------------------------------------------------------------------------------
-- T_IFD_LOJA
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_LOJA (
	cd_loja NUMBER(5) NOT NULL,
	nm_loja VARCHAR2(60) NOT NULL,
	ds_razao_social VARCHAR2(60) NOT NULL,
  nr_cnpj NUMBER(14) NOT NULL,
  nr_telefone NUMBER(12) NOT NULL,
  cd_especialidade NUMBER(5) NOT NULL,
  cd_contato NUMBER(5) NOT NULL,
  cd_endereco NUMBER(5) NOT NULL,
  cd_responsavel NUMBER(5) NOT NULL,
  cd_plano NUMBER(5) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_LOJA
	ADD CONSTRAINT PK_HT_LOJA PRIMARY KEY (cd_loja);

CREATE SEQUENCE	SEQ_IFD_LOJA
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
-------------------------------------------------------------------------------
-- T_IFD_ENDERECO
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_ENDERECO (
  cd_endereco NUMBER(5) NOT NULL,
  nm_estado VARCHAR2(60) NOT NULL,
  nm_cidade VARCHAR(60) NOT NULL,
  nm_bairro VARCHAR(60) NOT NULL,
  ds_endereco VARCHAR(250) NOT NULL,
  nr_numero VARCHAR(5) NOT NULL,
  ds_complemento VARCHAR (250) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_ENDERECO
	ADD CONSTRAINT PK_HT_ENDERECO PRIMARY KEY (cd_endereco);

CREATE SEQUENCE	SEQ_IFD_ENDERECO
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
-------------------------------------------------------------------------------
-- T_IFD_ESPECIALIDADE
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_ESPECIALIDADE (
  cd_especialidade NUMBER(5) NOT NULL,
  nm_especialidade VARCHAR2(60) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_ESPECIALIDADE
	ADD CONSTRAINT PK_HT_ESPECIALIDADE PRIMARY KEY (cd_especialidade);

CREATE SEQUENCE	SEQ_IFD_ESPECIALIDADE
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
-------------------------------------------------------------------------------
-- T_IFD_PLANO
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_PLANO (
  cd_plano NUMBER(5) NOT NULL,
  nm_plano VARCHAR2(60) NOT NULL,
  ds_plano VARCHAR2(250) NOT NULL,
  vl_comissao NUMBER(4) NOT NULL,
  vl_taxa NUMBER(4) NOT NULL,
  vl_preco NUMBER(4) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_PLANO
	ADD CONSTRAINT PK_HT_PLANO PRIMARY KEY (cd_plano);

CREATE SEQUENCE	SEQ_IFD_PLANO
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
-------------------------------------------------------------------------------
-- T_IFD_CONTATO
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_CONTATO (
  cd_contato NUMBER(5) NOT NULL,
  nm_contato VARCHAR2(60) NOT NULL,
  ds_email VARCHAR2(60) NOT NULL,
  nr_celular NUMBER(12) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_CONTATO
	ADD CONSTRAINT PK_HT_CONTATO PRIMARY KEY (cd_contato);

CREATE SEQUENCE	SEQ_IFD_CONTATO
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
-------------------------------------------------------------------------------
-- T_IFD_RESPONSAVEL
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_RESPONSAVEL (
  cd_responsavel NUMBER(5) NOT NULL,
  nm_responsavel VARCHAR2(60) NOT NULL,
  nr_cpf NUMBER (11) NOT NULL,
  nr_rg NUMBER(8) NOT NULL,
  dt_criacao TIMESTAMP DEFAULT SYSTIMESTAMP NOT NULL
);

ALTER TABLE T_IFD_RESPONSAVEL
	ADD CONSTRAINT PK_HT_RESPONSAVEL PRIMARY KEY (cd_RESPONSAVEL);

CREATE SEQUENCE	SEQ_IFD_RESPONSAVEL
INCREMENT BY 1
START WITH 1
MAXVALUE 99999
NOCACHE
NOCYCLE;
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

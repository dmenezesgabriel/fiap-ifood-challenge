-- DDL
-------------------------------------------------------------------------------
-- Delete tables
-------------------------------------------------------------------------------
DROP TABLE T_IFD_LOJA CASCADE CONSTRAINTS;
DROP TABLE T_IFD_ENDERECO CASCADE CONSTRAINTS;
DROP TABLE T_IFD_CONTATO CASCADE CONSTRAINTS;
DROP TABLE T_IFD_RESPONSAVEL CASCADE CONSTRAINTS;
DROP TABLE T_IFD_PLANO CASCADE CONSTRAINTS;
-------------------------------------------------------------------------------
-- Delete sequences
-------------------------------------------------------------------------------
DROP SEQUENCE SEQ_IFD_LOJA;
DROP SEQUENCE SEQ_IFD_ENDERECO;
DROP SEQUENCE SEQ_IFD_CONTATO;
DROP SEQUENCE SEQ_IFD_RESPONSAVEL;
DROP SEQUENCE SEQ_IFD_PLANO;
-------------------------------------------------------------------------------
-- Create tables and constraints
-------------------------------------------------------------------------------
-------------------------------------------------------------------------------
-- Contato
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_CONTATO (
	cd_contato NUMBER(5) NOT NULL,
	nm_contato VARCHAR2(60) NOT NULL,
	ds_email VARCHAR2(60) NOT NULL,
  nr_celular NUMBER(24) NOT NULL
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
-- Usuário responsável pela loja
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_RESPONSAVEL (
	cd_responsavel NUMBER(5) NOT NULL,
	nm_Responsavel VARCHAR2(60) NOT NULL,
  nr_cpf NUMBER(60) NOT NULL,
  ds_rg VARCHAR2(60) NOT NULL,
);
-------------------------------------------------------------------------------
-- Endereco Loja
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_ENDERECO (
);
  -- CEP
  -- ESTADO
  -- CIDADE
  -- BAIRRO
  -- ENDERECO
  -- NUMERO
  -- cOMPLEMENTO

-------------------------------------------------------------------------------
-- Loja
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_LOJA (
	cd_loja NUMBER(5) NOT NULL,
	nm_loja VARCHAR2(60) NOT NULL,
	ds_razao_social VARCHAR2(60) NOT NULL,
  nr_cnpj
  nr_telefone
  ds_especialidade
);
-------------------------------------------------------------------------------
-- Telefone
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_TELEFONE (
);
-------------------------------------------------------------------------------
-- Planos
-------------------------------------------------------------------------------
CREATE TABLE T_IFD_TELEFONE (
);
  -- Descricao
  -- Comissao
  -- Taxa
  -- Valor

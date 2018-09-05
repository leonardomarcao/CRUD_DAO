CREATE DATABASE crud_dao
ENCODING='WIN1252'
template=template0
CONNECTION LIMIT -1;

--create table produto
CREATE TABLE IF NOT EXISTS produto(
	codigo_produto SERIAL CONSTRAINT nn_codigo_produto NOT NULL,
	descricao_produto VARCHAR(100) CONSTRAINT nn_descricao_produto NOT NULL,
	preco_produto NUMERIC(7,2) CONSTRAINT nn_preco_produto NOT NULL,
	CONSTRAINT pk_codigo_produto PRIMARY KEY (codigo_produto)
);

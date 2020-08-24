create table colare.retificahomolog(
  uuid BINARY(16) NOT NULL
 ,altered_at DATETIME2 NULL
 ,inserted_at DATETIME2 NULL
 ,seq BIGINT IDENTITY
 ,cod_tipo_retificacao int not null
 ,id_procedimento_ou_contrato int not null
 ,motivo_retificacao varchar (250) not null
 ,arquivo_id BINARY(16) NULL
 ,PRIMARY KEY CLUSTERED (uuid)
)

ALTER TABLE colare.retificahomolog
ADD CONSTRAINT FK_RETIFICAHOMOLOG_ARQUIVO_ARQUIVO_ID FOREIGN KEY (arquivo_id) REFERENCES colare.arquivo (uuid)
GO
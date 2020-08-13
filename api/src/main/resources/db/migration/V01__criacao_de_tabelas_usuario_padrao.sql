
/****** Object:  Table [colare].[adesao_reg_prec]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[adesao_reg_prec](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_tipo_adesao] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_unidade_medida_prazo_execucao] [int] NOT NULL,
	[data_publicacao_aviso_intencao] [varchar](255) NOT NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
	[exercicio_adesao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_processo_administrativo] [varchar](255) NOT NULL,
	[objeto] [varchar](255) NOT NULL,
	[prazo_execucao] [int] NOT NULL,
	[processo_por_lote] [bit] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[org_ger_adesao_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[adtv_cont_licit]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[adtv_cont_licit](
	[uuid] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[arquivo]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[arquivo](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano] [int] NULL,
	[arquivo_homologacao] [varchar](255) NULL,
	[id] [bigint] NULL,
	[id_representacao] [int] NULL,
	[layout_sigla] [varchar](255) NULL,
	[mes] [int] NULL,
	[prestacao_de_contas_sigla] [varchar](255) NULL,
	[recibo] [varchar](255) NULL,
	[status_envio] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[atas_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[atas_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_ata] [int] NOT NULL,
	[data] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[licitacaofase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[cliente]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[cliente](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[access_token_validity_seconds] [int] NULL,
	[application_name] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[refresh_token_validity_seconds] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[comissao_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[comissao_fase1](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_ato_nomeacao] [int] NOT NULL,
	[cod_tipo_comissao] [int] NOT NULL,
	[data_ato_nomeacao] [varchar](255) NOT NULL,
	[fim_vigencia] [varchar](255) NOT NULL,
	[inicio_vigencia] [varchar](255) NOT NULL,
	[numero_ato_nomeacao] [varchar](255) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[cont_cred_edita]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[cont_cred_edita](
	[id] [binary](16) NOT NULL,
	[contr_proc_disp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[cont_lic_edital]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[cont_lic_edital](
	[id] [binary](16) NOT NULL,
	[contr_proc_lic_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contr_natobjdet]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contr_natobjdet](
	[uuid] [binary](16) NOT NULL,
	[contrato_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contr_proc_ades]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contr_proc_ades](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_esfera_orgao_gerenciador] [int] NOT NULL,
	[codibgeente_gerenciador] [varchar](255) NOT NULL,
	[data_ata_registro_preco] [varchar](255) NOT NULL,
	[data_validade] [varchar](255) NOT NULL,
	[exercicio_adesao] [int] NOT NULL,
	[numero_documento] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contr_proc_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contr_proc_disp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_processo] [int] NOT NULL,
	[exercicio_processo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contr_proc_docs]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contr_proc_docs](
	[uuid] [binary](16) NOT NULL,
	[contr_proc_ades_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contr_proc_lic]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contr_proc_lic](
	[uuid] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contrat_proced]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contrat_proced](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[adesaoaregistro_de_precos_uuid] [binary](16) NULL,
	[contr_proc_disp_id] [binary](16) NULL,
	[contr_proc_lic_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contratado]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contratado](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numerocndt] [varchar](255) NULL,
	[numero_certidao_regularidadefgts] [varchar](255) NULL,
	[numero_certidao_regularidadeinss] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contratado_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contratado_adt](
	[uuid] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contratado_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contratado_ini](
	[cod_ibge_inscricao_estadual] [varchar](255) NULL,
	[cod_ibgeufinscricaocrea_cau] [varchar](255) NULL,
	[cod_tipo_documento] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NULL,
	[numero_documento] [varchar](255) NOT NULL,
	[numero_inscricaocrea_cau] [varchar](255) NULL,
	[numero_inscricao_estadual] [varchar](255) NULL,
	[uuid] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contrato_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contrato_adt](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_contrato] [int] NOT NULL,
	[cod_tipo_aditivo] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_unidade_medida_prazo_execucao] [int] NULL,
	[data_firmatura] [varchar](255) NOT NULL,
	[id_contrato_original] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_contrato] [varchar](255) NOT NULL,
	[prazo_adicional] [int] NULL,
	[arquivo_id] [binary](16) NULL,
	[contratado_adt_id] [binary](16) NOT NULL,
	[adtv_contr_orig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contrato_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contrato_ini](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_contrato] [int] NOT NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_formalizacao_contrato] [int] NOT NULL,
	[cod_tipo_procedimento] [int] NOT NULL,
	[cod_unidade_medida_prazo_execucao] [int] NOT NULL,
	[data_firmatura] [varchar](255) NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
	[fim_vigencia] [varchar](255) NULL,
	[forma_pagamento] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_procedimento] [int] NOT NULL,
	[inicio_vigencia] [varchar](255) NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_contrato] [varchar](255) NULL,
	[objeto] [varchar](255) NOT NULL,
	[prazo_execucao] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[contratado_ini_id] [binary](16) NOT NULL,
	[contrat_proced_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contrato_original]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contrato_original](
	[dtype] [varchar](31) NOT NULL,
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_contrato] [int] NOT NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_tipo_procedimento] [int] NOT NULL,
	[fim_vigencia] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[inicio_vigencia] [varchar](255) NOT NULL,
	[numero_contrato] [varchar](255) NOT NULL,
	[objeto] [varchar](255) NOT NULL,
	[valor_contrato] [float] NOT NULL,
	[adtv_cont_licit_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[contrato_resc]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[contrato_resc](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_motivo_rescisao] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_rescisao] [int] NOT NULL,
	[data] [varchar](255) NOT NULL,
	[id_contrato_original] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[saldo_final_executado_contrato] [float] NULL,
	[arquivo_id] [binary](16) NULL,
	[resc_contr_orig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[cotacao_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[cotacao_adesao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_origem_valor_referencia] [int] NOT NULL,
	[cod_tipo_documento] [int] NULL,
	[data_cotacao] [varchar](255) NOT NULL,
	[descricao_origem_valor_referencia] [varchar](255) NULL,
	[numero_documento] [varchar](255) NULL,
	[quantidade] [float] NOT NULL,
	[valor_unitario] [float] NOT NULL,
	[item_adesao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[detalhalc123]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[detalhalc123](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo_empenho_pagamentomeepp] [varchar](255) NULL,
	[artigo_perc_objeto_contratacaomeepp] [varchar](255) NULL,
	[artigo_proc_sub_contratacaomeepp] [varchar](255) NULL,
	[artigo_regulamentou_particip_exclusivameepp] [varchar](255) NULL,
	[percentual_objeto_contratacaomeepp] [float] NULL,
	[percentual_sub_contratacaomeepp] [float] NULL,
	[regulamentou_criterios_empenho_pagamentomeepp] [bit] NOT NULL,
	[regulamentou_particip_exclusivameepp] [bit] NOT NULL,
	[regulamentou_perc_objeto_contratacaomeepp] [bit] NOT NULL,
	[regulamentou_proc_sub_contratacaomeepp] [bit] NOT NULL,
	[valor_limite_reg_particip_exclusivameepp] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[detalhamento_prova]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[detalhamento_prova](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_prova] [int] NOT NULL,
	[data_realizacao_prova] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[detalhamento_publicidade_extrato_edital]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[detalhamento_publicidade_extrato_edital](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_veiculo_publicacao] [int] NOT NULL,
	[data_publicacao] [varchar](255) NOT NULL,
	[descricao] [varchar](255) NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[disp_edit_anex]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[disp_edit_anex](
	[id] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[disp_natobjdet]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[disp_natobjdet](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_natureza_objeto_detalhada] [int] NOT NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dispensa_inexig]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dispensa_inexig](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_processo] [int] NOT NULL,
	[data_inicio_processo_dispensa] [varchar](255) NOT NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
	[exercicio_processo] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NULL,
	[id_fase2deserta_fracassada] [int] NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_processo_administrativo] [varchar](255) NOT NULL,
	[servico_continuo] [bit] NOT NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[doc_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[doc_adesao](
	[uuid] [binary](16) NOT NULL,
	[adesao_reg_prec_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[documento]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[documento](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_documento_anexado_adesao] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dominio]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dominio](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ativo] [bit] NOT NULL,
	[codigo] [bigint] NOT NULL,
	[descricao] [varchar](255) NULL,
	[vigencia] [varchar](255) NULL,
	[tp_dominio_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dotacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dotacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_fonte_recursos] [int] NOT NULL,
	[cod_funcao] [int] NOT NULL,
	[cod_orgao] [int] NOT NULL,
	[cod_programa] [int] NOT NULL,
	[cod_sub_funcao] [int] NOT NULL,
	[cod_unidade_orcamentaria] [int] NOT NULL,
	[natureza_acao] [int] NOT NULL,
	[natureza_despesa] [int] NOT NULL,
	[nro_proj_ativ] [int] NOT NULL,
	[saldo_atual_da_dotacao] [float] NOT NULL,
	[subelemento] [int] NULL,
	[valoraser_utilizado] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dotacao_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dotacao_adesao](
	[uuid] [binary](16) NOT NULL,
	[recorc_adesao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dotacao_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dotacao_disp](
	[id] [binary](16) NOT NULL,
	[recorc_disp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[dotacao_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[dotacao_fase1](
	[id] [binary](16) NOT NULL,
	[recorc_fase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[editaleanexo]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[editaleanexo](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_edital_anexos] [int] NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[emp_anulado_res]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[emp_anulado_res](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_anulacao_empenho] [varchar](255) NOT NULL,
	[data_empenho] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[numero_empenho] [int] NOT NULL,
	[valor_anulacao_empenho] [float] NOT NULL,
	[contrato_resc_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[emp_contrat_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[emp_contrat_adt](
	[uuid] [binary](16) NOT NULL,
	[contrato_adt_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[emp_contrat_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[emp_contrat_ini](
	[id] [binary](16) NOT NULL,
	[contrato_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[empenho]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[empenho](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_empenho] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[numero_empenho] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[fas1_edit_anex]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[fas1_edit_anex](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[fas1_natobjdet]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[fas1_natobjdet](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[fornecedor_contratado]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[fornecedor_contratado](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_ibge_inscricao_estadual] [varchar](255) NULL,
	[cod_tipo_documento] [int] NOT NULL,
	[empresa_de_capital_abertocvm] [bit] NOT NULL,
	[numerocndt] [varchar](255) NULL,
	[numero_certidao_regularidadefgts] [varchar](255) NULL,
	[numero_certidao_regularidadeinss] [varchar](255) NULL,
	[numero_documento] [varchar](255) NOT NULL,
	[numero_inscricao_estadual] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[habilit_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[habilit_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[motivo_da_inabilitacao] [varchar](255) NULL,
	[registrou_em_ata_presenca_preposto_do_licitante] [bit] NOT NULL,
	[renuncia_prazo_recursal] [bit] NOT NULL,
	[status_habilitacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[inav_badge]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[inav_badge](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[classe] [varchar](255) NULL,
	[text] [varchar](255) NULL,
	[variant] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[inav_data]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[inav_data](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[classe] [varchar](255) NULL,
	[divider] [bit] NULL,
	[href] [varchar](255) NULL,
	[icon] [varchar](255) NULL,
	[layout_descricao] [varchar](255) NULL,
	[layout_titulo] [varchar](255) NULL,
	[name] [varchar](255) NULL,
	[title] [bit] NULL,
	[url] [varchar](255) NULL,
	[variant] [varchar](255) NULL,
	[badge_id] [binary](16) NULL,
	[menu_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[item]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[item](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_origem_valor_referencia] [int] NOT NULL,
	[cod_unidade_medida] [int] NOT NULL,
	[codigo_unico_mercadoria_ou_servico] [int] NULL,
	[descricao_origem_valor_referencia] [varchar](255) NULL,
	[numero_item] [int] NOT NULL,
	[quantidade] [int] NOT NULL,
	[quantidade_desdobra_unidade] [int] NULL,
	[valor_de_referencia] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[item_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[item_adesao](
	[cod_tipo_documento] [int] NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_documento] [varchar](255) NOT NULL,
	[quantidade_aderida] [float] NOT NULL,
	[quantidade_licitada] [float] NOT NULL,
	[valor_unitario] [float] NOT NULL,
	[codigo] [binary](16) NOT NULL,
	[lote_adesao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[item_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[item_adt](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numero_item] [int] NOT NULL,
	[numero_lote] [int] NOT NULL,
	[quantidade_acrescida] [float] NOT NULL,
	[quantidade_decrescida] [float] NOT NULL,
	[valor_unitario_acrescido] [float] NOT NULL,
	[valor_unitario_decrescido] [float] NOT NULL,
	[contratado_adt_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[item_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[item_disp](
	[data_cotacao] [varchar](255) NOT NULL,
	[descricao_item] [varchar](255) NOT NULL,
	[codigo] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[item_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[item_fase1](
	[descricao] [varchar](255) NOT NULL,
	[preco_maximo] [bit] NOT NULL,
	[codigo] [binary](16) NOT NULL,
	[lote_fase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[julg_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[julg_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[registrou_em_ata_presenca_preposto_do_licitante] [bit] NOT NULL,
	[renuncia_prazo_recursal] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[lic_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[lic_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_ibge_inscricao_estadual] [varchar](255) NULL,
	[cod_tipo_documento] [int] NOT NULL,
	[empresa_de_capital_abertocvm] [bit] NOT NULL,
	[numero_documento] [varchar](255) NOT NULL,
	[numero_inscricao_estadual] [varchar](255) NULL,
	[numero_inscricao_municipal] [varchar](255) NULL,
	[habilit_fase2_id] [binary](16) NOT NULL,
	[julg_fase2_id] [binary](16) NOT NULL,
	[licitacaofase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[licitacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[licitacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_modalidade_licitacao] [int] NOT NULL,
	[exercicio_licitacao] [int] NOT NULL,
	[numero_licitacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[licitacaofase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[licitacaofase1](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_modalidade_licitacao] [int] NOT NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_natureza_procedimento] [int] NOT NULL,
	[cod_regime_execucao] [int] NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_licitacao_criterio_julgamento] [int] NULL,
	[criterio_desempatemeepp] [bit] NOT NULL,
	[data_prevista_abertura_sessao] [varchar](255) NOT NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
	[descricao_premio_ou_remuneracao_concurso] [varchar](255) NULL,
	[destinacao_exclusivameepp] [bit] NOT NULL,
	[exercicio_licitacao] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[limite_perc_objeto_contratacaomeepp] [bit] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_de_convidados] [int] NULL,
	[numero_licitacao] [int] NOT NULL,
	[numero_processo_administrativo] [varchar](255) NOT NULL,
	[objeto] [varchar](255) NOT NULL,
	[processo_por_lote] [bit] NOT NULL,
	[servico_continuo] [bit] NOT NULL,
	[subcontratacaomeepp] [bit] NOT NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[licitacaofase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[licitacaofase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[id_licitacao_fase1] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[lote]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[lote](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao_lote] [varchar](255) NULL,
	[numero_lote] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[lote_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[lote_adesao](
	[uuid] [binary](16) NOT NULL,
	[org_ger_adesao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[lote_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[lote_fase1](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[membro_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[membro_fase1](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_atribuicao] [int] NOT NULL,
	[cod_natureza_cargo] [int] NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[comissao_fase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[natureza_objeto_detalhada]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[natureza_objeto_detalhada](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_natureza_objeto_detalhada] [int] NOT NULL,
	[descricao_natureza_objeto_outros] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[org_ger_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[org_ger_adesao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_esfera_orgao_gerenciador] [int] NOT NULL,
	[codibgeente_gerenciador] [varchar](255) NOT NULL,
	[cod_modalidade_licitacao] [int] NOT NULL,
	[cod_tipo_licitacao_criterio_julgamento] [int] NOT NULL,
	[data_ata_registro_preco] [varchar](255) NOT NULL,
	[data_validade] [varchar](255) NOT NULL,
	[exercicio_licitacao] [int] NOT NULL,
	[numero_documento] [varchar](255) NOT NULL,
	[numero_licitacao] [int] NOT NULL,
	[numero_processo_administrativo] [varchar](255) NOT NULL,
	[processo_por_lote] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[parec_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[parec_adesao](
	[uuid] [binary](16) NOT NULL,
	[adesao_reg_prec_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[parec_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[parec_disp](
	[id] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[parec_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[parec_fase1](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[parec_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[parec_fase2](
	[uuid] [binary](16) NOT NULL,
	[licitacaofase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[parecer]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[parecer](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_parecer] [int] NOT NULL,
	[cod_uf_registro_orgao_de_classe] [int] NOT NULL,
	[data_parecer] [varchar](255) NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[numero_registro_orgao_de_classe] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_acum2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_acum2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[nome_departamento_setor] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_acumula]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_acumula](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[acumula_cargo] [bit] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_adm2020]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_adm2020](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_homologacao] [int] NOT NULL,
	[numero_ordem_classificacao] [int] NOT NULL,
	[tipo_lista_classificacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_ate2019]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_ate2019](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[nome_do_cargo_registrado] [varchar](255) NOT NULL,
	[numero_acordaotcm] [varchar](255) NOT NULL,
	[numero_processo_admissao] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_dadoadm]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_dadoadm](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[admissao_anteriora2020] [bit] NOT NULL,
	[pes_adm_adm2020_id] [binary](16) NULL,
	[pes_adm_ate2019_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_dadosac]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_dadosac](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_esfera_acumulacao] [int] NOT NULL,
	[codibgedo_ente_onde_ha_acumulacao] [varchar](255) NOT NULL,
	[pes_adm_acum2_id] [binary](16) NULL,
	[pes_adm_acumula_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_detjud]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_detjud](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[detalhamento_peca_judicial] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[pes_adm_subjudi_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_docposs]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_docposs](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[tipo_documento_posse] [int] NOT NULL,
	[pes_admissao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_nepotis]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_nepotis](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[enquadra_situacao_nepotismo] [bit] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_subjudi]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_subjudi](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[candidato_nomeacao_sub_judice] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_tempsem]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_tempsem](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[detalhamento_excepcionalidade] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[pes_admissao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_adm_vinculo]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_adm_vinculo](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_classe] [int] NOT NULL,
	[cod_padrao_nivel] [int] NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[tipo_vinculo_admissao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_admissao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_admissao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_decreto_nomeacao] [varchar](255) NOT NULL,
	[data_efetivo_exercicio] [varchar](255) NOT NULL,
	[data_nomeacao] [varchar](255) NOT NULL,
	[data_posse_admissao] [varchar](255) NOT NULL,
	[id_pessoal_cadastro] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_decreto_nomeacao] [varchar](255) NOT NULL,
	[temporario_sem_proc_seletivo] [bit] NULL,
	[pes_adm_acumula_id] [binary](16) NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_adm_dadoadm_id] [binary](16) NOT NULL,
	[pes_adm_nepotis_id] [binary](16) NOT NULL,
	[pes_adm_subjudi_id] [binary](16) NOT NULL,
	[pes_adm_vinculo_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_assuntonorm]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_assuntonorm](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_assunto_norma] [int] NOT NULL,
	[pes_legislacao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cad_det_pcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cad_det_pcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cidpcd] [varchar](255) NOT NULL,
	[tipo_deficiencia] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cad_pcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cad_pcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[pcd] [bit] NOT NULL,
	[pes_cad_det_pcd_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cad_regprof]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cad_regprof](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_conselho_ordem] [int] NOT NULL,
	[numero_registro] [varchar](255) NOT NULL,
	[pes_cadastro_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cadastro]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cadastro](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cor_raca] [int] NOT NULL,
	[escolaridade_servidor] [int] NOT NULL,
	[id_documento_foto3x4] [varchar](255) NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[naturalidade] [varchar](255) NULL,
	[numeroctps] [varchar](255) NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[numero_pis_pasepnitnis] [varchar](255) NULL,
	[numero_seriectps] [varchar](255) NULL,
	[numero_titulo_eleitor] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_cad_pcd_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_atrib]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_atrib](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo] [varchar](255) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_class]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_class](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_classe] [int] NOT NULL,
	[descricao_classe] [varchar](255) NOT NULL,
	[pes_cargos_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_decex]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_decex](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_dedic]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_dedic](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cargo_dedicacao_exclusiva] [bit] NOT NULL,
	[pes_cargo_decex_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_ente]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_ente](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cargo_de_outro_ente] [bit] NOT NULL,
	[pes_cargo_outen_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_extf]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_extf](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo] [varchar](255) NOT NULL,
	[data_inicio_em_extincao] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_extin]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_extin](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cargo_em_extincao] [bit] NOT NULL,
	[pes_cargo_extf_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_outen]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_outen](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_ente] [int] NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[unidade_gestora_origem_cargo] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_pdr_n]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_pdr_n](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_padrao_nivel] [int] NOT NULL,
	[descricao_padrao_nivel] [varchar](255) NOT NULL,
	[valor_representacao] [float] NULL,
	[valor_vencimento_ou_subsidio] [float] NOT NULL,
	[pes_cargo_class_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_reqpr]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_reqpr](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo] [varchar](255) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_trans]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_trans](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cargo_decorrente_transformacao] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargo_trnsf]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargo_trnsf](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[pes_cargo_trans_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_cargos]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_cargos](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[carga_horaria_semanal] [float] NOT NULL,
	[cargo_acumulavel] [bit] NOT NULL,
	[cargo_carreira] [bit] NOT NULL,
	[classificacao_brasileira_ocupacoes] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_quadro_pessoal] [int] NOT NULL,
	[cod_tipo_regime_juridico] [int] NOT NULL,
	[descricao_especialidade] [varchar](255) NULL,
	[escolaridade_minima] [int] NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[nome_cargo] [varchar](255) NOT NULL,
	[quantitativo_cargo] [int] NOT NULL,
	[regime_previdenciario] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_cargo_ente_id] [binary](16) NOT NULL,
	[pes_cargo_trans_id] [binary](16) NOT NULL,
	[pes_cargo_extin_id] [binary](16) NOT NULL,
	[pes_cargo_dedic_id] [binary](16) NOT NULL,
	[pes_cargo_atrib_id] [binary](16) NOT NULL,
	[pes_cargo_reqpr_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_arrdpcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_arrdpcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_pcd_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_aut_ldo]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_aut_ldo](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[artigo] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_banca]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_banca](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_banca_examinadora] [int] NOT NULL,
	[id_contrato_original] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_cadastr]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_cadastr](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_cadres_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_cadres]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_cadres](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ha_cadastro_reserva] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_cargcla]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_cargcla](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_carprov_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_cargpro]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_cargpro](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[atribuicoes_edital] [varchar](255) NOT NULL,
	[carga_horaria_edital] [int] NOT NULL,
	[cod_conselho_ordem] [int] NULL,
	[exige_registro_conselho_ou_ordem] [bit] NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[oferta_vagas_por_micro_areas_paraacs] [bit] NOT NULL,
	[qtd_pcd] [int] NOT NULL,
	[qtd_vagas_ampla_concorrencia] [int] NOT NULL,
	[qtd_vagas_cadastro_reserva] [int] NOT NULL,
	[qtd_vagas_cotas] [int] NOT NULL,
	[requisitos_cargo_edital] [varchar](255) NOT NULL,
	[pes_con_psp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_carprov]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_carprov](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ha_pontuacao_minima] [bit] NOT NULL,
	[ha_clausula_cri_aprov] [bit] NOT NULL,
	[tipo_carater_prova] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_certrsf]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_certrsf](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_comissa]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_comissa](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_desemp3]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_desemp3](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_desempa_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_desempa]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_desempa](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[experiencia_no_servico_publico_constitui_um_criterio] [bit] NOT NULL,
	[maior_de60anos_como_primerio_criterio] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_desmp1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_desmp1](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_desempa_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_detpcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_detpcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[pes_con_pcd_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_extratp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_extratp](
	[id] [binary](16) NOT NULL,
	[pes_con_psp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_impug]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_impug](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[admite_outros_recursos_nao_presenciais] [bit] NOT NULL,
	[admite_recurso_por_procuracao] [bit] NOT NULL,
	[ha_prazo_para_interposicao_de_recursos] [bit] NOT NULL,
	[serao_atribuidos_os_pontos_das_questoes_anuladasatodos] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_impug2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_impug2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_impug_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_impug3]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_impug3](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_impug_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_impug4]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_impug4](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_impug_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_impug5]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_impug5](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_impug_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_insc2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_insc2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_inscr_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_insc3]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_insc3](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_inscr_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_insc4]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_insc4](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_inscr_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_inscr]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_inscr](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[existe_previsao_de_devolucao_devido_pag_em_duplicidade] [bit] NOT NULL,
	[existe_previsao_de_devolucao_taxa_devido_cancelamento] [bit] NOT NULL,
	[existe_previsao_de_isencao] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_menbros]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_menbros](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_de_funcao_comissao_organizadora] [int] NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[pes_con_comissa_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_pcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_pcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[existe_clausula_de_arreddondamento_de_percentual] [bit] NOT NULL,
	[existe_legislacao_municipal_reserva_vagaspcd] [bit] NOT NULL,
	[ha_vagas_destinadaspcd] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_prdinsc]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_prdinsc](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_provas]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_provas](
	[id] [binary](16) NOT NULL,
	[pes_con_carprov_id] [binary](16) NOT NULL,
	[pes_con_cargpro_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_psp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_psp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_edital] [int] NOT NULL,
	[cod_tipo_edital_selecao_pessoal] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_edital] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_con_aut_ldo_id] [binary](16) NOT NULL,
	[pes_con_banca_id] [binary](16) NOT NULL,
	[pes_con_cadres_id] [binary](16) NOT NULL,
	[pes_con_certrsf_id] [binary](16) NOT NULL,
	[pes_con_comissa_id] [binary](16) NOT NULL,
	[pes_con_desempa_id] [binary](16) NOT NULL,
	[pes_con_impug_id] [binary](16) NOT NULL,
	[pes_con_pcd_id] [binary](16) NOT NULL,
	[pes_con_prdinsc_id] [binary](16) NOT NULL,
	[pes_con_solcon_id] [binary](16) NOT NULL,
	[pes_con_inscr_id] [binary](16) NOT NULL,
	[pes_con_validad_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_solcon]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_solcon](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_txt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_txt](
	[codigo] [binary](16) NOT NULL,
	[pes_con_psp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_vagapcd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_vagapcd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_pcd_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_con_validad]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_con_validad](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[eh_prorrogavel] [bit] NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[prazo_de_validade] [int] NOT NULL,
	[tipo_validade] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_concessao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_concessao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[id_situacao_funcional_correspondente] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[tipo_situacao_funcional] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_concessaodt_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_concessaodt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_concessaodt](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[tipo_concessao] [int] NOT NULL,
	[pes_pos_vnct_cr_id] [binary](16) NULL,
	[pes_concs_verba] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_concs_verba]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_concs_verba](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_modalidade_desconto] [int] NOT NULL,
	[cod_modalidade_remuneracao] [int] NOT NULL,
	[cod_tipo_verba] [int] NOT NULL,
	[data_final] [varchar](255) NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NULL,
	[id_pessoal_verbas] [int] NOT NULL,
	[numero_de_parcelas] [int] NULL,
	[valor] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_conmenorpon]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_conmenorpon](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[pes_con_carprov_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_dados_prev]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_dados_prev](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_dadosrpps_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_dadosrgps]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_dadosrgps](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[aliquotafap] [float] NOT NULL,
	[aliquotarat] [float] NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[numerocnae] [int] NOT NULL,
	[pes_dados_prev_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_dadosrpps]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_dadosrpps](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[aliquota_contribuicao_patronal] [float] NOT NULL,
	[aliquota_contribuicao_servidores] [float] NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_folhapag]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_folhapag](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_competencia] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[mes_competencia] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[tipo_unidade_gestora_responsavel_folha] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_folhapag_fp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_folhapag_fp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[numerocpfordenador_despesa] [varchar](255) NOT NULL,
	[pes_folhapag_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_folpag_serv]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_folpag_serv](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_situacao_funcional_correspondente] [int] NOT NULL,
	[tipo_situacao_funcional] [int] NOT NULL,
	[pes_folhapag_fp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_descirrf]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_descirrf](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_fonte_recursos] [int] NOT NULL,
	[id_pessoal_concessao_vantagem_desconto] [int] NOT NULL,
	[valor] [float] NOT NULL,
	[pes_folpag_serv_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_descprev]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_descprev](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_fonte_recursos] [int] NOT NULL,
	[id_pessoal_concessao_vantagem_desconto] [int] NOT NULL,
	[valor] [float] NOT NULL,
	[pes_folpag_serv_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_banc]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_banc](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[codigo_banco_oficial_pagamentos] [int] NOT NULL,
	[pes_fp_exc_orcm_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_emp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_emp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_empenho] [varchar](255) NOT NULL,
	[numero_empenho] [int] NOT NULL,
	[valor_empenho] [float] NOT NULL,
	[pes_fp_exc_orcm_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_liq]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_liq](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_liquidacao] [varchar](255) NOT NULL,
	[numero_liquidacao] [int] NOT NULL,
	[valor_liquidacao] [float] NOT NULL,
	[pes_fp_exc_emp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_orcm]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_orcm](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[id_pessoal_folha_de_pagamento] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_retn]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_retn](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[doc_arquivo_retorno] [varchar](255) NOT NULL,
	[pes_fp_exc_banc_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exc_rms]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exc_rms](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[doc_arquivo_remessa] [varchar](255) NOT NULL,
	[pes_fp_exc_banc_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_exec_op]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_exec_op](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_pagamento] [varchar](255) NOT NULL,
	[numeroop] [int] NOT NULL,
	[valor_pagamento] [float] NOT NULL,
	[pes_fp_exc_emp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_fp_remdes]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_fp_remdes](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_fonte_recursos] [int] NOT NULL,
	[id_pessoal_concessao_vantagem_desconto] [int] NOT NULL,
	[pes_folpag_serv_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_homl_cargo]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_homl_cargo](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[pes_homolog_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_homl_lstapr]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_homl_lstapr](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[numero_ordem_classificacao] [int] NOT NULL,
	[tipo_lista_classificacao] [int] NOT NULL,
	[pes_homl_cargo] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_homolog]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_homolog](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_metodo_selecao_pessoal_utilizado] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_homologacao] [varchar](255) NOT NULL,
	[id_procedimento_selecao_pessoal] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_homolog_pub]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_homolog_pub](
	[url_veiculo_publicacao] [varchar](255) NOT NULL,
	[uuid] [binary](16) NOT NULL,
	[pes_homolog_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_legislacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_legislacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_da_norma] [int] NOT NULL,
	[cod_detalhamento_norma] [int] NOT NULL,
	[cod_tipo_ente] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_norma] [int] NOT NULL,
	[data_inicio_efeito_financeiro] [varchar](255) NULL,
	[data_publicacao] [varchar](255) NOT NULL,
	[ementa_da_norma] [varchar](255) NOT NULL,
	[fim_vigencia] [varchar](255) NULL,
	[inicio_vigencia] [varchar](255) NOT NULL,
	[motivo_retificacao] [varchar](255) NULL,
	[numero_da_norma] [varchar](255) NOT NULL,
	[pes_reg_outroid_id] [binary](16) NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_ug_aplicnor_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_lotacao_det]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_lotacao_det](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_lotacao] [int] NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[nome_departamento_setor_lotacao] [varchar](255) NOT NULL,
	[nome_local_lotacao] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_nor_reg]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_nor_reg](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[pes_reg_outroid_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_dados]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_dados](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_ato_concedeu_pensao] [varchar](255) NOT NULL,
	[nome_do_cargo_paradigma_registrado] [varchar](255) NOT NULL,
	[numero_acordaotcm] [varchar](255) NOT NULL,
	[numero_ato_concedeu_pensao] [int] NOT NULL,
	[numero_processo_concessao_pensao] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_depent]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_depent](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_final_pensao] [varchar](255) NOT NULL,
	[dependente_possuifilho] [bit] NOT NULL,
	[id_cadastro_pessoal] [int] NOT NULL,
	[tipo_dependente] [int] NOT NULL,
	[pes_pens_p_rpps_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_doccom]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_doccom](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[tipo_documento_comprobatorio] [int] NOT NULL,
	[pes_pens_depent_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_fin]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_fin](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[percentual_redutor] [float] NULL,
	[tipo_fixacao_proventos_pensao] [int] NOT NULL,
	[valor_redutor_provento] [float] NULL,
	[valor_total_proventos] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_merce]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_merce](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_cadastro_pessoal] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[tipo_documento_concessao_pensao_merce] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_p_jud]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_p_jud](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[detalhamento_peca_judicial] [int] NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_p_rpps]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_p_rpps](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_situacao_funcional_instituidor_correspondente] [int] NOT NULL,
	[id_vida_funcional_desligamento_inatividade] [int] NOT NULL,
	[morreu_em_atividade] [bit] NOT NULL,
	[tipo_situacao_funcional_instituidor] [int] NOT NULL,
	[pes_pens_req_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_req]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_req](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[certidao_de_publicacao_ou_comprovante] [varchar](255) NOT NULL,
	[cod_forma_de_reajuste] [int] NOT NULL,
	[cod_tipo_ato_administrativo] [int] NOT NULL,
	[data_ato_administrativo] [varchar](255) NOT NULL,
	[data_inicio_efeito_financeiro] [varchar](255) NOT NULL,
	[data_publicacao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[numero_ato_administrativo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_respat]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_respat](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
	[pes_pens_req_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pens_ultrem]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pens_ultrem](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_concessao_vantagem_desconto] [int] NOT NULL,
	[pes_pens_fin_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pensionist]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pensionist](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_pensao] [int] NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[pensionista_anterior2020] [bit] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_pens_dados_id] [binary](16) NULL,
	[pes_pens_p_jud_id] [binary](16) NULL,
	[pes_pens_merce_id] [binary](16) NULL,
	[pes_pens_p_rpps_id] [binary](16) NULL,
	[pes_pens_fin_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pos_vnct_cr]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pos_vnct_cr](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_classe] [int] NOT NULL,
	[cod_padrao_nivel] [int] NOT NULL,
	[data_final] [varchar](255) NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[valor_vencimento_ou_subsidio] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_procselsimp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_procselsimp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_edital] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_edital] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_pss_banca] [binary](16) NOT NULL,
	[pes_pss_duracao_id] [binary](16) NOT NULL,
	[pes_pss_prd_ins] [binary](16) NOT NULL,
	[pes_pss_valid_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_banca]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_banca](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_banca_examinadora] [int] NOT NULL,
	[id_contrato_original] [int] NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_duracao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_duracao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[prazo_de_duracao] [int] NOT NULL,
	[tipo_prazo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_excep]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_excep](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[pes_procselsimp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_funcao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_funcao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[qtd_pcd] [int] NOT NULL,
	[qtd_vagas_ampla_concorrencia] [int] NOT NULL,
	[qtd_vagas_cadastro_reserva] [int] NOT NULL,
	[qtd_vagas_cotas] [int] NOT NULL,
	[requisitos_cargo_edital] [varchar](255) NOT NULL,
	[pes_procselsimp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_funprov]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_funprov](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[tipo_carater_prova] [int] NOT NULL,
	[pes_pss_funcao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_prd_ins]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_prd_ins](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_public]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_public](
	[id] [binary](16) NOT NULL,
	[pes_procselsimp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_txtedit]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_txtedit](
	[codigo] [binary](16) NOT NULL,
	[pes_procselsimp_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_pss_valid]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_pss_valid](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[eh_prorrogavel] [bit] NOT NULL,
	[numero_item_do_edital] [varchar](255) NOT NULL,
	[prazo_de_validade] [int] NOT NULL,
	[tipo_validade] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_reg_outroid]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_reg_outroid](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[norma_regulamenta_outroidpessoal_legislacao] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_text_norma]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_text_norma](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_texto_documento] [int] NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[pes_legislacao_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ug_aplicave]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ug_aplicave](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[pes_ug_aplicnor_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ug_aplicnor]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ug_aplicnor](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[norma_aplicavelatodas_as_unidades_gestoras] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ver_formca2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ver_formca2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[vl_maximo] [float] NOT NULL,
	[vl_minimo] [float] NOT NULL,
	[pes_ver_formcal_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ver_formcal]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ver_formcal](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[base_de_calculo_detalhe] [float] NOT NULL,
	[tipo_base_de_calculo] [int] NOT NULL,
	[tipo_calculo] [int] NOT NULL,
	[valor_ou_percentual] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ver_nd]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ver_nd](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_categoria_economica] [int] NOT NULL,
	[cod_elemento_despesa] [int] NOT NULL,
	[cod_grupo_natureza_despesa] [int] NOT NULL,
	[cod_modalidade_aplicacao] [int] NOT NULL,
	[subelemento] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_ver_vces]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_ver_vces](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ha_vinculo_cargo_especifico] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_verb_detvic]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_verb_detvic](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[id_pessoal_cargo] [int] NOT NULL,
	[pes_ver_vces_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_verbas]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_verbas](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_categoria_desconto] [int] NULL,
	[cod_categoria_remuneracao] [int] NULL,
	[cod_natureza_desconto] [int] NULL,
	[cod_natureza_remuneracao] [int] NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_verba] [int] NOT NULL,
	[cod_vinculo_tipo_quadro_cargo] [int] NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_pessoal_legislacao] [int] NOT NULL,
	[id_unidade_gestora] [int] NOT NULL,
	[incidencia_previdenciaria] [bit] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[nome_verba] [varchar](255) NOT NULL,
	[verba_transitoria] [bit] NOT NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_ver_nd_id] [binary](16) NOT NULL,
	[pes_ver_formcal_id] [binary](16) NOT NULL,
	[pes_ver_vces_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_vf_desl_int]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_vf_desl_int](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_desligamento_inatividade] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_admissao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_vf_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_vf_disp](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_disposicao] [int] NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_admissao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_vf_disp_dst] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_vf_disp_dst]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_vf_disp_dst](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_esfera_disposicao] [int] NOT NULL,
	[codibge] [varchar](255) NOT NULL,
	[id_unidade_gestora] [int] NULL,
	[nome_orgao_ou_entidade] [varchar](255) NOT NULL,
	[numerocnpj] [varchar](255) NOT NULL,
	[tipo_entidade] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_vf_licenca]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_vf_licenca](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_licenca] [int] NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_admissao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pes_vf_lotacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pes_vf_lotacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[data_final] [varchar](255) NOT NULL,
	[data_inicio] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_pessoal_admissao] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
	[pes_lotacao_det_id] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[preco_contrat]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[preco_contrat](
	[numero_lote] [int] NOT NULL,
	[uuid] [binary](16) NOT NULL,
	[contratado_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[preco_contratado]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[preco_contratado](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numero_item] [int] NOT NULL,
	[quantidade] [float] NOT NULL,
	[valor_unitario] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[preco_contratado_dispensa]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[preco_contratado_dispensa](
	[id] [binary](16) NOT NULL,
	[fornecedor_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[preco_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[preco_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[item_deserto] [bit] NOT NULL,
	[item_fracassado] [bit] NOT NULL,
	[numero_item] [int] NOT NULL,
	[numero_lote] [int] NOT NULL,
	[valor_unitario] [float] NULL,
	[resultado_fase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[propostas_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[propostas_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[numero_item] [int] NOT NULL,
	[numero_lote] [int] NOT NULL,
	[valor_unitario] [float] NOT NULL,
	[lic_fase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_adesao](
	[uuid] [binary](16) NOT NULL,
	[adesao_reg_prec_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_contrat_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_contrat_adt](
	[uuid] [binary](16) NOT NULL,
	[contrato_adt_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_contrat_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_contrat_ini](
	[id] [binary](16) NOT NULL,
	[contrato_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_contrat_res]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_contrat_res](
	[id] [binary](16) NOT NULL,
	[contrato_resc_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_dispensa]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_dispensa](
	[id] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[pub_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[pub_fase1](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[publicacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[publicacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_veiculo_publicacao] [int] NULL,
	[data_publicacao] [varchar](255) NULL,
	[descricao] [varchar](255) NULL,
	[id_documentopdf] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[quadro_societario]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[quadro_societario](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_documento] [int] NOT NULL,
	[cod_tipo_participacao] [int] NOT NULL,
	[numero_documento] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[quadro_societario_dispensa]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[quadro_societario_dispensa](
	[id] [binary](16) NOT NULL,
	[fornecedor_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[quadsoc_adt]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[quadsoc_adt](
	[uuid] [binary](16) NOT NULL,
	[contratado_adt_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[quadsoc_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[quadsoc_fase2](
	[id] [binary](16) NOT NULL,
	[lic_fase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[quadsoc_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[quadsoc_ini](
	[uuid] [binary](16) NOT NULL,
	[contratado_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[recorc_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[recorc_adesao](
	[uuid] [binary](16) NOT NULL,
	[adesao_reg_prec_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[recorc_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[recorc_disp](
	[id] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[recorc_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[recorc_fase1](
	[id] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[recurso_orcamentario]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[recurso_orcamentario](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_origem_recurso] [int] NOT NULL,
	[id_convenio] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[reg_licitacao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[reg_licitacao](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_regulamentacao] [int] NOT NULL,
	[data_decreto_municipal] [varchar](255) NULL,
	[data_publicacao] [varchar](255) NULL,
	[existe_regulamentacao_municipal] [bit] NOT NULL,
	[id_documentopdf] [varchar](255) NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_decreto_municipal] [varchar](255) NULL,
	[arquivo_id] [binary](16) NULL,
	[detalhalc123_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resc_cont_licit]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resc_cont_licit](
	[uuid] [binary](16) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resc_contr_orig]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resc_contr_orig](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[ano_contrato] [int] NULL,
	[cod_natureza_objeto] [int] NOT NULL,
	[cod_tipo_procedimento] [int] NOT NULL,
	[fim_vigencia] [varchar](255) NULL,
	[id_documentopdf] [varchar](255) NULL,
	[inicio_vigencia] [varchar](255) NULL,
	[numero_contrato] [varchar](255) NULL,
	[objeto] [varchar](255) NULL,
	[valor_contrato] [float] NULL,
	[resc_cont_licit_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resp_adesao]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resp_adesao](
	[codigo] [binary](16) NOT NULL,
	[adesao_reg_prec_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resp_contr_ini]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resp_contr_ini](
	[codigo] [binary](16) NOT NULL,
	[contrato_ini_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resp_disp]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resp_disp](
	[codigo] [binary](16) NOT NULL,
	[dispensa_inexig_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resp_fase1]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resp_fase1](
	[codigo] [binary](16) NOT NULL,
	[licitacaofase1_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resp_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resp_fase2](
	[codigo] [binary](16) NOT NULL,
	[licitacaofase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[responsavel]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[responsavel](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_responsabilidade] [int] NOT NULL,
	[numero_cpf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[resultado_fase2]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[resultado_fase2](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_documento] [int] NULL,
	[data_adjudicacao] [varchar](255) NULL,
	[data_homologacao] [varchar](255) NULL,
	[numero_documento] [varchar](255) NULL,
	[licitacaofase2_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[situacao_proced]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[situacao_proced](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_envio] [int] NOT NULL,
	[cod_tipo_procedimento_ou_contrato] [int] NOT NULL,
	[data] [varchar](255) NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
	[id_procedimento_ou_contrato] [int] NOT NULL,
	[motivo_atualizacao_correcao] [varchar](255) NULL,
	[numero_processotcm] [varchar](255) NULL,
	[tipo_de_situacao] [int] NOT NULL,
	[arquivo_id] [binary](16) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[texto_edital]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[texto_edital](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[cod_tipo_edital_anexos] [int] NOT NULL,
	[descricao] [varchar](255) NOT NULL,
	[id_documentopdf] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[tipo_dominio]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[tipo_dominio](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[nome_tipo_dominio] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [colare].[usuario]    Script Date: 13/08/2020 00:10:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [colare].[usuario](
	[uuid] [binary](16) NOT NULL,
	[altered_at] [datetime2](7) NULL,
	[inserted_at] [datetime2](7) NULL,
	[seq] [bigint] IDENTITY(1,1) NOT NULL,
	[email] [varchar](255) NULL,
	[nome] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[sobrenome] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uuid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [colare].[cliente] ON 

INSERT [colare].[cliente] ([uuid], [altered_at], [inserted_at], [seq], [access_token_validity_seconds], [application_name], [password], [refresh_token_validity_seconds]) VALUES (0x4FC5232E91724DC3B01FECCEC7D5D0B5, CAST(N'2020-08-12T22:23:08.1740000' AS DateTime2), CAST(N'2020-08-12T22:23:08.1740000' AS DateTime2), 1, 3600, N'Angular', N'$2y$12$4eEj5MHYtS4hA29.zIqMXeeQfsdCRuDJmEJyL0CcxzY5Soojli436', 28800)
SET IDENTITY_INSERT [colare].[cliente] OFF
GO
SET IDENTITY_INSERT [colare].[inav_badge] ON 

INSERT [colare].[inav_badge] ([uuid], [altered_at], [inserted_at], [seq], [classe], [text], [variant]) VALUES (0x85B11917F33744B79432A2C2FAAC6E27, CAST(N'2020-08-13T00:05:34.5090000' AS DateTime2), CAST(N'2020-08-13T00:05:34.5090000' AS DateTime2), 1, NULL, N'NEW', N'warning')
SET IDENTITY_INSERT [colare].[inav_badge] OFF
GO
SET IDENTITY_INSERT [colare].[inav_data] ON 

INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x0288FC8B917B40F88C3BC56C30640A07, CAST(N'2020-08-13T00:05:34.5160000' AS DateTime2), CAST(N'2020-08-13T00:05:34.5160000' AS DateTime2), 1, NULL, NULL, NULL, N'cui-note', NULL, NULL, N'Dashboard', NULL, N'/dashboard', NULL, 0x85B11917F33744B79432A2C2FAAC6E27, NULL)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x19744D11E017491787EAC507AF758856, CAST(N'2020-08-13T00:06:40.1230000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1230000' AS DateTime2), 13, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Contrato aditivo', NULL, N'/LIC/CONTRATO_ADT', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x20255A3C643B4AA6BEEF75FF2DCB05D1, CAST(N'2020-08-13T00:06:23.2850000' AS DateTime2), CAST(N'2020-08-13T00:06:23.2850000' AS DateTime2), 3, NULL, NULL, NULL, N'icon-puzzle', NULL, NULL, N'Domínios', NULL, N'/dominio', NULL, NULL, NULL)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x2C39ABC8A81A494284B231A425321F74, CAST(N'2020-08-13T00:06:23.2860000' AS DateTime2), CAST(N'2020-08-13T00:06:23.2860000' AS DateTime2), 4, NULL, NULL, NULL, N'icon-puzzle', NULL, NULL, N'Tipo de envio', NULL, N'/dominio/tipo-de-envio', NULL, NULL, 0x20255A3C643B4AA6BEEF75FF2DCB05D1)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x6A29BB08553F4800A7576803BBEEADA1, CAST(N'2020-08-13T00:06:23.2880000' AS DateTime2), CAST(N'2020-08-13T00:06:23.2880000' AS DateTime2), 6, NULL, NULL, NULL, N'icon-puzzle', NULL, NULL, N'Natureza do Objeto', NULL, N'/dominio/natureza-do-objeto', NULL, NULL, 0x20255A3C643B4AA6BEEF75FF2DCB05D1)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x8147987AA048440C905C7FD03CB62B2E, CAST(N'2020-08-13T00:06:40.1190000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1190000' AS DateTime2), 10, NULL, NULL, NULL, N'icon-user-unfollow', NULL, NULL, N'Contrato Rescisao', NULL, N'/LIC/CONTRATO_RESC', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0x89EA7AF1B1384C56A3212AAAF3791C71, CAST(N'2020-08-13T00:05:53.8290000' AS DateTime2), CAST(N'2020-08-13T00:05:53.8290000' AS DateTime2), 2, NULL, NULL, NULL, NULL, NULL, NULL, N'Tabelas', 1, NULL, NULL, NULL, NULL)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xB5D572B1EE134896A820DD765F3A4ACB, CAST(N'2020-08-13T00:06:40.1240000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1240000' AS DateTime2), 14, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Dispensa', NULL, N'/LIC/DISPENSA_INEXIG', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xB8D3A7FC4FD84923BEC843008CF0CC22, CAST(N'2020-08-13T00:06:40.1210000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1210000' AS DateTime2), 11, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Situacao Procedimento', NULL, N'/LIC/SITUACAO_PROCED', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xB901731623A645BF9E6CDBB98A0A9410, CAST(N'2020-08-13T00:06:40.1180000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1180000' AS DateTime2), 9, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Reg. Proc. licitatórios', NULL, N'/LIC/REG_LICITACAO', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xC2EB25EC460A4B30BD4FC802A6719878, CAST(N'2020-08-13T00:06:23.2870000' AS DateTime2), CAST(N'2020-08-13T00:06:23.2870000' AS DateTime2), 5, NULL, NULL, NULL, N'icon-puzzle', NULL, NULL, N'Tipo regulamentação', NULL, N'/dominio/tipo-regulamentacao', NULL, NULL, 0x20255A3C643B4AA6BEEF75FF2DCB05D1)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xE1EE4ABD4924491EB836D6DA603900D8, CAST(N'2020-08-13T00:06:40.1220000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1220000' AS DateTime2), 12, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Registro de Precos', NULL, N'/LIC/ADESAO_REG_PREC', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xE4FDFB5DD08E45BEAAAB6E91C5CA8B3A, CAST(N'2020-08-13T00:06:40.1270000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1270000' AS DateTime2), 17, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Contrato inicial', NULL, N'/LIC/CONTRATO_INI', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xEACA8E8813A947A982E46621A16583A9, CAST(N'2020-08-13T00:06:31.9290000' AS DateTime2), CAST(N'2020-08-13T00:06:31.9290000' AS DateTime2), 7, NULL, NULL, NULL, NULL, NULL, NULL, N'LICITAÇÕES', 1, NULL, NULL, NULL, NULL)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xF0746648100046F59AD147C2751E477F, CAST(N'2020-08-13T00:06:40.1120000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1120000' AS DateTime2), 8, NULL, NULL, NULL, N'icon-puzzle', NULL, NULL, N'Layout´s', NULL, N'/LIC', NULL, NULL, NULL)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xF803874E0230481EAD6763FFC758001A, CAST(N'2020-08-13T00:06:40.1240000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1250000' AS DateTime2), 15, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Licitação Fase 1', NULL, N'/LIC/LICITACAOFASE1', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
INSERT [colare].[inav_data] ([uuid], [altered_at], [inserted_at], [seq], [classe], [divider], [href], [icon], [layout_descricao], [layout_titulo], [name], [title], [url], [variant], [badge_id], [menu_id]) VALUES (0xF9C825F249CF4F6E8D12631FF705F590, CAST(N'2020-08-13T00:06:40.1260000' AS DateTime2), CAST(N'2020-08-13T00:06:40.1260000' AS DateTime2), 16, NULL, NULL, NULL, N'icon-notebook', NULL, NULL, N'Licitação Fase 2', NULL, N'/LIC/LICITACAOFASE2', NULL, NULL, 0xF0746648100046F59AD147C2751E477F)
SET IDENTITY_INSERT [colare].[inav_data] OFF
GO
SET IDENTITY_INSERT [colare].[usuario] ON 

INSERT [colare].[usuario] ([uuid], [altered_at], [inserted_at], [seq], [email], [nome], [password], [sobrenome]) VALUES (0xA988C2D909DA4E52894934F727B3065B, CAST(N'2020-08-12T22:23:08.1740000' AS DateTime2), CAST(N'2020-08-12T22:23:08.1740000' AS DateTime2), 1, N'douglas.janerson@gmail.com', N'Janerson Douglas', N'$2a$10$KuLE0V.oSuTSpTZ.qp2ggOpEgM.XPcomdJaMa3anwXAdGSV7xDM3.', N'dos Santos')
SET IDENTITY_INSERT [colare].[usuario] OFF
GO
ALTER TABLE [colare].[adesao_reg_prec]  WITH CHECK ADD  CONSTRAINT [FKegj94nk0wj0bgepa3p4cv5dnv] FOREIGN KEY([org_ger_adesao_id])
REFERENCES [colare].[org_ger_adesao] ([uuid])
GO
ALTER TABLE [colare].[adesao_reg_prec] CHECK CONSTRAINT [FKegj94nk0wj0bgepa3p4cv5dnv]
GO
ALTER TABLE [colare].[adesao_reg_prec]  WITH CHECK ADD  CONSTRAINT [FKquaqqxs8q73xg0oupsvjaifqs] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[adesao_reg_prec] CHECK CONSTRAINT [FKquaqqxs8q73xg0oupsvjaifqs]
GO
ALTER TABLE [colare].[adtv_cont_licit]  WITH CHECK ADD  CONSTRAINT [FKb9qf92wltmbsx7m9rw6a5vmua] FOREIGN KEY([uuid])
REFERENCES [colare].[licitacao] ([uuid])
GO
ALTER TABLE [colare].[adtv_cont_licit] CHECK CONSTRAINT [FKb9qf92wltmbsx7m9rw6a5vmua]
GO
ALTER TABLE [colare].[atas_fase2]  WITH CHECK ADD  CONSTRAINT [FKj1ms6nah9ye4w2v2j3jx2p40l] FOREIGN KEY([licitacaofase2_id])
REFERENCES [colare].[licitacaofase2] ([uuid])
GO
ALTER TABLE [colare].[atas_fase2] CHECK CONSTRAINT [FKj1ms6nah9ye4w2v2j3jx2p40l]
GO
ALTER TABLE [colare].[comissao_fase1]  WITH CHECK ADD  CONSTRAINT [FKoxpiw4wwa34wv5qnny71em8am] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[comissao_fase1] CHECK CONSTRAINT [FKoxpiw4wwa34wv5qnny71em8am]
GO
ALTER TABLE [colare].[cont_cred_edita]  WITH CHECK ADD  CONSTRAINT [FK21hao52uoa72n1k1nvxgalq8o] FOREIGN KEY([contr_proc_disp_id])
REFERENCES [colare].[contr_proc_disp] ([uuid])
GO
ALTER TABLE [colare].[cont_cred_edita] CHECK CONSTRAINT [FK21hao52uoa72n1k1nvxgalq8o]
GO
ALTER TABLE [colare].[cont_cred_edita]  WITH CHECK ADD  CONSTRAINT [FKat2kp88i2g564n07479xq33s2] FOREIGN KEY([id])
REFERENCES [colare].[editaleanexo] ([uuid])
GO
ALTER TABLE [colare].[cont_cred_edita] CHECK CONSTRAINT [FKat2kp88i2g564n07479xq33s2]
GO
ALTER TABLE [colare].[cont_lic_edital]  WITH CHECK ADD  CONSTRAINT [FKh317vwkbdh4tkaykrsnyagmwo] FOREIGN KEY([contr_proc_lic_id])
REFERENCES [colare].[contr_proc_lic] ([uuid])
GO
ALTER TABLE [colare].[cont_lic_edital] CHECK CONSTRAINT [FKh317vwkbdh4tkaykrsnyagmwo]
GO
ALTER TABLE [colare].[cont_lic_edital]  WITH CHECK ADD  CONSTRAINT [FKshyagco8qspn7gwwvtak0f4pi] FOREIGN KEY([id])
REFERENCES [colare].[editaleanexo] ([uuid])
GO
ALTER TABLE [colare].[cont_lic_edital] CHECK CONSTRAINT [FKshyagco8qspn7gwwvtak0f4pi]
GO
ALTER TABLE [colare].[contr_natobjdet]  WITH CHECK ADD  CONSTRAINT [FKfpq4seoafmut4bbumrs1j65ml] FOREIGN KEY([uuid])
REFERENCES [colare].[natureza_objeto_detalhada] ([uuid])
GO
ALTER TABLE [colare].[contr_natobjdet] CHECK CONSTRAINT [FKfpq4seoafmut4bbumrs1j65ml]
GO
ALTER TABLE [colare].[contr_natobjdet]  WITH CHECK ADD  CONSTRAINT [FKgtds2fum5ti7dd0dhy7plkib5] FOREIGN KEY([contrato_ini_id])
REFERENCES [colare].[contrato_ini] ([uuid])
GO
ALTER TABLE [colare].[contr_natobjdet] CHECK CONSTRAINT [FKgtds2fum5ti7dd0dhy7plkib5]
GO
ALTER TABLE [colare].[contr_proc_docs]  WITH CHECK ADD  CONSTRAINT [FK3oki5q6gpcyp4ve07q25ulru0] FOREIGN KEY([contr_proc_ades_id])
REFERENCES [colare].[contr_proc_ades] ([uuid])
GO
ALTER TABLE [colare].[contr_proc_docs] CHECK CONSTRAINT [FK3oki5q6gpcyp4ve07q25ulru0]
GO
ALTER TABLE [colare].[contr_proc_docs]  WITH CHECK ADD  CONSTRAINT [FKgj4i7bk4c5a7mrxh004ihodeu] FOREIGN KEY([uuid])
REFERENCES [colare].[documento] ([uuid])
GO
ALTER TABLE [colare].[contr_proc_docs] CHECK CONSTRAINT [FKgj4i7bk4c5a7mrxh004ihodeu]
GO
ALTER TABLE [colare].[contr_proc_lic]  WITH CHECK ADD  CONSTRAINT [FKbd7ua72vh7sxrqmn9f7g8f8nu] FOREIGN KEY([uuid])
REFERENCES [colare].[licitacao] ([uuid])
GO
ALTER TABLE [colare].[contr_proc_lic] CHECK CONSTRAINT [FKbd7ua72vh7sxrqmn9f7g8f8nu]
GO
ALTER TABLE [colare].[contrat_proced]  WITH CHECK ADD  CONSTRAINT [FK2gsbody9ompmj0sfsdpxlvw8u] FOREIGN KEY([contr_proc_lic_id])
REFERENCES [colare].[contr_proc_lic] ([uuid])
GO
ALTER TABLE [colare].[contrat_proced] CHECK CONSTRAINT [FK2gsbody9ompmj0sfsdpxlvw8u]
GO
ALTER TABLE [colare].[contrat_proced]  WITH CHECK ADD  CONSTRAINT [FK81py2imi6mexy62mgd8qugp66] FOREIGN KEY([adesaoaregistro_de_precos_uuid])
REFERENCES [colare].[contr_proc_ades] ([uuid])
GO
ALTER TABLE [colare].[contrat_proced] CHECK CONSTRAINT [FK81py2imi6mexy62mgd8qugp66]
GO
ALTER TABLE [colare].[contrat_proced]  WITH CHECK ADD  CONSTRAINT [FKea3tur6qwptkuf2klr2oxia38] FOREIGN KEY([contr_proc_disp_id])
REFERENCES [colare].[contr_proc_disp] ([uuid])
GO
ALTER TABLE [colare].[contrat_proced] CHECK CONSTRAINT [FKea3tur6qwptkuf2klr2oxia38]
GO
ALTER TABLE [colare].[contratado_adt]  WITH CHECK ADD  CONSTRAINT [FKixv2wlwcr8nu406cc30o4qpoi] FOREIGN KEY([uuid])
REFERENCES [colare].[contratado] ([uuid])
GO
ALTER TABLE [colare].[contratado_adt] CHECK CONSTRAINT [FKixv2wlwcr8nu406cc30o4qpoi]
GO
ALTER TABLE [colare].[contratado_ini]  WITH CHECK ADD  CONSTRAINT [FKf7vdcs03ktc9h3q5bl1gyy35] FOREIGN KEY([uuid])
REFERENCES [colare].[contratado] ([uuid])
GO
ALTER TABLE [colare].[contratado_ini] CHECK CONSTRAINT [FKf7vdcs03ktc9h3q5bl1gyy35]
GO
ALTER TABLE [colare].[contrato_adt]  WITH CHECK ADD  CONSTRAINT [FK12aiudc7tbpqp6hw8cll3mmqo] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[contrato_adt] CHECK CONSTRAINT [FK12aiudc7tbpqp6hw8cll3mmqo]
GO
ALTER TABLE [colare].[contrato_adt]  WITH CHECK ADD  CONSTRAINT [FK5hila41akm9d6xh3tjg9r2tyq] FOREIGN KEY([contratado_adt_id])
REFERENCES [colare].[contratado_adt] ([uuid])
GO
ALTER TABLE [colare].[contrato_adt] CHECK CONSTRAINT [FK5hila41akm9d6xh3tjg9r2tyq]
GO
ALTER TABLE [colare].[contrato_adt]  WITH CHECK ADD  CONSTRAINT [FKgc59vv6qtow5f0i0gnvyqlca0] FOREIGN KEY([adtv_contr_orig_id])
REFERENCES [colare].[contrato_original] ([uuid])
GO
ALTER TABLE [colare].[contrato_adt] CHECK CONSTRAINT [FKgc59vv6qtow5f0i0gnvyqlca0]
GO
ALTER TABLE [colare].[contrato_ini]  WITH CHECK ADD  CONSTRAINT [FK9g2j01aq4uhnoaqbimusmbk6h] FOREIGN KEY([contrat_proced_id])
REFERENCES [colare].[contrat_proced] ([uuid])
GO
ALTER TABLE [colare].[contrato_ini] CHECK CONSTRAINT [FK9g2j01aq4uhnoaqbimusmbk6h]
GO
ALTER TABLE [colare].[contrato_ini]  WITH CHECK ADD  CONSTRAINT [FKee9r3yw6ws1hjmtit4f969s9j] FOREIGN KEY([contratado_ini_id])
REFERENCES [colare].[contratado_ini] ([uuid])
GO
ALTER TABLE [colare].[contrato_ini] CHECK CONSTRAINT [FKee9r3yw6ws1hjmtit4f969s9j]
GO
ALTER TABLE [colare].[contrato_ini]  WITH CHECK ADD  CONSTRAINT [FKlyaapxib1e3igdxeqtagmwnc7] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[contrato_ini] CHECK CONSTRAINT [FKlyaapxib1e3igdxeqtagmwnc7]
GO
ALTER TABLE [colare].[contrato_original]  WITH CHECK ADD  CONSTRAINT [FKjgaxiptas86a43xo5x9ugcben] FOREIGN KEY([adtv_cont_licit_id])
REFERENCES [colare].[adtv_cont_licit] ([uuid])
GO
ALTER TABLE [colare].[contrato_original] CHECK CONSTRAINT [FKjgaxiptas86a43xo5x9ugcben]
GO
ALTER TABLE [colare].[contrato_resc]  WITH CHECK ADD  CONSTRAINT [FK3f561h338m8lg2rqj329tq22a] FOREIGN KEY([resc_contr_orig_id])
REFERENCES [colare].[resc_contr_orig] ([uuid])
GO
ALTER TABLE [colare].[contrato_resc] CHECK CONSTRAINT [FK3f561h338m8lg2rqj329tq22a]
GO
ALTER TABLE [colare].[contrato_resc]  WITH CHECK ADD  CONSTRAINT [FKr2epxtovog9asymdgw5i2xmfr] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[contrato_resc] CHECK CONSTRAINT [FKr2epxtovog9asymdgw5i2xmfr]
GO
ALTER TABLE [colare].[cotacao_adesao]  WITH CHECK ADD  CONSTRAINT [FKdrxtd4w5bh0m8gcsdyq94hu2w] FOREIGN KEY([item_adesao_id])
REFERENCES [colare].[item_adesao] ([codigo])
GO
ALTER TABLE [colare].[cotacao_adesao] CHECK CONSTRAINT [FKdrxtd4w5bh0m8gcsdyq94hu2w]
GO
ALTER TABLE [colare].[disp_edit_anex]  WITH CHECK ADD  CONSTRAINT [FKar0dtdj79i5y8k2vrcx00b2ef] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[disp_edit_anex] CHECK CONSTRAINT [FKar0dtdj79i5y8k2vrcx00b2ef]
GO
ALTER TABLE [colare].[disp_edit_anex]  WITH CHECK ADD  CONSTRAINT [FKbythtotx80ts7pgu7s72idyws] FOREIGN KEY([id])
REFERENCES [colare].[editaleanexo] ([uuid])
GO
ALTER TABLE [colare].[disp_edit_anex] CHECK CONSTRAINT [FKbythtotx80ts7pgu7s72idyws]
GO
ALTER TABLE [colare].[disp_natobjdet]  WITH CHECK ADD  CONSTRAINT [FKtgjihrtpehrtat8kl7j89f8b5] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[disp_natobjdet] CHECK CONSTRAINT [FKtgjihrtpehrtat8kl7j89f8b5]
GO
ALTER TABLE [colare].[dispensa_inexig]  WITH CHECK ADD  CONSTRAINT [FKsy0exeffugvrswkf80qd3cvyq] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[dispensa_inexig] CHECK CONSTRAINT [FKsy0exeffugvrswkf80qd3cvyq]
GO
ALTER TABLE [colare].[doc_adesao]  WITH CHECK ADD  CONSTRAINT [FKo04pyty2tpe0x7r5odhxh35cn] FOREIGN KEY([uuid])
REFERENCES [colare].[documento] ([uuid])
GO
ALTER TABLE [colare].[doc_adesao] CHECK CONSTRAINT [FKo04pyty2tpe0x7r5odhxh35cn]
GO
ALTER TABLE [colare].[doc_adesao]  WITH CHECK ADD  CONSTRAINT [FKphgw4muj2duk06ypqof29cof9] FOREIGN KEY([adesao_reg_prec_id])
REFERENCES [colare].[adesao_reg_prec] ([uuid])
GO
ALTER TABLE [colare].[doc_adesao] CHECK CONSTRAINT [FKphgw4muj2duk06ypqof29cof9]
GO
ALTER TABLE [colare].[dominio]  WITH CHECK ADD  CONSTRAINT [FKjhrlcauluxyy60m47uqtvfgrd] FOREIGN KEY([tp_dominio_id])
REFERENCES [colare].[tipo_dominio] ([uuid])
GO
ALTER TABLE [colare].[dominio] CHECK CONSTRAINT [FKjhrlcauluxyy60m47uqtvfgrd]
GO
ALTER TABLE [colare].[dotacao_adesao]  WITH CHECK ADD  CONSTRAINT [FKoqa9dddvmmdtwmgitdta9lg13] FOREIGN KEY([uuid])
REFERENCES [colare].[dotacao] ([uuid])
GO
ALTER TABLE [colare].[dotacao_adesao] CHECK CONSTRAINT [FKoqa9dddvmmdtwmgitdta9lg13]
GO
ALTER TABLE [colare].[dotacao_adesao]  WITH CHECK ADD  CONSTRAINT [FKot4dw0i04hsf8xqcol3wgsfsm] FOREIGN KEY([recorc_adesao_id])
REFERENCES [colare].[recorc_adesao] ([uuid])
GO
ALTER TABLE [colare].[dotacao_adesao] CHECK CONSTRAINT [FKot4dw0i04hsf8xqcol3wgsfsm]
GO
ALTER TABLE [colare].[dotacao_disp]  WITH CHECK ADD  CONSTRAINT [FKbqc1nrpuxuey3a7td05k39u0e] FOREIGN KEY([id])
REFERENCES [colare].[dotacao] ([uuid])
GO
ALTER TABLE [colare].[dotacao_disp] CHECK CONSTRAINT [FKbqc1nrpuxuey3a7td05k39u0e]
GO
ALTER TABLE [colare].[dotacao_disp]  WITH CHECK ADD  CONSTRAINT [FKep5grdsap54di9srvau4035wf] FOREIGN KEY([recorc_disp_id])
REFERENCES [colare].[recorc_disp] ([id])
GO
ALTER TABLE [colare].[dotacao_disp] CHECK CONSTRAINT [FKep5grdsap54di9srvau4035wf]
GO
ALTER TABLE [colare].[dotacao_fase1]  WITH CHECK ADD  CONSTRAINT [FK3psb74qbfspepgtrsy3m985nu] FOREIGN KEY([id])
REFERENCES [colare].[dotacao] ([uuid])
GO
ALTER TABLE [colare].[dotacao_fase1] CHECK CONSTRAINT [FK3psb74qbfspepgtrsy3m985nu]
GO
ALTER TABLE [colare].[dotacao_fase1]  WITH CHECK ADD  CONSTRAINT [FK5r7tuglg4kyndg4g944c5256v] FOREIGN KEY([recorc_fase1_id])
REFERENCES [colare].[recorc_fase1] ([id])
GO
ALTER TABLE [colare].[dotacao_fase1] CHECK CONSTRAINT [FK5r7tuglg4kyndg4g944c5256v]
GO
ALTER TABLE [colare].[emp_anulado_res]  WITH CHECK ADD  CONSTRAINT [FKea9twgppcjwdymf0wedwmf8km] FOREIGN KEY([contrato_resc_id])
REFERENCES [colare].[contrato_resc] ([uuid])
GO
ALTER TABLE [colare].[emp_anulado_res] CHECK CONSTRAINT [FKea9twgppcjwdymf0wedwmf8km]
GO
ALTER TABLE [colare].[emp_contrat_adt]  WITH CHECK ADD  CONSTRAINT [FK1gdecucjnvrnf1mnc2vbxg0jm] FOREIGN KEY([contrato_adt_id])
REFERENCES [colare].[contrato_adt] ([uuid])
GO
ALTER TABLE [colare].[emp_contrat_adt] CHECK CONSTRAINT [FK1gdecucjnvrnf1mnc2vbxg0jm]
GO
ALTER TABLE [colare].[emp_contrat_adt]  WITH CHECK ADD  CONSTRAINT [FKtf56ma2tlume3qv8u1u0mop4f] FOREIGN KEY([uuid])
REFERENCES [colare].[empenho] ([uuid])
GO
ALTER TABLE [colare].[emp_contrat_adt] CHECK CONSTRAINT [FKtf56ma2tlume3qv8u1u0mop4f]
GO
ALTER TABLE [colare].[emp_contrat_ini]  WITH CHECK ADD  CONSTRAINT [FK49g5lp06kqtcmoq6fw9edof8d] FOREIGN KEY([id])
REFERENCES [colare].[empenho] ([uuid])
GO
ALTER TABLE [colare].[emp_contrat_ini] CHECK CONSTRAINT [FK49g5lp06kqtcmoq6fw9edof8d]
GO
ALTER TABLE [colare].[emp_contrat_ini]  WITH CHECK ADD  CONSTRAINT [FKjkbylwj5181pfbencfc5rr78b] FOREIGN KEY([contrato_ini_id])
REFERENCES [colare].[contrato_ini] ([uuid])
GO
ALTER TABLE [colare].[emp_contrat_ini] CHECK CONSTRAINT [FKjkbylwj5181pfbencfc5rr78b]
GO
ALTER TABLE [colare].[fas1_edit_anex]  WITH CHECK ADD  CONSTRAINT [FK8aoybt6nhe5dy8a5qfjiwwdda] FOREIGN KEY([id])
REFERENCES [colare].[editaleanexo] ([uuid])
GO
ALTER TABLE [colare].[fas1_edit_anex] CHECK CONSTRAINT [FK8aoybt6nhe5dy8a5qfjiwwdda]
GO
ALTER TABLE [colare].[fas1_edit_anex]  WITH CHECK ADD  CONSTRAINT [FKg6dtt54uown1le068p1ufasqo] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[fas1_edit_anex] CHECK CONSTRAINT [FKg6dtt54uown1le068p1ufasqo]
GO
ALTER TABLE [colare].[fas1_natobjdet]  WITH CHECK ADD  CONSTRAINT [FKakejddwwriuhl0honwyvuodiw] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[fas1_natobjdet] CHECK CONSTRAINT [FKakejddwwriuhl0honwyvuodiw]
GO
ALTER TABLE [colare].[fas1_natobjdet]  WITH CHECK ADD  CONSTRAINT [FKkatd6ikl3xh3urdncsci7fcf] FOREIGN KEY([id])
REFERENCES [colare].[natureza_objeto_detalhada] ([uuid])
GO
ALTER TABLE [colare].[fas1_natobjdet] CHECK CONSTRAINT [FKkatd6ikl3xh3urdncsci7fcf]
GO
ALTER TABLE [colare].[inav_data]  WITH CHECK ADD  CONSTRAINT [FK5keje73t981qh2p8628ycv08e] FOREIGN KEY([menu_id])
REFERENCES [colare].[inav_data] ([uuid])
GO
ALTER TABLE [colare].[inav_data] CHECK CONSTRAINT [FK5keje73t981qh2p8628ycv08e]
GO
ALTER TABLE [colare].[inav_data]  WITH CHECK ADD  CONSTRAINT [FK74amwfeeunoq4rp5x3qfl8rjd] FOREIGN KEY([badge_id])
REFERENCES [colare].[inav_badge] ([uuid])
GO
ALTER TABLE [colare].[inav_data] CHECK CONSTRAINT [FK74amwfeeunoq4rp5x3qfl8rjd]
GO
ALTER TABLE [colare].[item_adesao]  WITH CHECK ADD  CONSTRAINT [FK73vbxqk6m3dy61vin3wkllnd8] FOREIGN KEY([codigo])
REFERENCES [colare].[item] ([uuid])
GO
ALTER TABLE [colare].[item_adesao] CHECK CONSTRAINT [FK73vbxqk6m3dy61vin3wkllnd8]
GO
ALTER TABLE [colare].[item_adesao]  WITH CHECK ADD  CONSTRAINT [FKlu2istaig2pwj9a93kf75myc0] FOREIGN KEY([lote_adesao_id])
REFERENCES [colare].[lote_adesao] ([uuid])
GO
ALTER TABLE [colare].[item_adesao] CHECK CONSTRAINT [FKlu2istaig2pwj9a93kf75myc0]
GO
ALTER TABLE [colare].[item_adt]  WITH CHECK ADD  CONSTRAINT [FKmqf5eaxa49x9jm4jyoyqw5565] FOREIGN KEY([contratado_adt_id])
REFERENCES [colare].[contratado_adt] ([uuid])
GO
ALTER TABLE [colare].[item_adt] CHECK CONSTRAINT [FKmqf5eaxa49x9jm4jyoyqw5565]
GO
ALTER TABLE [colare].[item_disp]  WITH CHECK ADD  CONSTRAINT [FKbesnlh56sy761nnios5l28li9] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[item_disp] CHECK CONSTRAINT [FKbesnlh56sy761nnios5l28li9]
GO
ALTER TABLE [colare].[item_disp]  WITH CHECK ADD  CONSTRAINT [FKelfxbl9knuuqrd8gwt09q2ies] FOREIGN KEY([codigo])
REFERENCES [colare].[item] ([uuid])
GO
ALTER TABLE [colare].[item_disp] CHECK CONSTRAINT [FKelfxbl9knuuqrd8gwt09q2ies]
GO
ALTER TABLE [colare].[item_fase1]  WITH CHECK ADD  CONSTRAINT [FK1qdsr193nonqqih4vy7ndhgr1] FOREIGN KEY([codigo])
REFERENCES [colare].[item] ([uuid])
GO
ALTER TABLE [colare].[item_fase1] CHECK CONSTRAINT [FK1qdsr193nonqqih4vy7ndhgr1]
GO
ALTER TABLE [colare].[item_fase1]  WITH CHECK ADD  CONSTRAINT [FKlc2s32ifwkbhv680ernnym2nd] FOREIGN KEY([lote_fase1_id])
REFERENCES [colare].[lote_fase1] ([id])
GO
ALTER TABLE [colare].[item_fase1] CHECK CONSTRAINT [FKlc2s32ifwkbhv680ernnym2nd]
GO
ALTER TABLE [colare].[lic_fase2]  WITH CHECK ADD  CONSTRAINT [FK33jewsjv9cw50cbc069ow36m] FOREIGN KEY([julg_fase2_id])
REFERENCES [colare].[julg_fase2] ([uuid])
GO
ALTER TABLE [colare].[lic_fase2] CHECK CONSTRAINT [FK33jewsjv9cw50cbc069ow36m]
GO
ALTER TABLE [colare].[lic_fase2]  WITH CHECK ADD  CONSTRAINT [FK7x4vuvfa56m7kfjjr07ocfnmd] FOREIGN KEY([licitacaofase2_id])
REFERENCES [colare].[licitacaofase2] ([uuid])
GO
ALTER TABLE [colare].[lic_fase2] CHECK CONSTRAINT [FK7x4vuvfa56m7kfjjr07ocfnmd]
GO
ALTER TABLE [colare].[lic_fase2]  WITH CHECK ADD  CONSTRAINT [FKfv5hgef7tn2sw6yfrrnh20sf4] FOREIGN KEY([habilit_fase2_id])
REFERENCES [colare].[habilit_fase2] ([uuid])
GO
ALTER TABLE [colare].[lic_fase2] CHECK CONSTRAINT [FKfv5hgef7tn2sw6yfrrnh20sf4]
GO
ALTER TABLE [colare].[licitacaofase1]  WITH CHECK ADD  CONSTRAINT [FKb2of55rm5ci4kryfypn7pyoie] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[licitacaofase1] CHECK CONSTRAINT [FKb2of55rm5ci4kryfypn7pyoie]
GO
ALTER TABLE [colare].[licitacaofase2]  WITH CHECK ADD  CONSTRAINT [FK4daqx69ybkslrd37obi7245ls] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[licitacaofase2] CHECK CONSTRAINT [FK4daqx69ybkslrd37obi7245ls]
GO
ALTER TABLE [colare].[lote_adesao]  WITH CHECK ADD  CONSTRAINT [FKoyohbs729gfq299udwb1v6gt5] FOREIGN KEY([org_ger_adesao_id])
REFERENCES [colare].[org_ger_adesao] ([uuid])
GO
ALTER TABLE [colare].[lote_adesao] CHECK CONSTRAINT [FKoyohbs729gfq299udwb1v6gt5]
GO
ALTER TABLE [colare].[lote_adesao]  WITH CHECK ADD  CONSTRAINT [FKq0sdgw4cvg014xugpew2kccvm] FOREIGN KEY([uuid])
REFERENCES [colare].[lote] ([uuid])
GO
ALTER TABLE [colare].[lote_adesao] CHECK CONSTRAINT [FKq0sdgw4cvg014xugpew2kccvm]
GO
ALTER TABLE [colare].[lote_fase1]  WITH CHECK ADD  CONSTRAINT [FK2eawklss052vqcr7w6dbh5p24] FOREIGN KEY([id])
REFERENCES [colare].[lote] ([uuid])
GO
ALTER TABLE [colare].[lote_fase1] CHECK CONSTRAINT [FK2eawklss052vqcr7w6dbh5p24]
GO
ALTER TABLE [colare].[lote_fase1]  WITH CHECK ADD  CONSTRAINT [FKk7f2qnlic9sbhj8qilynrpo5c] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[lote_fase1] CHECK CONSTRAINT [FKk7f2qnlic9sbhj8qilynrpo5c]
GO
ALTER TABLE [colare].[membro_fase1]  WITH CHECK ADD  CONSTRAINT [FK6jx1gawkp8acc8wlqsk467h07] FOREIGN KEY([comissao_fase1_id])
REFERENCES [colare].[comissao_fase1] ([uuid])
GO
ALTER TABLE [colare].[membro_fase1] CHECK CONSTRAINT [FK6jx1gawkp8acc8wlqsk467h07]
GO
ALTER TABLE [colare].[parec_adesao]  WITH CHECK ADD  CONSTRAINT [FK8aiygfuj5b6brrqr0iac5g8xa] FOREIGN KEY([adesao_reg_prec_id])
REFERENCES [colare].[adesao_reg_prec] ([uuid])
GO
ALTER TABLE [colare].[parec_adesao] CHECK CONSTRAINT [FK8aiygfuj5b6brrqr0iac5g8xa]
GO
ALTER TABLE [colare].[parec_adesao]  WITH CHECK ADD  CONSTRAINT [FKqbwtbnh1l1mu345bxbg5tulc1] FOREIGN KEY([uuid])
REFERENCES [colare].[parecer] ([uuid])
GO
ALTER TABLE [colare].[parec_adesao] CHECK CONSTRAINT [FKqbwtbnh1l1mu345bxbg5tulc1]
GO
ALTER TABLE [colare].[parec_disp]  WITH CHECK ADD  CONSTRAINT [FK8pqfhosxyaj91stj3f128galw] FOREIGN KEY([id])
REFERENCES [colare].[parecer] ([uuid])
GO
ALTER TABLE [colare].[parec_disp] CHECK CONSTRAINT [FK8pqfhosxyaj91stj3f128galw]
GO
ALTER TABLE [colare].[parec_disp]  WITH CHECK ADD  CONSTRAINT [FKtbjng370t51ex0g9whdt8d23n] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[parec_disp] CHECK CONSTRAINT [FKtbjng370t51ex0g9whdt8d23n]
GO
ALTER TABLE [colare].[parec_fase1]  WITH CHECK ADD  CONSTRAINT [FKaq36v6kwgr0ytwx3qx8r2x8yd] FOREIGN KEY([id])
REFERENCES [colare].[parecer] ([uuid])
GO
ALTER TABLE [colare].[parec_fase1] CHECK CONSTRAINT [FKaq36v6kwgr0ytwx3qx8r2x8yd]
GO
ALTER TABLE [colare].[parec_fase1]  WITH CHECK ADD  CONSTRAINT [FKjc1thh1d8h31pplhwfl6tgejk] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[parec_fase1] CHECK CONSTRAINT [FKjc1thh1d8h31pplhwfl6tgejk]
GO
ALTER TABLE [colare].[parec_fase2]  WITH CHECK ADD  CONSTRAINT [FKkfm3svkvfhnoo8eu5hu4gdvca] FOREIGN KEY([licitacaofase2_id])
REFERENCES [colare].[licitacaofase2] ([uuid])
GO
ALTER TABLE [colare].[parec_fase2] CHECK CONSTRAINT [FKkfm3svkvfhnoo8eu5hu4gdvca]
GO
ALTER TABLE [colare].[parec_fase2]  WITH CHECK ADD  CONSTRAINT [FKn7kcyk936n2ewafcxiynyll3e] FOREIGN KEY([uuid])
REFERENCES [colare].[parecer] ([uuid])
GO
ALTER TABLE [colare].[parec_fase2] CHECK CONSTRAINT [FKn7kcyk936n2ewafcxiynyll3e]
GO
ALTER TABLE [colare].[pes_adm_dadoadm]  WITH CHECK ADD  CONSTRAINT [FKbevgais21wxl9msdww8ky7toy] FOREIGN KEY([pes_adm_ate2019_id])
REFERENCES [colare].[pes_adm_ate2019] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_dadoadm] CHECK CONSTRAINT [FKbevgais21wxl9msdww8ky7toy]
GO
ALTER TABLE [colare].[pes_adm_dadoadm]  WITH CHECK ADD  CONSTRAINT [FKe1na8lfjvu8ky60csf5y0nsv0] FOREIGN KEY([pes_adm_adm2020_id])
REFERENCES [colare].[pes_adm_adm2020] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_dadoadm] CHECK CONSTRAINT [FKe1na8lfjvu8ky60csf5y0nsv0]
GO
ALTER TABLE [colare].[pes_adm_dadosac]  WITH CHECK ADD  CONSTRAINT [FKk26ufjmyy1whxhd7m1248gl4y] FOREIGN KEY([pes_adm_acumula_id])
REFERENCES [colare].[pes_adm_acumula] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_dadosac] CHECK CONSTRAINT [FKk26ufjmyy1whxhd7m1248gl4y]
GO
ALTER TABLE [colare].[pes_adm_dadosac]  WITH CHECK ADD  CONSTRAINT [FKo5tc0wxvtggawlqn9unlxu78c] FOREIGN KEY([pes_adm_acum2_id])
REFERENCES [colare].[pes_adm_acum2] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_dadosac] CHECK CONSTRAINT [FKo5tc0wxvtggawlqn9unlxu78c]
GO
ALTER TABLE [colare].[pes_adm_detjud]  WITH CHECK ADD  CONSTRAINT [FKtf23ecpn4wbrara66v555q0xs] FOREIGN KEY([pes_adm_subjudi_id])
REFERENCES [colare].[pes_adm_subjudi] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_detjud] CHECK CONSTRAINT [FKtf23ecpn4wbrara66v555q0xs]
GO
ALTER TABLE [colare].[pes_adm_docposs]  WITH CHECK ADD  CONSTRAINT [FKr2m8dylj6r6vhygunri5ouuml] FOREIGN KEY([pes_admissao_id])
REFERENCES [colare].[pes_admissao] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_docposs] CHECK CONSTRAINT [FKr2m8dylj6r6vhygunri5ouuml]
GO
ALTER TABLE [colare].[pes_adm_tempsem]  WITH CHECK ADD  CONSTRAINT [FKh0y8h9afme86gvsumcp9al13e] FOREIGN KEY([pes_admissao_id])
REFERENCES [colare].[pes_admissao] ([uuid])
GO
ALTER TABLE [colare].[pes_adm_tempsem] CHECK CONSTRAINT [FKh0y8h9afme86gvsumcp9al13e]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FK3aenwsxeugcis3lte2dvrtsmk] FOREIGN KEY([pes_adm_subjudi_id])
REFERENCES [colare].[pes_adm_subjudi] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FK3aenwsxeugcis3lte2dvrtsmk]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FK7voam2h0koigawyx5t9hqp47t] FOREIGN KEY([pes_adm_acumula_id])
REFERENCES [colare].[pes_adm_acumula] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FK7voam2h0koigawyx5t9hqp47t]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FKalofqt9xjww0l08stbyy41tc5] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FKalofqt9xjww0l08stbyy41tc5]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FKcxv1sxatcy7a2btn64a6ic175] FOREIGN KEY([pes_adm_dadoadm_id])
REFERENCES [colare].[pes_adm_dadoadm] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FKcxv1sxatcy7a2btn64a6ic175]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FKfatr7eqgnq05gyfa8suau5xmm] FOREIGN KEY([pes_adm_nepotis_id])
REFERENCES [colare].[pes_adm_nepotis] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FKfatr7eqgnq05gyfa8suau5xmm]
GO
ALTER TABLE [colare].[pes_admissao]  WITH CHECK ADD  CONSTRAINT [FKqq2p6ouonmxyfq53yulqy0h66] FOREIGN KEY([pes_adm_vinculo_id])
REFERENCES [colare].[pes_adm_vinculo] ([uuid])
GO
ALTER TABLE [colare].[pes_admissao] CHECK CONSTRAINT [FKqq2p6ouonmxyfq53yulqy0h66]
GO
ALTER TABLE [colare].[pes_assuntonorm]  WITH CHECK ADD  CONSTRAINT [FK2dgssj2022o4tc0grv8l84gda] FOREIGN KEY([pes_legislacao_id])
REFERENCES [colare].[pes_legislacao] ([uuid])
GO
ALTER TABLE [colare].[pes_assuntonorm] CHECK CONSTRAINT [FK2dgssj2022o4tc0grv8l84gda]
GO
ALTER TABLE [colare].[pes_cad_pcd]  WITH CHECK ADD  CONSTRAINT [FK42jtbphb422nwry67ky589uyt] FOREIGN KEY([pes_cad_det_pcd_id])
REFERENCES [colare].[pes_cad_det_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_cad_pcd] CHECK CONSTRAINT [FK42jtbphb422nwry67ky589uyt]
GO
ALTER TABLE [colare].[pes_cad_regprof]  WITH CHECK ADD  CONSTRAINT [FKequmdc2kjq3y25omwnn29irnf] FOREIGN KEY([pes_cadastro_id])
REFERENCES [colare].[pes_cadastro] ([uuid])
GO
ALTER TABLE [colare].[pes_cad_regprof] CHECK CONSTRAINT [FKequmdc2kjq3y25omwnn29irnf]
GO
ALTER TABLE [colare].[pes_cadastro]  WITH CHECK ADD  CONSTRAINT [FKetq2muscjvujd1avsbav44mno] FOREIGN KEY([pes_cad_pcd_id])
REFERENCES [colare].[pes_cad_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_cadastro] CHECK CONSTRAINT [FKetq2muscjvujd1avsbav44mno]
GO
ALTER TABLE [colare].[pes_cadastro]  WITH CHECK ADD  CONSTRAINT [FKrhwyruc3bnapk8ox9gdguixw7] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_cadastro] CHECK CONSTRAINT [FKrhwyruc3bnapk8ox9gdguixw7]
GO
ALTER TABLE [colare].[pes_cargo_class]  WITH CHECK ADD  CONSTRAINT [FK12v52p6l7u2rda0dk3o0kd1hb] FOREIGN KEY([pes_cargos_id])
REFERENCES [colare].[pes_cargos] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_class] CHECK CONSTRAINT [FK12v52p6l7u2rda0dk3o0kd1hb]
GO
ALTER TABLE [colare].[pes_cargo_dedic]  WITH CHECK ADD  CONSTRAINT [FKf8xelavrfdvegam18u6dpk5e3] FOREIGN KEY([pes_cargo_decex_id])
REFERENCES [colare].[pes_cargo_decex] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_dedic] CHECK CONSTRAINT [FKf8xelavrfdvegam18u6dpk5e3]
GO
ALTER TABLE [colare].[pes_cargo_ente]  WITH CHECK ADD  CONSTRAINT [FKmulgqfqk15s9oqypunog3p5qu] FOREIGN KEY([pes_cargo_outen_id])
REFERENCES [colare].[pes_cargo_outen] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_ente] CHECK CONSTRAINT [FKmulgqfqk15s9oqypunog3p5qu]
GO
ALTER TABLE [colare].[pes_cargo_extin]  WITH CHECK ADD  CONSTRAINT [FKbqngl3yt4htk4t2lu4hl7a3vt] FOREIGN KEY([pes_cargo_extf_id])
REFERENCES [colare].[pes_cargo_extf] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_extin] CHECK CONSTRAINT [FKbqngl3yt4htk4t2lu4hl7a3vt]
GO
ALTER TABLE [colare].[pes_cargo_pdr_n]  WITH CHECK ADD  CONSTRAINT [FK19x2mk90t1l7etlb2cjq0lgv5] FOREIGN KEY([pes_cargo_class_id])
REFERENCES [colare].[pes_cargo_class] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_pdr_n] CHECK CONSTRAINT [FK19x2mk90t1l7etlb2cjq0lgv5]
GO
ALTER TABLE [colare].[pes_cargo_trnsf]  WITH CHECK ADD  CONSTRAINT [FK3tow2ro7v45fkks4keuw229fg] FOREIGN KEY([pes_cargo_trans_id])
REFERENCES [colare].[pes_cargo_trans] ([uuid])
GO
ALTER TABLE [colare].[pes_cargo_trnsf] CHECK CONSTRAINT [FK3tow2ro7v45fkks4keuw229fg]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FK47upnte1rx4euvy2jb32uu1n5] FOREIGN KEY([pes_cargo_trans_id])
REFERENCES [colare].[pes_cargo_trans] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FK47upnte1rx4euvy2jb32uu1n5]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FK7uj9v5gqm9ybrj3757wy1y1tj] FOREIGN KEY([pes_cargo_dedic_id])
REFERENCES [colare].[pes_cargo_dedic] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FK7uj9v5gqm9ybrj3757wy1y1tj]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FK89g0n113obedd3oce8s59o9a7] FOREIGN KEY([pes_cargo_reqpr_id])
REFERENCES [colare].[pes_cargo_reqpr] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FK89g0n113obedd3oce8s59o9a7]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FK9mpb79lgil6biwwjpddsipd1q] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FK9mpb79lgil6biwwjpddsipd1q]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FKig9r3ugl5tv68sdj3j1ksvpem] FOREIGN KEY([pes_cargo_atrib_id])
REFERENCES [colare].[pes_cargo_atrib] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FKig9r3ugl5tv68sdj3j1ksvpem]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FKptwu89wl38cvrgnatwl57tcvy] FOREIGN KEY([pes_cargo_ente_id])
REFERENCES [colare].[pes_cargo_ente] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FKptwu89wl38cvrgnatwl57tcvy]
GO
ALTER TABLE [colare].[pes_cargos]  WITH CHECK ADD  CONSTRAINT [FKwxlc0gv4k1l4hrd9iybw02vo] FOREIGN KEY([pes_cargo_extin_id])
REFERENCES [colare].[pes_cargo_extin] ([uuid])
GO
ALTER TABLE [colare].[pes_cargos] CHECK CONSTRAINT [FKwxlc0gv4k1l4hrd9iybw02vo]
GO
ALTER TABLE [colare].[pes_con_arrdpcd]  WITH CHECK ADD  CONSTRAINT [FK7enb8gknlkmkda37u1ipjpv4] FOREIGN KEY([pes_con_pcd_id])
REFERENCES [colare].[pes_con_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_con_arrdpcd] CHECK CONSTRAINT [FK7enb8gknlkmkda37u1ipjpv4]
GO
ALTER TABLE [colare].[pes_con_cadastr]  WITH CHECK ADD  CONSTRAINT [FKi6l3mkn892su6awoeqo1t7dos] FOREIGN KEY([pes_con_cadres_id])
REFERENCES [colare].[pes_con_cadres] ([uuid])
GO
ALTER TABLE [colare].[pes_con_cadastr] CHECK CONSTRAINT [FKi6l3mkn892su6awoeqo1t7dos]
GO
ALTER TABLE [colare].[pes_con_cargcla]  WITH CHECK ADD  CONSTRAINT [FK712g7fct8wpgst3st25dh8e8g] FOREIGN KEY([pes_con_carprov_id])
REFERENCES [colare].[pes_con_carprov] ([uuid])
GO
ALTER TABLE [colare].[pes_con_cargcla] CHECK CONSTRAINT [FK712g7fct8wpgst3st25dh8e8g]
GO
ALTER TABLE [colare].[pes_con_cargpro]  WITH CHECK ADD  CONSTRAINT [FKggruwd3kbwucpqnytvm64xxma] FOREIGN KEY([pes_con_psp_id])
REFERENCES [colare].[pes_con_psp] ([uuid])
GO
ALTER TABLE [colare].[pes_con_cargpro] CHECK CONSTRAINT [FKggruwd3kbwucpqnytvm64xxma]
GO
ALTER TABLE [colare].[pes_con_desemp3]  WITH CHECK ADD  CONSTRAINT [FK28vgdlfyymmqlycl6wxedcen6] FOREIGN KEY([pes_con_desempa_id])
REFERENCES [colare].[pes_con_desempa] ([uuid])
GO
ALTER TABLE [colare].[pes_con_desemp3] CHECK CONSTRAINT [FK28vgdlfyymmqlycl6wxedcen6]
GO
ALTER TABLE [colare].[pes_con_desmp1]  WITH CHECK ADD  CONSTRAINT [FKat1rys15urrqdmigwvrevt0h9] FOREIGN KEY([pes_con_desempa_id])
REFERENCES [colare].[pes_con_desempa] ([uuid])
GO
ALTER TABLE [colare].[pes_con_desmp1] CHECK CONSTRAINT [FKat1rys15urrqdmigwvrevt0h9]
GO
ALTER TABLE [colare].[pes_con_detpcd]  WITH CHECK ADD  CONSTRAINT [FK6jcag5b902wgif9yo8c8mwo0d] FOREIGN KEY([pes_con_pcd_id])
REFERENCES [colare].[pes_con_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_con_detpcd] CHECK CONSTRAINT [FK6jcag5b902wgif9yo8c8mwo0d]
GO
ALTER TABLE [colare].[pes_con_extratp]  WITH CHECK ADD  CONSTRAINT [FK2033lousufc6fkm3gajg7c825] FOREIGN KEY([id])
REFERENCES [colare].[detalhamento_publicidade_extrato_edital] ([uuid])
GO
ALTER TABLE [colare].[pes_con_extratp] CHECK CONSTRAINT [FK2033lousufc6fkm3gajg7c825]
GO
ALTER TABLE [colare].[pes_con_extratp]  WITH CHECK ADD  CONSTRAINT [FK3kdsu5kudvr2okdq33ipyghbx] FOREIGN KEY([pes_con_psp_id])
REFERENCES [colare].[pes_con_psp] ([uuid])
GO
ALTER TABLE [colare].[pes_con_extratp] CHECK CONSTRAINT [FK3kdsu5kudvr2okdq33ipyghbx]
GO
ALTER TABLE [colare].[pes_con_impug2]  WITH CHECK ADD  CONSTRAINT [FKp05i7xvsf6imbdsxhud9b6q2u] FOREIGN KEY([pes_con_impug_id])
REFERENCES [colare].[pes_con_impug] ([uuid])
GO
ALTER TABLE [colare].[pes_con_impug2] CHECK CONSTRAINT [FKp05i7xvsf6imbdsxhud9b6q2u]
GO
ALTER TABLE [colare].[pes_con_impug3]  WITH CHECK ADD  CONSTRAINT [FKnreqadwsg669cb2a8mjmk1pax] FOREIGN KEY([pes_con_impug_id])
REFERENCES [colare].[pes_con_impug] ([uuid])
GO
ALTER TABLE [colare].[pes_con_impug3] CHECK CONSTRAINT [FKnreqadwsg669cb2a8mjmk1pax]
GO
ALTER TABLE [colare].[pes_con_impug4]  WITH CHECK ADD  CONSTRAINT [FKt8whbcbe0wog5se11wqym0uhi] FOREIGN KEY([pes_con_impug_id])
REFERENCES [colare].[pes_con_impug] ([uuid])
GO
ALTER TABLE [colare].[pes_con_impug4] CHECK CONSTRAINT [FKt8whbcbe0wog5se11wqym0uhi]
GO
ALTER TABLE [colare].[pes_con_impug5]  WITH CHECK ADD  CONSTRAINT [FKdcpgpra69cn46is9j7f7kaoo0] FOREIGN KEY([pes_con_impug_id])
REFERENCES [colare].[pes_con_impug] ([uuid])
GO
ALTER TABLE [colare].[pes_con_impug5] CHECK CONSTRAINT [FKdcpgpra69cn46is9j7f7kaoo0]
GO
ALTER TABLE [colare].[pes_con_insc2]  WITH CHECK ADD  CONSTRAINT [FK4gcchxr0xjykdpff9kie8yn1v] FOREIGN KEY([pes_con_inscr_id])
REFERENCES [colare].[pes_con_inscr] ([uuid])
GO
ALTER TABLE [colare].[pes_con_insc2] CHECK CONSTRAINT [FK4gcchxr0xjykdpff9kie8yn1v]
GO
ALTER TABLE [colare].[pes_con_insc3]  WITH CHECK ADD  CONSTRAINT [FK3b0mhyahej6bhoar9vegf1v3b] FOREIGN KEY([pes_con_inscr_id])
REFERENCES [colare].[pes_con_inscr] ([uuid])
GO
ALTER TABLE [colare].[pes_con_insc3] CHECK CONSTRAINT [FK3b0mhyahej6bhoar9vegf1v3b]
GO
ALTER TABLE [colare].[pes_con_insc4]  WITH CHECK ADD  CONSTRAINT [FKogxkwhgifdxe1xe96kif3ssi2] FOREIGN KEY([pes_con_inscr_id])
REFERENCES [colare].[pes_con_inscr] ([uuid])
GO
ALTER TABLE [colare].[pes_con_insc4] CHECK CONSTRAINT [FKogxkwhgifdxe1xe96kif3ssi2]
GO
ALTER TABLE [colare].[pes_con_menbros]  WITH CHECK ADD  CONSTRAINT [FKllod5frkj8283bddoh2yqx49s] FOREIGN KEY([pes_con_comissa_id])
REFERENCES [colare].[pes_con_comissa] ([uuid])
GO
ALTER TABLE [colare].[pes_con_menbros] CHECK CONSTRAINT [FKllod5frkj8283bddoh2yqx49s]
GO
ALTER TABLE [colare].[pes_con_provas]  WITH CHECK ADD  CONSTRAINT [FK56fdhc93fc7vkp5v9gr9rkxo3] FOREIGN KEY([pes_con_cargpro_id])
REFERENCES [colare].[pes_con_cargpro] ([uuid])
GO
ALTER TABLE [colare].[pes_con_provas] CHECK CONSTRAINT [FK56fdhc93fc7vkp5v9gr9rkxo3]
GO
ALTER TABLE [colare].[pes_con_provas]  WITH CHECK ADD  CONSTRAINT [FK78dfcun5iv3xlavvcdrpa3xex] FOREIGN KEY([id])
REFERENCES [colare].[detalhamento_prova] ([uuid])
GO
ALTER TABLE [colare].[pes_con_provas] CHECK CONSTRAINT [FK78dfcun5iv3xlavvcdrpa3xex]
GO
ALTER TABLE [colare].[pes_con_provas]  WITH CHECK ADD  CONSTRAINT [FKb20s2xebrojwqq889328aorxn] FOREIGN KEY([pes_con_carprov_id])
REFERENCES [colare].[pes_con_carprov] ([uuid])
GO
ALTER TABLE [colare].[pes_con_provas] CHECK CONSTRAINT [FKb20s2xebrojwqq889328aorxn]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FK1r4sp63j64ut3fvgu5mgdrpat] FOREIGN KEY([pes_con_certrsf_id])
REFERENCES [colare].[pes_con_certrsf] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FK1r4sp63j64ut3fvgu5mgdrpat]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FK5hjpxm1chivcodhk9bxri1f4g] FOREIGN KEY([pes_con_comissa_id])
REFERENCES [colare].[pes_con_comissa] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FK5hjpxm1chivcodhk9bxri1f4g]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FK5lp3di61ajoit2dadvgpno8qp] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FK5lp3di61ajoit2dadvgpno8qp]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FK8b4wmyw0njph5v159fspenbng] FOREIGN KEY([pes_con_prdinsc_id])
REFERENCES [colare].[pes_con_prdinsc] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FK8b4wmyw0njph5v159fspenbng]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKf37tj2ve4i6ojp8c2hlphnscx] FOREIGN KEY([pes_con_desempa_id])
REFERENCES [colare].[pes_con_desempa] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKf37tj2ve4i6ojp8c2hlphnscx]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKh12tkxtsyty6ermril6ylxuw6] FOREIGN KEY([pes_con_pcd_id])
REFERENCES [colare].[pes_con_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKh12tkxtsyty6ermril6ylxuw6]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKjcak3s1b2dd0gvy72nlpg7bgy] FOREIGN KEY([pes_con_cadres_id])
REFERENCES [colare].[pes_con_cadres] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKjcak3s1b2dd0gvy72nlpg7bgy]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKjf7opc3um5i6nsf4d7jl6amco] FOREIGN KEY([pes_con_aut_ldo_id])
REFERENCES [colare].[pes_con_aut_ldo] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKjf7opc3um5i6nsf4d7jl6amco]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKjxjtnvy4h3ogdq6gphg4h6564] FOREIGN KEY([pes_con_inscr_id])
REFERENCES [colare].[pes_con_inscr] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKjxjtnvy4h3ogdq6gphg4h6564]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKk5s7pduiywx137yhaymbjhea0] FOREIGN KEY([pes_con_solcon_id])
REFERENCES [colare].[pes_con_solcon] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKk5s7pduiywx137yhaymbjhea0]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKl6jr1r4vqyvqjubt10qy8ky1m] FOREIGN KEY([pes_con_impug_id])
REFERENCES [colare].[pes_con_impug] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKl6jr1r4vqyvqjubt10qy8ky1m]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKsw1jgobnwstp5b48gb314luis] FOREIGN KEY([pes_con_validad_id])
REFERENCES [colare].[pes_con_validad] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKsw1jgobnwstp5b48gb314luis]
GO
ALTER TABLE [colare].[pes_con_psp]  WITH CHECK ADD  CONSTRAINT [FKtnt0tq1lprqlh37xmosk5j7cn] FOREIGN KEY([pes_con_banca_id])
REFERENCES [colare].[pes_con_banca] ([uuid])
GO
ALTER TABLE [colare].[pes_con_psp] CHECK CONSTRAINT [FKtnt0tq1lprqlh37xmosk5j7cn]
GO
ALTER TABLE [colare].[pes_con_txt]  WITH CHECK ADD  CONSTRAINT [FKj54kjm7jdb6wfmwa9k61yha7f] FOREIGN KEY([codigo])
REFERENCES [colare].[texto_edital] ([uuid])
GO
ALTER TABLE [colare].[pes_con_txt] CHECK CONSTRAINT [FKj54kjm7jdb6wfmwa9k61yha7f]
GO
ALTER TABLE [colare].[pes_con_txt]  WITH CHECK ADD  CONSTRAINT [FKqik0pcu0knmhofookkrsegsiq] FOREIGN KEY([pes_con_psp_id])
REFERENCES [colare].[pes_con_psp] ([uuid])
GO
ALTER TABLE [colare].[pes_con_txt] CHECK CONSTRAINT [FKqik0pcu0knmhofookkrsegsiq]
GO
ALTER TABLE [colare].[pes_con_vagapcd]  WITH CHECK ADD  CONSTRAINT [FK7l4vsbt734hahify9cv5mvpyn] FOREIGN KEY([pes_con_pcd_id])
REFERENCES [colare].[pes_con_pcd] ([uuid])
GO
ALTER TABLE [colare].[pes_con_vagapcd] CHECK CONSTRAINT [FK7l4vsbt734hahify9cv5mvpyn]
GO
ALTER TABLE [colare].[pes_concessao]  WITH CHECK ADD  CONSTRAINT [FK51np5qerv2ceb1fqlgw6ri8e] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_concessao] CHECK CONSTRAINT [FK51np5qerv2ceb1fqlgw6ri8e]
GO
ALTER TABLE [colare].[pes_concessao]  WITH CHECK ADD  CONSTRAINT [FKg6wxvkc4y254epqpt3kue7uvc] FOREIGN KEY([pes_concessaodt_id])
REFERENCES [colare].[pes_concessaodt] ([uuid])
GO
ALTER TABLE [colare].[pes_concessao] CHECK CONSTRAINT [FKg6wxvkc4y254epqpt3kue7uvc]
GO
ALTER TABLE [colare].[pes_concessaodt]  WITH CHECK ADD  CONSTRAINT [FK15c3f9g07vk9ft22uohapf3ge] FOREIGN KEY([pes_concs_verba])
REFERENCES [colare].[pes_concs_verba] ([uuid])
GO
ALTER TABLE [colare].[pes_concessaodt] CHECK CONSTRAINT [FK15c3f9g07vk9ft22uohapf3ge]
GO
ALTER TABLE [colare].[pes_concessaodt]  WITH CHECK ADD  CONSTRAINT [FKnsedb0l0y7bf8vrmnlmvw55p5] FOREIGN KEY([pes_pos_vnct_cr_id])
REFERENCES [colare].[pes_pos_vnct_cr] ([uuid])
GO
ALTER TABLE [colare].[pes_concessaodt] CHECK CONSTRAINT [FKnsedb0l0y7bf8vrmnlmvw55p5]
GO
ALTER TABLE [colare].[pes_conmenorpon]  WITH CHECK ADD  CONSTRAINT [FKekh8w7hvfhkmj5jpho4tftc4s] FOREIGN KEY([pes_con_carprov_id])
REFERENCES [colare].[pes_con_carprov] ([uuid])
GO
ALTER TABLE [colare].[pes_conmenorpon] CHECK CONSTRAINT [FKekh8w7hvfhkmj5jpho4tftc4s]
GO
ALTER TABLE [colare].[pes_dados_prev]  WITH CHECK ADD  CONSTRAINT [FK43c7xg2j54lothcru9j7496my] FOREIGN KEY([pes_dadosrpps_id])
REFERENCES [colare].[pes_dadosrpps] ([uuid])
GO
ALTER TABLE [colare].[pes_dados_prev] CHECK CONSTRAINT [FK43c7xg2j54lothcru9j7496my]
GO
ALTER TABLE [colare].[pes_dados_prev]  WITH CHECK ADD  CONSTRAINT [FKjs1o4e4p2vr8yeu8ckx7rgwy] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_dados_prev] CHECK CONSTRAINT [FKjs1o4e4p2vr8yeu8ckx7rgwy]
GO
ALTER TABLE [colare].[pes_dadosrgps]  WITH CHECK ADD  CONSTRAINT [FKkpo66osy28494lxa4g8npw401] FOREIGN KEY([pes_dados_prev_id])
REFERENCES [colare].[pes_dados_prev] ([uuid])
GO
ALTER TABLE [colare].[pes_dadosrgps] CHECK CONSTRAINT [FKkpo66osy28494lxa4g8npw401]
GO
ALTER TABLE [colare].[pes_folhapag]  WITH CHECK ADD  CONSTRAINT [FKh5n00p9bvmt625mr1ixce644p] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_folhapag] CHECK CONSTRAINT [FKh5n00p9bvmt625mr1ixce644p]
GO
ALTER TABLE [colare].[pes_folhapag_fp]  WITH CHECK ADD  CONSTRAINT [FKgikxy5k1yga9xif97qd11jftf] FOREIGN KEY([pes_folhapag_id])
REFERENCES [colare].[pes_folhapag] ([uuid])
GO
ALTER TABLE [colare].[pes_folhapag_fp] CHECK CONSTRAINT [FKgikxy5k1yga9xif97qd11jftf]
GO
ALTER TABLE [colare].[pes_folpag_serv]  WITH CHECK ADD  CONSTRAINT [FKi979afnwvivdcxxwndxmw7v47] FOREIGN KEY([pes_folhapag_fp_id])
REFERENCES [colare].[pes_folhapag_fp] ([uuid])
GO
ALTER TABLE [colare].[pes_folpag_serv] CHECK CONSTRAINT [FKi979afnwvivdcxxwndxmw7v47]
GO
ALTER TABLE [colare].[pes_fp_descirrf]  WITH CHECK ADD  CONSTRAINT [FK51n5ckdlaosmss8ik2m0pr50o] FOREIGN KEY([pes_folpag_serv_id])
REFERENCES [colare].[pes_folpag_serv] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_descirrf] CHECK CONSTRAINT [FK51n5ckdlaosmss8ik2m0pr50o]
GO
ALTER TABLE [colare].[pes_fp_descprev]  WITH CHECK ADD  CONSTRAINT [FKdb5ecx552hin2kwox4pi32yp7] FOREIGN KEY([pes_folpag_serv_id])
REFERENCES [colare].[pes_folpag_serv] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_descprev] CHECK CONSTRAINT [FKdb5ecx552hin2kwox4pi32yp7]
GO
ALTER TABLE [colare].[pes_fp_exc_banc]  WITH CHECK ADD  CONSTRAINT [FK4kg557rq9yb3e0x6yt2kym68k] FOREIGN KEY([pes_fp_exc_orcm_id])
REFERENCES [colare].[pes_fp_exc_orcm] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_banc] CHECK CONSTRAINT [FK4kg557rq9yb3e0x6yt2kym68k]
GO
ALTER TABLE [colare].[pes_fp_exc_emp]  WITH CHECK ADD  CONSTRAINT [FK4aydqy7et0vhpea0ctse6k306] FOREIGN KEY([pes_fp_exc_orcm_id])
REFERENCES [colare].[pes_fp_exc_orcm] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_emp] CHECK CONSTRAINT [FK4aydqy7et0vhpea0ctse6k306]
GO
ALTER TABLE [colare].[pes_fp_exc_liq]  WITH CHECK ADD  CONSTRAINT [FKcabwmdqeur2xgx4bxsi1f3aqx] FOREIGN KEY([pes_fp_exc_emp_id])
REFERENCES [colare].[pes_fp_exc_emp] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_liq] CHECK CONSTRAINT [FKcabwmdqeur2xgx4bxsi1f3aqx]
GO
ALTER TABLE [colare].[pes_fp_exc_orcm]  WITH CHECK ADD  CONSTRAINT [FKbv1636y252pi5mxd2bjcy2lbi] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_orcm] CHECK CONSTRAINT [FKbv1636y252pi5mxd2bjcy2lbi]
GO
ALTER TABLE [colare].[pes_fp_exc_retn]  WITH CHECK ADD  CONSTRAINT [FK18667ur20lwknoli6k1lr3du] FOREIGN KEY([pes_fp_exc_banc_id])
REFERENCES [colare].[pes_fp_exc_banc] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_retn] CHECK CONSTRAINT [FK18667ur20lwknoli6k1lr3du]
GO
ALTER TABLE [colare].[pes_fp_exc_rms]  WITH CHECK ADD  CONSTRAINT [FKdqvwwbhdy0emorkykwjcfr2b4] FOREIGN KEY([pes_fp_exc_banc_id])
REFERENCES [colare].[pes_fp_exc_banc] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exc_rms] CHECK CONSTRAINT [FKdqvwwbhdy0emorkykwjcfr2b4]
GO
ALTER TABLE [colare].[pes_fp_exec_op]  WITH CHECK ADD  CONSTRAINT [FKce00h6ipiksyn41xpbr1h70ct] FOREIGN KEY([pes_fp_exc_emp_id])
REFERENCES [colare].[pes_fp_exc_emp] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_exec_op] CHECK CONSTRAINT [FKce00h6ipiksyn41xpbr1h70ct]
GO
ALTER TABLE [colare].[pes_fp_remdes]  WITH CHECK ADD  CONSTRAINT [FK4f5jlvpwt72bsc53jbjvxqxjq] FOREIGN KEY([pes_folpag_serv_id])
REFERENCES [colare].[pes_folpag_serv] ([uuid])
GO
ALTER TABLE [colare].[pes_fp_remdes] CHECK CONSTRAINT [FK4f5jlvpwt72bsc53jbjvxqxjq]
GO
ALTER TABLE [colare].[pes_homl_cargo]  WITH CHECK ADD  CONSTRAINT [FKsw1osslxuq6ub2uaty3icf7lk] FOREIGN KEY([pes_homolog_id])
REFERENCES [colare].[pes_homolog] ([uuid])
GO
ALTER TABLE [colare].[pes_homl_cargo] CHECK CONSTRAINT [FKsw1osslxuq6ub2uaty3icf7lk]
GO
ALTER TABLE [colare].[pes_homl_lstapr]  WITH CHECK ADD  CONSTRAINT [FK_CARGO_APROV_ID] FOREIGN KEY([pes_homl_cargo])
REFERENCES [colare].[pes_homl_cargo] ([uuid])
GO
ALTER TABLE [colare].[pes_homl_lstapr] CHECK CONSTRAINT [FK_CARGO_APROV_ID]
GO
ALTER TABLE [colare].[pes_homolog]  WITH CHECK ADD  CONSTRAINT [FK87mgfts3tcykd8xjwhyebjgf] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_homolog] CHECK CONSTRAINT [FK87mgfts3tcykd8xjwhyebjgf]
GO
ALTER TABLE [colare].[pes_homolog_pub]  WITH CHECK ADD  CONSTRAINT [FK9us5t0qdfyt9ai9kugb76b5si] FOREIGN KEY([pes_homolog_id])
REFERENCES [colare].[pes_homolog] ([uuid])
GO
ALTER TABLE [colare].[pes_homolog_pub] CHECK CONSTRAINT [FK9us5t0qdfyt9ai9kugb76b5si]
GO
ALTER TABLE [colare].[pes_homolog_pub]  WITH CHECK ADD  CONSTRAINT [FKe5nbdhxje80rmbjcuq4v7pito] FOREIGN KEY([uuid])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pes_homolog_pub] CHECK CONSTRAINT [FKe5nbdhxje80rmbjcuq4v7pito]
GO
ALTER TABLE [colare].[pes_legislacao]  WITH CHECK ADD  CONSTRAINT [FK3r2qypy5e5chit89at6hndi2n] FOREIGN KEY([pes_reg_outroid_id])
REFERENCES [colare].[pes_reg_outroid] ([uuid])
GO
ALTER TABLE [colare].[pes_legislacao] CHECK CONSTRAINT [FK3r2qypy5e5chit89at6hndi2n]
GO
ALTER TABLE [colare].[pes_legislacao]  WITH CHECK ADD  CONSTRAINT [FK63ketv2sue09hh57xt8awgq6n] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_legislacao] CHECK CONSTRAINT [FK63ketv2sue09hh57xt8awgq6n]
GO
ALTER TABLE [colare].[pes_legislacao]  WITH CHECK ADD  CONSTRAINT [FKakbv9qguiceyty4pf5v5daf0q] FOREIGN KEY([pes_ug_aplicnor_id])
REFERENCES [colare].[pes_ug_aplicnor] ([uuid])
GO
ALTER TABLE [colare].[pes_legislacao] CHECK CONSTRAINT [FKakbv9qguiceyty4pf5v5daf0q]
GO
ALTER TABLE [colare].[pes_nor_reg]  WITH CHECK ADD  CONSTRAINT [FKr4cq8b3vxa78r1nk3qtslgm1v] FOREIGN KEY([pes_reg_outroid_id])
REFERENCES [colare].[pes_reg_outroid] ([uuid])
GO
ALTER TABLE [colare].[pes_nor_reg] CHECK CONSTRAINT [FKr4cq8b3vxa78r1nk3qtslgm1v]
GO
ALTER TABLE [colare].[pes_pens_depent]  WITH CHECK ADD  CONSTRAINT [FK2a9h2gjtd4d9ua3ynfwn2ar1u] FOREIGN KEY([pes_pens_p_rpps_id])
REFERENCES [colare].[pes_pens_p_rpps] ([uuid])
GO
ALTER TABLE [colare].[pes_pens_depent] CHECK CONSTRAINT [FK2a9h2gjtd4d9ua3ynfwn2ar1u]
GO
ALTER TABLE [colare].[pes_pens_doccom]  WITH CHECK ADD  CONSTRAINT [FK96xy30or45g9kr6lgca2k1alq] FOREIGN KEY([pes_pens_depent_id])
REFERENCES [colare].[pes_pens_depent] ([uuid])
GO
ALTER TABLE [colare].[pes_pens_doccom] CHECK CONSTRAINT [FK96xy30or45g9kr6lgca2k1alq]
GO
ALTER TABLE [colare].[pes_pens_p_rpps]  WITH CHECK ADD  CONSTRAINT [FKfgm7el8phb5c1692ursfbi433] FOREIGN KEY([pes_pens_req_id])
REFERENCES [colare].[pes_pens_req] ([uuid])
GO
ALTER TABLE [colare].[pes_pens_p_rpps] CHECK CONSTRAINT [FKfgm7el8phb5c1692ursfbi433]
GO
ALTER TABLE [colare].[pes_pens_respat]  WITH CHECK ADD  CONSTRAINT [FK455vmhq60c25wdns4lf71frnq] FOREIGN KEY([pes_pens_req_id])
REFERENCES [colare].[pes_pens_req] ([uuid])
GO
ALTER TABLE [colare].[pes_pens_respat] CHECK CONSTRAINT [FK455vmhq60c25wdns4lf71frnq]
GO
ALTER TABLE [colare].[pes_pens_ultrem]  WITH CHECK ADD  CONSTRAINT [FKqtl8i1cs9ddp5fmvv7fa7i8ug] FOREIGN KEY([pes_pens_fin_id])
REFERENCES [colare].[pes_pens_fin] ([uuid])
GO
ALTER TABLE [colare].[pes_pens_ultrem] CHECK CONSTRAINT [FKqtl8i1cs9ddp5fmvv7fa7i8ug]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FK1urtb3om69ak89e8b4uaprn39] FOREIGN KEY([pes_pens_p_jud_id])
REFERENCES [colare].[pes_pens_p_jud] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FK1urtb3om69ak89e8b4uaprn39]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FK3hjlcpyd6piy28xuihut8q28t] FOREIGN KEY([pes_pens_fin_id])
REFERENCES [colare].[pes_pens_fin] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FK3hjlcpyd6piy28xuihut8q28t]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FKhofsosfc8gjrwxke867lj4ja7] FOREIGN KEY([pes_pens_merce_id])
REFERENCES [colare].[pes_pens_merce] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FKhofsosfc8gjrwxke867lj4ja7]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FKhrvfvbfa30jy5o19w915d2nh5] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FKhrvfvbfa30jy5o19w915d2nh5]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FKq3jdw8cqi7u2tfc8nk5ko7pg4] FOREIGN KEY([pes_pens_dados_id])
REFERENCES [colare].[pes_pens_dados] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FKq3jdw8cqi7u2tfc8nk5ko7pg4]
GO
ALTER TABLE [colare].[pes_pensionist]  WITH CHECK ADD  CONSTRAINT [FKr3i2odcp3pdr3390ld5c0j9m6] FOREIGN KEY([pes_pens_p_rpps_id])
REFERENCES [colare].[pes_pens_p_rpps] ([uuid])
GO
ALTER TABLE [colare].[pes_pensionist] CHECK CONSTRAINT [FKr3i2odcp3pdr3390ld5c0j9m6]
GO
ALTER TABLE [colare].[pes_procselsimp]  WITH CHECK ADD  CONSTRAINT [FK13dtbeij12jbgkmv7jcblow57] FOREIGN KEY([pes_pss_duracao_id])
REFERENCES [colare].[pes_pss_duracao] ([uuid])
GO
ALTER TABLE [colare].[pes_procselsimp] CHECK CONSTRAINT [FK13dtbeij12jbgkmv7jcblow57]
GO
ALTER TABLE [colare].[pes_procselsimp]  WITH CHECK ADD  CONSTRAINT [FK2dyk54fqkk7r9riiqkmieq67e] FOREIGN KEY([pes_pss_prd_ins])
REFERENCES [colare].[pes_pss_prd_ins] ([uuid])
GO
ALTER TABLE [colare].[pes_procselsimp] CHECK CONSTRAINT [FK2dyk54fqkk7r9riiqkmieq67e]
GO
ALTER TABLE [colare].[pes_procselsimp]  WITH CHECK ADD  CONSTRAINT [FK9i1810nqclc1k55fv3v50d4yx] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_procselsimp] CHECK CONSTRAINT [FK9i1810nqclc1k55fv3v50d4yx]
GO
ALTER TABLE [colare].[pes_procselsimp]  WITH CHECK ADD  CONSTRAINT [FKh8mg8147t9o56bopk381lmhso] FOREIGN KEY([pes_pss_banca])
REFERENCES [colare].[pes_pss_banca] ([uuid])
GO
ALTER TABLE [colare].[pes_procselsimp] CHECK CONSTRAINT [FKh8mg8147t9o56bopk381lmhso]
GO
ALTER TABLE [colare].[pes_procselsimp]  WITH CHECK ADD  CONSTRAINT [FKr6bl8olg9ogumy2e3nqx6sl0n] FOREIGN KEY([pes_pss_valid_id])
REFERENCES [colare].[pes_pss_valid] ([uuid])
GO
ALTER TABLE [colare].[pes_procselsimp] CHECK CONSTRAINT [FKr6bl8olg9ogumy2e3nqx6sl0n]
GO
ALTER TABLE [colare].[pes_pss_excep]  WITH CHECK ADD  CONSTRAINT [FK3yyqha4c44oy2b2fer6vur5pg] FOREIGN KEY([pes_procselsimp_id])
REFERENCES [colare].[pes_procselsimp] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_excep] CHECK CONSTRAINT [FK3yyqha4c44oy2b2fer6vur5pg]
GO
ALTER TABLE [colare].[pes_pss_funcao]  WITH CHECK ADD  CONSTRAINT [FKdwuibv2qduptemaviyhvgorbs] FOREIGN KEY([pes_procselsimp_id])
REFERENCES [colare].[pes_procselsimp] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_funcao] CHECK CONSTRAINT [FKdwuibv2qduptemaviyhvgorbs]
GO
ALTER TABLE [colare].[pes_pss_funprov]  WITH CHECK ADD  CONSTRAINT [FKd6awnmy4slepija4wxr81ky10] FOREIGN KEY([pes_pss_funcao_id])
REFERENCES [colare].[pes_pss_funcao] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_funprov] CHECK CONSTRAINT [FKd6awnmy4slepija4wxr81ky10]
GO
ALTER TABLE [colare].[pes_pss_public]  WITH CHECK ADD  CONSTRAINT [FKff2m09p6lvu8n3h115ugb7qv] FOREIGN KEY([pes_procselsimp_id])
REFERENCES [colare].[pes_procselsimp] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_public] CHECK CONSTRAINT [FKff2m09p6lvu8n3h115ugb7qv]
GO
ALTER TABLE [colare].[pes_pss_public]  WITH CHECK ADD  CONSTRAINT [FKq4uymq14d7krw206fdngilp21] FOREIGN KEY([id])
REFERENCES [colare].[detalhamento_publicidade_extrato_edital] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_public] CHECK CONSTRAINT [FKq4uymq14d7krw206fdngilp21]
GO
ALTER TABLE [colare].[pes_pss_txtedit]  WITH CHECK ADD  CONSTRAINT [FKpgmw4bta8es13f93ro215fcg6] FOREIGN KEY([pes_procselsimp_id])
REFERENCES [colare].[pes_procselsimp] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_txtedit] CHECK CONSTRAINT [FKpgmw4bta8es13f93ro215fcg6]
GO
ALTER TABLE [colare].[pes_pss_txtedit]  WITH CHECK ADD  CONSTRAINT [FKqxn76ucdhgvme6q28ybr7tfnj] FOREIGN KEY([codigo])
REFERENCES [colare].[texto_edital] ([uuid])
GO
ALTER TABLE [colare].[pes_pss_txtedit] CHECK CONSTRAINT [FKqxn76ucdhgvme6q28ybr7tfnj]
GO
ALTER TABLE [colare].[pes_text_norma]  WITH CHECK ADD  CONSTRAINT [FKdh1xmgufsux4j2ksi0r5a2bvb] FOREIGN KEY([pes_legislacao_id])
REFERENCES [colare].[pes_legislacao] ([uuid])
GO
ALTER TABLE [colare].[pes_text_norma] CHECK CONSTRAINT [FKdh1xmgufsux4j2ksi0r5a2bvb]
GO
ALTER TABLE [colare].[pes_ug_aplicave]  WITH CHECK ADD  CONSTRAINT [FKeb6kiyhgkgtgsf7ic3ny3ovxy] FOREIGN KEY([pes_ug_aplicnor_id])
REFERENCES [colare].[pes_ug_aplicnor] ([uuid])
GO
ALTER TABLE [colare].[pes_ug_aplicave] CHECK CONSTRAINT [FKeb6kiyhgkgtgsf7ic3ny3ovxy]
GO
ALTER TABLE [colare].[pes_ver_formca2]  WITH CHECK ADD  CONSTRAINT [FKfghprnfcuhthckbl9iqtb9w0u] FOREIGN KEY([pes_ver_formcal_id])
REFERENCES [colare].[pes_ver_formcal] ([uuid])
GO
ALTER TABLE [colare].[pes_ver_formca2] CHECK CONSTRAINT [FKfghprnfcuhthckbl9iqtb9w0u]
GO
ALTER TABLE [colare].[pes_verb_detvic]  WITH CHECK ADD  CONSTRAINT [FK7g4617uar3p24mxy781cfpawh] FOREIGN KEY([pes_ver_vces_id])
REFERENCES [colare].[pes_ver_vces] ([uuid])
GO
ALTER TABLE [colare].[pes_verb_detvic] CHECK CONSTRAINT [FK7g4617uar3p24mxy781cfpawh]
GO
ALTER TABLE [colare].[pes_verbas]  WITH CHECK ADD  CONSTRAINT [FK9rc5kjtv9gt4cgusuch1e16xf] FOREIGN KEY([pes_ver_vces_id])
REFERENCES [colare].[pes_ver_vces] ([uuid])
GO
ALTER TABLE [colare].[pes_verbas] CHECK CONSTRAINT [FK9rc5kjtv9gt4cgusuch1e16xf]
GO
ALTER TABLE [colare].[pes_verbas]  WITH CHECK ADD  CONSTRAINT [FKjddf21961ieoiugj8bab5hwq3] FOREIGN KEY([pes_ver_formcal_id])
REFERENCES [colare].[pes_ver_formcal] ([uuid])
GO
ALTER TABLE [colare].[pes_verbas] CHECK CONSTRAINT [FKjddf21961ieoiugj8bab5hwq3]
GO
ALTER TABLE [colare].[pes_verbas]  WITH CHECK ADD  CONSTRAINT [FKki7772674y5gydxjj2kqjbtie] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_verbas] CHECK CONSTRAINT [FKki7772674y5gydxjj2kqjbtie]
GO
ALTER TABLE [colare].[pes_verbas]  WITH CHECK ADD  CONSTRAINT [FKkkrfnng49i5ldqifn8onexdu3] FOREIGN KEY([pes_ver_nd_id])
REFERENCES [colare].[pes_ver_nd] ([uuid])
GO
ALTER TABLE [colare].[pes_verbas] CHECK CONSTRAINT [FKkkrfnng49i5ldqifn8onexdu3]
GO
ALTER TABLE [colare].[pes_vf_desl_int]  WITH CHECK ADD  CONSTRAINT [FKj5ax7vm4njh10sg2bkboss31x] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_desl_int] CHECK CONSTRAINT [FKj5ax7vm4njh10sg2bkboss31x]
GO
ALTER TABLE [colare].[pes_vf_disp]  WITH CHECK ADD  CONSTRAINT [FKh822jmofiiuhov8x63wdim3bh] FOREIGN KEY([pes_vf_disp_dst])
REFERENCES [colare].[pes_vf_disp_dst] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_disp] CHECK CONSTRAINT [FKh822jmofiiuhov8x63wdim3bh]
GO
ALTER TABLE [colare].[pes_vf_disp]  WITH CHECK ADD  CONSTRAINT [FKo3mny7dpwovobwuf4e1tda6tw] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_disp] CHECK CONSTRAINT [FKo3mny7dpwovobwuf4e1tda6tw]
GO
ALTER TABLE [colare].[pes_vf_licenca]  WITH CHECK ADD  CONSTRAINT [FKawgyshjvo9qrm4ovc7u1ynu08] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_licenca] CHECK CONSTRAINT [FKawgyshjvo9qrm4ovc7u1ynu08]
GO
ALTER TABLE [colare].[pes_vf_lotacao]  WITH CHECK ADD  CONSTRAINT [FK1vg9c7oqo8ydl3q4u85axbiqk] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_lotacao] CHECK CONSTRAINT [FK1vg9c7oqo8ydl3q4u85axbiqk]
GO
ALTER TABLE [colare].[pes_vf_lotacao]  WITH CHECK ADD  CONSTRAINT [FKfg9s6ll9jfl0nm18xem5ctf91] FOREIGN KEY([pes_lotacao_det_id])
REFERENCES [colare].[pes_lotacao_det] ([uuid])
GO
ALTER TABLE [colare].[pes_vf_lotacao] CHECK CONSTRAINT [FKfg9s6ll9jfl0nm18xem5ctf91]
GO
ALTER TABLE [colare].[preco_contrat]  WITH CHECK ADD  CONSTRAINT [FK7f2tgy8jspv74uqfynowi7a8a] FOREIGN KEY([contratado_ini_id])
REFERENCES [colare].[contratado_ini] ([uuid])
GO
ALTER TABLE [colare].[preco_contrat] CHECK CONSTRAINT [FK7f2tgy8jspv74uqfynowi7a8a]
GO
ALTER TABLE [colare].[preco_contrat]  WITH CHECK ADD  CONSTRAINT [FKqd7ytf0yqhd33shleax8yn68v] FOREIGN KEY([uuid])
REFERENCES [colare].[preco_contratado] ([uuid])
GO
ALTER TABLE [colare].[preco_contrat] CHECK CONSTRAINT [FKqd7ytf0yqhd33shleax8yn68v]
GO
ALTER TABLE [colare].[preco_contratado_dispensa]  WITH CHECK ADD  CONSTRAINT [FK2lj9u3e9mprmj7xpvy48ufbrs] FOREIGN KEY([id])
REFERENCES [colare].[preco_contratado] ([uuid])
GO
ALTER TABLE [colare].[preco_contratado_dispensa] CHECK CONSTRAINT [FK2lj9u3e9mprmj7xpvy48ufbrs]
GO
ALTER TABLE [colare].[preco_contratado_dispensa]  WITH CHECK ADD  CONSTRAINT [FKdq6t1bw1skiq3ugbtqldoro2f] FOREIGN KEY([fornecedor_id])
REFERENCES [colare].[fornecedor_contratado] ([uuid])
GO
ALTER TABLE [colare].[preco_contratado_dispensa] CHECK CONSTRAINT [FKdq6t1bw1skiq3ugbtqldoro2f]
GO
ALTER TABLE [colare].[preco_fase2]  WITH CHECK ADD  CONSTRAINT [FK2nt95ads2uxip8vdi9lowivvi] FOREIGN KEY([resultado_fase2_id])
REFERENCES [colare].[resultado_fase2] ([uuid])
GO
ALTER TABLE [colare].[preco_fase2] CHECK CONSTRAINT [FK2nt95ads2uxip8vdi9lowivvi]
GO
ALTER TABLE [colare].[propostas_fase2]  WITH CHECK ADD  CONSTRAINT [FKfbw46euj8hjeo6gerpnouw8b8] FOREIGN KEY([lic_fase2_id])
REFERENCES [colare].[lic_fase2] ([uuid])
GO
ALTER TABLE [colare].[propostas_fase2] CHECK CONSTRAINT [FKfbw46euj8hjeo6gerpnouw8b8]
GO
ALTER TABLE [colare].[pub_adesao]  WITH CHECK ADD  CONSTRAINT [FKbwptmfv5fyul5vk1m4jqct79k] FOREIGN KEY([uuid])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_adesao] CHECK CONSTRAINT [FKbwptmfv5fyul5vk1m4jqct79k]
GO
ALTER TABLE [colare].[pub_adesao]  WITH CHECK ADD  CONSTRAINT [FKjvpos81xsouo9w3t0l5pudyt6] FOREIGN KEY([adesao_reg_prec_id])
REFERENCES [colare].[adesao_reg_prec] ([uuid])
GO
ALTER TABLE [colare].[pub_adesao] CHECK CONSTRAINT [FKjvpos81xsouo9w3t0l5pudyt6]
GO
ALTER TABLE [colare].[pub_contrat_adt]  WITH CHECK ADD  CONSTRAINT [FK3mkqdy4qfh1p0bd7gsthj8onw] FOREIGN KEY([uuid])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_adt] CHECK CONSTRAINT [FK3mkqdy4qfh1p0bd7gsthj8onw]
GO
ALTER TABLE [colare].[pub_contrat_adt]  WITH CHECK ADD  CONSTRAINT [FKa4e1ifob9567lmwm595hunq8m] FOREIGN KEY([contrato_adt_id])
REFERENCES [colare].[contrato_adt] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_adt] CHECK CONSTRAINT [FKa4e1ifob9567lmwm595hunq8m]
GO
ALTER TABLE [colare].[pub_contrat_ini]  WITH CHECK ADD  CONSTRAINT [FKd6eosgs5ae4153afo27u8ep8i] FOREIGN KEY([id])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_ini] CHECK CONSTRAINT [FKd6eosgs5ae4153afo27u8ep8i]
GO
ALTER TABLE [colare].[pub_contrat_ini]  WITH CHECK ADD  CONSTRAINT [FKngfkxoaobrfv0sbs54w0mkxgf] FOREIGN KEY([contrato_ini_id])
REFERENCES [colare].[contrato_ini] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_ini] CHECK CONSTRAINT [FKngfkxoaobrfv0sbs54w0mkxgf]
GO
ALTER TABLE [colare].[pub_contrat_res]  WITH CHECK ADD  CONSTRAINT [FK8df1im4pv78wjfcdb8ec9d9di] FOREIGN KEY([contrato_resc_id])
REFERENCES [colare].[contrato_resc] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_res] CHECK CONSTRAINT [FK8df1im4pv78wjfcdb8ec9d9di]
GO
ALTER TABLE [colare].[pub_contrat_res]  WITH CHECK ADD  CONSTRAINT [FKocnl2tqeesyibmjjo1r2goct3] FOREIGN KEY([id])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_contrat_res] CHECK CONSTRAINT [FKocnl2tqeesyibmjjo1r2goct3]
GO
ALTER TABLE [colare].[pub_dispensa]  WITH CHECK ADD  CONSTRAINT [FK74kcy09ghl0fn4eiddk1kkgma] FOREIGN KEY([id])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_dispensa] CHECK CONSTRAINT [FK74kcy09ghl0fn4eiddk1kkgma]
GO
ALTER TABLE [colare].[pub_dispensa]  WITH CHECK ADD  CONSTRAINT [FKg60o72d54ai6r25tv5ob5u856] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[pub_dispensa] CHECK CONSTRAINT [FKg60o72d54ai6r25tv5ob5u856]
GO
ALTER TABLE [colare].[pub_fase1]  WITH CHECK ADD  CONSTRAINT [FKaoqa7oxlig333h0i41wjwovw3] FOREIGN KEY([id])
REFERENCES [colare].[publicacao] ([uuid])
GO
ALTER TABLE [colare].[pub_fase1] CHECK CONSTRAINT [FKaoqa7oxlig333h0i41wjwovw3]
GO
ALTER TABLE [colare].[pub_fase1]  WITH CHECK ADD  CONSTRAINT [FKjrlq3n3puwoc264ra2c9afeyh] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[pub_fase1] CHECK CONSTRAINT [FKjrlq3n3puwoc264ra2c9afeyh]
GO
ALTER TABLE [colare].[quadro_societario_dispensa]  WITH CHECK ADD  CONSTRAINT [FK29gnvqbjvl7bclgfhgcif6hcu] FOREIGN KEY([id])
REFERENCES [colare].[quadro_societario] ([uuid])
GO
ALTER TABLE [colare].[quadro_societario_dispensa] CHECK CONSTRAINT [FK29gnvqbjvl7bclgfhgcif6hcu]
GO
ALTER TABLE [colare].[quadro_societario_dispensa]  WITH CHECK ADD  CONSTRAINT [FK3peia13n6stwgvdij04holm5n] FOREIGN KEY([fornecedor_id])
REFERENCES [colare].[fornecedor_contratado] ([uuid])
GO
ALTER TABLE [colare].[quadro_societario_dispensa] CHECK CONSTRAINT [FK3peia13n6stwgvdij04holm5n]
GO
ALTER TABLE [colare].[quadsoc_adt]  WITH CHECK ADD  CONSTRAINT [FKbati193wlxe13y03eulcwlxlf] FOREIGN KEY([contratado_adt_id])
REFERENCES [colare].[contratado_adt] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_adt] CHECK CONSTRAINT [FKbati193wlxe13y03eulcwlxlf]
GO
ALTER TABLE [colare].[quadsoc_adt]  WITH CHECK ADD  CONSTRAINT [FKt74hyav40dho05fpuub0us08d] FOREIGN KEY([uuid])
REFERENCES [colare].[quadro_societario] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_adt] CHECK CONSTRAINT [FKt74hyav40dho05fpuub0us08d]
GO
ALTER TABLE [colare].[quadsoc_fase2]  WITH CHECK ADD  CONSTRAINT [FKdvt0tfjics8d27dhnctd5xa6p] FOREIGN KEY([id])
REFERENCES [colare].[quadro_societario] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_fase2] CHECK CONSTRAINT [FKdvt0tfjics8d27dhnctd5xa6p]
GO
ALTER TABLE [colare].[quadsoc_fase2]  WITH CHECK ADD  CONSTRAINT [FKtdupa97i0vrgbdi77grlsdj0m] FOREIGN KEY([lic_fase2_id])
REFERENCES [colare].[lic_fase2] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_fase2] CHECK CONSTRAINT [FKtdupa97i0vrgbdi77grlsdj0m]
GO
ALTER TABLE [colare].[quadsoc_ini]  WITH CHECK ADD  CONSTRAINT [FK44xf7davaff4d6yct3kn1nbqk] FOREIGN KEY([uuid])
REFERENCES [colare].[quadro_societario] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_ini] CHECK CONSTRAINT [FK44xf7davaff4d6yct3kn1nbqk]
GO
ALTER TABLE [colare].[quadsoc_ini]  WITH CHECK ADD  CONSTRAINT [FKajabxjmb0sp627w704q507j5k] FOREIGN KEY([contratado_ini_id])
REFERENCES [colare].[contratado_ini] ([uuid])
GO
ALTER TABLE [colare].[quadsoc_ini] CHECK CONSTRAINT [FKajabxjmb0sp627w704q507j5k]
GO
ALTER TABLE [colare].[recorc_adesao]  WITH CHECK ADD  CONSTRAINT [FKhircb2a9tpkk9c2286sdjp4on] FOREIGN KEY([adesao_reg_prec_id])
REFERENCES [colare].[adesao_reg_prec] ([uuid])
GO
ALTER TABLE [colare].[recorc_adesao] CHECK CONSTRAINT [FKhircb2a9tpkk9c2286sdjp4on]
GO
ALTER TABLE [colare].[recorc_adesao]  WITH CHECK ADD  CONSTRAINT [FKsxglnmtmdn28rx3aty9b013m5] FOREIGN KEY([uuid])
REFERENCES [colare].[recurso_orcamentario] ([uuid])
GO
ALTER TABLE [colare].[recorc_adesao] CHECK CONSTRAINT [FKsxglnmtmdn28rx3aty9b013m5]
GO
ALTER TABLE [colare].[recorc_disp]  WITH CHECK ADD  CONSTRAINT [FK5qpq5yoptg38meqel7pbdb994] FOREIGN KEY([id])
REFERENCES [colare].[recurso_orcamentario] ([uuid])
GO
ALTER TABLE [colare].[recorc_disp] CHECK CONSTRAINT [FK5qpq5yoptg38meqel7pbdb994]
GO
ALTER TABLE [colare].[recorc_disp]  WITH CHECK ADD  CONSTRAINT [FK9nwc2j0no7b7rwuivl5mw1ofo] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[recorc_disp] CHECK CONSTRAINT [FK9nwc2j0no7b7rwuivl5mw1ofo]
GO
ALTER TABLE [colare].[recorc_fase1]  WITH CHECK ADD  CONSTRAINT [FK8ea91ndpvpdl77l1db4sm4dtp] FOREIGN KEY([id])
REFERENCES [colare].[recurso_orcamentario] ([uuid])
GO
ALTER TABLE [colare].[recorc_fase1] CHECK CONSTRAINT [FK8ea91ndpvpdl77l1db4sm4dtp]
GO
ALTER TABLE [colare].[recorc_fase1]  WITH CHECK ADD  CONSTRAINT [FKehpr1u4pmj5yoe0k3lksaimgi] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[recorc_fase1] CHECK CONSTRAINT [FKehpr1u4pmj5yoe0k3lksaimgi]
GO
ALTER TABLE [colare].[reg_licitacao]  WITH CHECK ADD  CONSTRAINT [FKdng438p2lxw0w6jhocsy1n1gt] FOREIGN KEY([detalhalc123_id])
REFERENCES [colare].[detalhalc123] ([uuid])
GO
ALTER TABLE [colare].[reg_licitacao] CHECK CONSTRAINT [FKdng438p2lxw0w6jhocsy1n1gt]
GO
ALTER TABLE [colare].[reg_licitacao]  WITH CHECK ADD  CONSTRAINT [FKfo2adotfrp5xiywratwl6a313] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[reg_licitacao] CHECK CONSTRAINT [FKfo2adotfrp5xiywratwl6a313]
GO
ALTER TABLE [colare].[resc_cont_licit]  WITH CHECK ADD  CONSTRAINT [FK29wvmq5lkkgc5hic7uejjp95p] FOREIGN KEY([uuid])
REFERENCES [colare].[licitacao] ([uuid])
GO
ALTER TABLE [colare].[resc_cont_licit] CHECK CONSTRAINT [FK29wvmq5lkkgc5hic7uejjp95p]
GO
ALTER TABLE [colare].[resc_contr_orig]  WITH CHECK ADD  CONSTRAINT [FKluev2he86a2fke1kiqsikin08] FOREIGN KEY([resc_cont_licit_id])
REFERENCES [colare].[resc_cont_licit] ([uuid])
GO
ALTER TABLE [colare].[resc_contr_orig] CHECK CONSTRAINT [FKluev2he86a2fke1kiqsikin08]
GO
ALTER TABLE [colare].[resp_adesao]  WITH CHECK ADD  CONSTRAINT [FKbbsr4md30dev58sx8vlghbg0l] FOREIGN KEY([codigo])
REFERENCES [colare].[responsavel] ([uuid])
GO
ALTER TABLE [colare].[resp_adesao] CHECK CONSTRAINT [FKbbsr4md30dev58sx8vlghbg0l]
GO
ALTER TABLE [colare].[resp_adesao]  WITH CHECK ADD  CONSTRAINT [FKitbpbn0sofrnuec04ssggd5g1] FOREIGN KEY([adesao_reg_prec_id])
REFERENCES [colare].[adesao_reg_prec] ([uuid])
GO
ALTER TABLE [colare].[resp_adesao] CHECK CONSTRAINT [FKitbpbn0sofrnuec04ssggd5g1]
GO
ALTER TABLE [colare].[resp_contr_ini]  WITH CHECK ADD  CONSTRAINT [FK64w52o6hwv4yo96jv5ow3l160] FOREIGN KEY([codigo])
REFERENCES [colare].[responsavel] ([uuid])
GO
ALTER TABLE [colare].[resp_contr_ini] CHECK CONSTRAINT [FK64w52o6hwv4yo96jv5ow3l160]
GO
ALTER TABLE [colare].[resp_contr_ini]  WITH CHECK ADD  CONSTRAINT [FK8ctf25oko3h93svatkkgam8nm] FOREIGN KEY([contrato_ini_id])
REFERENCES [colare].[contrato_ini] ([uuid])
GO
ALTER TABLE [colare].[resp_contr_ini] CHECK CONSTRAINT [FK8ctf25oko3h93svatkkgam8nm]
GO
ALTER TABLE [colare].[resp_disp]  WITH CHECK ADD  CONSTRAINT [FK43aylc35608spo0gqj76r30e] FOREIGN KEY([codigo])
REFERENCES [colare].[responsavel] ([uuid])
GO
ALTER TABLE [colare].[resp_disp] CHECK CONSTRAINT [FK43aylc35608spo0gqj76r30e]
GO
ALTER TABLE [colare].[resp_disp]  WITH CHECK ADD  CONSTRAINT [FKa3b8fs9mqksx0938e0b0j32js] FOREIGN KEY([dispensa_inexig_id])
REFERENCES [colare].[dispensa_inexig] ([uuid])
GO
ALTER TABLE [colare].[resp_disp] CHECK CONSTRAINT [FKa3b8fs9mqksx0938e0b0j32js]
GO
ALTER TABLE [colare].[resp_fase1]  WITH CHECK ADD  CONSTRAINT [FK11w8twycksjd6oevql9am7rq9] FOREIGN KEY([licitacaofase1_id])
REFERENCES [colare].[licitacaofase1] ([uuid])
GO
ALTER TABLE [colare].[resp_fase1] CHECK CONSTRAINT [FK11w8twycksjd6oevql9am7rq9]
GO
ALTER TABLE [colare].[resp_fase1]  WITH CHECK ADD  CONSTRAINT [FK4prgy591kh7jyp1ynk6plarut] FOREIGN KEY([codigo])
REFERENCES [colare].[responsavel] ([uuid])
GO
ALTER TABLE [colare].[resp_fase1] CHECK CONSTRAINT [FK4prgy591kh7jyp1ynk6plarut]
GO
ALTER TABLE [colare].[resp_fase2]  WITH CHECK ADD  CONSTRAINT [FK3es12ra4xa6r1aho3g2af8lyi] FOREIGN KEY([licitacaofase2_id])
REFERENCES [colare].[licitacaofase2] ([uuid])
GO
ALTER TABLE [colare].[resp_fase2] CHECK CONSTRAINT [FK3es12ra4xa6r1aho3g2af8lyi]
GO
ALTER TABLE [colare].[resp_fase2]  WITH CHECK ADD  CONSTRAINT [FKc3rovy6deb22cu7cqu4pa32o1] FOREIGN KEY([codigo])
REFERENCES [colare].[responsavel] ([uuid])
GO
ALTER TABLE [colare].[resp_fase2] CHECK CONSTRAINT [FKc3rovy6deb22cu7cqu4pa32o1]
GO
ALTER TABLE [colare].[resultado_fase2]  WITH CHECK ADD  CONSTRAINT [FKh0b5ynaud2rsm8vmvitig443x] FOREIGN KEY([licitacaofase2_id])
REFERENCES [colare].[licitacaofase2] ([uuid])
GO
ALTER TABLE [colare].[resultado_fase2] CHECK CONSTRAINT [FKh0b5ynaud2rsm8vmvitig443x]
GO
ALTER TABLE [colare].[situacao_proced]  WITH CHECK ADD  CONSTRAINT [FKkm272xnss67v284b6x1570cpd] FOREIGN KEY([arquivo_id])
REFERENCES [colare].[arquivo] ([uuid])
GO
ALTER TABLE [colare].[situacao_proced] CHECK CONSTRAINT [FKkm272xnss67v284b6x1570cpd]
GO

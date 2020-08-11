-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.5.3-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para colare
CREATE DATABASE IF NOT EXISTS `colare` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `colare`;

-- Copiando estrutura para tabela colare.adesao_reg_prec
CREATE TABLE IF NOT EXISTS `adesao_reg_prec` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_tipo_adesao` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_unidade_medida_prazo_execucao` int(11) NOT NULL,
  `data_publicacao_aviso_intencao` varchar(255) NOT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  `exercicio_adesao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_processo_administrativo` varchar(255) NOT NULL,
  `objeto` varchar(255) NOT NULL,
  `prazo_execucao` int(11) NOT NULL,
  `processo_por_lote` bit(1) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `org_ger_adesao_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKquaqqxs8q73xg0oupsvjaifqs` (`arquivo_id`),
  KEY `FKegj94nk0wj0bgepa3p4cv5dnv` (`org_ger_adesao_id`),
  CONSTRAINT `FKegj94nk0wj0bgepa3p4cv5dnv` FOREIGN KEY (`org_ger_adesao_id`) REFERENCES `org_ger_adesao` (`uuid`),
  CONSTRAINT `FKquaqqxs8q73xg0oupsvjaifqs` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.adesao_reg_prec: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `adesao_reg_prec` DISABLE KEYS */;
/*!40000 ALTER TABLE `adesao_reg_prec` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.adtv_cont_licit
CREATE TABLE IF NOT EXISTS `adtv_cont_licit` (
  `uuid` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  CONSTRAINT `FKb9qf92wltmbsx7m9rw6a5vmua` FOREIGN KEY (`uuid`) REFERENCES `licitacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.adtv_cont_licit: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `adtv_cont_licit` DISABLE KEYS */;
/*!40000 ALTER TABLE `adtv_cont_licit` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.arquivo
CREATE TABLE IF NOT EXISTS `arquivo` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano` int(11) DEFAULT NULL,
  `arquivo_homologacao` varchar(255) DEFAULT NULL,
  `id` bigint(20) DEFAULT NULL,
  `id_representacao` int(11) DEFAULT NULL,
  `layout_sigla` varchar(255) DEFAULT NULL,
  `mes` int(11) DEFAULT NULL,
  `prestacao_de_contas_sigla` varchar(255) DEFAULT NULL,
  `recibo` varchar(255) DEFAULT NULL,
  `status_envio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.arquivo: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `arquivo` DISABLE KEYS */;
INSERT INTO `arquivo` (`uuid`, `altered_at`, `inserted_at`, `seq`, `ano`, `arquivo_homologacao`, `id`, `id_representacao`, `layout_sigla`, `mes`, `prestacao_de_contas_sigla`, `recibo`, `status_envio`) VALUES
	(_binary 0xE037D12BFD1142FC932125492421C065, '2020-08-10 16:28:01', '2020-08-10 16:28:01', 1, 0, NULL, 0, 0, NULL, 0, NULL, NULL, NULL);
/*!40000 ALTER TABLE `arquivo` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.atas_fase2
CREATE TABLE IF NOT EXISTS `atas_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_ata` int(11) NOT NULL,
  `data` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `licitacaofase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKj1ms6nah9ye4w2v2j3jx2p40l` (`licitacaofase2_id`),
  CONSTRAINT `FKj1ms6nah9ye4w2v2j3jx2p40l` FOREIGN KEY (`licitacaofase2_id`) REFERENCES `licitacaofase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.atas_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `atas_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `atas_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `access_token_validity_seconds` int(11) DEFAULT NULL,
  `application_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `refresh_token_validity_seconds` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.cliente: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`uuid`, `altered_at`, `inserted_at`, `seq`, `access_token_validity_seconds`, `application_name`, `password`, `refresh_token_validity_seconds`) VALUES
	(_binary 0x4FC5232E91724DC3B01FECCEC7D5D0B5, NULL, NULL, 1, 3600, 'Angular', '$2y$12$4eEj5MHYtS4hA29.zIqMXeeQfsdCRuDJmEJyL0CcxzY5Soojli436', 28800);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.comissao_fase1
CREATE TABLE IF NOT EXISTS `comissao_fase1` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_ato_nomeacao` int(11) NOT NULL,
  `cod_tipo_comissao` int(11) NOT NULL,
  `data_ato_nomeacao` varchar(255) NOT NULL,
  `fim_vigencia` varchar(255) NOT NULL,
  `inicio_vigencia` varchar(255) NOT NULL,
  `numero_ato_nomeacao` varchar(255) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKoxpiw4wwa34wv5qnny71em8am` (`licitacaofase1_id`),
  CONSTRAINT `FKoxpiw4wwa34wv5qnny71em8am` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.comissao_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `comissao_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `comissao_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contratado
CREATE TABLE IF NOT EXISTS `contratado` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numerocndt` varchar(255) DEFAULT NULL,
  `numero_certidao_regularidadefgts` varchar(255) DEFAULT NULL,
  `numero_certidao_regularidadeinss` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contratado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contratado` DISABLE KEYS */;
/*!40000 ALTER TABLE `contratado` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contratado_adt
CREATE TABLE IF NOT EXISTS `contratado_adt` (
  `uuid` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  CONSTRAINT `FKixv2wlwcr8nu406cc30o4qpoi` FOREIGN KEY (`uuid`) REFERENCES `contratado` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contratado_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contratado_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `contratado_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contratado_ini
CREATE TABLE IF NOT EXISTS `contratado_ini` (
  `cod_ibge_inscricao_estadual` varchar(255) DEFAULT NULL,
  `cod_ibgeufinscricaocrea_cau` varchar(255) DEFAULT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  `numero_documento` varchar(255) NOT NULL,
  `numero_inscricaocrea_cau` varchar(255) DEFAULT NULL,
  `numero_inscricao_estadual` varchar(255) DEFAULT NULL,
  `uuid` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  CONSTRAINT `FKf7vdcs03ktc9h3q5bl1gyy35` FOREIGN KEY (`uuid`) REFERENCES `contratado` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contratado_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contratado_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `contratado_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contrato_adt
CREATE TABLE IF NOT EXISTS `contrato_adt` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_contrato` int(11) NOT NULL,
  `cod_tipo_aditivo` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_unidade_medida_prazo_execucao` int(11) DEFAULT NULL,
  `data_firmatura` varchar(255) NOT NULL,
  `id_contrato_original` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_contrato` varchar(255) NOT NULL,
  `prazo_adicional` int(11) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `contratado_adt_id` binary(16) NOT NULL,
  `adtv_contr_orig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK12aiudc7tbpqp6hw8cll3mmqo` (`arquivo_id`),
  KEY `FK5hila41akm9d6xh3tjg9r2tyq` (`contratado_adt_id`),
  KEY `FKgc59vv6qtow5f0i0gnvyqlca0` (`adtv_contr_orig_id`),
  CONSTRAINT `FK12aiudc7tbpqp6hw8cll3mmqo` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FK5hila41akm9d6xh3tjg9r2tyq` FOREIGN KEY (`contratado_adt_id`) REFERENCES `contratado_adt` (`uuid`),
  CONSTRAINT `FKgc59vv6qtow5f0i0gnvyqlca0` FOREIGN KEY (`adtv_contr_orig_id`) REFERENCES `contrato_original` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contrato_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contrato_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contrato_ini
CREATE TABLE IF NOT EXISTS `contrato_ini` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_contrato` int(11) NOT NULL,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_formalizacao_contrato` int(11) NOT NULL,
  `cod_tipo_procedimento` int(11) NOT NULL,
  `cod_unidade_medida_prazo_execucao` int(11) NOT NULL,
  `data_firmatura` varchar(255) DEFAULT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  `fim_vigencia` varchar(255) DEFAULT NULL,
  `forma_pagamento` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_procedimento` int(11) NOT NULL,
  `inicio_vigencia` varchar(255) DEFAULT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_contrato` varchar(255) DEFAULT NULL,
  `objeto` varchar(255) NOT NULL,
  `prazo_execucao` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `contratado_ini_id` binary(16) NOT NULL,
  `contrat_proced_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKlyaapxib1e3igdxeqtagmwnc7` (`arquivo_id`),
  KEY `FKee9r3yw6ws1hjmtit4f969s9j` (`contratado_ini_id`),
  KEY `FK9g2j01aq4uhnoaqbimusmbk6h` (`contrat_proced_id`),
  CONSTRAINT `FK9g2j01aq4uhnoaqbimusmbk6h` FOREIGN KEY (`contrat_proced_id`) REFERENCES `contrat_proced` (`uuid`),
  CONSTRAINT `FKee9r3yw6ws1hjmtit4f969s9j` FOREIGN KEY (`contratado_ini_id`) REFERENCES `contratado_ini` (`uuid`),
  CONSTRAINT `FKlyaapxib1e3igdxeqtagmwnc7` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contrato_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contrato_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contrato_original
CREATE TABLE IF NOT EXISTS `contrato_original` (
  `dtype` varchar(31) NOT NULL,
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_contrato` int(11) NOT NULL,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_tipo_procedimento` int(11) NOT NULL,
  `fim_vigencia` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `inicio_vigencia` varchar(255) NOT NULL,
  `numero_contrato` varchar(255) NOT NULL,
  `objeto` varchar(255) NOT NULL,
  `valor_contrato` double NOT NULL,
  `adtv_cont_licit_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKjgaxiptas86a43xo5x9ugcben` (`adtv_cont_licit_id`),
  CONSTRAINT `FKjgaxiptas86a43xo5x9ugcben` FOREIGN KEY (`adtv_cont_licit_id`) REFERENCES `adtv_cont_licit` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contrato_original: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contrato_original` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_original` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contrato_resc
CREATE TABLE IF NOT EXISTS `contrato_resc` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_motivo_rescisao` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_rescisao` int(11) NOT NULL,
  `data` varchar(255) NOT NULL,
  `id_contrato_original` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `saldo_final_executado_contrato` double DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `resc_contr_orig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKr2epxtovog9asymdgw5i2xmfr` (`arquivo_id`),
  KEY `FK3f561h338m8lg2rqj329tq22a` (`resc_contr_orig_id`),
  CONSTRAINT `FK3f561h338m8lg2rqj329tq22a` FOREIGN KEY (`resc_contr_orig_id`) REFERENCES `resc_contr_orig` (`uuid`),
  CONSTRAINT `FKr2epxtovog9asymdgw5i2xmfr` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contrato_resc: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contrato_resc` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_resc` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contrat_proced
CREATE TABLE IF NOT EXISTS `contrat_proced` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_unidade_gestora` int(11) NOT NULL,
  `adesaoaregistro_de_precos_uuid` binary(16) DEFAULT NULL,
  `contr_proc_disp_id` binary(16) DEFAULT NULL,
  `contr_proc_lic_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK81py2imi6mexy62mgd8qugp66` (`adesaoaregistro_de_precos_uuid`),
  KEY `FKea3tur6qwptkuf2klr2oxia38` (`contr_proc_disp_id`),
  KEY `FK2gsbody9ompmj0sfsdpxlvw8u` (`contr_proc_lic_id`),
  CONSTRAINT `FK2gsbody9ompmj0sfsdpxlvw8u` FOREIGN KEY (`contr_proc_lic_id`) REFERENCES `contr_proc_lic` (`uuid`),
  CONSTRAINT `FK81py2imi6mexy62mgd8qugp66` FOREIGN KEY (`adesaoaregistro_de_precos_uuid`) REFERENCES `contr_proc_ades` (`uuid`),
  CONSTRAINT `FKea3tur6qwptkuf2klr2oxia38` FOREIGN KEY (`contr_proc_disp_id`) REFERENCES `contr_proc_disp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contrat_proced: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contrat_proced` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrat_proced` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contr_natobjdet
CREATE TABLE IF NOT EXISTS `contr_natobjdet` (
  `uuid` binary(16) NOT NULL,
  `contrato_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKgtds2fum5ti7dd0dhy7plkib5` (`contrato_ini_id`),
  CONSTRAINT `FKfpq4seoafmut4bbumrs1j65ml` FOREIGN KEY (`uuid`) REFERENCES `natureza_objeto_detalhada` (`uuid`),
  CONSTRAINT `FKgtds2fum5ti7dd0dhy7plkib5` FOREIGN KEY (`contrato_ini_id`) REFERENCES `contrato_ini` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contr_natobjdet: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contr_natobjdet` DISABLE KEYS */;
/*!40000 ALTER TABLE `contr_natobjdet` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contr_proc_ades
CREATE TABLE IF NOT EXISTS `contr_proc_ades` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_esfera_orgao_gerenciador` int(11) NOT NULL,
  `codibgeente_gerenciador` varchar(255) NOT NULL,
  `data_ata_registro_preco` varchar(255) NOT NULL,
  `data_validade` varchar(255) NOT NULL,
  `exercicio_adesao` int(11) NOT NULL,
  `numero_documento` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contr_proc_ades: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contr_proc_ades` DISABLE KEYS */;
/*!40000 ALTER TABLE `contr_proc_ades` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contr_proc_disp
CREATE TABLE IF NOT EXISTS `contr_proc_disp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_processo` int(11) NOT NULL,
  `exercicio_processo` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contr_proc_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contr_proc_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `contr_proc_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contr_proc_docs
CREATE TABLE IF NOT EXISTS `contr_proc_docs` (
  `uuid` binary(16) NOT NULL,
  `contr_proc_ades_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK3oki5q6gpcyp4ve07q25ulru0` (`contr_proc_ades_id`),
  CONSTRAINT `FK3oki5q6gpcyp4ve07q25ulru0` FOREIGN KEY (`contr_proc_ades_id`) REFERENCES `contr_proc_ades` (`uuid`),
  CONSTRAINT `FKgj4i7bk4c5a7mrxh004ihodeu` FOREIGN KEY (`uuid`) REFERENCES `documento` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contr_proc_docs: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contr_proc_docs` DISABLE KEYS */;
/*!40000 ALTER TABLE `contr_proc_docs` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.contr_proc_lic
CREATE TABLE IF NOT EXISTS `contr_proc_lic` (
  `uuid` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  CONSTRAINT `FKbd7ua72vh7sxrqmn9f7g8f8nu` FOREIGN KEY (`uuid`) REFERENCES `licitacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.contr_proc_lic: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contr_proc_lic` DISABLE KEYS */;
/*!40000 ALTER TABLE `contr_proc_lic` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.cont_cred_edita
CREATE TABLE IF NOT EXISTS `cont_cred_edita` (
  `id` binary(16) NOT NULL,
  `contr_proc_disp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK21hao52uoa72n1k1nvxgalq8o` (`contr_proc_disp_id`),
  CONSTRAINT `FK21hao52uoa72n1k1nvxgalq8o` FOREIGN KEY (`contr_proc_disp_id`) REFERENCES `contr_proc_disp` (`uuid`),
  CONSTRAINT `FKat2kp88i2g564n07479xq33s2` FOREIGN KEY (`id`) REFERENCES `editaleanexo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.cont_cred_edita: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cont_cred_edita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cont_cred_edita` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.cont_lic_edital
CREATE TABLE IF NOT EXISTS `cont_lic_edital` (
  `id` binary(16) NOT NULL,
  `contr_proc_lic_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh317vwkbdh4tkaykrsnyagmwo` (`contr_proc_lic_id`),
  CONSTRAINT `FKh317vwkbdh4tkaykrsnyagmwo` FOREIGN KEY (`contr_proc_lic_id`) REFERENCES `contr_proc_lic` (`uuid`),
  CONSTRAINT `FKshyagco8qspn7gwwvtak0f4pi` FOREIGN KEY (`id`) REFERENCES `editaleanexo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.cont_lic_edital: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cont_lic_edital` DISABLE KEYS */;
/*!40000 ALTER TABLE `cont_lic_edital` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.cotacao_adesao
CREATE TABLE IF NOT EXISTS `cotacao_adesao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_origem_valor_referencia` int(11) NOT NULL,
  `cod_tipo_documento` int(11) DEFAULT NULL,
  `data_cotacao` varchar(255) NOT NULL,
  `descricao_origem_valor_referencia` varchar(255) DEFAULT NULL,
  `numero_documento` varchar(255) DEFAULT NULL,
  `quantidade` double NOT NULL,
  `valor_unitario` double NOT NULL,
  `item_adesao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdrxtd4w5bh0m8gcsdyq94hu2w` (`item_adesao_id`),
  CONSTRAINT `FKdrxtd4w5bh0m8gcsdyq94hu2w` FOREIGN KEY (`item_adesao_id`) REFERENCES `item_adesao` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.cotacao_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cotacao_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `cotacao_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.detalhalc123
CREATE TABLE IF NOT EXISTS `detalhalc123` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo_empenho_pagamentomeepp` varchar(255) DEFAULT NULL,
  `artigo_perc_objeto_contratacaomeepp` varchar(255) DEFAULT NULL,
  `artigo_proc_sub_contratacaomeepp` varchar(255) DEFAULT NULL,
  `artigo_regulamentou_particip_exclusivameepp` varchar(255) DEFAULT NULL,
  `percentual_objeto_contratacaomeepp` double DEFAULT NULL,
  `percentual_sub_contratacaomeepp` double DEFAULT NULL,
  `regulamentou_criterios_empenho_pagamentomeepp` bit(1) NOT NULL,
  `regulamentou_particip_exclusivameepp` bit(1) NOT NULL,
  `regulamentou_perc_objeto_contratacaomeepp` bit(1) NOT NULL,
  `regulamentou_proc_sub_contratacaomeepp` bit(1) NOT NULL,
  `valor_limite_reg_particip_exclusivameepp` double DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.detalhalc123: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalhalc123` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalhalc123` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.detalhamento_prova
CREATE TABLE IF NOT EXISTS `detalhamento_prova` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_prova` int(11) NOT NULL,
  `data_realizacao_prova` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.detalhamento_prova: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalhamento_prova` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalhamento_prova` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.detalhamento_publicidade_extrato_edital
CREATE TABLE IF NOT EXISTS `detalhamento_publicidade_extrato_edital` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_veiculo_publicacao` int(11) NOT NULL,
  `data_publicacao` varchar(255) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.detalhamento_publicidade_extrato_edital: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalhamento_publicidade_extrato_edital` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalhamento_publicidade_extrato_edital` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dispensa_inexig
CREATE TABLE IF NOT EXISTS `dispensa_inexig` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_processo` int(11) NOT NULL,
  `data_inicio_processo_dispensa` varchar(255) NOT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  `exercicio_processo` int(11) NOT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  `id_fase2deserta_fracassada` int(11) DEFAULT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_processo_administrativo` varchar(255) NOT NULL,
  `servico_continuo` bit(1) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKsy0exeffugvrswkf80qd3cvyq` (`arquivo_id`),
  CONSTRAINT `FKsy0exeffugvrswkf80qd3cvyq` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dispensa_inexig: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dispensa_inexig` DISABLE KEYS */;
/*!40000 ALTER TABLE `dispensa_inexig` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.disp_edit_anex
CREATE TABLE IF NOT EXISTS `disp_edit_anex` (
  `id` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKar0dtdj79i5y8k2vrcx00b2ef` (`dispensa_inexig_id`),
  CONSTRAINT `FKar0dtdj79i5y8k2vrcx00b2ef` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`),
  CONSTRAINT `FKbythtotx80ts7pgu7s72idyws` FOREIGN KEY (`id`) REFERENCES `editaleanexo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.disp_edit_anex: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `disp_edit_anex` DISABLE KEYS */;
/*!40000 ALTER TABLE `disp_edit_anex` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.disp_natobjdet
CREATE TABLE IF NOT EXISTS `disp_natobjdet` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_natureza_objeto_detalhada` int(11) NOT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKtgjihrtpehrtat8kl7j89f8b5` (`dispensa_inexig_id`),
  CONSTRAINT `FKtgjihrtpehrtat8kl7j89f8b5` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.disp_natobjdet: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `disp_natobjdet` DISABLE KEYS */;
/*!40000 ALTER TABLE `disp_natobjdet` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.documento
CREATE TABLE IF NOT EXISTS `documento` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_documento_anexado_adesao` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.documento: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `documento` DISABLE KEYS */;
/*!40000 ALTER TABLE `documento` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.doc_adesao
CREATE TABLE IF NOT EXISTS `doc_adesao` (
  `uuid` binary(16) NOT NULL,
  `adesao_reg_prec_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKphgw4muj2duk06ypqof29cof9` (`adesao_reg_prec_id`),
  CONSTRAINT `FKo04pyty2tpe0x7r5odhxh35cn` FOREIGN KEY (`uuid`) REFERENCES `documento` (`uuid`),
  CONSTRAINT `FKphgw4muj2duk06ypqof29cof9` FOREIGN KEY (`adesao_reg_prec_id`) REFERENCES `adesao_reg_prec` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.doc_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `doc_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `doc_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dominio
CREATE TABLE IF NOT EXISTS `dominio` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `codigo` bigint(20) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `vigencia` varchar(255) DEFAULT NULL,
  `tp_dominio_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKjhrlcauluxyy60m47uqtvfgrd` (`tp_dominio_id`),
  CONSTRAINT `FKjhrlcauluxyy60m47uqtvfgrd` FOREIGN KEY (`tp_dominio_id`) REFERENCES `tipo_dominio` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dominio: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `dominio` DISABLE KEYS */;
INSERT INTO `dominio` (`uuid`, `altered_at`, `inserted_at`, `seq`, `ativo`, `codigo`, `descricao`, `vigencia`, `tp_dominio_id`) VALUES
	(_binary 0x1AFD477185EA4CE9BBF3290BEBE76F62, '2020-08-10 16:24:53', '2020-08-10 16:24:53', 3, b'1', 3, 'Correção (de erro material)', '01/2017', _binary 0x1861BD50116F4DAC8FC3707DD1B26F61),
	(_binary 0x1BFC96773F974F8ABE45EC22EF05E647, '2020-08-10 16:27:42', '2020-08-10 16:27:42', 6, b'1', 3, 'Artigo 47 da Lei Complementar 123/2006', '01/2017', _binary 0x4BFB4D39FB0948AFAB91E6BDA9A5F223),
	(_binary 0x33910AB83664457DBA8678D3929ED0B4, '2020-08-10 16:27:42', '2020-08-10 16:27:42', 4, b'1', 1, 'Registro de preços', '01/2017', _binary 0x4BFB4D39FB0948AFAB91E6BDA9A5F223),
	(_binary 0x6A5C35DF51C244F89E5A89E08892F4E2, '2020-08-10 16:24:53', '2020-08-10 16:24:53', 2, b'1', 2, 'Atualização (por fato superveniente)', '01/2017', _binary 0x1861BD50116F4DAC8FC3707DD1B26F61),
	(_binary 0x881E37EBDC4B46BAA506A485969433D7, '2020-08-10 16:27:42', '2020-08-10 16:27:42', 7, b'1', 4, 'Adesão a registro de preços', '01/2018', _binary 0x4BFB4D39FB0948AFAB91E6BDA9A5F223),
	(_binary 0xA917822594AC46B6B239D1EF3487925B, '2020-08-10 16:24:53', '2020-08-10 16:24:53', 1, b'1', 1, 'Inicial', '01/2017', _binary 0x1861BD50116F4DAC8FC3707DD1B26F61),
	(_binary 0xDA7F76B83A2F4FC19181D4878789E3F5, '2020-08-10 16:27:42', '2020-08-10 16:27:42', 5, b'1', 2, 'Pregão', '01/2017', _binary 0x4BFB4D39FB0948AFAB91E6BDA9A5F223);
/*!40000 ALTER TABLE `dominio` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dotacao
CREATE TABLE IF NOT EXISTS `dotacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_fonte_recursos` int(11) NOT NULL,
  `cod_funcao` int(11) NOT NULL,
  `cod_orgao` int(11) NOT NULL,
  `cod_programa` int(11) NOT NULL,
  `cod_sub_funcao` int(11) NOT NULL,
  `cod_unidade_orcamentaria` int(11) NOT NULL,
  `natureza_acao` int(11) NOT NULL,
  `natureza_despesa` int(11) NOT NULL,
  `nro_proj_ativ` int(11) NOT NULL,
  `saldo_atual_da_dotacao` double NOT NULL,
  `subelemento` int(11) DEFAULT NULL,
  `valoraser_utilizado` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dotacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dotacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `dotacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dotacao_adesao
CREATE TABLE IF NOT EXISTS `dotacao_adesao` (
  `uuid` binary(16) NOT NULL,
  `recorc_adesao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKot4dw0i04hsf8xqcol3wgsfsm` (`recorc_adesao_id`),
  CONSTRAINT `FKoqa9dddvmmdtwmgitdta9lg13` FOREIGN KEY (`uuid`) REFERENCES `dotacao` (`uuid`),
  CONSTRAINT `FKot4dw0i04hsf8xqcol3wgsfsm` FOREIGN KEY (`recorc_adesao_id`) REFERENCES `recorc_adesao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dotacao_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dotacao_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `dotacao_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dotacao_disp
CREATE TABLE IF NOT EXISTS `dotacao_disp` (
  `id` binary(16) NOT NULL,
  `recorc_disp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKep5grdsap54di9srvau4035wf` (`recorc_disp_id`),
  CONSTRAINT `FKbqc1nrpuxuey3a7td05k39u0e` FOREIGN KEY (`id`) REFERENCES `dotacao` (`uuid`),
  CONSTRAINT `FKep5grdsap54di9srvau4035wf` FOREIGN KEY (`recorc_disp_id`) REFERENCES `recorc_disp` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dotacao_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dotacao_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `dotacao_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.dotacao_fase1
CREATE TABLE IF NOT EXISTS `dotacao_fase1` (
  `id` binary(16) NOT NULL,
  `recorc_fase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5r7tuglg4kyndg4g944c5256v` (`recorc_fase1_id`),
  CONSTRAINT `FK3psb74qbfspepgtrsy3m985nu` FOREIGN KEY (`id`) REFERENCES `dotacao` (`uuid`),
  CONSTRAINT `FK5r7tuglg4kyndg4g944c5256v` FOREIGN KEY (`recorc_fase1_id`) REFERENCES `recorc_fase1` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.dotacao_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dotacao_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `dotacao_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.editaleanexo
CREATE TABLE IF NOT EXISTS `editaleanexo` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_edital_anexos` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.editaleanexo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `editaleanexo` DISABLE KEYS */;
/*!40000 ALTER TABLE `editaleanexo` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.empenho
CREATE TABLE IF NOT EXISTS `empenho` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_empenho` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `numero_empenho` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.empenho: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `empenho` DISABLE KEYS */;
/*!40000 ALTER TABLE `empenho` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.emp_anulado_res
CREATE TABLE IF NOT EXISTS `emp_anulado_res` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_anulacao_empenho` varchar(255) NOT NULL,
  `data_empenho` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `numero_empenho` int(11) NOT NULL,
  `valor_anulacao_empenho` double NOT NULL,
  `contrato_resc_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKea9twgppcjwdymf0wedwmf8km` (`contrato_resc_id`),
  CONSTRAINT `FKea9twgppcjwdymf0wedwmf8km` FOREIGN KEY (`contrato_resc_id`) REFERENCES `contrato_resc` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.emp_anulado_res: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `emp_anulado_res` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_anulado_res` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.emp_contrat_adt
CREATE TABLE IF NOT EXISTS `emp_contrat_adt` (
  `uuid` binary(16) NOT NULL,
  `contrato_adt_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK1gdecucjnvrnf1mnc2vbxg0jm` (`contrato_adt_id`),
  CONSTRAINT `FK1gdecucjnvrnf1mnc2vbxg0jm` FOREIGN KEY (`contrato_adt_id`) REFERENCES `contrato_adt` (`uuid`),
  CONSTRAINT `FKtf56ma2tlume3qv8u1u0mop4f` FOREIGN KEY (`uuid`) REFERENCES `empenho` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.emp_contrat_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `emp_contrat_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_contrat_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.emp_contrat_ini
CREATE TABLE IF NOT EXISTS `emp_contrat_ini` (
  `id` binary(16) NOT NULL,
  `contrato_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjkbylwj5181pfbencfc5rr78b` (`contrato_ini_id`),
  CONSTRAINT `FK49g5lp06kqtcmoq6fw9edof8d` FOREIGN KEY (`id`) REFERENCES `empenho` (`uuid`),
  CONSTRAINT `FKjkbylwj5181pfbencfc5rr78b` FOREIGN KEY (`contrato_ini_id`) REFERENCES `contrato_ini` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.emp_contrat_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `emp_contrat_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_contrat_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.fas1_edit_anex
CREATE TABLE IF NOT EXISTS `fas1_edit_anex` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg6dtt54uown1le068p1ufasqo` (`licitacaofase1_id`),
  CONSTRAINT `FK8aoybt6nhe5dy8a5qfjiwwdda` FOREIGN KEY (`id`) REFERENCES `editaleanexo` (`uuid`),
  CONSTRAINT `FKg6dtt54uown1le068p1ufasqo` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.fas1_edit_anex: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fas1_edit_anex` DISABLE KEYS */;
/*!40000 ALTER TABLE `fas1_edit_anex` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.fas1_natobjdet
CREATE TABLE IF NOT EXISTS `fas1_natobjdet` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKakejddwwriuhl0honwyvuodiw` (`licitacaofase1_id`),
  CONSTRAINT `FKakejddwwriuhl0honwyvuodiw` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`),
  CONSTRAINT `FKkatd6ikl3xh3urdncsci7fcf` FOREIGN KEY (`id`) REFERENCES `natureza_objeto_detalhada` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.fas1_natobjdet: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fas1_natobjdet` DISABLE KEYS */;
/*!40000 ALTER TABLE `fas1_natobjdet` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.fornecedor_contratado
CREATE TABLE IF NOT EXISTS `fornecedor_contratado` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_ibge_inscricao_estadual` varchar(255) DEFAULT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `empresa_de_capital_abertocvm` bit(1) NOT NULL,
  `numerocndt` varchar(255) DEFAULT NULL,
  `numero_certidao_regularidadefgts` varchar(255) DEFAULT NULL,
  `numero_certidao_regularidadeinss` varchar(255) DEFAULT NULL,
  `numero_documento` varchar(255) NOT NULL,
  `numero_inscricao_estadual` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.fornecedor_contratado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedor_contratado` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor_contratado` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.habilit_fase2
CREATE TABLE IF NOT EXISTS `habilit_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `motivo_da_inabilitacao` varchar(255) DEFAULT NULL,
  `registrou_em_ata_presenca_preposto_do_licitante` bit(1) NOT NULL,
  `renuncia_prazo_recursal` bit(1) NOT NULL,
  `status_habilitacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.habilit_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `habilit_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `habilit_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.inav_badge
CREATE TABLE IF NOT EXISTS `inav_badge` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `classe` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `variant` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.inav_badge: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `inav_badge` DISABLE KEYS */;
INSERT INTO `inav_badge` (`uuid`, `altered_at`, `inserted_at`, `seq`, `classe`, `text`, `variant`) VALUES
	(_binary 0x0779C1E325014498920434F50B8E1624, '2020-08-09 20:18:40', '2020-08-09 20:18:40', 1, NULL, 'NEW', 'warning');
/*!40000 ALTER TABLE `inav_badge` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.inav_data
CREATE TABLE IF NOT EXISTS `inav_data` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `classe` varchar(255) DEFAULT NULL,
  `divider` bit(1) DEFAULT NULL,
  `href` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `title` bit(1) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `variant` varchar(255) DEFAULT NULL,
  `badge_id` binary(16) DEFAULT NULL,
  `menu_id` binary(16) DEFAULT NULL,
  `layout_descricao` varchar(255) DEFAULT NULL,
  `layout_titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK74amwfeeunoq4rp5x3qfl8rjd` (`badge_id`),
  KEY `FK5keje73t981qh2p8628ycv08e` (`menu_id`),
  CONSTRAINT `FK5keje73t981qh2p8628ycv08e` FOREIGN KEY (`menu_id`) REFERENCES `inav_data` (`uuid`),
  CONSTRAINT `FK74amwfeeunoq4rp5x3qfl8rjd` FOREIGN KEY (`badge_id`) REFERENCES `inav_badge` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.inav_data: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `inav_data` DISABLE KEYS */;
INSERT INTO `inav_data` (`uuid`, `altered_at`, `inserted_at`, `seq`, `classe`, `divider`, `href`, `icon`, `name`, `title`, `url`, `variant`, `badge_id`, `menu_id`, `layout_descricao`, `layout_titulo`) VALUES
	(_binary 0x123E307487E74359AF22E23E2D276BA9, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 16, NULL, NULL, NULL, 'icon-notebook', 'Licitação Fase 2', NULL, '/LIC/LICITACAOFASE2', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0x4C004C65B04746B3A6F8CACC9FC62CF8, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 11, NULL, NULL, NULL, 'icon-notebook', 'Situacão Procedimento', NULL, '/LIC/SITUACAO_PROCED', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0x4D147631F88D479CA58BEB1B8F60E219, '2020-08-09 20:21:07', '2020-08-09 20:21:07', 5, NULL, NULL, NULL, 'icon-puzzle', 'Tipo regulamentação', NULL, '/dominio/tipo-regulamentacao', NULL, NULL, _binary 0x9953A07C9CD5416889C6F671C455F76E, NULL, NULL),
	(_binary 0x56C9712903964E40A0F43BEB185D745A, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 13, NULL, NULL, NULL, 'icon-notebook', 'Contrato aditivo', NULL, '/LIC/CONTRATO_ADT', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0x6E9AD9CFD59A455EAA123F1DF0B27FF1, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 9, NULL, NULL, NULL, 'icon-notebook', 'Reg. Proc. licitatórios', NULL, '/LIC/REG_LICITACAO', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, 'Reg. dos proced. licitatórios'),
	(_binary 0x8D9F1F57502E426DA8E8CBBA4C9770DB, '2020-08-09 20:45:14', '2020-08-09 20:45:14', 7, NULL, NULL, NULL, NULL, 'Licitações', b'1', NULL, NULL, NULL, NULL, NULL, NULL),
	(_binary 0x8DB4AF81CCB4491498EBD7F96A0AD440, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 17, NULL, NULL, NULL, 'icon-notebook', 'Contrato inicial', NULL, '/LIC/CONTRATO_INI', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0x9953A07C9CD5416889C6F671C455F76E, '2020-08-09 20:21:07', '2020-08-09 20:21:07', 3, NULL, NULL, NULL, 'icon-puzzle', 'Domínios', NULL, '/dominio', NULL, NULL, NULL, NULL, NULL),
	(_binary 0xB75241FFE92E45D7A523B7B5A7DDE3BF, '2020-08-09 20:21:07', '2020-08-09 20:21:07', 6, NULL, NULL, NULL, 'icon-puzzle', 'Natureza do Objeto', NULL, '/dominio/natureza-do-objeto', NULL, NULL, _binary 0x9953A07C9CD5416889C6F671C455F76E, NULL, NULL),
	(_binary 0xBD75D937B6A84D6688ED7F68F182F40F, '2020-08-09 20:19:44', '2020-08-09 20:19:44', 2, NULL, NULL, NULL, NULL, 'Tabelas', b'1', NULL, NULL, NULL, NULL, NULL, NULL),
	(_binary 0xC45E135953F14E46AD4299EADE6597BE, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 8, NULL, NULL, NULL, 'icon-puzzle', 'Layout´s', NULL, '/LIC', NULL, NULL, NULL, NULL, NULL),
	(_binary 0xD8D10BC5245F47C482E3524A2292C7E6, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 12, NULL, NULL, NULL, 'icon-notebook', 'Registro de Preços', NULL, '/LIC/ADESAO_REG_PREC', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, 'A adesão à ata de registro de preços se dá com a possibilidade de um órgão ou entidade que não participou do procedimento licitatório aderir à ata e adquirir os bens e serviços licitados por órgão diverso.', 'Adesão a Registro de Preço'),
	(_binary 0xD976E9F9111B4951A02C91220E8E6B9B, '2020-08-09 20:21:07', '2020-08-09 20:21:07', 4, NULL, NULL, NULL, 'icon-puzzle', 'Tipo de envio', NULL, '/dominio/tipo-de-envio', NULL, NULL, _binary 0x9953A07C9CD5416889C6F671C455F76E, NULL, NULL),
	(_binary 0xE2015FCBE3CB4A5F8186FBFF7133E43E, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 14, NULL, NULL, NULL, 'icon-notebook', 'Dispensa', NULL, '/LIC/DISPENSA_INEXIG', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0xFBC29633C06B481380ED8730F9C24480, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 10, NULL, NULL, NULL, 'icon-user-unfollow', 'Contrato Rescisão', NULL, '/LIC/CONTRATO_RESC', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0xFE43B5F84427410D8E06B3360DDCB17F, '2020-08-10 12:29:39', '2020-08-10 12:29:39', 15, NULL, NULL, NULL, 'icon-notebook', 'Licitação Fase 1', NULL, '/LIC/LICITACAOFASE1', NULL, NULL, _binary 0xC45E135953F14E46AD4299EADE6597BE, NULL, NULL),
	(_binary 0xFE5990870AE74820A812B8D9BF2B585B, '2020-08-09 20:18:40', '2020-08-09 20:18:40', 1, NULL, NULL, NULL, 'cui-note', 'Dashboard', NULL, '/dashboard', NULL, _binary 0x0779C1E325014498920434F50B8E1624, NULL, NULL, NULL);
/*!40000 ALTER TABLE `inav_data` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.item
CREATE TABLE IF NOT EXISTS `item` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_origem_valor_referencia` int(11) NOT NULL,
  `cod_unidade_medida` int(11) NOT NULL,
  `codigo_unico_mercadoria_ou_servico` int(11) DEFAULT NULL,
  `descricao_origem_valor_referencia` varchar(255) DEFAULT NULL,
  `numero_item` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `quantidade_desdobra_unidade` int(11) DEFAULT NULL,
  `valor_de_referencia` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.item: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.item_adesao
CREATE TABLE IF NOT EXISTS `item_adesao` (
  `cod_tipo_documento` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `numero_documento` varchar(255) NOT NULL,
  `quantidade_aderida` double NOT NULL,
  `quantidade_licitada` double NOT NULL,
  `valor_unitario` double NOT NULL,
  `codigo` binary(16) NOT NULL,
  `lote_adesao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKlu2istaig2pwj9a93kf75myc0` (`lote_adesao_id`),
  CONSTRAINT `FK73vbxqk6m3dy61vin3wkllnd8` FOREIGN KEY (`codigo`) REFERENCES `item` (`uuid`),
  CONSTRAINT `FKlu2istaig2pwj9a93kf75myc0` FOREIGN KEY (`lote_adesao_id`) REFERENCES `lote_adesao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.item_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `item_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.item_adt
CREATE TABLE IF NOT EXISTS `item_adt` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero_item` int(11) NOT NULL,
  `numero_lote` int(11) NOT NULL,
  `quantidade_acrescida` double NOT NULL,
  `quantidade_decrescida` double NOT NULL,
  `valor_unitario_acrescido` double NOT NULL,
  `valor_unitario_decrescido` double NOT NULL,
  `contratado_adt_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKmqf5eaxa49x9jm4jyoyqw5565` (`contratado_adt_id`),
  CONSTRAINT `FKmqf5eaxa49x9jm4jyoyqw5565` FOREIGN KEY (`contratado_adt_id`) REFERENCES `contratado_adt` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.item_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `item_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.item_disp
CREATE TABLE IF NOT EXISTS `item_disp` (
  `data_cotacao` varchar(255) NOT NULL,
  `descricao_item` varchar(255) NOT NULL,
  `codigo` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKbesnlh56sy761nnios5l28li9` (`dispensa_inexig_id`),
  CONSTRAINT `FKbesnlh56sy761nnios5l28li9` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`),
  CONSTRAINT `FKelfxbl9knuuqrd8gwt09q2ies` FOREIGN KEY (`codigo`) REFERENCES `item` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.item_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `item_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.item_fase1
CREATE TABLE IF NOT EXISTS `item_fase1` (
  `descricao` varchar(255) NOT NULL,
  `preco_maximo` bit(1) NOT NULL,
  `codigo` binary(16) NOT NULL,
  `lote_fase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKlc2s32ifwkbhv680ernnym2nd` (`lote_fase1_id`),
  CONSTRAINT `FK1qdsr193nonqqih4vy7ndhgr1` FOREIGN KEY (`codigo`) REFERENCES `item` (`uuid`),
  CONSTRAINT `FKlc2s32ifwkbhv680ernnym2nd` FOREIGN KEY (`lote_fase1_id`) REFERENCES `lote_fase1` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.item_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `item_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.julg_fase2
CREATE TABLE IF NOT EXISTS `julg_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `registrou_em_ata_presenca_preposto_do_licitante` bit(1) NOT NULL,
  `renuncia_prazo_recursal` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.julg_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `julg_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `julg_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.licitacao
CREATE TABLE IF NOT EXISTS `licitacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_modalidade_licitacao` int(11) NOT NULL,
  `exercicio_licitacao` int(11) NOT NULL,
  `numero_licitacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.licitacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `licitacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `licitacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.licitacaofase1
CREATE TABLE IF NOT EXISTS `licitacaofase1` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_modalidade_licitacao` int(11) NOT NULL,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_natureza_procedimento` int(11) NOT NULL,
  `cod_regime_execucao` int(11) DEFAULT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_licitacao_criterio_julgamento` int(11) DEFAULT NULL,
  `criterio_desempatemeepp` bit(1) NOT NULL,
  `data_prevista_abertura_sessao` varchar(255) NOT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  `descricao_premio_ou_remuneracao_concurso` varchar(255) DEFAULT NULL,
  `destinacao_exclusivameepp` bit(1) NOT NULL,
  `exercicio_licitacao` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `limite_perc_objeto_contratacaomeepp` bit(1) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_de_convidados` int(11) DEFAULT NULL,
  `numero_licitacao` int(11) NOT NULL,
  `numero_processo_administrativo` varchar(255) NOT NULL,
  `objeto` varchar(255) NOT NULL,
  `processo_por_lote` bit(1) NOT NULL,
  `servico_continuo` bit(1) NOT NULL,
  `subcontratacaomeepp` bit(1) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKb2of55rm5ci4kryfypn7pyoie` (`arquivo_id`),
  CONSTRAINT `FKb2of55rm5ci4kryfypn7pyoie` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.licitacaofase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `licitacaofase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `licitacaofase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.licitacaofase2
CREATE TABLE IF NOT EXISTS `licitacaofase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `id_licitacao_fase1` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK4daqx69ybkslrd37obi7245ls` (`arquivo_id`),
  CONSTRAINT `FK4daqx69ybkslrd37obi7245ls` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.licitacaofase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `licitacaofase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `licitacaofase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.lic_fase2
CREATE TABLE IF NOT EXISTS `lic_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_ibge_inscricao_estadual` varchar(255) DEFAULT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `empresa_de_capital_abertocvm` bit(1) NOT NULL,
  `numero_documento` varchar(255) NOT NULL,
  `numero_inscricao_estadual` varchar(255) DEFAULT NULL,
  `numero_inscricao_municipal` varchar(255) DEFAULT NULL,
  `habilit_fase2_id` binary(16) NOT NULL,
  `julg_fase2_id` binary(16) NOT NULL,
  `licitacaofase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKfv5hgef7tn2sw6yfrrnh20sf4` (`habilit_fase2_id`),
  KEY `FK33jewsjv9cw50cbc069ow36m` (`julg_fase2_id`),
  KEY `FK7x4vuvfa56m7kfjjr07ocfnmd` (`licitacaofase2_id`),
  CONSTRAINT `FK33jewsjv9cw50cbc069ow36m` FOREIGN KEY (`julg_fase2_id`) REFERENCES `julg_fase2` (`uuid`),
  CONSTRAINT `FK7x4vuvfa56m7kfjjr07ocfnmd` FOREIGN KEY (`licitacaofase2_id`) REFERENCES `licitacaofase2` (`uuid`),
  CONSTRAINT `FKfv5hgef7tn2sw6yfrrnh20sf4` FOREIGN KEY (`habilit_fase2_id`) REFERENCES `habilit_fase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.lic_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `lic_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `lic_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.lote
CREATE TABLE IF NOT EXISTS `lote` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao_lote` varchar(255) DEFAULT NULL,
  `numero_lote` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.lote: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `lote` DISABLE KEYS */;
/*!40000 ALTER TABLE `lote` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.lote_adesao
CREATE TABLE IF NOT EXISTS `lote_adesao` (
  `uuid` binary(16) NOT NULL,
  `org_ger_adesao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKoyohbs729gfq299udwb1v6gt5` (`org_ger_adesao_id`),
  CONSTRAINT `FKoyohbs729gfq299udwb1v6gt5` FOREIGN KEY (`org_ger_adesao_id`) REFERENCES `org_ger_adesao` (`uuid`),
  CONSTRAINT `FKq0sdgw4cvg014xugpew2kccvm` FOREIGN KEY (`uuid`) REFERENCES `lote` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.lote_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `lote_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `lote_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.lote_fase1
CREATE TABLE IF NOT EXISTS `lote_fase1` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKk7f2qnlic9sbhj8qilynrpo5c` (`licitacaofase1_id`),
  CONSTRAINT `FK2eawklss052vqcr7w6dbh5p24` FOREIGN KEY (`id`) REFERENCES `lote` (`uuid`),
  CONSTRAINT `FKk7f2qnlic9sbhj8qilynrpo5c` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.lote_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `lote_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `lote_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.membro_fase1
CREATE TABLE IF NOT EXISTS `membro_fase1` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_atribuicao` int(11) NOT NULL,
  `cod_natureza_cargo` int(11) NOT NULL,
  `numero_cpf` varchar(255) NOT NULL,
  `comissao_fase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK6jx1gawkp8acc8wlqsk467h07` (`comissao_fase1_id`),
  CONSTRAINT `FK6jx1gawkp8acc8wlqsk467h07` FOREIGN KEY (`comissao_fase1_id`) REFERENCES `comissao_fase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.membro_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `membro_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `membro_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.natureza_objeto_detalhada
CREATE TABLE IF NOT EXISTS `natureza_objeto_detalhada` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_natureza_objeto_detalhada` int(11) NOT NULL,
  `descricao_natureza_objeto_outros` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.natureza_objeto_detalhada: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `natureza_objeto_detalhada` DISABLE KEYS */;
/*!40000 ALTER TABLE `natureza_objeto_detalhada` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.org_ger_adesao
CREATE TABLE IF NOT EXISTS `org_ger_adesao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_esfera_orgao_gerenciador` int(11) NOT NULL,
  `codibgeente_gerenciador` varchar(255) NOT NULL,
  `cod_modalidade_licitacao` int(11) NOT NULL,
  `cod_tipo_licitacao_criterio_julgamento` int(11) NOT NULL,
  `data_ata_registro_preco` varchar(255) NOT NULL,
  `data_validade` varchar(255) NOT NULL,
  `exercicio_licitacao` int(11) NOT NULL,
  `numero_documento` varchar(255) NOT NULL,
  `numero_licitacao` int(11) NOT NULL,
  `numero_processo_administrativo` varchar(255) NOT NULL,
  `processo_por_lote` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.org_ger_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `org_ger_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `org_ger_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.parecer
CREATE TABLE IF NOT EXISTS `parecer` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_parecer` int(11) NOT NULL,
  `cod_uf_registro_orgao_de_classe` int(11) NOT NULL,
  `data_parecer` varchar(255) NOT NULL,
  `numero_cpf` varchar(255) NOT NULL,
  `numero_registro_orgao_de_classe` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.parecer: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `parecer` DISABLE KEYS */;
/*!40000 ALTER TABLE `parecer` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.parec_adesao
CREATE TABLE IF NOT EXISTS `parec_adesao` (
  `uuid` binary(16) NOT NULL,
  `adesao_reg_prec_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK8aiygfuj5b6brrqr0iac5g8xa` (`adesao_reg_prec_id`),
  CONSTRAINT `FK8aiygfuj5b6brrqr0iac5g8xa` FOREIGN KEY (`adesao_reg_prec_id`) REFERENCES `adesao_reg_prec` (`uuid`),
  CONSTRAINT `FKqbwtbnh1l1mu345bxbg5tulc1` FOREIGN KEY (`uuid`) REFERENCES `parecer` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.parec_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `parec_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `parec_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.parec_disp
CREATE TABLE IF NOT EXISTS `parec_disp` (
  `id` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtbjng370t51ex0g9whdt8d23n` (`dispensa_inexig_id`),
  CONSTRAINT `FK8pqfhosxyaj91stj3f128galw` FOREIGN KEY (`id`) REFERENCES `parecer` (`uuid`),
  CONSTRAINT `FKtbjng370t51ex0g9whdt8d23n` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.parec_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `parec_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `parec_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.parec_fase1
CREATE TABLE IF NOT EXISTS `parec_fase1` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjc1thh1d8h31pplhwfl6tgejk` (`licitacaofase1_id`),
  CONSTRAINT `FKaq36v6kwgr0ytwx3qx8r2x8yd` FOREIGN KEY (`id`) REFERENCES `parecer` (`uuid`),
  CONSTRAINT `FKjc1thh1d8h31pplhwfl6tgejk` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.parec_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `parec_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `parec_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.parec_fase2
CREATE TABLE IF NOT EXISTS `parec_fase2` (
  `uuid` binary(16) NOT NULL,
  `licitacaofase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKkfm3svkvfhnoo8eu5hu4gdvca` (`licitacaofase2_id`),
  CONSTRAINT `FKkfm3svkvfhnoo8eu5hu4gdvca` FOREIGN KEY (`licitacaofase2_id`) REFERENCES `licitacaofase2` (`uuid`),
  CONSTRAINT `FKn7kcyk936n2ewafcxiynyll3e` FOREIGN KEY (`uuid`) REFERENCES `parecer` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.parec_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `parec_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `parec_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_admissao
CREATE TABLE IF NOT EXISTS `pes_admissao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_decreto_nomeacao` varchar(255) NOT NULL,
  `data_efetivo_exercicio` varchar(255) NOT NULL,
  `data_nomeacao` varchar(255) NOT NULL,
  `data_posse_admissao` varchar(255) NOT NULL,
  `id_pessoal_cadastro` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_decreto_nomeacao` varchar(255) NOT NULL,
  `temporario_sem_proc_seletivo` bit(1) DEFAULT NULL,
  `pes_adm_acumula_id` binary(16) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_adm_dadoadm_id` binary(16) NOT NULL,
  `pes_adm_nepotis_id` binary(16) NOT NULL,
  `pes_adm_subjudi_id` binary(16) NOT NULL,
  `pes_adm_vinculo_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK7voam2h0koigawyx5t9hqp47t` (`pes_adm_acumula_id`),
  KEY `FKalofqt9xjww0l08stbyy41tc5` (`arquivo_id`),
  KEY `FKcxv1sxatcy7a2btn64a6ic175` (`pes_adm_dadoadm_id`),
  KEY `FKfatr7eqgnq05gyfa8suau5xmm` (`pes_adm_nepotis_id`),
  KEY `FK3aenwsxeugcis3lte2dvrtsmk` (`pes_adm_subjudi_id`),
  KEY `FKqq2p6ouonmxyfq53yulqy0h66` (`pes_adm_vinculo_id`),
  CONSTRAINT `FK3aenwsxeugcis3lte2dvrtsmk` FOREIGN KEY (`pes_adm_subjudi_id`) REFERENCES `pes_adm_subjudi` (`uuid`),
  CONSTRAINT `FK7voam2h0koigawyx5t9hqp47t` FOREIGN KEY (`pes_adm_acumula_id`) REFERENCES `pes_adm_acumula` (`uuid`),
  CONSTRAINT `FKalofqt9xjww0l08stbyy41tc5` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKcxv1sxatcy7a2btn64a6ic175` FOREIGN KEY (`pes_adm_dadoadm_id`) REFERENCES `pes_adm_dadoadm` (`uuid`),
  CONSTRAINT `FKfatr7eqgnq05gyfa8suau5xmm` FOREIGN KEY (`pes_adm_nepotis_id`) REFERENCES `pes_adm_nepotis` (`uuid`),
  CONSTRAINT `FKqq2p6ouonmxyfq53yulqy0h66` FOREIGN KEY (`pes_adm_vinculo_id`) REFERENCES `pes_adm_vinculo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_admissao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_admissao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_admissao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_acum2
CREATE TABLE IF NOT EXISTS `pes_adm_acum2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_cargo` int(11) NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `nome_departamento_setor` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_acum2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_acum2` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_acum2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_acumula
CREATE TABLE IF NOT EXISTS `pes_adm_acumula` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `acumula_cargo` bit(1) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_acumula: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_acumula` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_acumula` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_adm2020
CREATE TABLE IF NOT EXISTS `pes_adm_adm2020` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_homologacao` int(11) NOT NULL,
  `numero_ordem_classificacao` int(11) NOT NULL,
  `tipo_lista_classificacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_adm2020: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_adm2020` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_adm2020` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_ate2019
CREATE TABLE IF NOT EXISTS `pes_adm_ate2019` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome_do_cargo_registrado` varchar(255) NOT NULL,
  `numero_acordaotcm` varchar(255) NOT NULL,
  `numero_processo_admissao` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_ate2019: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_ate2019` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_ate2019` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_dadoadm
CREATE TABLE IF NOT EXISTS `pes_adm_dadoadm` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `admissao_anteriora2020` bit(1) NOT NULL,
  `pes_adm_adm2020_id` binary(16) DEFAULT NULL,
  `pes_adm_ate2019_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKe1na8lfjvu8ky60csf5y0nsv0` (`pes_adm_adm2020_id`),
  KEY `FKbevgais21wxl9msdww8ky7toy` (`pes_adm_ate2019_id`),
  CONSTRAINT `FKbevgais21wxl9msdww8ky7toy` FOREIGN KEY (`pes_adm_ate2019_id`) REFERENCES `pes_adm_ate2019` (`uuid`),
  CONSTRAINT `FKe1na8lfjvu8ky60csf5y0nsv0` FOREIGN KEY (`pes_adm_adm2020_id`) REFERENCES `pes_adm_adm2020` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_dadoadm: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_dadoadm` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_dadoadm` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_dadosac
CREATE TABLE IF NOT EXISTS `pes_adm_dadosac` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_esfera_acumulacao` int(11) NOT NULL,
  `codibgedo_ente_onde_ha_acumulacao` varchar(255) NOT NULL,
  `pes_adm_acum2_id` binary(16) DEFAULT NULL,
  `pes_adm_acumula_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKo5tc0wxvtggawlqn9unlxu78c` (`pes_adm_acum2_id`),
  KEY `FKk26ufjmyy1whxhd7m1248gl4y` (`pes_adm_acumula_id`),
  CONSTRAINT `FKk26ufjmyy1whxhd7m1248gl4y` FOREIGN KEY (`pes_adm_acumula_id`) REFERENCES `pes_adm_acumula` (`uuid`),
  CONSTRAINT `FKo5tc0wxvtggawlqn9unlxu78c` FOREIGN KEY (`pes_adm_acum2_id`) REFERENCES `pes_adm_acum2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_dadosac: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_dadosac` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_dadosac` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_detjud
CREATE TABLE IF NOT EXISTS `pes_adm_detjud` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `detalhamento_peca_judicial` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `pes_adm_subjudi_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKtf23ecpn4wbrara66v555q0xs` (`pes_adm_subjudi_id`),
  CONSTRAINT `FKtf23ecpn4wbrara66v555q0xs` FOREIGN KEY (`pes_adm_subjudi_id`) REFERENCES `pes_adm_subjudi` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_detjud: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_detjud` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_detjud` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_docposs
CREATE TABLE IF NOT EXISTS `pes_adm_docposs` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_documentopdf` varchar(255) NOT NULL,
  `tipo_documento_posse` int(11) NOT NULL,
  `pes_admissao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKr2m8dylj6r6vhygunri5ouuml` (`pes_admissao_id`),
  CONSTRAINT `FKr2m8dylj6r6vhygunri5ouuml` FOREIGN KEY (`pes_admissao_id`) REFERENCES `pes_admissao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_docposs: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_docposs` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_docposs` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_nepotis
CREATE TABLE IF NOT EXISTS `pes_adm_nepotis` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `enquadra_situacao_nepotismo` bit(1) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_nepotis: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_nepotis` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_nepotis` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_subjudi
CREATE TABLE IF NOT EXISTS `pes_adm_subjudi` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `candidato_nomeacao_sub_judice` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_subjudi: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_subjudi` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_subjudi` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_tempsem
CREATE TABLE IF NOT EXISTS `pes_adm_tempsem` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `detalhamento_excepcionalidade` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `pes_admissao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKh0y8h9afme86gvsumcp9al13e` (`pes_admissao_id`),
  CONSTRAINT `FKh0y8h9afme86gvsumcp9al13e` FOREIGN KEY (`pes_admissao_id`) REFERENCES `pes_admissao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_tempsem: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_tempsem` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_tempsem` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_adm_vinculo
CREATE TABLE IF NOT EXISTS `pes_adm_vinculo` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_classe` int(11) NOT NULL,
  `cod_padrao_nivel` int(11) NOT NULL,
  `id_pessoal_cargo` int(11) NOT NULL,
  `tipo_vinculo_admissao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_adm_vinculo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_adm_vinculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_adm_vinculo` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_assuntonorm
CREATE TABLE IF NOT EXISTS `pes_assuntonorm` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_assunto_norma` int(11) NOT NULL,
  `pes_legislacao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK2dgssj2022o4tc0grv8l84gda` (`pes_legislacao_id`),
  CONSTRAINT `FK2dgssj2022o4tc0grv8l84gda` FOREIGN KEY (`pes_legislacao_id`) REFERENCES `pes_legislacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_assuntonorm: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_assuntonorm` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_assuntonorm` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cadastro
CREATE TABLE IF NOT EXISTS `pes_cadastro` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `cor_raca` int(11) NOT NULL,
  `escolaridade_servidor` int(11) NOT NULL,
  `id_documento_foto3x4` varchar(255) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `naturalidade` varchar(255) DEFAULT NULL,
  `numeroctps` varchar(255) DEFAULT NULL,
  `numero_cpf` varchar(255) NOT NULL,
  `numero_pis_pasepnitnis` varchar(255) DEFAULT NULL,
  `numero_seriectps` varchar(255) DEFAULT NULL,
  `numero_titulo_eleitor` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_cad_pcd_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKrhwyruc3bnapk8ox9gdguixw7` (`arquivo_id`),
  KEY `FKetq2muscjvujd1avsbav44mno` (`pes_cad_pcd_id`),
  CONSTRAINT `FKetq2muscjvujd1avsbav44mno` FOREIGN KEY (`pes_cad_pcd_id`) REFERENCES `pes_cad_pcd` (`uuid`),
  CONSTRAINT `FKrhwyruc3bnapk8ox9gdguixw7` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cadastro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cadastro` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cadastro` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cad_det_pcd
CREATE TABLE IF NOT EXISTS `pes_cad_det_pcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cidpcd` varchar(255) NOT NULL,
  `tipo_deficiencia` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cad_det_pcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cad_det_pcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cad_det_pcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cad_pcd
CREATE TABLE IF NOT EXISTS `pes_cad_pcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `pcd` bit(1) NOT NULL,
  `pes_cad_det_pcd_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK42jtbphb422nwry67ky589uyt` (`pes_cad_det_pcd_id`),
  CONSTRAINT `FK42jtbphb422nwry67ky589uyt` FOREIGN KEY (`pes_cad_det_pcd_id`) REFERENCES `pes_cad_det_pcd` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cad_pcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cad_pcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cad_pcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cad_regprof
CREATE TABLE IF NOT EXISTS `pes_cad_regprof` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_conselho_ordem` int(11) NOT NULL,
  `numero_registro` varchar(255) NOT NULL,
  `pes_cadastro_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKequmdc2kjq3y25omwnn29irnf` (`pes_cadastro_id`),
  CONSTRAINT `FKequmdc2kjq3y25omwnn29irnf` FOREIGN KEY (`pes_cadastro_id`) REFERENCES `pes_cadastro` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cad_regprof: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cad_regprof` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cad_regprof` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargos
CREATE TABLE IF NOT EXISTS `pes_cargos` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `carga_horaria_semanal` double NOT NULL,
  `cargo_acumulavel` bit(1) NOT NULL,
  `cargo_carreira` bit(1) NOT NULL,
  `classificacao_brasileira_ocupacoes` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_quadro_pessoal` int(11) NOT NULL,
  `cod_tipo_regime_juridico` int(11) NOT NULL,
  `descricao_especialidade` varchar(255) DEFAULT NULL,
  `escolaridade_minima` int(11) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `nome_cargo` varchar(255) NOT NULL,
  `quantitativo_cargo` int(11) NOT NULL,
  `regime_previdenciario` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_cargo_ente_id` binary(16) NOT NULL,
  `pes_cargo_trans_id` binary(16) NOT NULL,
  `pes_cargo_extin_id` binary(16) NOT NULL,
  `pes_cargo_dedic_id` binary(16) NOT NULL,
  `pes_cargo_atrib_id` binary(16) NOT NULL,
  `pes_cargo_reqpr_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK9mpb79lgil6biwwjpddsipd1q` (`arquivo_id`),
  KEY `FKptwu89wl38cvrgnatwl57tcvy` (`pes_cargo_ente_id`),
  KEY `FK47upnte1rx4euvy2jb32uu1n5` (`pes_cargo_trans_id`),
  KEY `FKwxlc0gv4k1l4hrd9iybw02vo` (`pes_cargo_extin_id`),
  KEY `FK7uj9v5gqm9ybrj3757wy1y1tj` (`pes_cargo_dedic_id`),
  KEY `FKig9r3ugl5tv68sdj3j1ksvpem` (`pes_cargo_atrib_id`),
  KEY `FK89g0n113obedd3oce8s59o9a7` (`pes_cargo_reqpr_id`),
  CONSTRAINT `FK47upnte1rx4euvy2jb32uu1n5` FOREIGN KEY (`pes_cargo_trans_id`) REFERENCES `pes_cargo_trans` (`uuid`),
  CONSTRAINT `FK7uj9v5gqm9ybrj3757wy1y1tj` FOREIGN KEY (`pes_cargo_dedic_id`) REFERENCES `pes_cargo_dedic` (`uuid`),
  CONSTRAINT `FK89g0n113obedd3oce8s59o9a7` FOREIGN KEY (`pes_cargo_reqpr_id`) REFERENCES `pes_cargo_reqpr` (`uuid`),
  CONSTRAINT `FK9mpb79lgil6biwwjpddsipd1q` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKig9r3ugl5tv68sdj3j1ksvpem` FOREIGN KEY (`pes_cargo_atrib_id`) REFERENCES `pes_cargo_atrib` (`uuid`),
  CONSTRAINT `FKptwu89wl38cvrgnatwl57tcvy` FOREIGN KEY (`pes_cargo_ente_id`) REFERENCES `pes_cargo_ente` (`uuid`),
  CONSTRAINT `FKwxlc0gv4k1l4hrd9iybw02vo` FOREIGN KEY (`pes_cargo_extin_id`) REFERENCES `pes_cargo_extin` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargos` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_atrib
CREATE TABLE IF NOT EXISTS `pes_cargo_atrib` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo` varchar(255) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_atrib: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_atrib` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_atrib` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_class
CREATE TABLE IF NOT EXISTS `pes_cargo_class` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_classe` int(11) NOT NULL,
  `descricao_classe` varchar(255) NOT NULL,
  `pes_cargos_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK12v52p6l7u2rda0dk3o0kd1hb` (`pes_cargos_id`),
  CONSTRAINT `FK12v52p6l7u2rda0dk3o0kd1hb` FOREIGN KEY (`pes_cargos_id`) REFERENCES `pes_cargos` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_class: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_class` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_decex
CREATE TABLE IF NOT EXISTS `pes_cargo_decex` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_decex: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_decex` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_decex` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_dedic
CREATE TABLE IF NOT EXISTS `pes_cargo_dedic` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo_dedicacao_exclusiva` bit(1) NOT NULL,
  `pes_cargo_decex_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKf8xelavrfdvegam18u6dpk5e3` (`pes_cargo_decex_id`),
  CONSTRAINT `FKf8xelavrfdvegam18u6dpk5e3` FOREIGN KEY (`pes_cargo_decex_id`) REFERENCES `pes_cargo_decex` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_dedic: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_dedic` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_dedic` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_ente
CREATE TABLE IF NOT EXISTS `pes_cargo_ente` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo_de_outro_ente` bit(1) NOT NULL,
  `pes_cargo_outen_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKmulgqfqk15s9oqypunog3p5qu` (`pes_cargo_outen_id`),
  CONSTRAINT `FKmulgqfqk15s9oqypunog3p5qu` FOREIGN KEY (`pes_cargo_outen_id`) REFERENCES `pes_cargo_outen` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_ente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_ente` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_ente` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_extf
CREATE TABLE IF NOT EXISTS `pes_cargo_extf` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo` varchar(255) NOT NULL,
  `data_inicio_em_extincao` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_extf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_extf` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_extf` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_extin
CREATE TABLE IF NOT EXISTS `pes_cargo_extin` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo_em_extincao` bit(1) NOT NULL,
  `pes_cargo_extf_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKbqngl3yt4htk4t2lu4hl7a3vt` (`pes_cargo_extf_id`),
  CONSTRAINT `FKbqngl3yt4htk4t2lu4hl7a3vt` FOREIGN KEY (`pes_cargo_extf_id`) REFERENCES `pes_cargo_extf` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_extin: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_extin` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_extin` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_outen
CREATE TABLE IF NOT EXISTS `pes_cargo_outen` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_ente` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `unidade_gestora_origem_cargo` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_outen: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_outen` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_outen` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_pdr_n
CREATE TABLE IF NOT EXISTS `pes_cargo_pdr_n` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_padrao_nivel` int(11) NOT NULL,
  `descricao_padrao_nivel` varchar(255) NOT NULL,
  `valor_representacao` double DEFAULT NULL,
  `valor_vencimento_ou_subsidio` double NOT NULL,
  `pes_cargo_class_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK19x2mk90t1l7etlb2cjq0lgv5` (`pes_cargo_class_id`),
  CONSTRAINT `FK19x2mk90t1l7etlb2cjq0lgv5` FOREIGN KEY (`pes_cargo_class_id`) REFERENCES `pes_cargo_class` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_pdr_n: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_pdr_n` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_pdr_n` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_reqpr
CREATE TABLE IF NOT EXISTS `pes_cargo_reqpr` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo` varchar(255) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_reqpr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_reqpr` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_reqpr` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_trans
CREATE TABLE IF NOT EXISTS `pes_cargo_trans` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo_decorrente_transformacao` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_trans: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_trans` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_trans` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_cargo_trnsf
CREATE TABLE IF NOT EXISTS `pes_cargo_trnsf` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_cargo` int(11) NOT NULL,
  `pes_cargo_trans_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK3tow2ro7v45fkks4keuw229fg` (`pes_cargo_trans_id`),
  CONSTRAINT `FK3tow2ro7v45fkks4keuw229fg` FOREIGN KEY (`pes_cargo_trans_id`) REFERENCES `pes_cargo_trans` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_cargo_trnsf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_cargo_trnsf` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_cargo_trnsf` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_concessao
CREATE TABLE IF NOT EXISTS `pes_concessao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `id_situacao_funcional_correspondente` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `tipo_situacao_funcional` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_concessaodt_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK51np5qerv2ceb1fqlgw6ri8e` (`arquivo_id`),
  KEY `FKg6wxvkc4y254epqpt3kue7uvc` (`pes_concessaodt_id`),
  CONSTRAINT `FK51np5qerv2ceb1fqlgw6ri8e` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKg6wxvkc4y254epqpt3kue7uvc` FOREIGN KEY (`pes_concessaodt_id`) REFERENCES `pes_concessaodt` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_concessao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_concessao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_concessao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_concessaodt
CREATE TABLE IF NOT EXISTS `pes_concessaodt` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `tipo_concessao` int(11) NOT NULL,
  `pes_pos_vnct_cr_id` binary(16) DEFAULT NULL,
  `pes_concs_verba` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKnsedb0l0y7bf8vrmnlmvw55p5` (`pes_pos_vnct_cr_id`),
  KEY `FK15c3f9g07vk9ft22uohapf3ge` (`pes_concs_verba`),
  CONSTRAINT `FK15c3f9g07vk9ft22uohapf3ge` FOREIGN KEY (`pes_concs_verba`) REFERENCES `pes_concs_verba` (`uuid`),
  CONSTRAINT `FKnsedb0l0y7bf8vrmnlmvw55p5` FOREIGN KEY (`pes_pos_vnct_cr_id`) REFERENCES `pes_pos_vnct_cr` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_concessaodt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_concessaodt` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_concessaodt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_concs_verba
CREATE TABLE IF NOT EXISTS `pes_concs_verba` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_modalidade_desconto` int(11) NOT NULL,
  `cod_modalidade_remuneracao` int(11) NOT NULL,
  `cod_tipo_verba` int(11) NOT NULL,
  `data_final` varchar(255) DEFAULT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  `id_pessoal_verbas` int(11) NOT NULL,
  `numero_de_parcelas` int(11) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_concs_verba: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_concs_verba` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_concs_verba` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_conmenorpon
CREATE TABLE IF NOT EXISTS `pes_conmenorpon` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_carprov_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKekh8w7hvfhkmj5jpho4tftc4s` (`pes_con_carprov_id`),
  CONSTRAINT `FKekh8w7hvfhkmj5jpho4tftc4s` FOREIGN KEY (`pes_con_carprov_id`) REFERENCES `pes_con_carprov` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_conmenorpon: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_conmenorpon` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_conmenorpon` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_arrdpcd
CREATE TABLE IF NOT EXISTS `pes_con_arrdpcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_pcd_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK7enb8gknlkmkda37u1ipjpv4` (`pes_con_pcd_id`),
  CONSTRAINT `FK7enb8gknlkmkda37u1ipjpv4` FOREIGN KEY (`pes_con_pcd_id`) REFERENCES `pes_con_pcd` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_arrdpcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_arrdpcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_arrdpcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_aut_ldo
CREATE TABLE IF NOT EXISTS `pes_con_aut_ldo` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `artigo` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_aut_ldo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_aut_ldo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_aut_ldo` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_banca
CREATE TABLE IF NOT EXISTS `pes_con_banca` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_banca_examinadora` int(11) NOT NULL,
  `id_contrato_original` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_banca: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_banca` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_banca` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_cadastr
CREATE TABLE IF NOT EXISTS `pes_con_cadastr` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_cadres_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKi6l3mkn892su6awoeqo1t7dos` (`pes_con_cadres_id`),
  CONSTRAINT `FKi6l3mkn892su6awoeqo1t7dos` FOREIGN KEY (`pes_con_cadres_id`) REFERENCES `pes_con_cadres` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_cadastr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_cadastr` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_cadastr` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_cadres
CREATE TABLE IF NOT EXISTS `pes_con_cadres` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ha_cadastro_reserva` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_cadres: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_cadres` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_cadres` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_cargcla
CREATE TABLE IF NOT EXISTS `pes_con_cargcla` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_carprov_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK712g7fct8wpgst3st25dh8e8g` (`pes_con_carprov_id`),
  CONSTRAINT `FK712g7fct8wpgst3st25dh8e8g` FOREIGN KEY (`pes_con_carprov_id`) REFERENCES `pes_con_carprov` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_cargcla: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_cargcla` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_cargcla` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_cargpro
CREATE TABLE IF NOT EXISTS `pes_con_cargpro` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `atribuicoes_edital` varchar(255) NOT NULL,
  `carga_horaria_edital` int(11) NOT NULL,
  `cod_conselho_ordem` int(11) DEFAULT NULL,
  `exige_registro_conselho_ou_ordem` bit(1) NOT NULL,
  `id_pessoal_cargo` int(11) NOT NULL,
  `oferta_vagas_por_micro_areas_paraacs` bit(1) NOT NULL,
  `qtd_pcd` int(11) NOT NULL,
  `qtd_vagas_ampla_concorrencia` int(11) NOT NULL,
  `qtd_vagas_cadastro_reserva` int(11) NOT NULL,
  `qtd_vagas_cotas` int(11) NOT NULL,
  `requisitos_cargo_edital` varchar(255) NOT NULL,
  `pes_con_psp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKggruwd3kbwucpqnytvm64xxma` (`pes_con_psp_id`),
  CONSTRAINT `FKggruwd3kbwucpqnytvm64xxma` FOREIGN KEY (`pes_con_psp_id`) REFERENCES `pes_con_psp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_cargpro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_cargpro` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_cargpro` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_carprov
CREATE TABLE IF NOT EXISTS `pes_con_carprov` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ha_pontuacao_minima` bit(1) NOT NULL,
  `ha_clausula_cri_aprov` bit(1) NOT NULL,
  `tipo_carater_prova` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_carprov: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_carprov` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_carprov` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_certrsf
CREATE TABLE IF NOT EXISTS `pes_con_certrsf` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_certrsf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_certrsf` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_certrsf` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_comissa
CREATE TABLE IF NOT EXISTS `pes_con_comissa` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_comissa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_comissa` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_comissa` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_desemp3
CREATE TABLE IF NOT EXISTS `pes_con_desemp3` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_desempa_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK28vgdlfyymmqlycl6wxedcen6` (`pes_con_desempa_id`),
  CONSTRAINT `FK28vgdlfyymmqlycl6wxedcen6` FOREIGN KEY (`pes_con_desempa_id`) REFERENCES `pes_con_desempa` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_desemp3: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_desemp3` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_desemp3` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_desempa
CREATE TABLE IF NOT EXISTS `pes_con_desempa` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `experiencia_no_servico_publico_constitui_um_criterio` bit(1) NOT NULL,
  `maior_de60anos_como_primerio_criterio` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_desempa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_desempa` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_desempa` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_desmp1
CREATE TABLE IF NOT EXISTS `pes_con_desmp1` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_desempa_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKat1rys15urrqdmigwvrevt0h9` (`pes_con_desempa_id`),
  CONSTRAINT `FKat1rys15urrqdmigwvrevt0h9` FOREIGN KEY (`pes_con_desempa_id`) REFERENCES `pes_con_desempa` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_desmp1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_desmp1` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_desmp1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_detpcd
CREATE TABLE IF NOT EXISTS `pes_con_detpcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `pes_con_pcd_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK6jcag5b902wgif9yo8c8mwo0d` (`pes_con_pcd_id`),
  CONSTRAINT `FK6jcag5b902wgif9yo8c8mwo0d` FOREIGN KEY (`pes_con_pcd_id`) REFERENCES `pes_con_pcd` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_detpcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_detpcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_detpcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_extratp
CREATE TABLE IF NOT EXISTS `pes_con_extratp` (
  `id` binary(16) NOT NULL,
  `pes_con_psp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3kdsu5kudvr2okdq33ipyghbx` (`pes_con_psp_id`),
  CONSTRAINT `FK2033lousufc6fkm3gajg7c825` FOREIGN KEY (`id`) REFERENCES `detalhamento_publicidade_extrato_edital` (`uuid`),
  CONSTRAINT `FK3kdsu5kudvr2okdq33ipyghbx` FOREIGN KEY (`pes_con_psp_id`) REFERENCES `pes_con_psp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_extratp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_extratp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_extratp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_impug
CREATE TABLE IF NOT EXISTS `pes_con_impug` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `admite_outros_recursos_nao_presenciais` bit(1) NOT NULL,
  `admite_recurso_por_procuracao` bit(1) NOT NULL,
  `ha_prazo_para_interposicao_de_recursos` bit(1) NOT NULL,
  `serao_atribuidos_os_pontos_das_questoes_anuladasatodos` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_impug: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_impug` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_impug` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_impug2
CREATE TABLE IF NOT EXISTS `pes_con_impug2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_impug_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKp05i7xvsf6imbdsxhud9b6q2u` (`pes_con_impug_id`),
  CONSTRAINT `FKp05i7xvsf6imbdsxhud9b6q2u` FOREIGN KEY (`pes_con_impug_id`) REFERENCES `pes_con_impug` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_impug2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_impug2` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_impug2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_impug3
CREATE TABLE IF NOT EXISTS `pes_con_impug3` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_impug_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKnreqadwsg669cb2a8mjmk1pax` (`pes_con_impug_id`),
  CONSTRAINT `FKnreqadwsg669cb2a8mjmk1pax` FOREIGN KEY (`pes_con_impug_id`) REFERENCES `pes_con_impug` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_impug3: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_impug3` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_impug3` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_impug4
CREATE TABLE IF NOT EXISTS `pes_con_impug4` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_impug_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKt8whbcbe0wog5se11wqym0uhi` (`pes_con_impug_id`),
  CONSTRAINT `FKt8whbcbe0wog5se11wqym0uhi` FOREIGN KEY (`pes_con_impug_id`) REFERENCES `pes_con_impug` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_impug4: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_impug4` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_impug4` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_impug5
CREATE TABLE IF NOT EXISTS `pes_con_impug5` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_impug_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdcpgpra69cn46is9j7f7kaoo0` (`pes_con_impug_id`),
  CONSTRAINT `FKdcpgpra69cn46is9j7f7kaoo0` FOREIGN KEY (`pes_con_impug_id`) REFERENCES `pes_con_impug` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_impug5: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_impug5` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_impug5` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_insc2
CREATE TABLE IF NOT EXISTS `pes_con_insc2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_inscr_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK4gcchxr0xjykdpff9kie8yn1v` (`pes_con_inscr_id`),
  CONSTRAINT `FK4gcchxr0xjykdpff9kie8yn1v` FOREIGN KEY (`pes_con_inscr_id`) REFERENCES `pes_con_inscr` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_insc2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_insc2` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_insc2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_insc3
CREATE TABLE IF NOT EXISTS `pes_con_insc3` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_inscr_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK3b0mhyahej6bhoar9vegf1v3b` (`pes_con_inscr_id`),
  CONSTRAINT `FK3b0mhyahej6bhoar9vegf1v3b` FOREIGN KEY (`pes_con_inscr_id`) REFERENCES `pes_con_inscr` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_insc3: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_insc3` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_insc3` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_insc4
CREATE TABLE IF NOT EXISTS `pes_con_insc4` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_inscr_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKogxkwhgifdxe1xe96kif3ssi2` (`pes_con_inscr_id`),
  CONSTRAINT `FKogxkwhgifdxe1xe96kif3ssi2` FOREIGN KEY (`pes_con_inscr_id`) REFERENCES `pes_con_inscr` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_insc4: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_insc4` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_insc4` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_inscr
CREATE TABLE IF NOT EXISTS `pes_con_inscr` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `existe_previsao_de_devolucao_devido_pag_em_duplicidade` bit(1) NOT NULL,
  `existe_previsao_de_devolucao_taxa_devido_cancelamento` bit(1) NOT NULL,
  `existe_previsao_de_isencao` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_inscr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_inscr` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_inscr` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_menbros
CREATE TABLE IF NOT EXISTS `pes_con_menbros` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_de_funcao_comissao_organizadora` int(11) NOT NULL,
  `numero_cpf` varchar(255) NOT NULL,
  `pes_con_comissa_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKllod5frkj8283bddoh2yqx49s` (`pes_con_comissa_id`),
  CONSTRAINT `FKllod5frkj8283bddoh2yqx49s` FOREIGN KEY (`pes_con_comissa_id`) REFERENCES `pes_con_comissa` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_menbros: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_menbros` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_menbros` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_pcd
CREATE TABLE IF NOT EXISTS `pes_con_pcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `existe_clausula_de_arreddondamento_de_percentual` bit(1) NOT NULL,
  `existe_legislacao_municipal_reserva_vagaspcd` bit(1) NOT NULL,
  `ha_vagas_destinadaspcd` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_pcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_pcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_pcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_prdinsc
CREATE TABLE IF NOT EXISTS `pes_con_prdinsc` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_prdinsc: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_prdinsc` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_prdinsc` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_provas
CREATE TABLE IF NOT EXISTS `pes_con_provas` (
  `id` binary(16) NOT NULL,
  `pes_con_carprov_id` binary(16) NOT NULL,
  `pes_con_cargpro_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKb20s2xebrojwqq889328aorxn` (`pes_con_carprov_id`),
  KEY `FK56fdhc93fc7vkp5v9gr9rkxo3` (`pes_con_cargpro_id`),
  CONSTRAINT `FK56fdhc93fc7vkp5v9gr9rkxo3` FOREIGN KEY (`pes_con_cargpro_id`) REFERENCES `pes_con_cargpro` (`uuid`),
  CONSTRAINT `FK78dfcun5iv3xlavvcdrpa3xex` FOREIGN KEY (`id`) REFERENCES `detalhamento_prova` (`uuid`),
  CONSTRAINT `FKb20s2xebrojwqq889328aorxn` FOREIGN KEY (`pes_con_carprov_id`) REFERENCES `pes_con_carprov` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_provas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_provas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_provas` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_psp
CREATE TABLE IF NOT EXISTS `pes_con_psp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_edital` int(11) NOT NULL,
  `cod_tipo_edital_selecao_pessoal` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_edital` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_con_aut_ldo_id` binary(16) NOT NULL,
  `pes_con_banca_id` binary(16) NOT NULL,
  `pes_con_cadres_id` binary(16) NOT NULL,
  `pes_con_certrsf_id` binary(16) NOT NULL,
  `pes_con_comissa_id` binary(16) NOT NULL,
  `pes_con_desempa_id` binary(16) NOT NULL,
  `pes_con_impug_id` binary(16) NOT NULL,
  `pes_con_pcd_id` binary(16) NOT NULL,
  `pes_con_prdinsc_id` binary(16) NOT NULL,
  `pes_con_solcon_id` binary(16) NOT NULL,
  `pes_con_inscr_id` binary(16) NOT NULL,
  `pes_con_validad_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK5lp3di61ajoit2dadvgpno8qp` (`arquivo_id`),
  KEY `FKjf7opc3um5i6nsf4d7jl6amco` (`pes_con_aut_ldo_id`),
  KEY `FKtnt0tq1lprqlh37xmosk5j7cn` (`pes_con_banca_id`),
  KEY `FKjcak3s1b2dd0gvy72nlpg7bgy` (`pes_con_cadres_id`),
  KEY `FK1r4sp63j64ut3fvgu5mgdrpat` (`pes_con_certrsf_id`),
  KEY `FK5hjpxm1chivcodhk9bxri1f4g` (`pes_con_comissa_id`),
  KEY `FKf37tj2ve4i6ojp8c2hlphnscx` (`pes_con_desempa_id`),
  KEY `FKl6jr1r4vqyvqjubt10qy8ky1m` (`pes_con_impug_id`),
  KEY `FKh12tkxtsyty6ermril6ylxuw6` (`pes_con_pcd_id`),
  KEY `FK8b4wmyw0njph5v159fspenbng` (`pes_con_prdinsc_id`),
  KEY `FKk5s7pduiywx137yhaymbjhea0` (`pes_con_solcon_id`),
  KEY `FKjxjtnvy4h3ogdq6gphg4h6564` (`pes_con_inscr_id`),
  KEY `FKsw1jgobnwstp5b48gb314luis` (`pes_con_validad_id`),
  CONSTRAINT `FK1r4sp63j64ut3fvgu5mgdrpat` FOREIGN KEY (`pes_con_certrsf_id`) REFERENCES `pes_con_certrsf` (`uuid`),
  CONSTRAINT `FK5hjpxm1chivcodhk9bxri1f4g` FOREIGN KEY (`pes_con_comissa_id`) REFERENCES `pes_con_comissa` (`uuid`),
  CONSTRAINT `FK5lp3di61ajoit2dadvgpno8qp` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FK8b4wmyw0njph5v159fspenbng` FOREIGN KEY (`pes_con_prdinsc_id`) REFERENCES `pes_con_prdinsc` (`uuid`),
  CONSTRAINT `FKf37tj2ve4i6ojp8c2hlphnscx` FOREIGN KEY (`pes_con_desempa_id`) REFERENCES `pes_con_desempa` (`uuid`),
  CONSTRAINT `FKh12tkxtsyty6ermril6ylxuw6` FOREIGN KEY (`pes_con_pcd_id`) REFERENCES `pes_con_pcd` (`uuid`),
  CONSTRAINT `FKjcak3s1b2dd0gvy72nlpg7bgy` FOREIGN KEY (`pes_con_cadres_id`) REFERENCES `pes_con_cadres` (`uuid`),
  CONSTRAINT `FKjf7opc3um5i6nsf4d7jl6amco` FOREIGN KEY (`pes_con_aut_ldo_id`) REFERENCES `pes_con_aut_ldo` (`uuid`),
  CONSTRAINT `FKjxjtnvy4h3ogdq6gphg4h6564` FOREIGN KEY (`pes_con_inscr_id`) REFERENCES `pes_con_inscr` (`uuid`),
  CONSTRAINT `FKk5s7pduiywx137yhaymbjhea0` FOREIGN KEY (`pes_con_solcon_id`) REFERENCES `pes_con_solcon` (`uuid`),
  CONSTRAINT `FKl6jr1r4vqyvqjubt10qy8ky1m` FOREIGN KEY (`pes_con_impug_id`) REFERENCES `pes_con_impug` (`uuid`),
  CONSTRAINT `FKsw1jgobnwstp5b48gb314luis` FOREIGN KEY (`pes_con_validad_id`) REFERENCES `pes_con_validad` (`uuid`),
  CONSTRAINT `FKtnt0tq1lprqlh37xmosk5j7cn` FOREIGN KEY (`pes_con_banca_id`) REFERENCES `pes_con_banca` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_psp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_psp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_psp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_solcon
CREATE TABLE IF NOT EXISTS `pes_con_solcon` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_solcon: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_solcon` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_solcon` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_txt
CREATE TABLE IF NOT EXISTS `pes_con_txt` (
  `codigo` binary(16) NOT NULL,
  `pes_con_psp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKqik0pcu0knmhofookkrsegsiq` (`pes_con_psp_id`),
  CONSTRAINT `FKj54kjm7jdb6wfmwa9k61yha7f` FOREIGN KEY (`codigo`) REFERENCES `texto_edital` (`uuid`),
  CONSTRAINT `FKqik0pcu0knmhofookkrsegsiq` FOREIGN KEY (`pes_con_psp_id`) REFERENCES `pes_con_psp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_txt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_txt` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_txt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_vagapcd
CREATE TABLE IF NOT EXISTS `pes_con_vagapcd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `pes_con_pcd_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK7l4vsbt734hahify9cv5mvpyn` (`pes_con_pcd_id`),
  CONSTRAINT `FK7l4vsbt734hahify9cv5mvpyn` FOREIGN KEY (`pes_con_pcd_id`) REFERENCES `pes_con_pcd` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_vagapcd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_vagapcd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_vagapcd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_con_validad
CREATE TABLE IF NOT EXISTS `pes_con_validad` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `eh_prorrogavel` bit(1) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `prazo_de_validade` int(11) NOT NULL,
  `tipo_validade` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_con_validad: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_con_validad` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_con_validad` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_dadosrgps
CREATE TABLE IF NOT EXISTS `pes_dadosrgps` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `aliquotafap` double NOT NULL,
  `aliquotarat` double NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `numerocnae` int(11) NOT NULL,
  `pes_dados_prev_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKkpo66osy28494lxa4g8npw401` (`pes_dados_prev_id`),
  CONSTRAINT `FKkpo66osy28494lxa4g8npw401` FOREIGN KEY (`pes_dados_prev_id`) REFERENCES `pes_dados_prev` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_dadosrgps: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_dadosrgps` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_dadosrgps` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_dadosrpps
CREATE TABLE IF NOT EXISTS `pes_dadosrpps` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `aliquota_contribuicao_patronal` double NOT NULL,
  `aliquota_contribuicao_servidores` double NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_dadosrpps: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_dadosrpps` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_dadosrpps` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_dados_prev
CREATE TABLE IF NOT EXISTS `pes_dados_prev` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_dadosrpps_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKjs1o4e4p2vr8yeu8ckx7rgwy` (`arquivo_id`),
  KEY `FK43c7xg2j54lothcru9j7496my` (`pes_dadosrpps_id`),
  CONSTRAINT `FK43c7xg2j54lothcru9j7496my` FOREIGN KEY (`pes_dadosrpps_id`) REFERENCES `pes_dadosrpps` (`uuid`),
  CONSTRAINT `FKjs1o4e4p2vr8yeu8ckx7rgwy` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_dados_prev: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_dados_prev` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_dados_prev` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_folhapag
CREATE TABLE IF NOT EXISTS `pes_folhapag` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_competencia` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `mes_competencia` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `tipo_unidade_gestora_responsavel_folha` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKh5n00p9bvmt625mr1ixce644p` (`arquivo_id`),
  CONSTRAINT `FKh5n00p9bvmt625mr1ixce644p` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_folhapag: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_folhapag` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_folhapag` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_folhapag_fp
CREATE TABLE IF NOT EXISTS `pes_folhapag_fp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_unidade_gestora` int(11) NOT NULL,
  `numerocpfordenador_despesa` varchar(255) NOT NULL,
  `pes_folhapag_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKgikxy5k1yga9xif97qd11jftf` (`pes_folhapag_id`),
  CONSTRAINT `FKgikxy5k1yga9xif97qd11jftf` FOREIGN KEY (`pes_folhapag_id`) REFERENCES `pes_folhapag` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_folhapag_fp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_folhapag_fp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_folhapag_fp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_folpag_serv
CREATE TABLE IF NOT EXISTS `pes_folpag_serv` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_situacao_funcional_correspondente` int(11) NOT NULL,
  `tipo_situacao_funcional` int(11) NOT NULL,
  `pes_folhapag_fp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKi979afnwvivdcxxwndxmw7v47` (`pes_folhapag_fp_id`),
  CONSTRAINT `FKi979afnwvivdcxxwndxmw7v47` FOREIGN KEY (`pes_folhapag_fp_id`) REFERENCES `pes_folhapag_fp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_folpag_serv: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_folpag_serv` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_folpag_serv` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_descirrf
CREATE TABLE IF NOT EXISTS `pes_fp_descirrf` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_fonte_recursos` int(11) NOT NULL,
  `id_pessoal_concessao_vantagem_desconto` int(11) NOT NULL,
  `valor` double NOT NULL,
  `pes_folpag_serv_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK51n5ckdlaosmss8ik2m0pr50o` (`pes_folpag_serv_id`),
  CONSTRAINT `FK51n5ckdlaosmss8ik2m0pr50o` FOREIGN KEY (`pes_folpag_serv_id`) REFERENCES `pes_folpag_serv` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_descirrf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_descirrf` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_descirrf` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_descprev
CREATE TABLE IF NOT EXISTS `pes_fp_descprev` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_fonte_recursos` int(11) NOT NULL,
  `id_pessoal_concessao_vantagem_desconto` int(11) NOT NULL,
  `valor` double NOT NULL,
  `pes_folpag_serv_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdb5ecx552hin2kwox4pi32yp7` (`pes_folpag_serv_id`),
  CONSTRAINT `FKdb5ecx552hin2kwox4pi32yp7` FOREIGN KEY (`pes_folpag_serv_id`) REFERENCES `pes_folpag_serv` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_descprev: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_descprev` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_descprev` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_banc
CREATE TABLE IF NOT EXISTS `pes_fp_exc_banc` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo_banco_oficial_pagamentos` int(11) NOT NULL,
  `pes_fp_exc_orcm_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK4kg557rq9yb3e0x6yt2kym68k` (`pes_fp_exc_orcm_id`),
  CONSTRAINT `FK4kg557rq9yb3e0x6yt2kym68k` FOREIGN KEY (`pes_fp_exc_orcm_id`) REFERENCES `pes_fp_exc_orcm` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_banc: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_banc` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_banc` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_emp
CREATE TABLE IF NOT EXISTS `pes_fp_exc_emp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_empenho` varchar(255) NOT NULL,
  `numero_empenho` int(11) NOT NULL,
  `valor_empenho` double NOT NULL,
  `pes_fp_exc_orcm_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK4aydqy7et0vhpea0ctse6k306` (`pes_fp_exc_orcm_id`),
  CONSTRAINT `FK4aydqy7et0vhpea0ctse6k306` FOREIGN KEY (`pes_fp_exc_orcm_id`) REFERENCES `pes_fp_exc_orcm` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_emp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_emp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_emp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_liq
CREATE TABLE IF NOT EXISTS `pes_fp_exc_liq` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_liquidacao` varchar(255) NOT NULL,
  `numero_liquidacao` int(11) NOT NULL,
  `valor_liquidacao` double NOT NULL,
  `pes_fp_exc_emp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKcabwmdqeur2xgx4bxsi1f3aqx` (`pes_fp_exc_emp_id`),
  CONSTRAINT `FKcabwmdqeur2xgx4bxsi1f3aqx` FOREIGN KEY (`pes_fp_exc_emp_id`) REFERENCES `pes_fp_exc_emp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_liq: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_liq` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_liq` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_orcm
CREATE TABLE IF NOT EXISTS `pes_fp_exc_orcm` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `id_pessoal_folha_de_pagamento` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKbv1636y252pi5mxd2bjcy2lbi` (`arquivo_id`),
  CONSTRAINT `FKbv1636y252pi5mxd2bjcy2lbi` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_orcm: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_orcm` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_orcm` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_retn
CREATE TABLE IF NOT EXISTS `pes_fp_exc_retn` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `doc_arquivo_retorno` varchar(255) NOT NULL,
  `pes_fp_exc_banc_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK18667ur20lwknoli6k1lr3du` (`pes_fp_exc_banc_id`),
  CONSTRAINT `FK18667ur20lwknoli6k1lr3du` FOREIGN KEY (`pes_fp_exc_banc_id`) REFERENCES `pes_fp_exc_banc` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_retn: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_retn` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_retn` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exc_rms
CREATE TABLE IF NOT EXISTS `pes_fp_exc_rms` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `doc_arquivo_remessa` varchar(255) NOT NULL,
  `pes_fp_exc_banc_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdqvwwbhdy0emorkykwjcfr2b4` (`pes_fp_exc_banc_id`),
  CONSTRAINT `FKdqvwwbhdy0emorkykwjcfr2b4` FOREIGN KEY (`pes_fp_exc_banc_id`) REFERENCES `pes_fp_exc_banc` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exc_rms: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exc_rms` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exc_rms` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_exec_op
CREATE TABLE IF NOT EXISTS `pes_fp_exec_op` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_pagamento` varchar(255) NOT NULL,
  `numeroop` int(11) NOT NULL,
  `valor_pagamento` double NOT NULL,
  `pes_fp_exc_emp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKce00h6ipiksyn41xpbr1h70ct` (`pes_fp_exc_emp_id`),
  CONSTRAINT `FKce00h6ipiksyn41xpbr1h70ct` FOREIGN KEY (`pes_fp_exc_emp_id`) REFERENCES `pes_fp_exc_emp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_exec_op: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_exec_op` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_exec_op` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_fp_remdes
CREATE TABLE IF NOT EXISTS `pes_fp_remdes` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_fonte_recursos` int(11) NOT NULL,
  `id_pessoal_concessao_vantagem_desconto` int(11) NOT NULL,
  `pes_folpag_serv_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK4f5jlvpwt72bsc53jbjvxqxjq` (`pes_folpag_serv_id`),
  CONSTRAINT `FK4f5jlvpwt72bsc53jbjvxqxjq` FOREIGN KEY (`pes_folpag_serv_id`) REFERENCES `pes_folpag_serv` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_fp_remdes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_fp_remdes` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_fp_remdes` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_homl_cargo
CREATE TABLE IF NOT EXISTS `pes_homl_cargo` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_cargo` int(11) NOT NULL,
  `pes_homolog_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKsw1osslxuq6ub2uaty3icf7lk` (`pes_homolog_id`),
  CONSTRAINT `FKsw1osslxuq6ub2uaty3icf7lk` FOREIGN KEY (`pes_homolog_id`) REFERENCES `pes_homolog` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_homl_cargo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_homl_cargo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_homl_cargo` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_homl_lstapr
CREATE TABLE IF NOT EXISTS `pes_homl_lstapr` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero_cpf` varchar(255) NOT NULL,
  `numero_ordem_classificacao` int(11) NOT NULL,
  `tipo_lista_classificacao` int(11) NOT NULL,
  `pes_homl_cargo` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK_CARGO_APROV_ID` (`pes_homl_cargo`),
  CONSTRAINT `FK_CARGO_APROV_ID` FOREIGN KEY (`pes_homl_cargo`) REFERENCES `pes_homl_cargo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_homl_lstapr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_homl_lstapr` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_homl_lstapr` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_homolog
CREATE TABLE IF NOT EXISTS `pes_homolog` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_metodo_selecao_pessoal_utilizado` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_homologacao` varchar(255) NOT NULL,
  `id_procedimento_selecao_pessoal` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK87mgfts3tcykd8xjwhyebjgf` (`arquivo_id`),
  CONSTRAINT `FK87mgfts3tcykd8xjwhyebjgf` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_homolog: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_homolog` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_homolog` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_homolog_pub
CREATE TABLE IF NOT EXISTS `pes_homolog_pub` (
  `url_veiculo_publicacao` varchar(255) NOT NULL,
  `uuid` binary(16) NOT NULL,
  `pes_homolog_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK9us5t0qdfyt9ai9kugb76b5si` (`pes_homolog_id`),
  CONSTRAINT `FK9us5t0qdfyt9ai9kugb76b5si` FOREIGN KEY (`pes_homolog_id`) REFERENCES `pes_homolog` (`uuid`),
  CONSTRAINT `FKe5nbdhxje80rmbjcuq4v7pito` FOREIGN KEY (`uuid`) REFERENCES `publicacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_homolog_pub: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_homolog_pub` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_homolog_pub` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_legislacao
CREATE TABLE IF NOT EXISTS `pes_legislacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_da_norma` int(11) NOT NULL,
  `cod_detalhamento_norma` int(11) NOT NULL,
  `cod_tipo_ente` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_norma` int(11) NOT NULL,
  `data_inicio_efeito_financeiro` varchar(255) DEFAULT NULL,
  `data_publicacao` varchar(255) NOT NULL,
  `ementa_da_norma` varchar(255) NOT NULL,
  `fim_vigencia` varchar(255) DEFAULT NULL,
  `inicio_vigencia` varchar(255) NOT NULL,
  `motivo_retificacao` varchar(255) DEFAULT NULL,
  `numero_da_norma` varchar(255) NOT NULL,
  `pes_reg_outroid_id` binary(16) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_ug_aplicnor_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK3r2qypy5e5chit89at6hndi2n` (`pes_reg_outroid_id`),
  KEY `FK63ketv2sue09hh57xt8awgq6n` (`arquivo_id`),
  KEY `FKakbv9qguiceyty4pf5v5daf0q` (`pes_ug_aplicnor_id`),
  CONSTRAINT `FK3r2qypy5e5chit89at6hndi2n` FOREIGN KEY (`pes_reg_outroid_id`) REFERENCES `pes_reg_outroid` (`uuid`),
  CONSTRAINT `FK63ketv2sue09hh57xt8awgq6n` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKakbv9qguiceyty4pf5v5daf0q` FOREIGN KEY (`pes_ug_aplicnor_id`) REFERENCES `pes_ug_aplicnor` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_legislacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_legislacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_legislacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_lotacao_det
CREATE TABLE IF NOT EXISTS `pes_lotacao_det` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_lotacao` int(11) NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `nome_departamento_setor_lotacao` varchar(255) NOT NULL,
  `nome_local_lotacao` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_lotacao_det: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_lotacao_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_lotacao_det` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_nor_reg
CREATE TABLE IF NOT EXISTS `pes_nor_reg` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `pes_reg_outroid_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKr4cq8b3vxa78r1nk3qtslgm1v` (`pes_reg_outroid_id`),
  CONSTRAINT `FKr4cq8b3vxa78r1nk3qtslgm1v` FOREIGN KEY (`pes_reg_outroid_id`) REFERENCES `pes_reg_outroid` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_nor_reg: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_nor_reg` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_nor_reg` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pensionist
CREATE TABLE IF NOT EXISTS `pes_pensionist` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_pensao` int(11) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `pensionista_anterior2020` bit(1) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_pens_dados_id` binary(16) DEFAULT NULL,
  `pes_pens_p_jud_id` binary(16) DEFAULT NULL,
  `pes_pens_merce_id` binary(16) DEFAULT NULL,
  `pes_pens_p_rpps_id` binary(16) DEFAULT NULL,
  `pes_pens_fin_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKhrvfvbfa30jy5o19w915d2nh5` (`arquivo_id`),
  KEY `FKq3jdw8cqi7u2tfc8nk5ko7pg4` (`pes_pens_dados_id`),
  KEY `FK1urtb3om69ak89e8b4uaprn39` (`pes_pens_p_jud_id`),
  KEY `FKhofsosfc8gjrwxke867lj4ja7` (`pes_pens_merce_id`),
  KEY `FKr3i2odcp3pdr3390ld5c0j9m6` (`pes_pens_p_rpps_id`),
  KEY `FK3hjlcpyd6piy28xuihut8q28t` (`pes_pens_fin_id`),
  CONSTRAINT `FK1urtb3om69ak89e8b4uaprn39` FOREIGN KEY (`pes_pens_p_jud_id`) REFERENCES `pes_pens_p_jud` (`uuid`),
  CONSTRAINT `FK3hjlcpyd6piy28xuihut8q28t` FOREIGN KEY (`pes_pens_fin_id`) REFERENCES `pes_pens_fin` (`uuid`),
  CONSTRAINT `FKhofsosfc8gjrwxke867lj4ja7` FOREIGN KEY (`pes_pens_merce_id`) REFERENCES `pes_pens_merce` (`uuid`),
  CONSTRAINT `FKhrvfvbfa30jy5o19w915d2nh5` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKq3jdw8cqi7u2tfc8nk5ko7pg4` FOREIGN KEY (`pes_pens_dados_id`) REFERENCES `pes_pens_dados` (`uuid`),
  CONSTRAINT `FKr3i2odcp3pdr3390ld5c0j9m6` FOREIGN KEY (`pes_pens_p_rpps_id`) REFERENCES `pes_pens_p_rpps` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pensionist: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pensionist` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pensionist` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_dados
CREATE TABLE IF NOT EXISTS `pes_pens_dados` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_ato_concedeu_pensao` varchar(255) NOT NULL,
  `nome_do_cargo_paradigma_registrado` varchar(255) NOT NULL,
  `numero_acordaotcm` varchar(255) NOT NULL,
  `numero_ato_concedeu_pensao` int(11) NOT NULL,
  `numero_processo_concessao_pensao` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_dados: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_dados` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_dados` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_depent
CREATE TABLE IF NOT EXISTS `pes_pens_depent` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_final_pensao` varchar(255) NOT NULL,
  `dependente_possuifilho` bit(1) NOT NULL,
  `id_cadastro_pessoal` int(11) NOT NULL,
  `tipo_dependente` int(11) NOT NULL,
  `pes_pens_p_rpps_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK2a9h2gjtd4d9ua3ynfwn2ar1u` (`pes_pens_p_rpps_id`),
  CONSTRAINT `FK2a9h2gjtd4d9ua3ynfwn2ar1u` FOREIGN KEY (`pes_pens_p_rpps_id`) REFERENCES `pes_pens_p_rpps` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_depent: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_depent` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_depent` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_doccom
CREATE TABLE IF NOT EXISTS `pes_pens_doccom` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_documentopdf` varchar(255) NOT NULL,
  `tipo_documento_comprobatorio` int(11) NOT NULL,
  `pes_pens_depent_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK96xy30or45g9kr6lgca2k1alq` (`pes_pens_depent_id`),
  CONSTRAINT `FK96xy30or45g9kr6lgca2k1alq` FOREIGN KEY (`pes_pens_depent_id`) REFERENCES `pes_pens_depent` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_doccom: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_doccom` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_doccom` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_fin
CREATE TABLE IF NOT EXISTS `pes_pens_fin` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `percentual_redutor` double DEFAULT NULL,
  `tipo_fixacao_proventos_pensao` int(11) NOT NULL,
  `valor_redutor_provento` double DEFAULT NULL,
  `valor_total_proventos` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_fin: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_fin` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_fin` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_merce
CREATE TABLE IF NOT EXISTS `pes_pens_merce` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_cadastro_pessoal` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `tipo_documento_concessao_pensao_merce` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_merce: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_merce` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_merce` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_p_jud
CREATE TABLE IF NOT EXISTS `pes_pens_p_jud` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `detalhamento_peca_judicial` int(11) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_p_jud: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_p_jud` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_p_jud` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_p_rpps
CREATE TABLE IF NOT EXISTS `pes_pens_p_rpps` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_situacao_funcional_instituidor_correspondente` int(11) NOT NULL,
  `id_vida_funcional_desligamento_inatividade` int(11) NOT NULL,
  `morreu_em_atividade` bit(1) NOT NULL,
  `tipo_situacao_funcional_instituidor` int(11) NOT NULL,
  `pes_pens_req_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKfgm7el8phb5c1692ursfbi433` (`pes_pens_req_id`),
  CONSTRAINT `FKfgm7el8phb5c1692ursfbi433` FOREIGN KEY (`pes_pens_req_id`) REFERENCES `pes_pens_req` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_p_rpps: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_p_rpps` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_p_rpps` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_req
CREATE TABLE IF NOT EXISTS `pes_pens_req` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `certidao_de_publicacao_ou_comprovante` varchar(255) NOT NULL,
  `cod_forma_de_reajuste` int(11) NOT NULL,
  `cod_tipo_ato_administrativo` int(11) NOT NULL,
  `data_ato_administrativo` varchar(255) NOT NULL,
  `data_inicio_efeito_financeiro` varchar(255) NOT NULL,
  `data_publicacao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `numero_ato_administrativo` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_req: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_req` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_req` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_respat
CREATE TABLE IF NOT EXISTS `pes_pens_respat` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero_cpf` varchar(255) NOT NULL,
  `pes_pens_req_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK455vmhq60c25wdns4lf71frnq` (`pes_pens_req_id`),
  CONSTRAINT `FK455vmhq60c25wdns4lf71frnq` FOREIGN KEY (`pes_pens_req_id`) REFERENCES `pes_pens_req` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_respat: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_respat` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_respat` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pens_ultrem
CREATE TABLE IF NOT EXISTS `pes_pens_ultrem` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_concessao_vantagem_desconto` int(11) NOT NULL,
  `pes_pens_fin_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKqtl8i1cs9ddp5fmvv7fa7i8ug` (`pes_pens_fin_id`),
  CONSTRAINT `FKqtl8i1cs9ddp5fmvv7fa7i8ug` FOREIGN KEY (`pes_pens_fin_id`) REFERENCES `pes_pens_fin` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pens_ultrem: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pens_ultrem` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pens_ultrem` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pos_vnct_cr
CREATE TABLE IF NOT EXISTS `pes_pos_vnct_cr` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_classe` int(11) NOT NULL,
  `cod_padrao_nivel` int(11) NOT NULL,
  `data_final` varchar(255) DEFAULT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_cargo` int(11) NOT NULL,
  `valor_vencimento_ou_subsidio` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pos_vnct_cr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pos_vnct_cr` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pos_vnct_cr` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_procselsimp
CREATE TABLE IF NOT EXISTS `pes_procselsimp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_edital` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_edital` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_pss_banca` binary(16) NOT NULL,
  `pes_pss_duracao_id` binary(16) NOT NULL,
  `pes_pss_prd_ins` binary(16) NOT NULL,
  `pes_pss_valid_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK9i1810nqclc1k55fv3v50d4yx` (`arquivo_id`),
  KEY `FKh8mg8147t9o56bopk381lmhso` (`pes_pss_banca`),
  KEY `FK13dtbeij12jbgkmv7jcblow57` (`pes_pss_duracao_id`),
  KEY `FK2dyk54fqkk7r9riiqkmieq67e` (`pes_pss_prd_ins`),
  KEY `FKr6bl8olg9ogumy2e3nqx6sl0n` (`pes_pss_valid_id`),
  CONSTRAINT `FK13dtbeij12jbgkmv7jcblow57` FOREIGN KEY (`pes_pss_duracao_id`) REFERENCES `pes_pss_duracao` (`uuid`),
  CONSTRAINT `FK2dyk54fqkk7r9riiqkmieq67e` FOREIGN KEY (`pes_pss_prd_ins`) REFERENCES `pes_pss_prd_ins` (`uuid`),
  CONSTRAINT `FK9i1810nqclc1k55fv3v50d4yx` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKh8mg8147t9o56bopk381lmhso` FOREIGN KEY (`pes_pss_banca`) REFERENCES `pes_pss_banca` (`uuid`),
  CONSTRAINT `FKr6bl8olg9ogumy2e3nqx6sl0n` FOREIGN KEY (`pes_pss_valid_id`) REFERENCES `pes_pss_valid` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_procselsimp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_procselsimp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_procselsimp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_banca
CREATE TABLE IF NOT EXISTS `pes_pss_banca` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_banca_examinadora` int(11) NOT NULL,
  `id_contrato_original` int(11) DEFAULT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_banca: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_banca` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_banca` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_duracao
CREATE TABLE IF NOT EXISTS `pes_pss_duracao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `prazo_de_duracao` int(11) NOT NULL,
  `tipo_prazo` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_duracao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_duracao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_duracao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_excep
CREATE TABLE IF NOT EXISTS `pes_pss_excep` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `pes_procselsimp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK3yyqha4c44oy2b2fer6vur5pg` (`pes_procselsimp_id`),
  CONSTRAINT `FK3yyqha4c44oy2b2fer6vur5pg` FOREIGN KEY (`pes_procselsimp_id`) REFERENCES `pes_procselsimp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_excep: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_excep` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_excep` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_funcao
CREATE TABLE IF NOT EXISTS `pes_pss_funcao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_cargo` int(11) NOT NULL,
  `qtd_pcd` int(11) NOT NULL,
  `qtd_vagas_ampla_concorrencia` int(11) NOT NULL,
  `qtd_vagas_cadastro_reserva` int(11) NOT NULL,
  `qtd_vagas_cotas` int(11) NOT NULL,
  `requisitos_cargo_edital` varchar(255) NOT NULL,
  `pes_procselsimp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdwuibv2qduptemaviyhvgorbs` (`pes_procselsimp_id`),
  CONSTRAINT `FKdwuibv2qduptemaviyhvgorbs` FOREIGN KEY (`pes_procselsimp_id`) REFERENCES `pes_procselsimp` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_funcao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_funcao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_funcao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_funprov
CREATE TABLE IF NOT EXISTS `pes_pss_funprov` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `tipo_carater_prova` int(11) NOT NULL,
  `pes_pss_funcao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKd6awnmy4slepija4wxr81ky10` (`pes_pss_funcao_id`),
  CONSTRAINT `FKd6awnmy4slepija4wxr81ky10` FOREIGN KEY (`pes_pss_funcao_id`) REFERENCES `pes_pss_funcao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_funprov: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_funprov` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_funprov` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_prd_ins
CREATE TABLE IF NOT EXISTS `pes_pss_prd_ins` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_prd_ins: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_prd_ins` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_prd_ins` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_public
CREATE TABLE IF NOT EXISTS `pes_pss_public` (
  `id` binary(16) NOT NULL,
  `pes_procselsimp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKff2m09p6lvu8n3h115ugb7qv` (`pes_procselsimp_id`),
  CONSTRAINT `FKff2m09p6lvu8n3h115ugb7qv` FOREIGN KEY (`pes_procselsimp_id`) REFERENCES `pes_procselsimp` (`uuid`),
  CONSTRAINT `FKq4uymq14d7krw206fdngilp21` FOREIGN KEY (`id`) REFERENCES `detalhamento_publicidade_extrato_edital` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_public: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_public` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_public` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_txtedit
CREATE TABLE IF NOT EXISTS `pes_pss_txtedit` (
  `codigo` binary(16) NOT NULL,
  `pes_procselsimp_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKpgmw4bta8es13f93ro215fcg6` (`pes_procselsimp_id`),
  CONSTRAINT `FKpgmw4bta8es13f93ro215fcg6` FOREIGN KEY (`pes_procselsimp_id`) REFERENCES `pes_procselsimp` (`uuid`),
  CONSTRAINT `FKqxn76ucdhgvme6q28ybr7tfnj` FOREIGN KEY (`codigo`) REFERENCES `texto_edital` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_txtedit: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_txtedit` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_txtedit` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_pss_valid
CREATE TABLE IF NOT EXISTS `pes_pss_valid` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `eh_prorrogavel` bit(1) NOT NULL,
  `numero_item_do_edital` varchar(255) NOT NULL,
  `prazo_de_validade` int(11) NOT NULL,
  `tipo_validade` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_pss_valid: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_pss_valid` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_pss_valid` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_reg_outroid
CREATE TABLE IF NOT EXISTS `pes_reg_outroid` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `norma_regulamenta_outroidpessoal_legislacao` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_reg_outroid: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_reg_outroid` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_reg_outroid` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_text_norma
CREATE TABLE IF NOT EXISTS `pes_text_norma` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_texto_documento` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `pes_legislacao_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKdh1xmgufsux4j2ksi0r5a2bvb` (`pes_legislacao_id`),
  CONSTRAINT `FKdh1xmgufsux4j2ksi0r5a2bvb` FOREIGN KEY (`pes_legislacao_id`) REFERENCES `pes_legislacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_text_norma: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_text_norma` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_text_norma` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ug_aplicave
CREATE TABLE IF NOT EXISTS `pes_ug_aplicave` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_unidade_gestora` int(11) NOT NULL,
  `pes_ug_aplicnor_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKeb6kiyhgkgtgsf7ic3ny3ovxy` (`pes_ug_aplicnor_id`),
  CONSTRAINT `FKeb6kiyhgkgtgsf7ic3ny3ovxy` FOREIGN KEY (`pes_ug_aplicnor_id`) REFERENCES `pes_ug_aplicnor` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ug_aplicave: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ug_aplicave` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ug_aplicave` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ug_aplicnor
CREATE TABLE IF NOT EXISTS `pes_ug_aplicnor` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `norma_aplicavelatodas_as_unidades_gestoras` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ug_aplicnor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ug_aplicnor` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ug_aplicnor` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_verbas
CREATE TABLE IF NOT EXISTS `pes_verbas` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_categoria_desconto` int(11) DEFAULT NULL,
  `cod_categoria_remuneracao` int(11) DEFAULT NULL,
  `cod_natureza_desconto` int(11) DEFAULT NULL,
  `cod_natureza_remuneracao` int(11) DEFAULT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_verba` int(11) NOT NULL,
  `cod_vinculo_tipo_quadro_cargo` int(11) NOT NULL,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_pessoal_legislacao` int(11) NOT NULL,
  `id_unidade_gestora` int(11) NOT NULL,
  `incidencia_previdenciaria` bit(1) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `nome_verba` varchar(255) NOT NULL,
  `verba_transitoria` bit(1) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_ver_nd_id` binary(16) NOT NULL,
  `pes_ver_formcal_id` binary(16) NOT NULL,
  `pes_ver_vces_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKki7772674y5gydxjj2kqjbtie` (`arquivo_id`),
  KEY `FKkkrfnng49i5ldqifn8onexdu3` (`pes_ver_nd_id`),
  KEY `FKjddf21961ieoiugj8bab5hwq3` (`pes_ver_formcal_id`),
  KEY `FK9rc5kjtv9gt4cgusuch1e16xf` (`pes_ver_vces_id`),
  CONSTRAINT `FK9rc5kjtv9gt4cgusuch1e16xf` FOREIGN KEY (`pes_ver_vces_id`) REFERENCES `pes_ver_vces` (`uuid`),
  CONSTRAINT `FKjddf21961ieoiugj8bab5hwq3` FOREIGN KEY (`pes_ver_formcal_id`) REFERENCES `pes_ver_formcal` (`uuid`),
  CONSTRAINT `FKki7772674y5gydxjj2kqjbtie` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKkkrfnng49i5ldqifn8onexdu3` FOREIGN KEY (`pes_ver_nd_id`) REFERENCES `pes_ver_nd` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_verbas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_verbas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_verbas` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_verb_detvic
CREATE TABLE IF NOT EXISTS `pes_verb_detvic` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pessoal_cargo` int(11) NOT NULL,
  `pes_ver_vces_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK7g4617uar3p24mxy781cfpawh` (`pes_ver_vces_id`),
  CONSTRAINT `FK7g4617uar3p24mxy781cfpawh` FOREIGN KEY (`pes_ver_vces_id`) REFERENCES `pes_ver_vces` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_verb_detvic: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_verb_detvic` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_verb_detvic` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ver_formca2
CREATE TABLE IF NOT EXISTS `pes_ver_formca2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `vl_maximo` double NOT NULL,
  `vl_minimo` double NOT NULL,
  `pes_ver_formcal_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKfghprnfcuhthckbl9iqtb9w0u` (`pes_ver_formcal_id`),
  CONSTRAINT `FKfghprnfcuhthckbl9iqtb9w0u` FOREIGN KEY (`pes_ver_formcal_id`) REFERENCES `pes_ver_formcal` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ver_formca2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ver_formca2` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ver_formca2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ver_formcal
CREATE TABLE IF NOT EXISTS `pes_ver_formcal` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `base_de_calculo_detalhe` double NOT NULL,
  `tipo_base_de_calculo` int(11) NOT NULL,
  `tipo_calculo` int(11) NOT NULL,
  `valor_ou_percentual` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ver_formcal: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ver_formcal` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ver_formcal` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ver_nd
CREATE TABLE IF NOT EXISTS `pes_ver_nd` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_categoria_economica` int(11) NOT NULL,
  `cod_elemento_despesa` int(11) NOT NULL,
  `cod_grupo_natureza_despesa` int(11) NOT NULL,
  `cod_modalidade_aplicacao` int(11) NOT NULL,
  `subelemento` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ver_nd: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ver_nd` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ver_nd` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_ver_vces
CREATE TABLE IF NOT EXISTS `pes_ver_vces` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ha_vinculo_cargo_especifico` bit(1) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_ver_vces: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_ver_vces` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_ver_vces` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_vf_desl_int
CREATE TABLE IF NOT EXISTS `pes_vf_desl_int` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_desligamento_inatividade` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_admissao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKj5ax7vm4njh10sg2bkboss31x` (`arquivo_id`),
  CONSTRAINT `FKj5ax7vm4njh10sg2bkboss31x` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_vf_desl_int: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_vf_desl_int` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_vf_desl_int` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_vf_disp
CREATE TABLE IF NOT EXISTS `pes_vf_disp` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_disposicao` int(11) NOT NULL,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_admissao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_vf_disp_dst` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKo3mny7dpwovobwuf4e1tda6tw` (`arquivo_id`),
  KEY `FKh822jmofiiuhov8x63wdim3bh` (`pes_vf_disp_dst`),
  CONSTRAINT `FKh822jmofiiuhov8x63wdim3bh` FOREIGN KEY (`pes_vf_disp_dst`) REFERENCES `pes_vf_disp_dst` (`uuid`),
  CONSTRAINT `FKo3mny7dpwovobwuf4e1tda6tw` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_vf_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_vf_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_vf_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_vf_disp_dst
CREATE TABLE IF NOT EXISTS `pes_vf_disp_dst` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_esfera_disposicao` int(11) NOT NULL,
  `codibge` varchar(255) NOT NULL,
  `id_unidade_gestora` int(11) DEFAULT NULL,
  `nome_orgao_ou_entidade` varchar(255) NOT NULL,
  `numerocnpj` varchar(255) NOT NULL,
  `tipo_entidade` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_vf_disp_dst: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_vf_disp_dst` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_vf_disp_dst` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_vf_licenca
CREATE TABLE IF NOT EXISTS `pes_vf_licenca` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_licenca` int(11) NOT NULL,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_admissao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKawgyshjvo9qrm4ovc7u1ynu08` (`arquivo_id`),
  CONSTRAINT `FKawgyshjvo9qrm4ovc7u1ynu08` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_vf_licenca: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_vf_licenca` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_vf_licenca` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pes_vf_lotacao
CREATE TABLE IF NOT EXISTS `pes_vf_lotacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `data_final` varchar(255) NOT NULL,
  `data_inicio` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_pessoal_admissao` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `pes_lotacao_det_id` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK1vg9c7oqo8ydl3q4u85axbiqk` (`arquivo_id`),
  KEY `FKfg9s6ll9jfl0nm18xem5ctf91` (`pes_lotacao_det_id`),
  CONSTRAINT `FK1vg9c7oqo8ydl3q4u85axbiqk` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`),
  CONSTRAINT `FKfg9s6ll9jfl0nm18xem5ctf91` FOREIGN KEY (`pes_lotacao_det_id`) REFERENCES `pes_lotacao_det` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pes_vf_lotacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pes_vf_lotacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pes_vf_lotacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.preco_contrat
CREATE TABLE IF NOT EXISTS `preco_contrat` (
  `numero_lote` int(11) NOT NULL,
  `uuid` binary(16) NOT NULL,
  `contratado_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK7f2tgy8jspv74uqfynowi7a8a` (`contratado_ini_id`),
  CONSTRAINT `FK7f2tgy8jspv74uqfynowi7a8a` FOREIGN KEY (`contratado_ini_id`) REFERENCES `contratado_ini` (`uuid`),
  CONSTRAINT `FKqd7ytf0yqhd33shleax8yn68v` FOREIGN KEY (`uuid`) REFERENCES `preco_contratado` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.preco_contrat: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `preco_contrat` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco_contrat` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.preco_contratado
CREATE TABLE IF NOT EXISTS `preco_contratado` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero_item` int(11) NOT NULL,
  `quantidade` double NOT NULL,
  `valor_unitario` double NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.preco_contratado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `preco_contratado` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco_contratado` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.preco_contratado_dispensa
CREATE TABLE IF NOT EXISTS `preco_contratado_dispensa` (
  `id` binary(16) NOT NULL,
  `fornecedor_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdq6t1bw1skiq3ugbtqldoro2f` (`fornecedor_id`),
  CONSTRAINT `FK2lj9u3e9mprmj7xpvy48ufbrs` FOREIGN KEY (`id`) REFERENCES `preco_contratado` (`uuid`),
  CONSTRAINT `FKdq6t1bw1skiq3ugbtqldoro2f` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor_contratado` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.preco_contratado_dispensa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `preco_contratado_dispensa` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco_contratado_dispensa` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.preco_fase2
CREATE TABLE IF NOT EXISTS `preco_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `item_deserto` bit(1) NOT NULL,
  `item_fracassado` bit(1) NOT NULL,
  `numero_item` int(11) NOT NULL,
  `numero_lote` int(11) NOT NULL,
  `valor_unitario` double DEFAULT NULL,
  `resultado_fase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FK2nt95ads2uxip8vdi9lowivvi` (`resultado_fase2_id`),
  CONSTRAINT `FK2nt95ads2uxip8vdi9lowivvi` FOREIGN KEY (`resultado_fase2_id`) REFERENCES `resultado_fase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.preco_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `preco_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.propostas_fase2
CREATE TABLE IF NOT EXISTS `propostas_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `numero_item` int(11) NOT NULL,
  `numero_lote` int(11) NOT NULL,
  `valor_unitario` double NOT NULL,
  `lic_fase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKfbw46euj8hjeo6gerpnouw8b8` (`lic_fase2_id`),
  CONSTRAINT `FKfbw46euj8hjeo6gerpnouw8b8` FOREIGN KEY (`lic_fase2_id`) REFERENCES `lic_fase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.propostas_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `propostas_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `propostas_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.publicacao
CREATE TABLE IF NOT EXISTS `publicacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_veiculo_publicacao` int(11) DEFAULT NULL,
  `data_publicacao` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.publicacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `publicacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `publicacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_adesao
CREATE TABLE IF NOT EXISTS `pub_adesao` (
  `uuid` binary(16) NOT NULL,
  `adesao_reg_prec_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKjvpos81xsouo9w3t0l5pudyt6` (`adesao_reg_prec_id`),
  CONSTRAINT `FKbwptmfv5fyul5vk1m4jqct79k` FOREIGN KEY (`uuid`) REFERENCES `publicacao` (`uuid`),
  CONSTRAINT `FKjvpos81xsouo9w3t0l5pudyt6` FOREIGN KEY (`adesao_reg_prec_id`) REFERENCES `adesao_reg_prec` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_contrat_adt
CREATE TABLE IF NOT EXISTS `pub_contrat_adt` (
  `uuid` binary(16) NOT NULL,
  `contrato_adt_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKa4e1ifob9567lmwm595hunq8m` (`contrato_adt_id`),
  CONSTRAINT `FK3mkqdy4qfh1p0bd7gsthj8onw` FOREIGN KEY (`uuid`) REFERENCES `publicacao` (`uuid`),
  CONSTRAINT `FKa4e1ifob9567lmwm595hunq8m` FOREIGN KEY (`contrato_adt_id`) REFERENCES `contrato_adt` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_contrat_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_contrat_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_contrat_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_contrat_ini
CREATE TABLE IF NOT EXISTS `pub_contrat_ini` (
  `id` binary(16) NOT NULL,
  `contrato_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKngfkxoaobrfv0sbs54w0mkxgf` (`contrato_ini_id`),
  CONSTRAINT `FKd6eosgs5ae4153afo27u8ep8i` FOREIGN KEY (`id`) REFERENCES `publicacao` (`uuid`),
  CONSTRAINT `FKngfkxoaobrfv0sbs54w0mkxgf` FOREIGN KEY (`contrato_ini_id`) REFERENCES `contrato_ini` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_contrat_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_contrat_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_contrat_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_contrat_res
CREATE TABLE IF NOT EXISTS `pub_contrat_res` (
  `id` binary(16) NOT NULL,
  `contrato_resc_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8df1im4pv78wjfcdb8ec9d9di` (`contrato_resc_id`),
  CONSTRAINT `FK8df1im4pv78wjfcdb8ec9d9di` FOREIGN KEY (`contrato_resc_id`) REFERENCES `contrato_resc` (`uuid`),
  CONSTRAINT `FKocnl2tqeesyibmjjo1r2goct3` FOREIGN KEY (`id`) REFERENCES `publicacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_contrat_res: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_contrat_res` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_contrat_res` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_dispensa
CREATE TABLE IF NOT EXISTS `pub_dispensa` (
  `id` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg60o72d54ai6r25tv5ob5u856` (`dispensa_inexig_id`),
  CONSTRAINT `FK74kcy09ghl0fn4eiddk1kkgma` FOREIGN KEY (`id`) REFERENCES `publicacao` (`uuid`),
  CONSTRAINT `FKg60o72d54ai6r25tv5ob5u856` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_dispensa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_dispensa` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_dispensa` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.pub_fase1
CREATE TABLE IF NOT EXISTS `pub_fase1` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjrlq3n3puwoc264ra2c9afeyh` (`licitacaofase1_id`),
  CONSTRAINT `FKaoqa7oxlig333h0i41wjwovw3` FOREIGN KEY (`id`) REFERENCES `publicacao` (`uuid`),
  CONSTRAINT `FKjrlq3n3puwoc264ra2c9afeyh` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.pub_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pub_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `pub_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.quadro_societario
CREATE TABLE IF NOT EXISTS `quadro_societario` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_documento` int(11) NOT NULL,
  `cod_tipo_participacao` int(11) NOT NULL,
  `numero_documento` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.quadro_societario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `quadro_societario` DISABLE KEYS */;
/*!40000 ALTER TABLE `quadro_societario` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.quadro_societario_dispensa
CREATE TABLE IF NOT EXISTS `quadro_societario_dispensa` (
  `id` binary(16) NOT NULL,
  `fornecedor_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3peia13n6stwgvdij04holm5n` (`fornecedor_id`),
  CONSTRAINT `FK29gnvqbjvl7bclgfhgcif6hcu` FOREIGN KEY (`id`) REFERENCES `quadro_societario` (`uuid`),
  CONSTRAINT `FK3peia13n6stwgvdij04holm5n` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor_contratado` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.quadro_societario_dispensa: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `quadro_societario_dispensa` DISABLE KEYS */;
/*!40000 ALTER TABLE `quadro_societario_dispensa` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.quadsoc_adt
CREATE TABLE IF NOT EXISTS `quadsoc_adt` (
  `uuid` binary(16) NOT NULL,
  `contratado_adt_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKbati193wlxe13y03eulcwlxlf` (`contratado_adt_id`),
  CONSTRAINT `FKbati193wlxe13y03eulcwlxlf` FOREIGN KEY (`contratado_adt_id`) REFERENCES `contratado_adt` (`uuid`),
  CONSTRAINT `FKt74hyav40dho05fpuub0us08d` FOREIGN KEY (`uuid`) REFERENCES `quadro_societario` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.quadsoc_adt: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `quadsoc_adt` DISABLE KEYS */;
/*!40000 ALTER TABLE `quadsoc_adt` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.quadsoc_fase2
CREATE TABLE IF NOT EXISTS `quadsoc_fase2` (
  `id` binary(16) NOT NULL,
  `lic_fase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtdupa97i0vrgbdi77grlsdj0m` (`lic_fase2_id`),
  CONSTRAINT `FKdvt0tfjics8d27dhnctd5xa6p` FOREIGN KEY (`id`) REFERENCES `quadro_societario` (`uuid`),
  CONSTRAINT `FKtdupa97i0vrgbdi77grlsdj0m` FOREIGN KEY (`lic_fase2_id`) REFERENCES `lic_fase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.quadsoc_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `quadsoc_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `quadsoc_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.quadsoc_ini
CREATE TABLE IF NOT EXISTS `quadsoc_ini` (
  `uuid` binary(16) NOT NULL,
  `contratado_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKajabxjmb0sp627w704q507j5k` (`contratado_ini_id`),
  CONSTRAINT `FK44xf7davaff4d6yct3kn1nbqk` FOREIGN KEY (`uuid`) REFERENCES `quadro_societario` (`uuid`),
  CONSTRAINT `FKajabxjmb0sp627w704q507j5k` FOREIGN KEY (`contratado_ini_id`) REFERENCES `contratado_ini` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.quadsoc_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `quadsoc_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `quadsoc_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.recorc_adesao
CREATE TABLE IF NOT EXISTS `recorc_adesao` (
  `uuid` binary(16) NOT NULL,
  `adesao_reg_prec_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKhircb2a9tpkk9c2286sdjp4on` (`adesao_reg_prec_id`),
  CONSTRAINT `FKhircb2a9tpkk9c2286sdjp4on` FOREIGN KEY (`adesao_reg_prec_id`) REFERENCES `adesao_reg_prec` (`uuid`),
  CONSTRAINT `FKsxglnmtmdn28rx3aty9b013m5` FOREIGN KEY (`uuid`) REFERENCES `recurso_orcamentario` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.recorc_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `recorc_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `recorc_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.recorc_disp
CREATE TABLE IF NOT EXISTS `recorc_disp` (
  `id` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9nwc2j0no7b7rwuivl5mw1ofo` (`dispensa_inexig_id`),
  CONSTRAINT `FK5qpq5yoptg38meqel7pbdb994` FOREIGN KEY (`id`) REFERENCES `recurso_orcamentario` (`uuid`),
  CONSTRAINT `FK9nwc2j0no7b7rwuivl5mw1ofo` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.recorc_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `recorc_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `recorc_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.recorc_fase1
CREATE TABLE IF NOT EXISTS `recorc_fase1` (
  `id` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKehpr1u4pmj5yoe0k3lksaimgi` (`licitacaofase1_id`),
  CONSTRAINT `FK8ea91ndpvpdl77l1db4sm4dtp` FOREIGN KEY (`id`) REFERENCES `recurso_orcamentario` (`uuid`),
  CONSTRAINT `FKehpr1u4pmj5yoe0k3lksaimgi` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.recorc_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `recorc_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `recorc_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.recurso_orcamentario
CREATE TABLE IF NOT EXISTS `recurso_orcamentario` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_origem_recurso` int(11) NOT NULL,
  `id_convenio` int(11) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.recurso_orcamentario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `recurso_orcamentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `recurso_orcamentario` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.reg_licitacao
CREATE TABLE IF NOT EXISTS `reg_licitacao` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_regulamentacao` int(11) NOT NULL,
  `data_decreto_municipal` varchar(255) DEFAULT NULL,
  `data_publicacao` varchar(255) DEFAULT NULL,
  `existe_regulamentacao_municipal` bit(1) NOT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_decreto_municipal` varchar(255) DEFAULT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  `detalhalc123_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKfo2adotfrp5xiywratwl6a313` (`arquivo_id`),
  KEY `FKdng438p2lxw0w6jhocsy1n1gt` (`detalhalc123_id`),
  CONSTRAINT `FKdng438p2lxw0w6jhocsy1n1gt` FOREIGN KEY (`detalhalc123_id`) REFERENCES `detalhalc123` (`uuid`),
  CONSTRAINT `FKfo2adotfrp5xiywratwl6a313` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.reg_licitacao: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `reg_licitacao` DISABLE KEYS */;
INSERT INTO `reg_licitacao` (`uuid`, `altered_at`, `inserted_at`, `seq`, `cod_tipo_envio`, `cod_tipo_regulamentacao`, `data_decreto_municipal`, `data_publicacao`, `existe_regulamentacao_municipal`, `id_documentopdf`, `motivo_atualizacao_correcao`, `numero_decreto_municipal`, `arquivo_id`, `detalhalc123_id`) VALUES
	(_binary 0x9EC87B91E3C44EA3A787A3BD98ACD73D, '2020-08-10 16:28:01', '2020-08-10 16:28:01', 1, 0, 1, '2020-08-10', '2020-08-18', b'0', NULL, NULL, NULL, _binary 0xE037D12BFD1142FC932125492421C065, NULL);
/*!40000 ALTER TABLE `reg_licitacao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resc_contr_orig
CREATE TABLE IF NOT EXISTS `resc_contr_orig` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `ano_contrato` int(11) DEFAULT NULL,
  `cod_natureza_objeto` int(11) NOT NULL,
  `cod_tipo_procedimento` int(11) NOT NULL,
  `fim_vigencia` varchar(255) DEFAULT NULL,
  `id_documentopdf` varchar(255) DEFAULT NULL,
  `inicio_vigencia` varchar(255) DEFAULT NULL,
  `numero_contrato` varchar(255) DEFAULT NULL,
  `objeto` varchar(255) DEFAULT NULL,
  `valor_contrato` double DEFAULT NULL,
  `resc_cont_licit_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKluev2he86a2fke1kiqsikin08` (`resc_cont_licit_id`),
  CONSTRAINT `FKluev2he86a2fke1kiqsikin08` FOREIGN KEY (`resc_cont_licit_id`) REFERENCES `resc_cont_licit` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resc_contr_orig: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resc_contr_orig` DISABLE KEYS */;
/*!40000 ALTER TABLE `resc_contr_orig` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resc_cont_licit
CREATE TABLE IF NOT EXISTS `resc_cont_licit` (
  `uuid` binary(16) NOT NULL,
  PRIMARY KEY (`uuid`),
  CONSTRAINT `FK29wvmq5lkkgc5hic7uejjp95p` FOREIGN KEY (`uuid`) REFERENCES `licitacao` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resc_cont_licit: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resc_cont_licit` DISABLE KEYS */;
/*!40000 ALTER TABLE `resc_cont_licit` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.responsavel
CREATE TABLE IF NOT EXISTS `responsavel` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_responsabilidade` int(11) NOT NULL,
  `numero_cpf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.responsavel: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `responsavel` DISABLE KEYS */;
/*!40000 ALTER TABLE `responsavel` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resp_adesao
CREATE TABLE IF NOT EXISTS `resp_adesao` (
  `codigo` binary(16) NOT NULL,
  `adesao_reg_prec_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKitbpbn0sofrnuec04ssggd5g1` (`adesao_reg_prec_id`),
  CONSTRAINT `FKbbsr4md30dev58sx8vlghbg0l` FOREIGN KEY (`codigo`) REFERENCES `responsavel` (`uuid`),
  CONSTRAINT `FKitbpbn0sofrnuec04ssggd5g1` FOREIGN KEY (`adesao_reg_prec_id`) REFERENCES `adesao_reg_prec` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resp_adesao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resp_adesao` DISABLE KEYS */;
/*!40000 ALTER TABLE `resp_adesao` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resp_contr_ini
CREATE TABLE IF NOT EXISTS `resp_contr_ini` (
  `codigo` binary(16) NOT NULL,
  `contrato_ini_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK8ctf25oko3h93svatkkgam8nm` (`contrato_ini_id`),
  CONSTRAINT `FK64w52o6hwv4yo96jv5ow3l160` FOREIGN KEY (`codigo`) REFERENCES `responsavel` (`uuid`),
  CONSTRAINT `FK8ctf25oko3h93svatkkgam8nm` FOREIGN KEY (`contrato_ini_id`) REFERENCES `contrato_ini` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resp_contr_ini: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resp_contr_ini` DISABLE KEYS */;
/*!40000 ALTER TABLE `resp_contr_ini` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resp_disp
CREATE TABLE IF NOT EXISTS `resp_disp` (
  `codigo` binary(16) NOT NULL,
  `dispensa_inexig_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FKa3b8fs9mqksx0938e0b0j32js` (`dispensa_inexig_id`),
  CONSTRAINT `FK43aylc35608spo0gqj76r30e` FOREIGN KEY (`codigo`) REFERENCES `responsavel` (`uuid`),
  CONSTRAINT `FKa3b8fs9mqksx0938e0b0j32js` FOREIGN KEY (`dispensa_inexig_id`) REFERENCES `dispensa_inexig` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resp_disp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resp_disp` DISABLE KEYS */;
/*!40000 ALTER TABLE `resp_disp` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resp_fase1
CREATE TABLE IF NOT EXISTS `resp_fase1` (
  `codigo` binary(16) NOT NULL,
  `licitacaofase1_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK11w8twycksjd6oevql9am7rq9` (`licitacaofase1_id`),
  CONSTRAINT `FK11w8twycksjd6oevql9am7rq9` FOREIGN KEY (`licitacaofase1_id`) REFERENCES `licitacaofase1` (`uuid`),
  CONSTRAINT `FK4prgy591kh7jyp1ynk6plarut` FOREIGN KEY (`codigo`) REFERENCES `responsavel` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resp_fase1: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resp_fase1` DISABLE KEYS */;
/*!40000 ALTER TABLE `resp_fase1` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resp_fase2
CREATE TABLE IF NOT EXISTS `resp_fase2` (
  `codigo` binary(16) NOT NULL,
  `licitacaofase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK3es12ra4xa6r1aho3g2af8lyi` (`licitacaofase2_id`),
  CONSTRAINT `FK3es12ra4xa6r1aho3g2af8lyi` FOREIGN KEY (`licitacaofase2_id`) REFERENCES `licitacaofase2` (`uuid`),
  CONSTRAINT `FKc3rovy6deb22cu7cqu4pa32o1` FOREIGN KEY (`codigo`) REFERENCES `responsavel` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resp_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resp_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `resp_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.resultado_fase2
CREATE TABLE IF NOT EXISTS `resultado_fase2` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_documento` int(11) DEFAULT NULL,
  `data_adjudicacao` varchar(255) DEFAULT NULL,
  `data_homologacao` varchar(255) DEFAULT NULL,
  `numero_documento` varchar(255) DEFAULT NULL,
  `licitacaofase2_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKh0b5ynaud2rsm8vmvitig443x` (`licitacaofase2_id`),
  CONSTRAINT `FKh0b5ynaud2rsm8vmvitig443x` FOREIGN KEY (`licitacaofase2_id`) REFERENCES `licitacaofase2` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.resultado_fase2: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `resultado_fase2` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultado_fase2` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.situacao_proced
CREATE TABLE IF NOT EXISTS `situacao_proced` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_envio` int(11) NOT NULL,
  `cod_tipo_procedimento_ou_contrato` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  `id_procedimento_ou_contrato` int(11) NOT NULL,
  `motivo_atualizacao_correcao` varchar(255) DEFAULT NULL,
  `numero_processotcm` varchar(255) DEFAULT NULL,
  `tipo_de_situacao` int(11) NOT NULL,
  `arquivo_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`),
  KEY `FKkm272xnss67v284b6x1570cpd` (`arquivo_id`),
  CONSTRAINT `FKkm272xnss67v284b6x1570cpd` FOREIGN KEY (`arquivo_id`) REFERENCES `arquivo` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.situacao_proced: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `situacao_proced` DISABLE KEYS */;
/*!40000 ALTER TABLE `situacao_proced` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.texto_edital
CREATE TABLE IF NOT EXISTS `texto_edital` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `cod_tipo_edital_anexos` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `id_documentopdf` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.texto_edital: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `texto_edital` DISABLE KEYS */;
/*!40000 ALTER TABLE `texto_edital` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.tipo_dominio
CREATE TABLE IF NOT EXISTS `tipo_dominio` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome_tipo_dominio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.tipo_dominio: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_dominio` DISABLE KEYS */;
INSERT INTO `tipo_dominio` (`uuid`, `altered_at`, `inserted_at`, `seq`, `nome_tipo_dominio`) VALUES
	(_binary 0x1861BD50116F4DAC8FC3707DD1B26F61, '2020-08-10 16:24:53', '2020-08-10 16:24:53', 1, 'Tipo de envio de registro'),
	(_binary 0x4BFB4D39FB0948AFAB91E6BDA9A5F223, '2020-08-10 16:27:42', '2020-08-10 16:27:42', 2, 'Tipo de decreto regulamentador');
/*!40000 ALTER TABLE `tipo_dominio` ENABLE KEYS */;

-- Copiando estrutura para tabela colare.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `uuid` binary(16) NOT NULL,
  `altered_at` datetime DEFAULT NULL,
  `inserted_at` datetime DEFAULT NULL,
  `seq` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela colare.usuario: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`uuid`, `altered_at`, `inserted_at`, `seq`, `email`, `nome`, `password`, `sobrenome`) VALUES
	(_binary 0xA988C2D909DA4E52894934F727B3065B, NULL, NULL, 1, 'douglas.janerson@gmail.com', 'Janerson Douglas', '$2a$10$KuLE0V.oSuTSpTZ.qp2ggOpEgM.XPcomdJaMa3anwXAdGSV7xDM3.', 'dos Santos');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.20 - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para serviciotecnico
CREATE DATABASE IF NOT EXISTS `serviciotecnico` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `serviciotecnico`;


-- Volcando estructura para tabla serviciotecnico.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `cc_cliente` varchar(50) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(10) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `ocupacion` varchar(45) NOT NULL,
  PRIMARY KEY (`cc_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.cliente: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`cc_cliente`, `nombre`, `apellido`, `telefono`, `celular`, `email`, `ocupacion`) VALUES
	('1117513159', 'OSWALDO', 'PAMO LEAL', '3134692120', '3134692120', 'OSWALDPALE@HOTMAIL.COM', 'DESEMPLEADO'),
	('116504939', 'CARLOS', 'garzon', '333333', '3333333', 'oswaldpale@gmail.com', 'DESOCUPADO');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.mantenimiento_piezas
CREATE TABLE IF NOT EXISTS `mantenimiento_piezas` (
  `id_reporte_mantenimiento` int(11) NOT NULL AUTO_INCREMENT,
  `pruebas_realizadas` text NOT NULL,
  `cambio_de_parte` text NOT NULL,
  `reporte_final` text NOT NULL,
  `recomendaciones` text NOT NULL,
  `estado` enum('A','I') NOT NULL,
  `valor_servicio` int(11) NOT NULL,
  `fecha_revision` varchar(45) DEFAULT NULL,
  `valoracion_producto_id_cliente_tecnico` int(11) NOT NULL,
  PRIMARY KEY (`id_reporte_mantenimiento`),
  KEY `fk_mantenimiento_piezas_valoracion_producto1` (`valoracion_producto_id_cliente_tecnico`),
  CONSTRAINT `FK_mantenimiento_piezas_valoracion_producto` FOREIGN KEY (`valoracion_producto_id_cliente_tecnico`) REFERENCES `valoracion_producto` (`id_cliente_tecnico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.mantenimiento_piezas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `mantenimiento_piezas` DISABLE KEYS */;
/*!40000 ALTER TABLE `mantenimiento_piezas` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.marca
CREATE TABLE IF NOT EXISTS `marca` (
  `idmarca` int(11) NOT NULL AUTO_INCREMENT,
  `nombremarca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idmarca`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.marca: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`idmarca`, `nombremarca`) VALUES
	(1, 'ASUS');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_equipo` int(11) NOT NULL,
  `idmarca` int(11) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `n_serie` varchar(50) NOT NULL,
  PRIMARY KEY (`idproducto`),
  UNIQUE KEY `n_serie_UNIQUE` (`n_serie`),
  KEY `FK_producto_tipoequipo` (`id_tipo_equipo`),
  KEY `FK_producto_marca` (`idmarca`),
  CONSTRAINT `FK_producto_marca` FOREIGN KEY (`idmarca`) REFERENCES `marca` (`idmarca`),
  CONSTRAINT `FK_producto_tipoequipo` FOREIGN KEY (`id_tipo_equipo`) REFERENCES `tipoequipo` (`idtipoequipo`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.producto: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`idproducto`, `id_tipo_equipo`, `idmarca`, `modelo`, `n_serie`) VALUES
	(32, 1, 1, '4545', '3434'),
	(33, 1, 1, '3434', '34343'),
	(34, 1, 1, '434', '2323');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.tecnico
CREATE TABLE IF NOT EXISTS `tecnico` (
  `cc_tecnico` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`cc_tecnico`),
  UNIQUE KEY `Usuario` (`Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.tecnico: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tecnico` DISABLE KEYS */;
INSERT INTO `tecnico` (`cc_tecnico`, `nombre`, `Usuario`, `contrasena`, `apellido`, `celular`, `email`) VALUES
	(123, 'SERGIO', 'MARIN', 'MARIN', 'MARIN', '3423\'043490', 'SERGIO@HOTMAIL.COM');
/*!40000 ALTER TABLE `tecnico` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.tipoequipo
CREATE TABLE IF NOT EXISTS `tipoequipo` (
  `idtipoequipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEquipo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idtipoequipo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.tipoequipo: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tipoequipo` DISABLE KEYS */;
INSERT INTO `tipoequipo` (`idtipoequipo`, `nombreEquipo`) VALUES
	(1, 'PORTATIL');
/*!40000 ALTER TABLE `tipoequipo` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.tiposervicio
CREATE TABLE IF NOT EXISTS `tiposervicio` (
  `idservicio` int(11) NOT NULL AUTO_INCREMENT,
  `NombreServicio` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idservicio`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.tiposervicio: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tiposervicio` DISABLE KEYS */;
INSERT INTO `tiposervicio` (`idservicio`, `NombreServicio`) VALUES
	(1, 'FORMATEO');
/*!40000 ALTER TABLE `tiposervicio` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.tiposistemaoperativo
CREATE TABLE IF NOT EXISTS `tiposistemaoperativo` (
  `idsistema` int(11) NOT NULL AUTO_INCREMENT,
  `nombreSistema` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idsistema`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.tiposistemaoperativo: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `tiposistemaoperativo` DISABLE KEYS */;
INSERT INTO `tiposistemaoperativo` (`idsistema`, `nombreSistema`) VALUES
	(1, ''),
	(2, 'WINDOW 7'),
	(3, 'WINDOW 8'),
	(4, 'WINDOW 10');
/*!40000 ALTER TABLE `tiposistemaoperativo` ENABLE KEYS */;


-- Volcando estructura para tabla serviciotecnico.valoracion_producto
CREATE TABLE IF NOT EXISTS `valoracion_producto` (
  `id_cliente_tecnico` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_ingreso` date DEFAULT NULL,
  `id_tipo_servicio` int(11) NOT NULL,
  `id_sistema_operativo` int(11) NOT NULL,
  `diagnostico_inicial` varchar(45) NOT NULL,
  `valor_total` int(11) NOT NULL DEFAULT '0',
  `productoid` int(11) NOT NULL,
  `Cliente_cc_cliente` varchar(50) NOT NULL,
  `tecnico_cc_tecnico` int(11) NOT NULL,
  `estado` enum('entregado','pendiente','revisado') NOT NULL,
  `fecha_revision` date DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `confirmacion_cliente` enum('si','no') NOT NULL,
  `fecha_confirmacion_cliente` date DEFAULT NULL,
  `estado_producto` enum('A','I') DEFAULT NULL,
  PRIMARY KEY (`id_cliente_tecnico`),
  KEY `fk_Cliente_has_tecnico_tecnico1` (`tecnico_cc_tecnico`),
  KEY `fk_historial_cliente_tecnico_producto1` (`productoid`),
  KEY `FK_valoracion_producto_tiposervicio` (`id_tipo_servicio`),
  KEY `FK_valoracion_producto_tiposistemaoperativo` (`id_sistema_operativo`),
  KEY `fk_Cliente_Valoracion` (`Cliente_cc_cliente`),
  CONSTRAINT `FK_valoracion_producto_cliente` FOREIGN KEY (`Cliente_cc_cliente`) REFERENCES `cliente` (`cc_cliente`),
  CONSTRAINT `FK_valoracion_producto_producto` FOREIGN KEY (`productoid`) REFERENCES `producto` (`idproducto`),
  CONSTRAINT `FK_valoracion_producto_tecnico` FOREIGN KEY (`tecnico_cc_tecnico`) REFERENCES `tecnico` (`cc_tecnico`),
  CONSTRAINT `FK_valoracion_producto_tiposervicio` FOREIGN KEY (`id_tipo_servicio`) REFERENCES `tiposervicio` (`idservicio`),
  CONSTRAINT `FK_valoracion_producto_tiposistemaoperativo` FOREIGN KEY (`id_sistema_operativo`) REFERENCES `tiposistemaoperativo` (`idsistema`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla serviciotecnico.valoracion_producto: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `valoracion_producto` DISABLE KEYS */;
INSERT INTO `valoracion_producto` (`id_cliente_tecnico`, `fecha_ingreso`, `id_tipo_servicio`, `id_sistema_operativo`, `diagnostico_inicial`, `valor_total`, `productoid`, `Cliente_cc_cliente`, `tecnico_cc_tecnico`, `estado`, `fecha_revision`, `fecha_entrega`, `confirmacion_cliente`, `fecha_confirmacion_cliente`, `estado_producto`) VALUES
	(1, '2016-09-18', 1, 2, 'erere', 0, 32, '1117513159', 123, 'entregado', NULL, NULL, 'si', NULL, 'A'),
	(2, '2016-09-18', 1, 2, 'erere', 0, 32, '1117513159', 123, 'entregado', NULL, NULL, 'si', NULL, 'A'),
	(3, '2016-09-19', 1, 3, 'VIRUS ', 0, 33, '1117513159', 123, 'entregado', NULL, NULL, 'si', NULL, 'A'),
	(4, '2016-09-19', 1, 2, 'SFDDFD', 0, 32, '1117513159', 123, 'entregado', NULL, NULL, 'si', NULL, 'A');
/*!40000 ALTER TABLE `valoracion_producto` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- MariaDB dump 10.17  Distrib 10.4.13-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: coronavirusUY
-- ------------------------------------------------------
-- Server version	10.4.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Tareas`
--

DROP TABLE IF EXISTS `Tareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tareas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) NOT NULL,
  `descripcion` varchar(200) NOT NULL DEFAULT 'Sin descripcion',
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `prioridad` enum('Alta','Baja','Normal') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tareas`
--

LOCK TABLES `Tareas` WRITE;
/*!40000 ALTER TABLE `Tareas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tareas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario_Tareas`
--

DROP TABLE IF EXISTS `Usuario_Tareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario_Tareas` (
  `nombreUsuario` varchar(255) NOT NULL,
  `idTarea` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`nombreUsuario`,`idTarea`),
  KEY `idTarea` (`idTarea`),
  CONSTRAINT `Usuario_Tareas_ibfk_1` FOREIGN KEY (`nombreUsuario`) REFERENCES `usuarios` (`nombre`),
  CONSTRAINT `Usuario_Tareas_ibfk_2` FOREIGN KEY (`idTarea`) REFERENCES `Tareas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario_Tareas`
--

LOCK TABLES `Usuario_Tareas` WRITE;
/*!40000 ALTER TABLE `Usuario_Tareas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuario_Tareas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datosUruguay`
--

DROP TABLE IF EXISTS `datosUruguay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datosUruguay` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `confirmados` int(10) unsigned NOT NULL,
  `recuperados` int(10) unsigned NOT NULL,
  `muertes` int(10) unsigned NOT NULL,
  `cursandoEnf` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosUruguay`
--

LOCK TABLES `datosUruguay` WRITE;
/*!40000 ALTER TABLE `datosUruguay` DISABLE KEYS */;
INSERT INTO `datosUruguay` VALUES (1,'2020-08-07',1325,1095,37,193);
/*!40000 ALTER TABLE `datosUruguay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `nombre` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tareasSuperpuestas` bit(1) DEFAULT NULL,
  `nombrePersona` varchar(255) NOT NULL,
  `apellidoPersona` varchar(255) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('jparrilla','joaquin10','','Joaquín','Parrilla'),('pedroalfonso12','alfonsoxd777',NULL,'','');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-03 21:52:27

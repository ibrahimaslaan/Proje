CREATE DATABASE  IF NOT EXISTS `aslanrestoran` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `aslanrestoran`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: aslanrestoran
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `musteri`
--

DROP TABLE IF EXISTS `musteri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `musteri` (
  `idmusteri` int NOT NULL,
  `musteri_ad` varchar(45) DEFAULT NULL,
  `musteri_soyad` varchar(45) DEFAULT NULL,
  `musteri_telNo` varchar(11) DEFAULT NULL,
  `musteri_yas` int DEFAULT NULL,
  `musteri_kayıtTarih` varchar(45) DEFAULT NULL,
  `musteri_adres` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idmusteri`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `musteri`
--

LOCK TABLES `musteri` WRITE;
/*!40000 ALTER TABLE `musteri` DISABLE KEYS */;
INSERT INTO `musteri` VALUES (1,'Salim','Derviş','05354568545',24,'03.04.2019','meriç cad. hilal mah. no :88 merkez'),(2,'Nurullah','Kartal','05314567812',35,'08.02.2020','ustun mah. siyam sok. no 78: d:13 yakacık'),(3,'Durak','Alparslan','5641234512',34,'18.04.2020','meriç cad. hilal mah. no :83 d:5');
/*!40000 ALTER TABLE `musteri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `siparisler`
--

DROP TABLE IF EXISTS `siparisler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `siparisler` (
  `idSiparis` int NOT NULL,
  `siparis_tarih` varchar(45) DEFAULT NULL,
  `siparis_yemekler` varchar(90) DEFAULT NULL,
  `siparis_adres` varchar(45) DEFAULT NULL,
  `siparis_kisi` varchar(45) DEFAULT NULL,
  `musteri_id` int DEFAULT NULL,
  PRIMARY KEY (`idSiparis`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siparisler`
--

LOCK TABLES `siparisler` WRITE;
/*!40000 ALTER TABLE `siparisler` DISABLE KEYS */;
INSERT INTO `siparisler` VALUES (1,'14.04.2020','Hamburger','ustun mah. siyam sok. no 78: d:13 yakacık','Nurullah',2),(2,'09.11.2019','Kıymalı Pide','meriç cad. hilal mah. no :88 merkez','Salim',1),(3,'19.04.2020','Mantı','meriç cad. hilal mah. no :83 d:5','Durak',3);
/*!40000 ALTER TABLE `siparisler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yemekler`
--

DROP TABLE IF EXISTS `yemekler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `yemekler` (
  `idyemekler` int NOT NULL,
  `yemek_ad` varchar(45) DEFAULT NULL,
  `yemek_fiyat` int DEFAULT NULL,
  `yemek_icindekiler` varchar(45) DEFAULT NULL,
  `yemek_adet` int DEFAULT NULL,
  PRIMARY KEY (`idyemekler`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yemekler`
--

LOCK TABLES `yemekler` WRITE;
/*!40000 ALTER TABLE `yemekler` DISABLE KEYS */;
INSERT INTO `yemekler` VALUES (1,'Kabak Dolması',15,'kabak,pirinç,salça,kıyma',3),(2,'Adana Dürüm',20,'kıyma,soğan,acı biber,baharat',1),(3,'Urfa Dürüm',20,'kıyma,soğan,acı biber,baharat',1),(4,'İskender',25,'dana et,ekmek,biber,yoğurt',1),(5,'Lahmacun',8,'kıyma,domates,soğan,baharat',1),(6,'Beyti',35,'kıyma,domates,soğan,baharat,yoğurt',1),(7,'Hamburger',35,'Patates ,turşu,dana et, soğan',1),(8,'Kuş Başı Pide',15,'Kuş başı et, soğan,domates',1),(9,'Kıymalı  Başı Pide',13,'kıyma dana et, soğan,domates',1),(10,'Kaşarlı  Pide',10,'kaşar,tereyağı,domates',1),(11,'Sucuklu Pide',10,'sucuk, soğan,domates',1),(12,'Mercimek Çorbası',6,'mercimek,baharat, su',1),(13,'Yayla Çorbası',6,'yoğurt,su,kıyma,bakliyat',1),(14,'Arpa Şehriye  Çorbası',6,'su,salça,arpa şehriye',1),(15,'Kelle Paça Çorbası',15,'kelle,ayak,biber',1),(16,'Su',1,'Su',1),(17,'Kola',5,NULL,1),(18,'Künefe',13,'antep fıstık,peynir,kadayıf',1),(19,'Sütlaç',8,'pirinc,süt,şeker,nişasta',1),(20,'Mantı',13,'soğan,kıyma,yoğurt,hamur',1),(21,'Sarma',15,'pirinç,yaprak,kıyma,salça',5),(22,'Testi Kebabı',34,'dana et,soğan,domates,acı biber',1),(23,'Sucuk Ekmek',10,'sucuk,soğan,kaşar,domates',1);
/*!40000 ALTER TABLE `yemekler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'aslanrestoran'
--

--
-- Dumping routines for database 'aslanrestoran'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-19 19:47:43

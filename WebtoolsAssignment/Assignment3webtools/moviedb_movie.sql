-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: moviedb
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie` (
  `title` varchar(10) NOT NULL DEFAULT '',
  `Actor` varchar(6) NOT NULL DEFAULT '',
  `Actresses` varchar(6) NOT NULL DEFAULT '',
  `Genere` varchar(6) NOT NULL DEFAULT '',
  `Year` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES ('Run','Abhi','Aisha','Comedy',2002),('DDLJ','SRK','Kajol','Romn',1993),('q','q','q','i',1200),('w','w','w','w',12),('t','u','u','u',12),('u','u','r','y',12),('h','h','h','h',5674),('q','dhaval','f','h',2015),('ddlj','srk','kajol','roman',1990),('ty','tyt','yt','yt',45),('yu','yu','yu','yu',1200),('hj','hj','hjh','jhj',1),('io','io','io','i',6756),('ddlj','dhaval','hjh','roman',2012),('t','yu','uy','u',2008),('<67>','a','hj','ui',2001),('<as>','a','f','f',2001),('<67>','a','a','a',1200),('<67>','a','f','f',2001),('<670>','dhaval','f','a',2015),('null','dhaval','a','a',2001),('null','a','a','a',1200),('null','a','a','f',1200),('<670>','a','hj','f',1278),('<@rtuy','dwu','bh','b',1234),('<@rtuy','a','bh','b',1234),('rtuy','a','bh','b',2012),('670','a','hhh','b',1200);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-13 21:37:39

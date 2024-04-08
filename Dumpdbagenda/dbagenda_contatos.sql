-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: dbagenda
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `contatos`
--

DROP TABLE IF EXISTS `contatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contatos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `fone` varchar(20) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contatos`
--

LOCK TABLES `contatos` WRITE;
/*!40000 ALTER TABLE `contatos` DISABLE KEYS */;
INSERT INTO `contatos` VALUES (6,'James','14998685703','james@gmail.com'),(7,'Kauan','998187892','kaua@gmail.com'),(8,'Iman Zuhrah','14981161844','iman@gmail.com'),(11,'Jonathan','14996271873','jonathan@gmail.com'),(12,'Marcio','14998454202','marcio@gmail.com'),(13,'Evelyn','11995758331','evelyn@gmail.com'),(14,'Manuela','14991720364','manuela@gmail.com'),(30,'João','11998260001','joao1@gmail.com'),(31,'Maria','11998260002','maria2@hotmail.com'),(33,'Ana','11998260004','ana4@outlook.com'),(34,'Lucas','11998260005','lucas5@gmail.com'),(36,'Carlos','11998260007','carlos7@yahoo.com'),(37,'Paula','11998260008','paula8@outlook.com'),(38,'Fernando','11998260009','fernando9@gmail.com'),(39,'Mariana','11998260010','mariana10@hotmail.com'),(40,'João','11998260011','joao11@yahoo.com'),(41,'Maria','11998260012','maria12@outlook.com'),(42,'Pedro','11998260013','pedro13@gmail.com'),(43,'Ana','11998260014','ana14@hotmail.com'),(44,'Lucas','11998260015','lucas15@yahoo.com'),(45,'Juliana','11998260016','juliana16@outlook.com'),(46,'Carlos','11998260017','carlos17@gmail.com'),(47,'Paula','11998260018','paula18@hotmail.com'),(48,'Fernando','11998260019','fernando19@yahoo.com'),(49,'Mariana','11998260020','mariana20@outlook.com'),(50,'João','11998260201','joao201@gmail.com'),(51,'Maria','11998260202','maria202@hotmail.com'),(52,'Pedro','11998260203','pedro203@yahoo.com'),(53,'Ana','11998260204','ana204@outlook.com'),(54,'Lucas','11998260205','lucas205@gmail.com'),(55,'Juliana','11998260206','juliana206@hotmail.com'),(56,'Carlos','11998260207','carlos207@yahoo.com'),(57,'Paula','11998260208','paula208@outlook.com'),(58,'Fernando','11998260209','fernando209@gmail.com'),(59,'Mariana','11998260210','mariana210@hotmail.com'),(60,'João','11998260211','joao211@gmail.com'),(61,'Maria','11998260212','maria212@hotmail.com'),(62,'Pedro','11998260213','pedro213@yahoo.com'),(63,'Ana','11998260214','ana214@outlook.com'),(64,'Lucas','11998260215','lucas215@gmail.com'),(65,'Juliana','11998260216','juliana216@hotmail.com'),(66,'Carlos','11998260217','carlos217@yahoo.com'),(67,'Paula','11998260218','paula218@outlook.com'),(68,'Fernando','11998260219','fernando219@gmail.com'),(69,'Mariana','11998260220','mariana220@hotmail.com'),(70,'João','11998260221','joao221@yahoo.com'),(71,'Maria','11998260222','maria222@outlook.com'),(72,'Pedro','11998260223','pedro223@gmail.com'),(73,'Ana','11998260224','ana224@hotmail.com'),(74,'Lucas','11998260225','lucas225@yahoo.com'),(75,'Juliana','11998260226','juliana226@outlook.com'),(76,'Carlos','11998260227','carlos227@gmail.com'),(77,'Paula','11998260228','paula228@hotmail.com'),(78,'Fernando','11998260229','fernando229@yahoo.com'),(79,'Mariana','11998260230','mariana230@outlook.com'),(80,'João','11998260231','joao231@gmail.com'),(81,'Maria','11998260232','maria232@hotmail.com'),(82,'Pedro','11998260233','pedro233@yahoo.com'),(83,'Ana','11998260234','ana234@outlook.com'),(84,'Lucas','11998260235','lucas235@gmail.com'),(85,'Juliana','11998260236','juliana236@hotmail.com'),(86,'Carlos','11998260237','carlos237@yahoo.com'),(87,'Paula','11998260238','paula238@outlook.com'),(88,'Fernando','11998260239','fernando239@gmail.com'),(89,'Mariana','11998260240','mariana240@hotmail.com'),(90,'João','11998260241','joao241@yahoo.com'),(91,'Maria','11998260242','maria242@outlook.com'),(92,'Pedro','11998260243','pedro243@gmail.com'),(93,'Ana','11998260244','ana244@hotmail.com'),(94,'Lucas','11998260245','lucas245@yahoo.com'),(95,'Juliana','11998260246','juliana246@outlook.com'),(96,'Carlos','11998260247','carlos247@gmail.com'),(97,'Paula','11998260248','paula248@hotmail.com'),(98,'Fernando','11998260249','fernando249@yahoo.com'),(99,'Mariana','11998260250','mariana250@outlook.com'),(100,'João','11998260251','joao251@gmail.com'),(101,'Maria','11998260252','maria252@hotmail.com'),(102,'Pedro','11998260253','pedro253@yahoo.com'),(103,'Ana','11998260254','ana254@outlook.com'),(104,'Lucas','11998260255','lucas255@gmail.com'),(105,'Juliana','11998260256','juliana256@hotmail.com'),(106,'Carlos','11998260257','carlos257@yahoo.com'),(107,'Paula','11998260258','paula258@outlook.com'),(108,'Fernando','11998260259','fernando259@gmail.com'),(109,'Mariana','11998260260','mariana260@hotmail.com'),(110,'João','11998260261','joao261@yahoo.com'),(111,'Maria','11998260262','maria262@outlook.com'),(112,'Pedro','11998260263','pedro263@gmail.com'),(113,'Ana','11998260264','ana264@hotmail.com'),(114,'Lucas','11998260265','lucas265@yahoo.com'),(115,'Juliana','11998260266','juliana266@outlook.com'),(116,'Carlos','11998260267','carlos267@gmail.com'),(117,'Paula','11998260268','paula268@hotmail.com'),(118,'Fernando','11998260269','fernando269@yahoo.com'),(119,'Mariana','11998260270','mariana270@outlook.com'),(120,'João','11998260271','joao271@gmail.com'),(121,'Maria','11998260272','maria272@hotmail.com'),(122,'Pedro','11998260273','pedro273@yahoo.com'),(123,'Ana','11998260274','ana274@outlook.com'),(124,'Lucas','11998260275','lucas275@gmail.com'),(125,'Juliana','11998260276','juliana276@hotmail.com'),(126,'Carlos','11998260277','carlos277@yahoo.com'),(127,'Paula','11998260278','paula278@outlook.com'),(128,'Fernando','11998260279','fernando279@gmail.com'),(129,'Mariana','11998260280','mariana280@hotmail.com'),(130,'João','11998260281','joao281@yahoo.com'),(131,'Maria','11998260282','maria282@outlook.com'),(132,'Pedro','11998260283','pedro283@gmail.com'),(133,'Ana','11998260284','ana284@hotmail.com'),(134,'Lucas','11998260285','lucas285@yahoo.com'),(135,'Juliana','11998260286','juliana286@outlook.com'),(136,'Carlos','11998260287','carlos287@gmail.com'),(137,'Paula','11998260288','paula288@hotmail.com'),(138,'Fernando','11998260289','fernando289@yahoo.com'),(139,'Mariana','11998260290','mariana290@outlook.com'),(140,'João','11998260291','joao291@gmail.com'),(141,'Maria','11998260292','maria292@hotmail.com'),(142,'Pedro','11998260293','pedro293@yahoo.com'),(143,'Ana','11998260294','ana294@outlook.com'),(144,'Lucas','11998260295','lucas295@gmail.com'),(145,'Juliana','11998260296','juliana296@hotmail.com'),(146,'Carlos','11998260297','carlos297@yahoo.com'),(147,'Paula','11998260298','paula298@outlook.com'),(148,'Fernando','11998260299','fernando299@gmail.com'),(149,'Mariana','11998260300','mariana300@hotmail.com'),(150,'arara','rara','rara');
/*!40000 ALTER TABLE `contatos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-08 14:19:34

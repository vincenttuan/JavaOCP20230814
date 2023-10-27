-- MySQL dump 10.13  Distrib 8.0.11, for macos10.13 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `branches`
--

DROP TABLE IF EXISTS `branches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `branches` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_branch_city` (`city_id`),
  CONSTRAINT `fk_branch_city` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branches`
--

LOCK TABLES `branches` WRITE;
/*!40000 ALTER TABLE `branches` DISABLE KEYS */;
INSERT INTO `branches` VALUES (1,'信義分店',1),(2,'大安分店',1),(3,'左營分店',6),(4,'西區分店',4),(5,'鳳山分店',6),(6,'中壢分店',2),(7,'東區分店',3),(8,'安平分店',5),(9,'北區分店',4),(10,'南區分店',4),(11,'士林分店',1),(12,'北區分店',3),(13,'蘆竹分店',2),(14,'東區分店',5),(15,'鼓山分店',6),(16,'中區分店',4),(17,'大同分店',1),(18,'香山分店',3),(19,'松山分店',1),(20,'平鎮分店',2),(21,'中西分店',5),(22,'前鎮分店',6),(23,'南屯分店',4),(24,'中山分店',1),(25,'楊梅分店',2),(26,'安南分店',5),(27,'苓雅分店',6),(28,'北屯分店',4),(29,'文山分店',1),(30,'龍潭分店',2),(31,'北區分店',5),(32,'三民分店',6),(33,'西屯分店',4),(34,'南港分店',1),(35,'八德分店',2),(36,'仁德分店',5),(37,'新興分店',6),(38,'東勢分店',4),(39,'湖口分店',3),(40,'萬華分店',1),(41,'桃園分店',2),(42,'永康分店',5),(43,'楠梓分店',6),(44,'大甲分店',4),(45,'竹北分店',3),(46,'北門分店',5),(47,'竹南分店',3),(48,'岡山分店',6),(49,'新豐分店',3),(50,'內湖分店',1),(51,'大溪分店',2),(52,'南區分店',5),(53,'中正分店',1);
/*!40000 ALTER TABLE `branches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (4,'台中'),(1,'台北'),(5,'台南'),(3,'新竹'),(2,'桃園'),(6,'高雄');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'紅茶',30),(2,'咖啡',45),(3,'冰沙',60),(4,'綠茶',28),(5,'紅茶',30),(6,'珍珠奶茶',50),(7,'冰淇淋',35),(8,'熱可可',40),(9,'紅茶',30),(10,'果汁',38),(11,'拿鐵',50),(12,'冰淇淋',35),(13,'綠茶',28),(14,'熱可可',40),(15,'珍珠奶茶',50),(16,'拿鐵',50),(17,'咖啡',45),(18,'紅茶',30),(19,'綠茶',28),(20,'冰淇淋',35),(21,'珍珠奶茶',50),(22,'果汁',38),(23,'拿鐵',50),(24,'咖啡',45),(25,'紅茶',30),(26,'冰沙',60),(27,'綠茶',28),(28,'珍珠奶茶',50),(29,'拿鐵',50),(30,'果汁',38),(31,'冰淇淋',35),(32,'咖啡',45),(33,'紅茶',30),(34,'綠茶',28),(35,'珍珠奶茶',50),(36,'冰沙',60),(37,'果汁',38),(38,'拿鐵',50),(39,'熱可可',40),(40,'咖啡',45),(41,'綠茶',28),(42,'冰淇淋',35),(43,'珍珠奶茶',50),(44,'果汁',38),(45,'拿鐵',50),(46,'咖啡',45),(47,'紅茶',30),(48,'熱可可',40),(49,'冰沙',60),(50,'綠茶',28),(51,'烏龍茶',30),(52,'焦糖瑪奇朵',55),(53,'芒果冰沙',60),(54,'提拉米蘇',45),(55,'抹茶拿鐵',50),(56,'冰美式咖啡',45),(57,'冷萃咖啡',48),(58,'珍珠奶茶',50),(59,'冰淇淋',35),(60,'檸檬紅茶',28),(61,'香草拿鐵',50),(62,'黑森林蛋糕',65),(63,'紅豆餅',35),(64,'蜜糖吐司',30),(65,'抹茶冰淇淋',40),(66,'焦糖布丁',45),(67,'巧克力熱巧克力',55),(68,'草莓奶昔',50),(69,'杏仁豆腐',38),(70,'冰拿鐵',48),(71,'熱美式咖啡',42),(72,'綠茶慕斯',45),(73,'蘋果派',40),(74,'巧克力脆片',35),(75,'原味優格',30),(76,'蜜桃冰茶',28),(77,'奶油鮮奶酥',40),(78,'蔓越莓果汁',45),(79,'薑汁撞奶',50),(80,'香蕉巧克力吐司',48),(81,'花生醬瑪奇朵',55),(82,'橙汁',40),(83,'冰淇淋甜甜圈',45),(84,'芝麻糊',40),(85,'焦糖熱巧克力',55),(86,'冷萃咖啡',48),(87,'焦糖布丁',45),(88,'冰綠茶',30),(89,'榴槤冰沙',60),(90,'雲尼拿拿鐵',50),(91,'藍莓乳酪蛋糕',60),(92,'草莓慕斯',55),(93,'巧克力布朗尼',50),(94,'焦糖馬卡龍',58),(95,'檸檬汁',40),(96,'抹茶拿鐵',52),(97,'黑糖珍珠鮮奶',50),(98,'烤雞翅',45),(99,'冰淇淋三明治',48),(100,'紫薯餅',40);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sales` (
  `no` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `date` date NOT NULL,
  `qty` int(11) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `branch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`no`),
  KEY `fk_sale_product` (`product_id`),
  KEY `fk_sale_branch` (`branch_id`),
  CONSTRAINT `fk_sale_branch` FOREIGN KEY (`branch_id`) REFERENCES `branches` (`id`),
  CONSTRAINT `fk_sale_product` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES ('A001','2023-01-01',50,1,1),('A002','2023-01-01',80,2,2),('A003','2023-01-01',40,3,3),('A004','2023-01-01',30,4,4),('A005','2023-01-02',70,5,4),('A006','2023-01-02',60,6,1),('A007','2023-01-02',20,7,5),('A008','2023-01-02',55,8,6),('A009','2023-01-03',45,9,7),('A010','2023-01-03',40,10,8),('A011','2023-01-03',80,11,2),('A012','2023-01-03',60,12,9),('A013','2023-01-04',75,13,3),('A014','2023-01-04',70,14,10),('A015','2023-01-04',85,15,11),('A016','2023-01-05',75,16,12),('A017','2023-01-05',65,17,13),('A018','2023-01-05',90,18,14),('A019','2023-01-05',55,19,15),('A020','2023-01-06',25,20,16),('A021','2023-01-06',95,21,17),('A022','2023-01-06',65,22,18),('A023','2023-01-06',55,23,19),('A024','2023-01-07',50,24,20),('A025','2023-01-07',45,25,21),('A026','2023-01-07',50,26,22),('A027','2023-01-07',35,27,18),('A028','2023-01-08',40,28,23),('A029','2023-01-08',70,29,24),('A030','2023-01-08',60,30,25),('A031','2023-01-08',20,31,26),('A032','2023-01-09',85,32,27),('A033','2023-01-09',40,33,28),('A034','2023-01-09',50,34,7),('A035','2023-01-10',80,35,29),('A036','2023-01-10',60,36,30),('A037','2023-01-10',55,37,31),('A038','2023-01-10',65,38,32),('A039','2023-01-11',45,39,33),('A040','2023-01-11',75,40,12),('A041','2023-01-11',90,41,34),('A042','2023-01-12',70,42,35),('A043','2023-01-12',50,43,36),('A044','2023-01-12',45,44,37),('A045','2023-01-13',60,45,38),('A046','2023-01-13',65,46,39),('A047','2023-01-13',40,47,40),('A048','2023-01-14',70,48,41),('A049','2023-01-14',80,49,42),('A050','2023-01-14',55,50,43),('A051','2023-01-15',60,51,11),('A052','2023-01-15',70,52,6),('A053','2023-01-16',50,53,8),('A054','2023-01-16',45,54,5),('A055','2023-01-17',60,55,44),('A056','2023-01-17',65,56,45),('A057','2023-01-18',40,57,2),('A058','2023-01-18',70,58,20),('A059','2023-01-19',80,59,46),('A060','2023-01-19',55,60,3),('A061','2023-01-20',58,61,33),('A062','2023-01-20',47,62,47),('A063','2023-01-21',53,63,24),('A064','2023-01-21',62,64,35),('A065','2023-01-22',55,65,42),('A066','2023-01-22',67,66,48),('A067','2023-01-23',44,67,23),('A068','2023-01-23',59,68,49),('A069','2023-01-24',65,69,17),('A070','2023-01-24',60,70,25),('A071','2023-01-25',54,71,14),('A072','2023-01-25',61,72,32),('A073','2023-01-26',56,73,9),('A074','2023-01-26',63,74,7),('A075','2023-01-27',50,75,50),('A076','2023-01-27',68,76,51),('A077','2023-01-28',59,77,52),('A078','2023-01-28',57,78,27),('A079','2023-01-29',53,79,4),('A080','2023-01-29',66,80,12),('A081','2023-01-30',60,81,53),('A082','2023-01-30',55,82,30),('A083','2023-01-31',62,83,31),('A084','2023-01-31',64,84,22),('A085','2023-02-01',53,85,10),('A086','2023-02-01',58,86,45),('A087','2023-02-02',60,87,11),('A088','2023-02-02',67,88,6),('A089','2023-02-03',54,89,8),('A090','2023-02-03',59,90,5),('A091','2023-02-04',57,91,33),('A092','2023-02-04',62,92,47),('A093','2023-02-05',64,93,24),('A094','2023-02-05',60,94,35),('A095','2023-02-06',63,95,42),('A096','2023-02-06',61,96,48),('A097','2023-02-07',59,97,23),('A098','2023-02-07',58,98,49),('A099','2023-02-08',65,99,17),('A100','2023-02-08',67,100,25);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-27 13:07:41

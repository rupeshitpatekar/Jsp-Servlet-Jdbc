-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-0ubuntu6


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema northwind
--

CREATE DATABASE IF NOT EXISTS northwind;
USE northwind;

--
-- Definition of table `northwind`.`Account`
--

DROP TABLE IF EXISTS `northwind`.`Account`;
CREATE TABLE  `northwind`.`Account` (
  `fname` varchar(50) character set utf8 NOT NULL COMMENT 'First Name',
  `lname` varchar(50) character set utf8 NOT NULL COMMENT 'Last Name',
  `uname` varchar(50) character set utf8 NOT NULL COMMENT 'User Name',
  `pwd` varchar(50) character set utf8 NOT NULL COMMENT 'Password',
  `cpwd` varchar(50) character set utf8 NOT NULL COMMENT 'Confirm Password',
  PRIMARY KEY  (`uname`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='Account information';

--
-- Dumping data for table `northwind`.`Account`
--

/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
LOCK TABLES `Account` WRITE;
INSERT INTO `northwind`.`Account` VALUES  ('rupeshit','patekar','rupeshit@gmail.com','rrrr','rrrr'),
 ('soni','patil','soni@gmail.com','ssss','ssss');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;


--
-- Definition of table `northwind`.`Student`
--

DROP TABLE IF EXISTS `northwind`.`Student`;
CREATE TABLE  `northwind`.`Student` (
  `sid` int(11) NOT NULL auto_increment COMMENT 'Student ID',
  `sname` varchar(45) NOT NULL COMMENT 'Student Name',
  `sadd` varchar(45) NOT NULL COMMENT 'Student Address',
  `marks` int(11) default NULL COMMENT 'Students Marks',
  `sper` float default NULL COMMENT 'Students pecentage',
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM AUTO_INCREMENT=334 DEFAULT CHARSET=latin1 COMMENT='Student Details';

--
-- Dumping data for table `northwind`.`Student`
--

/*!40000 ALTER TABLE `Student` DISABLE KEYS */;
LOCK TABLES `Student` WRITE;
INSERT INTO `northwind`.`Student` VALUES  (110,'rupeshit','nashik',80,70.33),
 (330,'Soni','nashik',90,70.33),
 (331,'Pub','alibagh',110,80.33),
 (332,'Soni','nashik',90,70.33),
 (333,'atul','nashik',90,70.33);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Student` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

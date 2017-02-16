/*
SQLyog v10.2 
MySQL - 5.5.30 : Database - qingyuan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qingyuan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qingyuan`;

/*Table structure for table `classes` */

DROP TABLE IF EXISTS `classes`;

CREATE TABLE `classes` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(30) NOT NULL,
  `department_id` int(11) NOT NULL,
  `state` varchar(10) DEFAULT '未毕业',
  PRIMARY KEY (`class_id`),
  KEY `fk_class_department` (`department_id`),
  CONSTRAINT `fk_class_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `classes` */

insert  into `classes`(`class_id`,`class_name`,`department_id`,`state`) values (1,'12护理1班',1,'未毕业'),(2,'12护理2班',1,'未毕业'),(3,'12护理3班',1,'未毕业'),(4,'12护理4班',1,'未毕业'),(5,'12网络1班',4,'未毕业'),(6,'12英语1班',3,'未毕业'),(7,'12英语2班',3,'未毕业'),(8,'12英语3班',3,'未毕业'),(9,'12网络2班',4,'未毕业'),(10,'12网络3班',4,'未毕业'),(11,'12食品1班',6,'未毕业'),(12,'12食品2班',6,'未毕业'),(13,'10食品1班',6,'毕业');

/*Table structure for table `classroom` */

DROP TABLE IF EXISTS `classroom`;

CREATE TABLE `classroom` (
  `classroom_id` int(11) NOT NULL AUTO_INCREMENT,
  `classroom_name` varchar(20) NOT NULL,
  PRIMARY KEY (`classroom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `classroom` */

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `class_id` int(11) NOT NULL COMMENT '班级ID',
  `ci_id` int(11) NOT NULL COMMENT '课程信息ID',
  KEY `FK_ci_id` (`ci_id`),
  CONSTRAINT `FK_ci_id` FOREIGN KEY (`ci_id`) REFERENCES `courseinformation` (`ci_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `courseinformation` */

DROP TABLE IF EXISTS `courseinformation`;

CREATE TABLE `courseinformation` (
  `ci_id` int(11) NOT NULL AUTO_INCREMENT,
  `ci_name` varchar(20) NOT NULL,
  `department_id` int(11) NOT NULL,
  PRIMARY KEY (`ci_id`),
  KEY `fk_courseinfo_department` (`department_id`),
  CONSTRAINT `fk_courseinfo_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `courseinformation` */

insert  into `courseinformation`(`ci_id`,`ci_name`,`department_id`) values (1,'linux',4),(2,'php',4),(5,'java',4),(6,'jquery',4),(8,'网络营销',4),(9,'网络黑客攻防',4),(10,'打针',1);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`department_id`,`department_name`) values (1,'护理学院'),(2,'机电与汽车工程学院'),(3,'外语与经贸学院'),(4,'信息技术与创意设计学院'),(5,'旅游家政与艺术学院'),(6,'食品药品学院');

/*Table structure for table `pe_admin` */

DROP TABLE IF EXISTS `pe_admin`;

CREATE TABLE `pe_admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(30) NOT NULL,
  `admin_pass` varchar(32) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pe_admin` */

insert  into `pe_admin`(`admin_id`,`admin_name`,`admin_pass`) values (1,'admin','21232f297a57a5a743894a0e4a801fc3');

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `score_id` int(12) NOT NULL AUTO_INCREMENT,
  `score_name` varchar(20) NOT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `score` */

insert  into `score`(`score_id`,`score_name`) values (1,'2016-2017-1'),(2,'2016-2017-2');

/*Table structure for table `score_info` */

DROP TABLE IF EXISTS `score_info`;

CREATE TABLE `score_info` (
  `student_id` varchar(12) NOT NULL,
  `ci_id` int(11) NOT NULL,
  `fraction` double DEFAULT NULL,
  `score_id` int(11) NOT NULL,
  KEY `FK_score_ci_id` (`ci_id`),
  KEY `FK_score_id` (`score_id`),
  KEY `score_info_student_id` (`student_id`),
  CONSTRAINT `score_info_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `score_info` */

insert  into `score_info`(`student_id`,`ci_id`,`fraction`,`score_id`) values ('40000001',1,79,1),('40000001',2,77,1),('40000001',5,76,1),('40000001',6,75,1),('40000001',8,74,1),('40000001',9,73,1),('40000002',1,88,1),('40000002',2,87,1),('40000002',5,86,1),('40000002',6,85,1),('40000002',8,84,1),('40000002',9,83,1),('40000003',1,16,1),('40000003',2,17,1),('40000003',5,18,1),('40000003',6,19,1),('40000003',8,20,1),('40000003',9,21,1);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` varchar(8) NOT NULL,
  `student_name` varchar(30) DEFAULT NULL,
  `sex` varchar(8) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `entrance_time` date DEFAULT NULL,
  `img_url` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `fk_student_class` (`class_id`),
  KEY `fk_student_department` (`department_id`),
  CONSTRAINT `fk_student_class` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`),
  CONSTRAINT `fk_student_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`student_id`,`student_name`,`sex`,`department_id`,`class_id`,`phone`,`address`,`entrance_time`,`img_url`) values ('10000001','黄花岗','女',1,3,'188688288','111112',NULL,NULL),('30000001','123','女',3,6,'123123','312',NULL,NULL),('30000002','123','女',3,6,'123123','312',NULL,NULL),('30000003','詹姆斯','男',3,6,'120','加州',NULL,NULL),('30000004','乔丹','男',3,6,'119','美国',NULL,NULL),('30000005','科比','男',3,6,'110','华盛顿',NULL,NULL),('40000001','安东尼','男',4,9,'13246765751','6666666',NULL,'upload\\40000001\\1720-11091611202279.jpg'),('40000002','大秀哥','男',4,9,'18828838888','WWE',NULL,'upload\\40000002\\sz.JPG'),('40000003','HBK','男',4,9,'13888888888','WWE',NULL,NULL);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(20) NOT NULL,
  `department_id` int(11) NOT NULL,
  PRIMARY KEY (`teacher_id`),
  KEY `fk_teacher_department` (`department_id`),
  CONSTRAINT `fk_teacher_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`teacher_id`,`teacher_name`,`department_id`) values (1,'姚明',4),(2,'邓肯',4),(3,'哈登',4),(4,'詹姆斯',5),(5,'科比',1),(6,'新东方',2),(7,'华侨城',5),(8,'霍华德',3),(9,'杜兰特',6),(10,'雷阿伦',2),(11,'奥尼尔',5),(12,'大秀哥',5),(13,'甜瓜',3),(14,'韦德',6),(15,'威斯布鲁克',1),(16,'阿伯托',3),(17,'纳什',5),(18,'奈特·阿奇博尔德',5),(19,'鲍勃·库西',5),(20,'戴夫·宾',5),(21,'迈克尔·乔丹',5),(22,'比尔·沙曼',5),(23,'杰里·韦斯特',5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

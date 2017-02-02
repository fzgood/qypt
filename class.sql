/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : qingyuan

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2017-02-02 17:10:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(30) NOT NULL,
  `department_id` int(11) NOT NULL,
  `perple_num` int(11) NOT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for `classroom`
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `classroom_id` int(11) NOT NULL AUTO_INCREMENT,
  `classroom_name` varchar(20) NOT NULL,
  PRIMARY KEY (`classroom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classroom
-- ----------------------------

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `class_id` int(11) NOT NULL COMMENT '班级ID',
  `classroom_id` int(11) NOT NULL COMMENT '教室ID',
  `ci_id` int(11) NOT NULL COMMENT '课程信息ID',
  `teacher` int(11) NOT NULL COMMENT '老师ID',
  `week` varchar(20) NOT NULL DEFAULT '' COMMENT '星期',
  `order` int(11) NOT NULL COMMENT '上课顺序'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for `courseinformation`
-- ----------------------------
DROP TABLE IF EXISTS `courseinformation`;
CREATE TABLE `courseinformation` (
  `CI_id` int(11) NOT NULL AUTO_INCREMENT,
  `CI_name` varchar(20) NOT NULL,
  PRIMARY KEY (`CI_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of courseinformation
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '护理学院');
INSERT INTO `department` VALUES ('2', '机电与汽车工程学院');
INSERT INTO `department` VALUES ('3', '外语与经贸学院');
INSERT INTO `department` VALUES ('4', '信息技术与创意设计学院');
INSERT INTO `department` VALUES ('5', '旅游家政与艺术学院');
INSERT INTO `department` VALUES ('6', '食品药品学院');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

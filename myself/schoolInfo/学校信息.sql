/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : 学校信息

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-05-20 22:03:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `name` varchar(20) DEFAULT '0',
  `age` int(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `adression` varchar(20) DEFAULT NULL,
  `phoneNumber` int(20) DEFAULT NULL,
  `s_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`s_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('殴是', '52', '女', '天津', '5255', 'S1');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `name` varchar(20) DEFAULT '0',
  `age` int(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `adression` varchar(20) DEFAULT NULL,
  `phoneNumber` int(20) DEFAULT NULL,
  `t_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`t_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('T', '12', '女', '天津', '1256', 'T1');

-- ----------------------------
-- Table structure for `teachingassistant`
-- ----------------------------
DROP TABLE IF EXISTS `teachingassistant`;
CREATE TABLE `teachingassistant` (
  `name` varchar(20) DEFAULT '0',
  `age` int(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `adression` varchar(20) DEFAULT NULL,
  `phoneNumber` int(20) DEFAULT NULL,
  `A_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of teachingassistant
-- ----------------------------
INSERT INTO `teachingassistant` VALUES ('李湘', '12', '女', '天津', '123', 'A1');

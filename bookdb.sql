/*
 Navicat Premium Data Transfer

 Source Server         : mysql-conn
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : bookdb

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 08/08/2018 15:07:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lib_Book
-- ----------------------------
DROP TABLE IF EXISTS `lib_Book`;
CREATE TABLE `lib_Book` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `author` varchar(10) DEFAULT NULL,
  `isbn` varchar(255) DEFAULT NULL,
  `place_of_publication` varchar(255) DEFAULT NULL,
  `publication_date` datetime DEFAULT NULL,
  `press` varchar(255) DEFAULT NULL,
  `libId` bigint(20) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `createBy` bigint(20) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `updateBy` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1

-- ----------------------------
-- Table structure for lib_Member
-- ----------------------------
DROP TABLE IF EXISTS `lib_Member`;
CREATE TABLE `lib_Member` (
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

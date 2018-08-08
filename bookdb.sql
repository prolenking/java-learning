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

 Date: 07/08/2018 16:09:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shop_book
-- ----------------------------
DROP TABLE IF EXISTS `shop_book`;
CREATE TABLE `shop_book` (
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;

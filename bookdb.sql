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

 Date: 09/08/2018 12:39:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lib_book
-- ----------------------------
DROP TABLE IF EXISTS `lib_book`;
CREATE TABLE `lib_book` (
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for lib_member
-- ----------------------------
DROP TABLE IF EXISTS `lib_member`;
CREATE TABLE `lib_member` (
  `name` varchar(255) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

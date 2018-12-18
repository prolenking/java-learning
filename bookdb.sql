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

 Date: 26/09/2018 15:04:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lib_Book
-- ----------------------------
DROP TABLE IF EXISTS `lib_Book`;
CREATE TABLE `lib_Book` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `name` varchar(100) NOT NULL COMMENT '书名',
  `author` varchar(10) DEFAULT NULL COMMENT '作者姓名',
  `isbn` varchar(255) DEFAULT NULL COMMENT 'isbn码',
  `place_of_publication` varchar(255) DEFAULT NULL COMMENT '出版地',
  `publication_date` datetime DEFAULT NULL COMMENT '出版日期',
  `press` varchar(255) DEFAULT NULL COMMENT '出版社',
  `libId` bigint(20) DEFAULT NULL COMMENT '图书馆Id',
  `deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  `createTime` datetime DEFAULT NULL COMMENT '入馆时间',
  `createBy` bigint(20) DEFAULT NULL COMMENT '所在馆编号',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  `updateBy` bigint(20) DEFAULT NULL COMMENT '更新馆编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for lib_Member
-- ----------------------------
DROP TABLE IF EXISTS `lib_Member`;
CREATE TABLE `lib_Member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `phoneNumber` varchar(255) DEFAULT NULL COMMENT '手机号',
  `identificationNumber` varchar(255) DEFAULT NULL COMMENT '证件号',
  `bookNumber` int(11) DEFAULT NULL COMMENT '在借数量',
  `borrowTimes` int(11) DEFAULT NULL COMMENT '借阅次数',
  `createTime` datetime DEFAULT NULL,
  `createBy` bigint(255) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `updateBy` bigint(20) DEFAULT NULL,
  `libId` bigint(20) DEFAULT NULL,
  `deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `idx_identificationNumber_libId_unique` (`identificationNumber`,`libId`) USING BTREE COMMENT '身份编码-图书馆唯一索引'
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for lib_Record
-- ----------------------------
DROP TABLE IF EXISTS `lib_Record`;
CREATE TABLE `lib_Record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `bookId` bigint(20) DEFAULT NULL COMMENT '图书编号',
  `memberId` bigint(20) DEFAULT NULL COMMENT '会员编号',
  `returned` tinyint(1) DEFAULT '0' COMMENT '归还状况',
  `libId` int(11) DEFAULT NULL COMMENT '所在馆编号',
  `deleted` tinyint(1) DEFAULT NULL COMMENT '是否删除',
  `createTime` datetime DEFAULT NULL COMMENT '借阅日期',
  `createBy` bigint(20) DEFAULT NULL COMMENT '借出馆编号',
  `updateTime` datetime DEFAULT NULL COMMENT '更新日期',
  `updateBy` bigint(20) DEFAULT NULL COMMENT '更新馆编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.2.113
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : 192.168.2.113:3306
 Source Schema         : a_wt

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 22/01/2021 17:34:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo`  (
  `PK_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `CREATE_DATE` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`PK_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES (1, 'demo1', '2021-01-19 16:05:08');
INSERT INTO `demo` VALUES (2, 'demo2', '2021-01-19 16:05:12');
INSERT INTO `demo` VALUES (3, 'demo3', '2021-01-19 16:05:16');
INSERT INTO `demo` VALUES (4, 'demo4', '2021-01-19 16:05:21');

SET FOREIGN_KEY_CHECKS = 1;

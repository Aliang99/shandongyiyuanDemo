/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : shandongyiyuan

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2021-12-18 02:48:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for behospital
-- ----------------------------
DROP TABLE IF EXISTS `behospital`;
CREATE TABLE `behospital` (
  `beH_id` int NOT NULL AUTO_INCREMENT COMMENT '住院编号',
  `beH_nursepeople` int NOT NULL COMMENT '护理人',
  `beH_patBed` int NOT NULL COMMENT '病床号',
  `beh_antecedent` double NOT NULL COMMENT '缴纳押金',
  `beH_illness` varchar(255) NOT NULL COMMENT '病情介绍',
  `beH_closePrice` int NOT NULL DEFAULT '0' COMMENT '结算状态',
  `beH_state` int NOT NULL DEFAULT '0' COMMENT '信息状态',
  PRIMARY KEY (`beH_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of behospital
-- ----------------------------

-- ----------------------------
-- Table structure for chargeproject
-- ----------------------------
DROP TABLE IF EXISTS `chargeproject`;
CREATE TABLE `chargeproject` (
  `cp_id` int NOT NULL AUTO_INCREMENT COMMENT '项目编号',
  `cp_name` varchar(50) NOT NULL COMMENT '收费项目名称',
  `cp_money` double NOT NULL COMMENT '收费金额',
  PRIMARY KEY (`cp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of chargeproject
-- ----------------------------

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `d_id` int NOT NULL AUTO_INCREMENT COMMENT '医生编号',
  `d_name` varchar(20) NOT NULL COMMENT '医生名字',
  `d_idCard` varchar(18) NOT NULL COMMENT '身份证号',
  `d_phone` varchar(11) NOT NULL COMMENT '手机号码',
  `d_telphone` varchar(20) DEFAULT NULL COMMENT '座机号',
  `d_sex` int NOT NULL DEFAULT '1' COMMENT '性别',
  `d_birthday` datetime NOT NULL COMMENT '出生日期',
  `d_age` int NOT NULL COMMENT '年龄',
  `d_email` varchar(50) NOT NULL COMMENT '邮箱',
  `k_id` int NOT NULL COMMENT '所属科室',
  `x_id` int NOT NULL COMMENT '学历',
  `d_desc` varchar(255) DEFAULT NULL COMMENT '备注',
  `d_inTime` datetime NOT NULL COMMENT '入职时间',
  `d_state` int NOT NULL DEFAULT '0' COMMENT '状态 0正常 1离职',
  PRIMARY KEY (`d_id`),
  UNIQUE KEY `d_idCard` (`d_idCard`),
  UNIQUE KEY `d_phone` (`d_phone`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '张大爷', '431120199902023003', '15111114444', '800-8208820', '0', '1998-01-30 00:00:00', '23', '123@qq.com', '15', '7', '暂无', '2021-12-07 21:03:04', '1');
INSERT INTO `doctor` VALUES ('2', '刘医生', '431103200012124242', '15548487878', '800-2565897', '0', '2000-12-12 00:00:00', '21', '456@qq.com', '15', '8', '暂无', '1993-12-14 03:31:08', '1');
INSERT INTO `doctor` VALUES ('3', '王医生', '431103166902151548', '15148487878', '820-8008820', '0', '1669-02-15 00:00:00', '352', '111@qq.com', '1', '8', '666', '2021-12-15 23:51:55', '0');
INSERT INTO `doctor` VALUES ('4', '杨医生', '431103199908124578', '15148489336', '800-8215959', '1', '1999-08-12 00:00:00', '22', '124859@qq.com', '23', '7', '年轻有为', '2021-12-15 23:56:18', '0');
INSERT INTO `doctor` VALUES ('8', '狗狗', '431103188506054848', '15111693622', '0511-4405222', '0', '1885-06-05 00:00:00', '136', '123465@qq.com', '24', '7', 'aaa', '2021-12-18 00:01:42', '0');
INSERT INTO `doctor` VALUES ('11', '狗狗7', '431103154804003265', '15148456958', '021-87888822', '0', '2021-12-17 00:00:00', '0', '111@qq.com', '2', '1', '', '2021-12-18 00:06:31', '0');
INSERT INTO `doctor` VALUES ('12', '狗狗14', '431103181887870212', '15111695858', '021-87888823', '1', '2021-12-02 00:00:00', '0', '12345789@qq.com', '14', '5', '', '2021-12-18 00:18:15', '0');

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug` (
  `dr_id` int NOT NULL AUTO_INCREMENT COMMENT '药品编号',
  `dr_url` varchar(255) NOT NULL COMMENT '药品图片url',
  `dr_inPrice` double NOT NULL COMMENT '进价',
  `dr_outPrice` double NOT NULL COMMENT '售价',
  `dr_name` varchar(80) NOT NULL COMMENT '药品名称',
  `dr_type` varchar(80) NOT NULL COMMENT '药品类型',
  `dr_simDesc` varchar(255) NOT NULL COMMENT '简单介绍',
  `dr_dateDesc` varchar(255) NOT NULL COMMENT '详细描述',
  `dr_EXP` varchar(20) NOT NULL COMMENT '保质期',
  `dr_factory` varchar(80) NOT NULL COMMENT '生产厂家',
  `dr_direction` varchar(255) NOT NULL COMMENT '服用说明',
  `dr_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `dr_number` int NOT NULL COMMENT '库存',
  PRIMARY KEY (`dr_id`),
  UNIQUE KEY `dr_url` (`dr_url`),
  UNIQUE KEY `dr_name` (`dr_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of drug
-- ----------------------------

-- ----------------------------
-- Table structure for drugpeople
-- ----------------------------
DROP TABLE IF EXISTS `drugpeople`;
CREATE TABLE `drugpeople` (
  `drugP_id` int NOT NULL AUTO_INCREMENT COMMENT '中间表id',
  `dr_id` int NOT NULL COMMENT '药品的编号',
  `hosR_id` int NOT NULL COMMENT '病人的编号',
  `drugP_number` int NOT NULL COMMENT '药品的数量',
  `drugP_givenNumber` int NOT NULL DEFAULT '0' COMMENT '已发药品数量',
  PRIMARY KEY (`drugP_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of drugpeople
-- ----------------------------

-- ----------------------------
-- Table structure for hosregister
-- ----------------------------
DROP TABLE IF EXISTS `hosregister`;
CREATE TABLE `hosregister` (
  `hosR_id` int NOT NULL AUTO_INCREMENT COMMENT '挂号编号',
  `hosR_name` varchar(20) NOT NULL COMMENT '姓名',
  `hosR_idCard` varchar(18) NOT NULL COMMENT '身份证号',
  `hosR_medical` varchar(20) DEFAULT NULL COMMENT '社保号',
  `hosR_regPrice` double NOT NULL COMMENT '挂号费',
  `hosR_phone` varchar(11) NOT NULL COMMENT '联系电话',
  `hosR_selfPrice` int NOT NULL DEFAULT '1' COMMENT '是否自费 0自费 1免费',
  `hosR_sex` int NOT NULL DEFAULT '1' COMMENT '性别 0女 1男',
  `hosR_age` int NOT NULL COMMENT '年龄',
  `hosR_work` varchar(80) DEFAULT NULL COMMENT '职业',
  `hosR_lookState` int NOT NULL DEFAULT '0' COMMENT '初复诊 0初诊 1复诊',
  `d_id` int NOT NULL COMMENT '医生编号',
  `hosR_time` datetime NOT NULL COMMENT '挂号时间',
  `k_id` int NOT NULL COMMENT '科室编号',
  `hosR_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `hosR_state` int NOT NULL COMMENT '挂号状态',
  PRIMARY KEY (`hosR_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of hosregister
-- ----------------------------
INSERT INTO `hosregister` VALUES ('1', '王铁柱', '431103199801022566', '4356698596', '50', '15148489999', '1', '1', '200', '程序猿', '1', '1', '2021-12-10 15:55:52', '15', '暂无', '3');
INSERT INTO `hosregister` VALUES ('2', '田二妞', '431102336598891245', '7894561230', '120', '15144669988', '1', '0', '24', '程序媛', '0', '2', '2021-12-12 15:59:19', '3', '暂无', '3');
INSERT INTO `hosregister` VALUES ('3', '刘老三', '456789430001234565', '4567891234', '119', '15454578789', '1', '1', '26', '攻城狮', '0', '1', '2021-12-21 16:00:11', '15', null, '3');
INSERT INTO `hosregister` VALUES ('4', '三和大神2', '431103199825254542', '1515484878782', '502', '15148487872', '1', '0', '302', '该溜子2', '0', '2', '2021-12-11 00:25:27', '3', '此人有精神病2', '3');
INSERT INTO `hosregister` VALUES ('5', '七七', '431103200010011515', '431103200010011515', '10', '15514847878', '0', '1', '21', 'dwaddwa', '0', '1', '2021-12-17 08:14:09', '15', 'dwadaw', '0');
INSERT INTO `hosregister` VALUES ('6', '帅哥', '432908198803024252', '432908198803024252', '50.255', '15511487878', '0', '1', '23', '程序员', '0', '1', '2021-12-17 08:14:34', '15', '666', '0');
INSERT INTO `hosregister` VALUES ('7', '六六', '432908198803025589', 'dwadwa', '10', '15148485552', '0', '0', '23', 'dwadwa', '0', '4', '2021-12-18 02:08:31', '23', '', '3');

-- ----------------------------
-- Table structure for keshi
-- ----------------------------
DROP TABLE IF EXISTS `keshi`;
CREATE TABLE `keshi` (
  `k_id` int NOT NULL AUTO_INCREMENT COMMENT '科室编号',
  `keshi_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '科室名称',
  PRIMARY KEY (`k_id`),
  UNIQUE KEY `keshi_name` (`keshi_name`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of keshi
-- ----------------------------
INSERT INTO `keshi` VALUES ('8', '中西医结合科');
INSERT INTO `keshi` VALUES ('23', '儿科');
INSERT INTO `keshi` VALUES ('11', '内分泌科');
INSERT INTO `keshi` VALUES ('4', '呼吸与危重症医学科');
INSERT INTO `keshi` VALUES ('25', '妇科');
INSERT INTO `keshi` VALUES ('9', '心血管内科一病区');
INSERT INTO `keshi` VALUES ('10', '心血管内科二病区');
INSERT INTO `keshi` VALUES ('6', '感染疾病科');
INSERT INTO `keshi` VALUES ('13', '普通外科一病区');
INSERT INTO `keshi` VALUES ('14', '普通外科二病区');
INSERT INTO `keshi` VALUES ('17', '泌尿外科');
INSERT INTO `keshi` VALUES ('5', '消化内科');
INSERT INTO `keshi` VALUES ('18', '烧伤整形与皮肤外科');
INSERT INTO `keshi` VALUES ('7', '皮肤科');
INSERT INTO `keshi` VALUES ('2', '神经内一科');
INSERT INTO `keshi` VALUES ('3', '神经内二科');
INSERT INTO `keshi` VALUES ('20', '神经外科一病区');
INSERT INTO `keshi` VALUES ('21', '神经外科二病区');
INSERT INTO `keshi` VALUES ('22', '耳鼻喉科');
INSERT INTO `keshi` VALUES ('12', '肾病科');
INSERT INTO `keshi` VALUES ('24', '肿瘤科');
INSERT INTO `keshi` VALUES ('19', '胸心外科');
INSERT INTO `keshi` VALUES ('1', '血液科');
INSERT INTO `keshi` VALUES ('15', '骨一科');
INSERT INTO `keshi` VALUES ('16', '骨二科');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `m_id` int NOT NULL AUTO_INCREMENT COMMENT '菜单编号',
  `m_name` varchar(80) NOT NULL COMMENT '菜单资源路径',
  `m_state` int NOT NULL DEFAULT '0' COMMENT '菜单状态 0 正常 1禁用',
  PRIMARY KEY (`m_id`),
  UNIQUE KEY `m_name` (`m_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for pricepeople
-- ----------------------------
DROP TABLE IF EXISTS `pricepeople`;
CREATE TABLE `pricepeople` (
  `priceP_id` int NOT NULL AUTO_INCREMENT COMMENT '中间表id',
  `chaP_id` int NOT NULL COMMENT '收费项编号',
  `beH_id` int NOT NULL COMMENT '病人编号',
  PRIMARY KEY (`priceP_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of pricepeople
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `r_id` int NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `r_name` varchar(80) NOT NULL COMMENT '角色名称',
  `r_state` int NOT NULL DEFAULT '0' COMMENT '角色状态 0 正常 1禁用',
  PRIMARY KEY (`r_id`),
  UNIQUE KEY `r_name` (`r_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role_menu_mid
-- ----------------------------
DROP TABLE IF EXISTS `role_menu_mid`;
CREATE TABLE `role_menu_mid` (
  `role_menu_mid_id` int NOT NULL AUTO_INCREMENT COMMENT '中间表编号',
  `r_id` int NOT NULL COMMENT '角色编号',
  `m_id` int NOT NULL COMMENT '菜单编号',
  PRIMARY KEY (`role_menu_mid_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of role_menu_mid
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_loginName` int NOT NULL COMMENT '登录名',
  `u_passWord` varchar(80) NOT NULL COMMENT '密码',
  `u_trueName` varchar(80) NOT NULL COMMENT '真实姓名',
  `u_email` varchar(80) NOT NULL COMMENT '邮箱',
  `u_state` int NOT NULL DEFAULT '0' COMMENT '用户状态 0正常 1禁用',
  `r_id` int NOT NULL DEFAULT '0' COMMENT '角色编号',
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_loginName` (`u_loginName`),
  UNIQUE KEY `u_email` (`u_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for xueli
-- ----------------------------
DROP TABLE IF EXISTS `xueli`;
CREATE TABLE `xueli` (
  `x_id` int NOT NULL AUTO_INCREMENT COMMENT '学历编号',
  `x_name` varchar(20) NOT NULL COMMENT '学历名称',
  PRIMARY KEY (`x_id`),
  UNIQUE KEY `x_name` (`x_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of xueli
-- ----------------------------
INSERT INTO `xueli` VALUES ('4', '中专');
INSERT INTO `xueli` VALUES ('2', '初中');
INSERT INTO `xueli` VALUES ('6', '大专');
INSERT INTO `xueli` VALUES ('1', '小学');
INSERT INTO `xueli` VALUES ('7', '本科');
INSERT INTO `xueli` VALUES ('8', '研究生');
INSERT INTO `xueli` VALUES ('3', '高中');
INSERT INTO `xueli` VALUES ('5', '高职');

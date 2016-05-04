/*
Navicat MySQL Data Transfer

Source Server         : alex
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : commodity

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2016-05-05 00:42:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_activity`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activity`;
CREATE TABLE `tbl_activity` (
  `activity_id` int(10) NOT NULL AUTO_INCREMENT,
  `activity_name` varchar(255) NOT NULL,
  `start_time` varchar(20) NOT NULL,
  `end_time` varchar(20) NOT NULL,
  `discount` float(10,2) NOT NULL,
  `full_count` float(10,2) NOT NULL,
  `substract_count` float(10,2) NOT NULL,
  `type_id` int(10) NOT NULL,
  PRIMARY KEY (`activity_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `tbl_activity_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `tbl_activity_type` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_activity
-- ----------------------------
INSERT INTO `tbl_activity` VALUES ('1', '暂无活动', '2015-09-01 01:59', '2015-09-05', '0.00', '0.00', '0.00', '1');
INSERT INTO `tbl_activity` VALUES ('2', '以后', '2015-09-01 01:59', '2015-09-05', '0.80', '1.00', '0.00', '3');
INSERT INTO `tbl_activity` VALUES ('3', '好了', '2015-09-01 01:59', '2015-09-05', '1.00', '1.00', '40.00', '2');
INSERT INTO `tbl_activity` VALUES ('4', '店庆十周年', '2015-09-01 01:59', '2015-09-05', '0.70', '0.70', '0.00', '3');
INSERT INTO `tbl_activity` VALUES ('5', '回馈新老', '2015-09-01 01:59', '2015-09-05', '1.00', '1.00', '8.00', '2');
INSERT INTO `tbl_activity` VALUES ('6', '中秋节大团圆', '2015-09-01 01:59', '2015-09-05', '0.90', '0.90', '0.00', '3');
INSERT INTO `tbl_activity` VALUES ('7', '圣诞节', '2015-09-01 01:59', '2015-09-05', '1.00', '1.00', '10.00', '2');
INSERT INTO `tbl_activity` VALUES ('8', '万圣节', '2015-09-01 01:59', '2015-09-05', '1.00', '1.00', '11.00', '2');
INSERT INTO `tbl_activity` VALUES ('9', '春节', '2015-09-01 01:59', '2015-09-05', '0.85', '9.00', '0.00', '2');
INSERT INTO `tbl_activity` VALUES ('10', 'TTT', '2015-09-01 01:59', 'w', '5.00', '8.00', '0.00', '2');
INSERT INTO `tbl_activity` VALUES ('11', '3', '2015-09-01 01:59', '3', '1.00', '1.00', '1.00', '3');
INSERT INTO `tbl_activity` VALUES ('12', 'qq', '2015-09-01 01:59', '2016-04-06T00:59', '2.00', '2.00', '2.00', '2');
INSERT INTO `tbl_activity` VALUES ('13', '端午节', '2016-04-13 03:05', '2016-04-30T02:00', '6.00', '5.00', '3.00', '2');
INSERT INTO `tbl_activity` VALUES ('14', '君子坦荡荡', '2016-04-14 22:01', '2017-04-13 23:59', '0.80', '9999.00', '999.00', '3');
INSERT INTO `tbl_activity` VALUES ('15', '重阳节', '2016-04-06 00:59', '2016-04-22 00:59', '0.90', '99.00', '56.00', '1');
INSERT INTO `tbl_activity` VALUES ('16', '端午节大活动', '2016-05-02 04:05', '2016-05-19 05:07', '0.60', '9.00', '4.00', '3');

-- ----------------------------
-- Table structure for `tbl_activity_type`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activity_type`;
CREATE TABLE `tbl_activity_type` (
  `type_id` int(10) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(100) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_activity_type
-- ----------------------------
INSERT INTO `tbl_activity_type` VALUES ('1', '暂无活动');
INSERT INTO `tbl_activity_type` VALUES ('2', '单品打折');
INSERT INTO `tbl_activity_type` VALUES ('3', '满减活动');

-- ----------------------------
-- Table structure for `tbl_bill`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bill`;
CREATE TABLE `tbl_bill` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `action_tag` int(11) DEFAULT NULL,
  `action_id` varchar(10) DEFAULT NULL,
  `item_id` varchar(10) DEFAULT NULL,
  `action_price` double DEFAULT NULL,
  `action_amount` int(11) DEFAULT NULL,
  `supp_id` varchar(10) DEFAULT NULL,
  `action_date` date DEFAULT NULL,
  `action_person` varchar(20) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_BILL_ITEM` (`item_id`),
  CONSTRAINT `FK_BILL_ITEM` FOREIGN KEY (`item_id`) REFERENCES `tbl_items` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_bill
-- ----------------------------
INSERT INTO `tbl_bill` VALUES ('1', '1', '1', '1', '3', '50000', '1', '2015-09-22', 'Tom', '进货');
INSERT INTO `tbl_bill` VALUES ('2', '1', '2', '2', '2', '27000', '3', '2015-10-19', 'Tom', '进货');
INSERT INTO `tbl_bill` VALUES ('3', '1', '3', '3', '2', '15000', '7', '2015-09-20', 'Marry', '进货');
INSERT INTO `tbl_bill` VALUES ('4', '1', '4', '4', '6', '3000', '1', '2015-10-06', 'Tom', '进货');
INSERT INTO `tbl_bill` VALUES ('5', '1', '5', '5', '8', '1500', '2', '2015-12-26', 'Marry', '进货');
INSERT INTO `tbl_bill` VALUES ('6', '1', '6', '6', '20', '2000', '4', '2015-12-16', 'Tom', '进货');
INSERT INTO `tbl_bill` VALUES ('7', '1', '7', '7', '20', '2000', '5', '2016-01-11', 'Marry', '进货');
INSERT INTO `tbl_bill` VALUES ('8', '1', 'IM02', 'po42', '20', '3000', '2', '2016-03-11', 'Jim', '商品进货');
INSERT INTO `tbl_bill` VALUES ('9', '0', '1', '1', '5.5', '30000', '1', '2016-02-08', 'Tom', '出货');
INSERT INTO `tbl_bill` VALUES ('10', '0', '2', '2', '3.5', '2000', '3', '2016-01-06', 'Tom', '出货');
INSERT INTO `tbl_bill` VALUES ('11', '0', '3', '5', '10', '1500', '2', '2016-01-26', 'Marry', '出货');
INSERT INTO `tbl_bill` VALUES ('12', '0', '4', '7', '40', '1850', '5', '2016-01-12', 'Marry', '出货');
INSERT INTO `tbl_bill` VALUES ('13', '1', 'IM006', 'XM9988', '30', '3000', '3', '2016-03-11', 'Marry', '进货');
INSERT INTO `tbl_bill` VALUES ('14', '0', 'EX002', 'XM9988', '36.6', '1000', '3', '2016-03-17', 'Jim', '出货');
INSERT INTO `tbl_bill` VALUES ('15', '1', 'IMOP9097', 'XM9988', '36.6', '1500', '3', '2016-03-25', 'Tom', '商品进货');
INSERT INTO `tbl_bill` VALUES ('16', '1', 'J3', '12', '4.5', '50', '4', '2016-05-04', 'admin', '商品进货');
INSERT INTO `tbl_bill` VALUES ('17', '0', 'C1', '12', '63.3', '250', '4', '2016-05-04', 'admin', '商品出货');
INSERT INTO `tbl_bill` VALUES ('18', '0', 'C2', '12', '63.3', '50', '4', '2016-05-04', 'admin', '商品出货');

-- ----------------------------
-- Table structure for `tbl_catagorgy`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_catagorgy`;
CREATE TABLE `tbl_catagorgy` (
  `catagorgy_id` int(11) NOT NULL AUTO_INCREMENT,
  `catagorgy_parent_id` int(11) DEFAULT NULL,
  `catagorgy_name` varchar(200) DEFAULT NULL,
  `catagorgy_pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`catagorgy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_catagorgy
-- ----------------------------
INSERT INTO `tbl_catagorgy` VALUES ('1', '2', '牛奶乳品', null);
INSERT INTO `tbl_catagorgy` VALUES ('2', '1', '食品饮料类', null);
INSERT INTO `tbl_catagorgy` VALUES ('3', '1', '粮油副食类', null);
INSERT INTO `tbl_catagorgy` VALUES ('4', '1', '个人护理类', null);
INSERT INTO `tbl_catagorgy` VALUES ('5', '1', '护肤美妆', null);
INSERT INTO `tbl_catagorgy` VALUES ('6', '1', '清洁用品', null);
INSERT INTO `tbl_catagorgy` VALUES ('7', '1', '生鲜', null);
INSERT INTO `tbl_catagorgy` VALUES ('8', '2', '休闲食品', null);
INSERT INTO `tbl_catagorgy` VALUES ('9', '2', '饮料', null);
INSERT INTO `tbl_catagorgy` VALUES ('10', '3', '食用油', null);
INSERT INTO `tbl_catagorgy` VALUES ('11', '3', '米面', null);
INSERT INTO `tbl_catagorgy` VALUES ('12', '3', '厨房调味', null);
INSERT INTO `tbl_catagorgy` VALUES ('13', '3', '地方特产', null);
INSERT INTO `tbl_catagorgy` VALUES ('14', '5', '面部护肤', null);
INSERT INTO `tbl_catagorgy` VALUES ('15', '5', '身体护肤', null);
INSERT INTO `tbl_catagorgy` VALUES ('16', '5', '男士专区', null);
INSERT INTO `tbl_catagorgy` VALUES ('17', '5', '香水彩妆', null);
INSERT INTO `tbl_catagorgy` VALUES ('18', '4', '洗发护发', null);
INSERT INTO `tbl_catagorgy` VALUES ('19', '4', '口腔护理', null);
INSERT INTO `tbl_catagorgy` VALUES ('20', '4', '卫生护理', null);
INSERT INTO `tbl_catagorgy` VALUES ('21', '4', '身体护理', null);
INSERT INTO `tbl_catagorgy` VALUES ('22', '6', '纸品湿巾', null);
INSERT INTO `tbl_catagorgy` VALUES ('23', '6', '清洁工具', null);
INSERT INTO `tbl_catagorgy` VALUES ('24', '6', '衣物清洁', null);
INSERT INTO `tbl_catagorgy` VALUES ('25', '7', '水果', null);
INSERT INTO `tbl_catagorgy` VALUES ('26', '7', '蔬菜', null);
INSERT INTO `tbl_catagorgy` VALUES ('27', '7', '肉禽蛋', null);
INSERT INTO `tbl_catagorgy` VALUES ('28', '8', '果冻', null);
INSERT INTO `tbl_catagorgy` VALUES ('29', '8', '饼干', null);
INSERT INTO `tbl_catagorgy` VALUES ('30', '3', '牛肉干干', null);
INSERT INTO `tbl_catagorgy` VALUES ('31', '4', '力士身体沐浴露', null);
INSERT INTO `tbl_catagorgy` VALUES ('303', '4', '凡士林沐浴液', null);

-- ----------------------------
-- Table structure for `tbl_export_bill`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_export_bill`;
CREATE TABLE `tbl_export_bill` (
  `export_id` varchar(255) NOT NULL,
  `item_id` varchar(10) DEFAULT NULL,
  `export_price` double DEFAULT NULL,
  `export_amount` int(11) DEFAULT NULL,
  `supp_id` varchar(10) DEFAULT NULL,
  `export_date` date DEFAULT NULL,
  `export_person` varchar(20) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`export_id`),
  KEY `FK_EXPORT_ITEM` (`item_id`),
  CONSTRAINT `FK_EXPORT_ITEM` FOREIGN KEY (`item_id`) REFERENCES `tbl_items` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_export_bill
-- ----------------------------
INSERT INTO `tbl_export_bill` VALUES ('1', '1', '5.5', '30000', '1', '2016-02-08', 'Tom', '出货');
INSERT INTO `tbl_export_bill` VALUES ('2', '2', '3.5', '2000', '3', '2016-01-06', 'Tom', '出货');
INSERT INTO `tbl_export_bill` VALUES ('3', '5', '10', '1500', '2', '2016-01-26', 'Marry', '出货');
INSERT INTO `tbl_export_bill` VALUES ('4', '7', '40', '1850', '5', '2016-01-12', 'Marry', '出货');
INSERT INTO `tbl_export_bill` VALUES ('C1', '12', '63.3', '250', '4', '2016-05-04', 'admin', '商品出货');
INSERT INTO `tbl_export_bill` VALUES ('C2', '12', '63.3', '50', '4', '2016-05-04', 'admin', '商品出货');
INSERT INTO `tbl_export_bill` VALUES ('EX002', 'XM9988', '36.6', '1000', '3', '2016-03-17', 'Jim', '出货');
INSERT INTO `tbl_export_bill` VALUES ('EX02', 'po42', '33', '1500', '2', '2016-03-26', 'Jim', '商品出货');

-- ----------------------------
-- Table structure for `tbl_import_bill`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_import_bill`;
CREATE TABLE `tbl_import_bill` (
  `import_id` varchar(255) NOT NULL,
  `item_id` varchar(10) DEFAULT NULL,
  `import_price` double DEFAULT NULL,
  `import_amount` int(11) DEFAULT NULL,
  `supp_id` varchar(10) DEFAULT NULL,
  `import_date` date DEFAULT NULL,
  `import_person` varchar(20) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`import_id`),
  KEY `FK_IMPORT_ITEM` (`item_id`),
  CONSTRAINT `FK_IMPORT_ITEM` FOREIGN KEY (`item_id`) REFERENCES `tbl_items` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_import_bill
-- ----------------------------
INSERT INTO `tbl_import_bill` VALUES ('1', '1', '3', '50000', '1', '2015-09-22', 'Tom', '进货');
INSERT INTO `tbl_import_bill` VALUES ('2', '2', '2', '27000', '3', '2015-10-19', 'Tom', '进货');
INSERT INTO `tbl_import_bill` VALUES ('3', '3', '2', '15000', '7', '2015-09-20', 'Marry', '进货');
INSERT INTO `tbl_import_bill` VALUES ('4', '4', '6', '3000', '1', '2015-10-06', 'Tom', '进货');
INSERT INTO `tbl_import_bill` VALUES ('5', '5', '8', '1500', '2', '2015-12-26', 'Marry', '进货');
INSERT INTO `tbl_import_bill` VALUES ('6', '6', '20', '2000', '4', '2015-12-16', 'Tom', '进货');
INSERT INTO `tbl_import_bill` VALUES ('7', '7', '20', '2000', '5', '2016-01-11', 'Marry', '进货');
INSERT INTO `tbl_import_bill` VALUES ('IM006', 'XM9988', '30', '3000', '3', '2016-03-11', 'Marry', '进货');
INSERT INTO `tbl_import_bill` VALUES ('IM02', 'po42', '20', '3000', '2', '2016-03-11', 'Jim', '商品进货');
INSERT INTO `tbl_import_bill` VALUES ('IMOP9097', 'XM9988', '36.6', '1500', '3', '2016-03-25', 'Tom', '商品进货');
INSERT INTO `tbl_import_bill` VALUES ('J1', '12', '4.5', '500', '4', '2016-05-04', 'admin', '商品进货');
INSERT INTO `tbl_import_bill` VALUES ('J2', '12', '4.5', '300', '4', '2016-05-04', 'admin', '商品进货');
INSERT INTO `tbl_import_bill` VALUES ('J3', '12', '4.5', '50', '4', '2016-05-04', 'admin', '商品进货');

-- ----------------------------
-- Table structure for `tbl_items`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_items`;
CREATE TABLE `tbl_items` (
  `item_id` varchar(10) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `unit_id` int(11) NOT NULL,
  `catagorgy_id` int(11) NOT NULL,
  `supp_id` varchar(10) DEFAULT NULL,
  `retail_price` double NOT NULL,
  `item_pic` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `safe_amount` bigint(20) DEFAULT NULL,
  `activity_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FK_ITEM_UNIT` (`unit_id`),
  KEY `FK_ITEM_CATAGORGY` (`catagorgy_id`),
  KEY `FK_ITEM_SUPPLIER` (`supp_id`),
  KEY `activity_id` (`activity_id`),
  CONSTRAINT `FK_ITEM_CATAGORGY` FOREIGN KEY (`catagorgy_id`) REFERENCES `tbl_catagorgy` (`catagorgy_id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_ITEM_SUPPLIER` FOREIGN KEY (`supp_id`) REFERENCES `tbl_suppliers` (`supp_id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_ITEM_UNIT` FOREIGN KEY (`unit_id`) REFERENCES `tbl_unit` (`unit_id`) ON UPDATE CASCADE,
  CONSTRAINT `tbl_items_ibfk_1` FOREIGN KEY (`activity_id`) REFERENCES `tbl_activity` (`activity_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_items
-- ----------------------------
INSERT INTO `tbl_items` VALUES ('1', 'XX牌果冻', '3', '5', '1', '5.5', 'source/upload/itemPic/1.jpg', null, '600', '1');
INSERT INTO `tbl_items` VALUES ('10', '随便', '4', '5', '8', '35.8', 'source/upload/itemPic/2.jpg', '新增商品', '2000', '1');
INSERT INTO `tbl_items` VALUES ('12', 'rete', '3', '303', '4', '63.3', ',resources/upload/itemPic/1462373924908.jpg', '修改商品', '1600', '1');
INSERT INTO `tbl_items` VALUES ('13', '喜之郎', '3', '1', '1', '6.5', 'source/upload/itemPic/1.jpg', null, '300', '16');
INSERT INTO `tbl_items` VALUES ('2', 'AA牌果冻', '3', '28', '3', '3.5', 'source/upload/itemPic/1.jpg', null, '450', '6');
INSERT INTO `tbl_items` VALUES ('20', 'aaa', '3', '2', '3', '66', 'source/upload/itemPic/1.jpg', null, '25435', '2');
INSERT INTO `tbl_items` VALUES ('21', 'bbb', '2', '3', '3', '888', 'source/upload/itemPic/1.jpg', null, '57875', '4');
INSERT INTO `tbl_items` VALUES ('3', 'YY牌果冻', '3', '28', '7', '4', 'source/upload/itemPic/1.jpg', null, '320', '1');
INSERT INTO `tbl_items` VALUES ('4', '牛肉干', '1', '30', '1', '7.5', 'source/upload/itemPic/1.jpg', null, '440', '2');
INSERT INTO `tbl_items` VALUES ('5', 'AQ牛肉干', '1', '30', '2', '10', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', null, '550', '8');
INSERT INTO `tbl_items` VALUES ('6', 'AAA饼干', '2', '29', '4', '30', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', null, '530', '1');
INSERT INTO `tbl_items` VALUES ('7', 'AQ饼干', '2', '29', '5', '35', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', null, '310', '9');
INSERT INTO `tbl_items` VALUES ('9', 'XXX', '3', '5', 'ggg', '33.2', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', '新增商品', '1500', '7');
INSERT INTO `tbl_items` VALUES ('po42', 'poi', '3', '25', '2', '33', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', '增加商品', '300', '1');
INSERT INTO `tbl_items` VALUES ('XM9988', 'AAAAA', '5', '31', '3', '36.6', ',resources/upload/itemPic/be.jpg,resources/upload/itemPic/be.jpg', '', '1500', '1');

-- ----------------------------
-- Table structure for `tbl_role`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role`;
CREATE TABLE `tbl_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(10) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role
-- ----------------------------
INSERT INTO `tbl_role` VALUES ('1', '管理员');
INSERT INTO `tbl_role` VALUES ('2', '员工');

-- ----------------------------
-- Table structure for `tbl_stocks`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stocks`;
CREATE TABLE `tbl_stocks` (
  `item_id` varchar(10) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `safe_amount` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  CONSTRAINT `FK_STOCKS_ITEM` FOREIGN KEY (`item_id`) REFERENCES `tbl_items` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_stocks
-- ----------------------------
INSERT INTO `tbl_stocks` VALUES ('1', '20000', null);
INSERT INTO `tbl_stocks` VALUES ('2', '25000', null);
INSERT INTO `tbl_stocks` VALUES ('3', '15000', null);
INSERT INTO `tbl_stocks` VALUES ('4', '3000', null);
INSERT INTO `tbl_stocks` VALUES ('5', '3000', null);
INSERT INTO `tbl_stocks` VALUES ('6', '2000', null);
INSERT INTO `tbl_stocks` VALUES ('7', '150', null);

-- ----------------------------
-- Table structure for `tbl_suppliers`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_suppliers`;
CREATE TABLE `tbl_suppliers` (
  `supp_id` varchar(10) NOT NULL,
  `supp_name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `contact_person` varchar(20) NOT NULL,
  `account` varchar(100) NOT NULL,
  `bank` varchar(100) NOT NULL,
  `activity_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`supp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_suppliers
-- ----------------------------
INSERT INTO `tbl_suppliers` VALUES ('1', '天公司', '上海浦东区', '021-12345678', '张飞', '6212292000667267799', '工商银行', null);
INSERT INTO `tbl_suppliers` VALUES ('2', '地公司', '南京白下区', '025-12345678', '黄忠', '6212292000667267799', '交通银行', null);
INSERT INTO `tbl_suppliers` VALUES ('3', '玄公司', '南京鼓楼区', '025-12345678', '黄盖', '6212292000667267799', '招商银行', null);
INSERT INTO `tbl_suppliers` VALUES ('4', '黄公司', '上海虹口区', '021-12345678', '张辽', '6212292000667267799', '广发银行', null);
INSERT INTO `tbl_suppliers` VALUES ('5', '日公司', '上海闸口区', '021-12345678', '许褚', '6212292000667267799', '农业银行', null);
INSERT INTO `tbl_suppliers` VALUES ('6', '月公司', '南京秦淮区', '025-12345678', '诸葛亮', '6212292000667267799', '工商银行', null);
INSERT INTO `tbl_suppliers` VALUES ('7', '盈公司', '南京秦淮区', '025-12345678', '曹操', '6212292000667267799', '广发银', null);
INSERT INTO `tbl_suppliers` VALUES ('8', '昃公司', '上海浦东区', '021-12345678', '吕布', '6212292000667267799', 'gggg', null);
INSERT INTO `tbl_suppliers` VALUES ('ggg', '昃公司的对的', '上海浦东区', '021-12345678', '吕布', '6212292000667267799', '光大银行', null);
INSERT INTO `tbl_suppliers` VALUES ('SU003', '尧舜禹', '上海嘉定', '021-12345678', '李世民', '6212292000667267799', '花旗银行', null);
INSERT INTO `tbl_suppliers` VALUES ('SU1', '测试供应商', '测试供应商', '01', '测试供应商', '01', '测试供应商', null);

-- ----------------------------
-- Table structure for `tbl_unit`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_unit`;
CREATE TABLE `tbl_unit` (
  `unit_id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_name` varchar(20) NOT NULL,
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_unit
-- ----------------------------
INSERT INTO `tbl_unit` VALUES ('1', '包');
INSERT INTO `tbl_unit` VALUES ('2', '盒');
INSERT INTO `tbl_unit` VALUES ('3', '个');
INSERT INTO `tbl_unit` VALUES ('4', '份');
INSERT INTO `tbl_unit` VALUES ('5', '瓶');
INSERT INTO `tbl_unit` VALUES ('6', '件');
INSERT INTO `tbl_unit` VALUES ('9', '理解');
INSERT INTO `tbl_unit` VALUES ('10', 'ooo');
INSERT INTO `tbl_unit` VALUES ('11', 're');

-- ----------------------------
-- Table structure for `tbl_user`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `work_code` varchar(50) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK_USER_ROLE` (`role_id`),
  CONSTRAINT `FK_ROLE_USER` FOREIGN KEY (`role_id`) REFERENCES `tbl_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('2', '2', 'CCC', 'Jim', '2sb386hRPCrVf+3vE0Nn8Q==', null, null, null);
INSERT INTO `tbl_user` VALUES ('3', '2', 'SSS', 'Marry', '1234', null, null, null);
INSERT INTO `tbl_user` VALUES ('4', '2', '1654', 'Kate', '1234', null, null, null);
INSERT INTO `tbl_user` VALUES ('7', '2', '1654', 'Jam', '1234', null, null, null);
INSERT INTO `tbl_user` VALUES ('9', '2', 'TTT', '天地', '12345678', null, null, null);
INSERT INTO `tbl_user` VALUES ('11', '2', 'ehaqtr', 'Kate', 'edt1kkp7oQw=', null, null, null);
INSERT INTO `tbl_user` VALUES ('12', '1', 'sdfg', '炎帝', 'wWtaKLScu/4=', null, null, null);
INSERT INTO `tbl_user` VALUES ('15', '2', 'user', 'user', 'QyBls70IRDo=', null, null, null);
INSERT INTO `tbl_user` VALUES ('16', '1', 'admin', 'admin', 'QyBls70IRDo=', null, null, null);
INSERT INTO `tbl_user` VALUES ('17', '2', 'yuhui', 'yuhui', '2sb386hRPCrVf+3vE0Nn8Q==', null, null, null);

-- ----------------------------
-- View structure for `activityinfoview`
-- ----------------------------
DROP VIEW IF EXISTS `activityinfoview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `activityinfoview` AS select `tbl_activity`.`activity_id` AS `activity_id`,`tbl_activity`.`activity_name` AS `activity_name`,`tbl_activity`.`start_time` AS `start_time`,`tbl_activity`.`end_time` AS `end_time`,`tbl_activity`.`discount` AS `discount`,`tbl_activity`.`full_count` AS `full_count`,`tbl_activity`.`substract_count` AS `substract_count`,`tbl_activity_type`.`type_name` AS `type_name` from (`tbl_activity` join `tbl_activity_type` on((`tbl_activity`.`type_id` = `tbl_activity_type`.`type_id`))) ;

-- ----------------------------
-- View structure for `billinfoview`
-- ----------------------------
DROP VIEW IF EXISTS `billinfoview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `billinfoview` AS select distinct `tbl_bill`.`id` AS `id`,if((`tbl_bill`.`action_tag` = 1),'进货','出货') AS `action_tag`,`tbl_bill`.`action_id` AS `action_id`,`tbl_items`.`item_name` AS `item_name`,`tbl_bill`.`action_price` AS `action_price`,`tbl_bill`.`action_amount` AS `action_amount`,`tbl_suppliers`.`supp_name` AS `supp_name`,`tbl_bill`.`action_date` AS `action_date`,`tbl_bill`.`action_person` AS `action_person`,`tbl_bill`.`note` AS `note`,`tbl_unit`.`unit_name` AS `unit_name`,`tbl_catagorgy`.`catagorgy_name` AS `cata_name`,`tbl_items`.`item_id` AS `item_id`,`tbl_suppliers`.`supp_id` AS `supp_id`,`tbl_items`.`safe_amount` AS `safe_amount` from ((((`tbl_bill` join `tbl_suppliers` on((`tbl_bill`.`supp_id` = `tbl_suppliers`.`supp_id`))) join `tbl_items` on((`tbl_bill`.`item_id` = `tbl_items`.`item_id`))) join `tbl_catagorgy` on((`tbl_items`.`catagorgy_id` = `tbl_catagorgy`.`catagorgy_id`))) join `tbl_unit` on((`tbl_items`.`unit_id` = `tbl_unit`.`unit_id`))) order by `tbl_bill`.`action_date` desc ;

-- ----------------------------
-- View structure for `iteminfoview`
-- ----------------------------
DROP VIEW IF EXISTS `iteminfoview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`alex`@`127.0.0.1` SQL SECURITY DEFINER VIEW `iteminfoview` AS select `tbl_items`.`item_id` AS `item_id`,`tbl_items`.`item_name` AS `item_name`,`tbl_catagorgy`.`catagorgy_name` AS `cata_name`,`tbl_unit`.`unit_name` AS `unit_name`,`tbl_items`.`item_pic` AS `item_pic`,`tbl_items`.`retail_price` AS `retail_price`,ifnull(`a`.`import_price`,0) AS `import_price`,(ifnull(`a`.`count_import`,0) - ifnull(`b`.`count_export`,0)) AS `stocks`,`tbl_items`.`safe_amount` AS `safe_amount`,`tbl_items`.`note` AS `note`,`tbl_suppliers`.`supp_name` AS `supp_name`,`tbl_items`.`supp_id` AS `supp_id`,`tbl_suppliers`.`phone` AS `phone`,`tbl_suppliers`.`contact_person` AS `contact_person`,`activity`.`activity_name` AS `activity_name`,`activity`.`start_time` AS `start_time`,`activity`.`end_time` AS `end_time`,`activity`.`discount` AS `discount`,`activity`.`full_count` AS `full_count`,`activity`.`substract_count` AS `substract_count`,`activity`.`type_name` AS `type_name` from ((((((`tbl_items` left join `view_count_import` `a` on((`tbl_items`.`item_id` = `a`.`item_id`))) left join `view_count_export` `b` on((`tbl_items`.`item_id` = `b`.`item_id`))) join `tbl_suppliers` on((`tbl_items`.`supp_id` = `tbl_suppliers`.`supp_id`))) join `tbl_unit` on((`tbl_items`.`unit_id` = `tbl_unit`.`unit_id`))) join `tbl_catagorgy` on((`tbl_items`.`catagorgy_id` = `tbl_catagorgy`.`catagorgy_id`))) join `activityinfoview` `activity` on((`tbl_items`.`activity_id` = `activity`.`activity_id`))) ;

-- ----------------------------
-- View structure for `userview`
-- ----------------------------
DROP VIEW IF EXISTS `userview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `userview` AS select `tbl_user`.`user_id` AS `user_id`,`tbl_user`.`work_code` AS `work_code`,`tbl_user`.`user_name` AS `user_name`,`tbl_user`.`password` AS `password`,`tbl_role`.`role_name` AS `role_name`,`tbl_user`.`role_id` AS `role_id` from (`tbl_user` join `tbl_role` on((`tbl_user`.`role_id` = `tbl_role`.`role_id`))) ;

-- ----------------------------
-- View structure for `view_count_export`
-- ----------------------------
DROP VIEW IF EXISTS `view_count_export`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `view_count_export` AS select `tbl_export_bill`.`item_id` AS `item_id`,sum(ifnull(`tbl_export_bill`.`export_amount`,0)) AS `count_export`,ifnull(`tbl_export_bill`.`export_price`,0) AS `export_price` from `tbl_export_bill` group by `tbl_export_bill`.`item_id` ;

-- ----------------------------
-- View structure for `view_count_import`
-- ----------------------------
DROP VIEW IF EXISTS `view_count_import`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `view_count_import` AS select `tbl_import_bill`.`item_id` AS `item_id`,ifnull(`tbl_import_bill`.`import_price`,0) AS `import_price`,sum(ifnull(`tbl_import_bill`.`import_amount`,0)) AS `count_import` from `tbl_import_bill` group by `tbl_import_bill`.`item_id` ;
DROP TRIGGER IF EXISTS `exportTrigger`;
DELIMITER ;;
CREATE TRIGGER `exportTrigger` AFTER INSERT ON `tbl_export_bill` FOR EACH ROW BEGIN
    insert into tbl_bill (
        action_tag, action_id, item_id, action_price, action_amount, supp_id, action_date, action_person, note)
    values (
        0, 
        new.export_id, 
        new.item_id, 
        new.export_price, 
        new.export_amount, 
        new.supp_id, 
        new.export_date, 
        new.export_person, 
        new.note);
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `importTrigger`;
DELIMITER ;;
CREATE TRIGGER `importTrigger` AFTER INSERT ON `tbl_import_bill` FOR EACH ROW BEGIN
    insert into tbl_bill (
        action_tag, action_id, item_id, action_price, action_amount, supp_id, action_date, action_person, note)
    values (
        1, 
        new.import_id, 
        new.item_id, 
        new.import_price, 
        new.import_amount, 
        new.supp_id, 
        new.import_date, 
        new.import_person, 
        new.note);
END
;;
DELIMITER ;

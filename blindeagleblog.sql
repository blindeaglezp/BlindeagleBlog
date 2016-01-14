/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : blindeagleblog

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-01-14 19:36:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for normalweb
-- ----------------------------
DROP TABLE IF EXISTS `normalweb`;
CREATE TABLE `normalweb` (
  `norWebId` int(11) NOT NULL AUTO_INCREMENT,
  `norWebName` varchar(100) DEFAULT NULL,
  `norWebUrl` varchar(100) DEFAULT NULL,
  `norWebSubId` int(11) DEFAULT NULL,
  PRIMARY KEY (`norWebId`),
  KEY `norWebSubId` (`norWebSubId`),
  CONSTRAINT `norWebSubId` FOREIGN KEY (`norWebSubId`) REFERENCES `normalwebsubject` (`norWebSubId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of normalweb
-- ----------------------------
INSERT INTO `normalweb` VALUES ('1', '潭州教育', 'http://www.tanzhoujiaoyu.com/', '1');
INSERT INTO `normalweb` VALUES ('2', '126邮箱', 'http://mail.126.com/', '2');
INSERT INTO `normalweb` VALUES ('5', '新浪邮箱', 'mail.sina.com.cn', '2');
INSERT INTO `normalweb` VALUES ('10', 'icafe', 'http://cafe.baidu.com/#panel1', '4');
INSERT INTO `normalweb` VALUES ('13', 'xw素材网', 'http://www.xwcms.net/', '3');
INSERT INTO `normalweb` VALUES ('14', '阿里巴巴矢量图', 'http://www.iconfont.cn/', '3');
INSERT INTO `normalweb` VALUES ('15', 'google文档', 'https://docs.google.com/document/', '4');
INSERT INTO `normalweb` VALUES ('16', '思鹏代码库', 'http://qxw1146880046.my3w.com/', '3');
INSERT INTO `normalweb` VALUES ('17', 'facebook', 'https://www.facebook.com/', '2');
INSERT INTO `normalweb` VALUES ('18', 'JFreeChart使用', 'http://blog.csdn.net/itmyhome1990/article/details/36898497', '1');
INSERT INTO `normalweb` VALUES ('19', 'mysql教程', 'http://www.runoob.com/mysql/mysql-tutorial.html', '1');
INSERT INTO `normalweb` VALUES ('20', 'Oracle教程', 'http://www.cnblogs.com/gossip/archive/2011/12/01/2270674.html', '1');
INSERT INTO `normalweb` VALUES ('21', 'C3P0', 'http://blog.csdn.net/u012750578/article/details/15436423', '1');
INSERT INTO `normalweb` VALUES ('22', 'Maven教程', 'http://www.yiibai.com/maven/', '1');
INSERT INTO `normalweb` VALUES ('23', '百度传课', 'http://www.chuanke.com/', '1');
INSERT INTO `normalweb` VALUES ('24', '网易云课堂', 'http://study.163.com/', '1');
INSERT INTO `normalweb` VALUES ('25', '黑马程序员', 'http://www.itheima.com/', '1');
INSERT INTO `normalweb` VALUES ('27', '在线ps', 'http://www.uupoop.com/', '4');
INSERT INTO `normalweb` VALUES ('28', '站长工具', 'http://tool.chinaz.com/', '4');
INSERT INTO `normalweb` VALUES ('29', '站长素材', 'http://sc.chinaz.com/', '3');
INSERT INTO `normalweb` VALUES ('30', 'w3school', 'http://www.w3school.com.cn/', '6');
INSERT INTO `normalweb` VALUES ('31', 'AndroidDevTools', 'http://www.androiddevtools.cn/donate.html', '4');
INSERT INTO `normalweb` VALUES ('32', 'aTool工具', 'http://www.atool.org/', '4');
INSERT INTO `normalweb` VALUES ('33', 'UI中国', 'http://www.atool.org/', '3');
INSERT INTO `normalweb` VALUES ('35', '逗比博客', 'http://dbqf.xyz', '2');
INSERT INTO `normalweb` VALUES ('36', 'JetBrains', 'https://www.jetbrains.com/', '4');
INSERT INTO `normalweb` VALUES ('37', 'californiacolleges', 'https://secure.californiacolleges.edu/', '2');
INSERT INTO `normalweb` VALUES ('38', '中华万年历', 'http://www.zhwnl.cn/', '4');
INSERT INTO `normalweb` VALUES ('39', 'Swing Gui', 'https://netbeans.org/kb/docs/java/quickstart-gui_zh_CN.html#getting_familiar', '1');
INSERT INTO `normalweb` VALUES ('42', '方正招聘', 'http://xiaoyuan.zhaopin.com/job/CC000108034J90000000000', '7');

-- ----------------------------
-- Table structure for normalwebsubject
-- ----------------------------
DROP TABLE IF EXISTS `normalwebsubject`;
CREATE TABLE `normalwebsubject` (
  `norWebSubId` int(11) NOT NULL AUTO_INCREMENT,
  `norWebSubject` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`norWebSubId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of normalwebsubject
-- ----------------------------
INSERT INTO `normalwebsubject` VALUES ('1', '学习网站');
INSERT INTO `normalwebsubject` VALUES ('2', '交流工具');
INSERT INTO `normalwebsubject` VALUES ('3', '素材网站');
INSERT INTO `normalwebsubject` VALUES ('4', '常用工具');
INSERT INTO `normalwebsubject` VALUES ('5', '项目开发');
INSERT INTO `normalwebsubject` VALUES ('6', '开发文档');
INSERT INTO `normalwebsubject` VALUES ('7', '求职招聘');

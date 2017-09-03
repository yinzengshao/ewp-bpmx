DROP TABLE IF EXISTS sys_config;
CREATE TABLE sys_config (
  config_id smallint(11) unsigned NOT NULL AUTO_INCREMENT,
  config_name varchar(100) DEFAULT NULL COMMENT '配置编码',
  config_value varchar(500) DEFAULT NULL COMMENT '配置值',
  PRIMARY KEY pk_sys_config(config_id),
  KEY idx_system_config_name (config_name)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统参数配置';
INSERT INTO sys_config VALUES ('148', 'site_name', 'Think.Admin Demo');
INSERT INTO sys_config VALUES ('149', 'site_copy', '尹增韶 © 2017');
INSERT INTO sys_config VALUES ('173', 'app_name', 'Think.Admin');
INSERT INTO sys_config VALUES ('174', 'app_version', '2.00 dev');

DROP TABLE IF EXISTS sys_menu;
CREATE TABLE sys_menu (
  menu_id smallint(20) unsigned NOT NULL AUTO_INCREMENT,
  menu_code 	varchar(10) NOT NULL COMMENT '菜单编码',
  p_menu_code varchar(10) COMMENT '父菜单编码，一级菜单为0',
  menu_name 	varchar(50) COMMENT '菜单名称',
  menu_url varchar(200) COMMENT '菜单URL',
  menu_icon 	varchar(50) COMMENT '菜单图标',
  order_num int COMMENT '排序',
  menu_status char(1) NOT NULL COMMENT '状态(0:禁用,1:启用)',
  CONSTRAINT pk_sys_menu PRIMARY KEY (menu_id),
  CONSTRAINT uk_menu_code UNIQUE KEY (menu_code)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('00', '0', '后台首页', '/main', 'fa fa-fw fa-tachometer', 0, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('01', '0', '系统管理', null, null, 1, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('0101', '01', '系统配置', null, null, 101, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010102', '0102', '系统参数', null, null, 010102, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010103', '0102', '文件存储', null, null, 010103, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('0102', '01', '系统权限', null, null, 102, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010201', '0101', '用户管理', '/sys/user/list', null, 10201, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010202', '0101', '角色管理', null, null, 10202, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010203', '0101', '菜单管理', null, null, 10203, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010204', '0101', '权限管理', null, null, 10204, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('02', '0', '流程中心', null, null, 2, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('0201', '02', '流程管理', null, null, 201, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('020101', '0201', '我的流程', null, null, 20101, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('020102', '0201', '流程发起', null, null, 20102, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('020103', '0201', '流程查询', null, null, 20103, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('020104', '0201', '流程说明', null, null, 20104, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('0202', '02', '流程定义', null, null, 202, 1);

DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
  user_id smallint(20) unsigned NOT NULL AUTO_INCREMENT,
  user_name varchar(50) NOT NULL COMMENT '用户名',
  user_pwd varchar(100) COMMENT '密码',
  user_email varchar(100) COMMENT '邮箱',
  user_mobile varchar(100) COMMENT '手机号',
  user_status char(1) COMMENT '状态：0-禁用，1-正常',
  login_num bigint(20) unsigned DEFAULT '0' COMMENT '登录次数',
  last_login_at datetime DEFAULT NULL COMMENT '最后登录时间',
  dept_code varchar(20) COMMENT '部门编码',
  create_at datetime COMMENT '创建时间',
  create_by datetime COMMENT '创建人',
  modified_at datetime COMMENT '修改时间',
  modified_by datetime COMMENT '修改人',
  PRIMARY KEY pk_sys_user (user_id),
  UNIQUE INDEX uk_user_name (user_name) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='系统用户';

CREATE TABLE sys_role (
  role_id bigint NOT NULL AUTO_INCREMENT,
  role_name varchar(100) COMMENT '角色名称',
  create_at datetime COMMENT '创建时间',
  PRIMARY KEY (role_id)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='角色';
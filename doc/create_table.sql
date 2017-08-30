DROP TABLE IF EXISTS sys_menu;
CREATE TABLE sys_menu (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  menu_code 	varchar(10) NOT NULL COMMENT '菜单编码',
  p_menu_code varchar(10) COMMENT '父菜单编码，一级菜单为0',
  menu_name 	varchar(50) COMMENT '菜单名称',
  menu_url varchar(200) COMMENT '菜单URL',
  menu_icon 	varchar(50) COMMENT '菜单图标',
  order_num int COMMENT '排序',
  menu_status char(1) NOT NULL COMMENT '状态(0:禁用,1:启用)',
  CONSTRAINT pk_sys_menu PRIMARY KEY (id),
  CONSTRAINT uk_menu_code UNIQUE KEY (menu_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单管理';

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('01', '0', '系统管理', null, null, 1, 1);

insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('0101', '01', '系统配置', null, null, 101, 1);
insert into sys_menu(menu_code,p_menu_code,menu_name,menu_url,menu_icon,order_num,menu_status)
values('010101', '0102', '后台首页', '/main', 'fa fa-fw fa-tachometer', 10101, 1);
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
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  user_name varchar(50) NOT NULL COMMENT '用户名',
  user_pwd varchar(100) COMMENT '密码',
  user_email varchar(100) COMMENT '邮箱',
  user_mobile varchar(100) COMMENT '手机号',
  user_status char(1) COMMENT '状态：0-禁用，1-正常',
  dept_code varchar(20) COMMENT '部门编码',
  create_at datetime COMMENT '创建时间',
  create_by datetime COMMENT '创建人',
  modified_at datetime COMMENT '修改时间',
  modified_by datetime COMMENT '修改人',
  PRIMARY KEY pk_sys_user (id),
  UNIQUE INDEX uk_user_name (user_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户';
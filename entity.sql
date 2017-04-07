/*********************************************ADDRESS***************************************************************/
CREATE TABLE address(
	ID INT(11) primary key NOT NULL AUTO_INCREMENT,
	MEMBER_ID INT(11) NOT NULL,
	NAME VARCHAR(5) NOT NULL,
	PROVINCE VARCHAR(5) NOT NULL,
	CITY VARCHAR(10) NOT NULL,
	AREA VARCHAR(40) NOT NULL,
	ADDRESS VARCHAR(40) NOT NULL,
	TELEPHONE VARCHAR(16) NOT NULL,
	EMAIL VARCHAR(60),
	ALIAS VARCHAR(20),
	ZIP_CODE VARCHAR(10),
	CREATE_TIME TIMESTAMP NOT NULL,
	IS_DEFAULT INT(2) NOT NULL,
	FOREIGN KEY(MEMBER_ID)
);

/*********************************************MEMBER***************************************************************/
CREATE TABLE MEMBER(
	ID INT(11) primary key NOT NULL AUTO_INCREMENT,
	ACCOUNT VARCHAR(20) NOT NULL,
	NICK_NAME VARCHAR(5) NOT NULL,
	NAME VARCHAR(5) NOT NULL,
	CERT_TYPE VARCHAR(10) NOT NULL,
	CERT_NO VARCHAR(40) NOT NULL,
	PASSWORD VARCHAR(40) NOT NULL,
	EMAIL VARCHAR(16) NOT NULL,
	MOBILE VARCHAR(60),
	STATUS INT(20),
	REGISTER_DATE_TIME TIMESTAMP(10),
	LAST_LOGIN_DATE_TIME TIMESTAMP NOT NULL,
	EXPRERIENCE INT(11) NOT NULL,
	SOURCE_ID INT(11) NOT NULL,
	PROVIDER VARCHAR(20) NOT NULL,
	PICTURE VARCHAR(120) NOT NULL,
	IS_MOBILE_AUTHED INT(2) NOT NULL,
	IS_EMAIL_AUTHED INT(2) NOT NULL,
	IS_VIP INT(2) NOT NULL,
	IS_CHARGE INT(2) NOT NULL,
	IS_VIRTUAL_ACCOUNT INT(2) NOT NULL,
	FOREIGN KEY(ID)
);

/*********************************************DRAW_RECORD***************************************************************/
-- Create table
create table DRAW_RECORD
(
  id               INT(11) primary key  AUTO_INCREMENT ,
  account          VARCHAR(40) not null COMMENT '会员帐号',
  create_date_time TIMESTAMP(6) not null COMMENT '创建时间',
  num_count        INT(8) not null COMMENT '号码个数',
  win_status       INT(2) COMMENT '中奖状态',
  ip               VARCHAR(40) COMMENT '会员帐号',
  ip_addr          VARCHAR(120) COMMENT 'ip直实地址',
  term_id          INT(10) COMMENT '会员帐号',
  num_str          TEXT not null COMMENT '号码内容',
  platform         INT(2) not null COMMENT '参与平台',
  term_no          VARCHAR(20) COMMENT '期数号',
  product_name     VARCHAR(40) COMMENT '产品名称',
  score            INT(11) COMMENT '消耗积',
  product_id       INT(11) COMMENT '产品ID',
  member_id        INT(11) COMMENT '会员Id',
  cover_image      VARCHAR(400) COMMENT '产品图片地址'
)
/*********************************************NUM_POOLS***************************************************************/
-- Create table
create table NUM_POOLS(
  id               INT(11) primary key  AUTO_INCREMENT,
  num         	   VARCHAR(8) not null,
  account          VARCHAR(40),
  create_date_time TIMESTAMP(6),
  draw_date_time   TIMESTAMP(6),
  win_status       INT(2) not null,
  term_id          VARCHAR(20)
)
/*********************************************PRODUCT***************************************************************/

-- Create table
create table PRODUCT
(
  id            INT(11) primary key  AUTO_INCREMENT,
  type_id       INT(11) not null,
  name          VARCHAR(40) not null,
  title         VARCHAR(400),
  keywords      VARCHAR(100),
  description   VARCHAR(200),
  detail_url    VARCHAR(100),
  money         INT(10,2) not null,
  total_part    INT(7) not null,
  mult_part     INT(7),
  hot           INT,
  is_pos        INT(1),
  status        INT(1) not null,
  subtitle      VARCHAR(40),
  pic_arr       VARCHAR(2000),
  create_time   TIMESTAMP(6) not null,
  max_part      INT(7),
  cover_image   VARCHAR(400),
  per_score     INT(7) default 2000,
  share_title   VARCHAR(40),
  share_content VARCHAR(200)
)

-- Add comments to the table 
comment on table PRODUCT
  is '产品表';
-- Add comments to the columns 
comment on column PRODUCT.type_id
  is '类别ID';
comment on column PRODUCT.name
  is '名称';
comment on column PRODUCT.title
  is '长标题';
comment on column PRODUCT.keywords
  is 'keywords';
comment on column PRODUCT.description
  is 'desc';
comment on column PRODUCT.detail_url
  is '详情页连接';
comment on column PRODUCT.money
  is '价格';
comment on column PRODUCT.total_part
  is '总份数';
comment on column PRODUCT.mult_part
  is '每次只能购买的这个数的倍数 -1(无限制)';
comment on column PRODUCT.hot
  is '热度';
comment on column PRODUCT.is_pos
  is '是否推荐 1/0 是/否';
comment on column PRODUCT.status
  is '状态';
comment on column PRODUCT.subtitle
  is '短标题';
comment on column PRODUCT.pic_arr
  is '图片集合';
comment on column PRODUCT.create_time
  is '创建时间';
comment on column PRODUCT.max_part
  is '限购份数';
comment on column PRODUCT.cover_image
  is '封面图片';
/*********************************************TERM***************************************************************/

-- Create table
create table TERM
(
  id             INT not null,
  term           VARCHAR(20) not null,
  product_id     INT not null,
  total_part     INT(7) not null,
  sold_part      INT(7),
  mod_part       INT(7),
  create_time    TIMESTAMP(6) not null,
  hot            INT,
  is_pos         INT(1),
  open_time      TIMESTAMP(6),
  status         INT(1) not null,
  account        VARCHAR(80),
  num       VARCHAR(20),
  open_counttime VARCHAR(20),
  mult_part      INT(7),
  max_part       INT(7),
  finish_time    TIMESTAMP(6),
  member_buy_num INT,
  member_ip      VARCHAR(120),
  member_id      INT,
  per_score      INT(7) default 2000
)

comment on table TERM
  is '期数';
-- Add comments to the columns 
comment on column TERM.term
  is '期数';
comment on column TERM.product_id
  is '产品id';
comment on column TERM.total_part
  is '总份数';
comment on column TERM.sold_part
  is '已销售份数';
comment on column TERM.mod_part
  is '剩余份数';
comment on column TERM.create_time
  is '创建时间';
comment on column TERM.hot
  is '热度';
comment on column TERM.is_pos
  is '是否推荐  1/0 是/否';
comment on column TERM.open_time
  is '开奖时间';
comment on column TERM.status
  is '状态';
comment on column TERM.account
  is '中奖人';
comment on column TERM.num
  is '开奖码';
comment on column TERM.open_counttime
  is '总时间相加';
comment on column TERM.mult_part
  is '每次只能购买的这个数的倍数 -1(无限制)';
comment on column TERM.max_part
  is '限购份数';
comment on column TERM.finish_time
  is '购买完成时间';
comment on column TERM.member_buy_num
  is '中奖人购买的份数';
comment on column TERM.member_ip
  is '中奖人的IP地址';
comment on column TERM.member_id
  is '中奖人id';
-- Create/Recreate primary, unique and foreign key constraints 
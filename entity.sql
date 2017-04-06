/*********************************************ADDRESS***************************************************************/
Create table
create table ADDRESS
(
  id          NUMBER not null,
  account     VARCHAR2(80) not null,
  name        VARCHAR2(20) not null,
  province    VARCHAR2(40) not null,
  city        VARCHAR2(40) not null,
  area        VARCHAR2(40) not null,
  address     VARCHAR2(400) not null,
  telephone   VARCHAR2(20) not null,
  email       VARCHAR2(100),
  alias       VARCHAR2(20),
  zip_code    VARCHAR2(20),
  create_time TIMESTAMP(6),
  is_default  NUMBER(1) not null
)
tablespace CLWEB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table ADDRESS
  is '收获地址表';
-- Add comments to the columns 
comment on column ADDRESS.account
  is '账户';
comment on column ADDRESS.name
  is '收货人';
comment on column ADDRESS.province
  is '省份';
comment on column ADDRESS.city
  is '城市';
comment on column ADDRESS.area
  is '区';
comment on column ADDRESS.address
  is '详细地址';
comment on column ADDRESS.telephone
  is '手机';
comment on column ADDRESS.email
  is 'email';
comment on column ADDRESS.alias
  is '别名';
comment on column ADDRESS.zip_code
  is '邮编';
comment on column ADDRESS.create_time
  is '创建时间';
comment on column ADDRESS.is_default
  is '是否默认';
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADDRESS
  add constraint PK_ADDRESS_ID primary key (ID)
  using index 
  tablespace CLWEB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Grant/Revoke object privileges 
grant select on ADDRESS to CLWEB_USER_RO;

/*********************************************DRAW_RECORD***************************************************************/
-- Create table
create table DRAW_RECORD
(
  id               NUMBER(11) not null,
  account          VARCHAR2(40) not null,
  create_date_time TIMESTAMP(6) not null,
  num_count        NUMBER(8) not null,
  win_status       NUMBER(2),
  ip               VARCHAR2(40),
  ip_addr          VARCHAR2(120),
  term_id          NUMBER(10),
  num_str          CLOB not null,
  platform         NUMBER(2) not null,
  term_no          VARCHAR2(20),
  product_name     VARCHAR2(40),
  score            NUMBER,
  product_id       NUMBER,
  member_id        NUMBER,
  cover_image      VARCHAR2(400)
)
tablespace CLWEB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column DRAW_RECORD.account
  is '会员帐号';
comment on column DRAW_RECORD.create_date_time
  is '创建时间';
comment on column DRAW_RECORD.num_count
  is '号码个数';
comment on column DRAW_RECORD.win_status
  is '中奖状态';
comment on column DRAW_RECORD.ip
  is 'ip';
comment on column DRAW_RECORD.ip_addr
  is 'ip直实地址';
comment on column DRAW_RECORD.num_str
  is '号码内容';
comment on column DRAW_RECORD.platform
  is '参与平台';
comment on column DRAW_RECORD.term_no
  is '期数号';
comment on column DRAW_RECORD.product_name
  is '产品名称';
comment on column DRAW_RECORD.score
  is '消耗积分';
comment on column DRAW_RECORD.product_id
  is '产品ID';
-- Create/Recreate primary, unique and foreign key constraints 
alter table DRAW_RECORD
  add constraint PK_DRAW_RECORD primary key (ID)
  using index 
  tablespace CLWEB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Grant/Revoke object privileges 
grant select on DRAW_RECORD to CLWEB_USER_RO;

/*********************************************NUM_POOLS***************************************************************/
-- Create table
create table NUM_POOLS
(
  id               NUMBER(11) not null,
  num         VARCHAR2(8) not null,
  account          VARCHAR2(40),
  create_date_time TIMESTAMP(6),
  draw_date_time   TIMESTAMP(6),
  win_status       NUMBER(2) not null,
  term_id          NUMBER(10)
)
tablespace CLWEB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column NUM_POOLS.num
  is '幸运号';
comment on column NUM_POOLS.account
  is '用户名';
comment on column NUM_POOLS.create_date_time
  is '创建时间';
comment on column NUM_POOLS.draw_date_time
  is '抽取时间';
comment on column NUM_POOLS.win_status
  is '中奖状态';
-- Create/Recreate primary, unique and foreign key constraints 
alter table NUM_POOLS
  add constraint PK_NUM_POOLS primary key (ID)
  using index 
  tablespace CLWEB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Grant/Revoke object privileges 
grant select on NUM_POOLS to CLWEB_USER_RO;

/*********************************************PRODUCT***************************************************************/

-- Create table
create table PRODUCT
(
  id            NUMBER not null,
  type_id       NUMBER not null,
  name          VARCHAR2(40) not null,
  title         VARCHAR2(400),
  keywords      VARCHAR2(100),
  description   VARCHAR2(200),
  detail_url    VARCHAR2(100),
  money         NUMBER(10,2) not null,
  total_part    NUMBER(7) not null,
  mult_part     NUMBER(7),
  hot           NUMBER,
  is_pos        NUMBER(1),
  status        NUMBER(1) not null,
  subtitle      VARCHAR2(40),
  pic_arr       VARCHAR2(2000),
  create_time   TIMESTAMP(6) not null,
  max_part      NUMBER(7),
  cover_image   VARCHAR2(400),
  per_score     NUMBER(7) default 2000,
  share_title   VARCHAR2(40),
  share_content VARCHAR2(200)
)
tablespace CLWEB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
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
-- Create/Recreate primary, unique and foreign key constraints 
alter table PRODUCT
  add constraint PK_LUXK_PRODUCT_ID primary key (ID)
  using index 
  tablespace CLWEB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Grant/Revoke object privileges 
grant select on PRODUCT to CLWEB_USER_RO;

/*********************************************TERM***************************************************************/

-- Create table
create table TERM
(
  id             NUMBER not null,
  term           VARCHAR2(20) not null,
  product_id     NUMBER not null,
  total_part     NUMBER(7) not null,
  sold_part      NUMBER(7),
  mod_part       NUMBER(7),
  create_time    TIMESTAMP(6) not null,
  hot            NUMBER,
  is_pos         NUMBER(1),
  open_time      TIMESTAMP(6),
  status         NUMBER(1) not null,
  account        VARCHAR2(80),
  num       VARCHAR2(20),
  open_counttime VARCHAR2(20),
  mult_part      NUMBER(7),
  max_part       NUMBER(7),
  finish_time    TIMESTAMP(6),
  member_buy_num NUMBER,
  member_ip      VARCHAR2(120),
  member_id      NUMBER,
  per_score      NUMBER(7) default 2000
)
tablespace CLWEB_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    next 8
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
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
alter table TERM
  add constraint PK_TERM_ID primary key (ID)
  using index 
  tablespace CLWEB_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table TERM
  add constraint FK_TERM_PRODUCT_ID foreign key (PRODUCT_ID)
  references PRODUCT (ID) on delete cascade;
-- Grant/Revoke object privileges 
grant select on TERM to CLWEB_USER_RO;

CREATE TABLE member (
  ID int(11) NOT NULL AUTO_INCREMENT,
  ACCOUNT varchar(40) NOT NULL,
  PASSWORD varchar(80) NOT NULL,
  nick_Name varchar(40) NOT NULL,
  name varchar(10) DEFAULT NULL,
  cert_No varchar(40) DEFAULT NULL,
  email varchar(80) DEFAULT NULL,
  mobile varchar(20) DEFAULT NULL,
  status int(11) DEFAULT NULL,
  register_Date_Time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  last_Login_Date_Time timestamp NULL DEFAULT 0000-00-00 00:00:00,
  source_Id int(11) DEFAULT NULL,
  provider varchar(20) DEFAULT NULL,
  picture varchar(120) DEFAULT NULL,
  is_Mobile_Authed int(11) DEFAULT NULL,
  is_Email_Authed int(11) DEFAULT NULL,
  is_VIP int(11) DEFAULT NULL,
  is_Charge int(11) DEFAULT NULL,
  is_Virtual_Account int(11) DEFAULT NULL,
  PRIMARY KEY (ID,ACCOUNT,PASSWORD,nick_Name),
  UNIQUE KEY ACCOUNT (ACCOUNT)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

<resultMap type="address" id="addressResultMap">
		<id property="id" column="id"/>
		<result property="memberId" column="MEMBER_ID"/>
		<result property="name" column="NAME"/>
		<result property="province" column="PROVINCE"/>
		<result property="city" column="CITY"/>
		<result property="area" column="AREA"/>
		<result property="address" column="ADDRESS"/>
		<result property="telephone" column="TELEPHONE"/>
		<result property="email" column="EMAIL"/>
		<result property="alias" column="ALIAS"/>
		<result property="zipCode" column="ZIP_CODE"/>
		<result property="createTime" column="CREATE_TIME"/>
		<result property="isDefault" column="IS_DEFAULT"/>		
	</resultMap>
	
CREATE TABLE address(
	ID INT(11) NOT NULL AUTO_INCREMENT,
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

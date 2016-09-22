package com.lucky.core.entity.member;

import java.util.Date;

public class Member {
	// 会员Id
	private Integer id;
	// 帐号
	private String account;
	// 显示的名字
	private String nickName;
	// 姓名
	private String name;
	// 证件类型
	private Integer certType;
	// 证件号码
	private String certNo;
	// 密码
	private String password;
	// 电子邮箱
	private String email;
	// 电话号码
	private String mobile;
	// 状态
	private Integer status;
	// 注册时间
	private Date registerDateTime;
	// 最后登录时间
	private Date lastLoginDateTime;
	// 总的经验值
	private Integer exprerience;
	// 来源编号
	private Integer sourceId;
	// 合作供应商
	private String provider;
	// 用户头像
	private String picture;
	// 是否手机验证通过
	private Integer isMobileAuthed;
	// 是否邮箱验证通过
	private Integer isEmailAuthed;
	// 是否VIP
	private Integer isVIP;
	// 是否充值
	private Integer isCharge; // 0未充值过 1充值过
	// 是否虚拟账户
	private Integer isVirtualAccount;// 0 否 1 是

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getRegisterDateTime() {
		return registerDateTime;
	}

	public void setRegisterDateTime(Date registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	public Date getLastLoginDateTime() {
		return lastLoginDateTime;
	}

	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}

	public Integer getExprerience() {
		return exprerience;
	}

	public void setExprerience(Integer exprerience) {
		this.exprerience = exprerience;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getIsMobileAuthed() {
		return isMobileAuthed;
	}

	public void setIsMobileAuthed(Integer isMobileAuthed) {
		this.isMobileAuthed = isMobileAuthed;
	}

	public Integer getIsEmailAuthed() {
		return isEmailAuthed;
	}

	public void setIsEmailAuthed(Integer isEmailAuthed) {
		this.isEmailAuthed = isEmailAuthed;
	}

	public Integer getIsVIP() {
		return isVIP;
	}

	public void setIsVIP(Integer isVIP) {
		this.isVIP = isVIP;
	}

	public Integer getIsCharge() {
		return isCharge;
	}

	public void setIsCharge(Integer isCharge) {
		this.isCharge = isCharge;
	}

	public Integer getIsVirtualAccount() {
		return isVirtualAccount;
	}

	public void setIsVirtualAccount(Integer isVirtualAccount) {
		this.isVirtualAccount = isVirtualAccount;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", account=" + account + ", nickName=" + nickName + ", name=" + name + ", certType="
				+ certType + ", certNo=" + certNo + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", status=" + status + ", registerDateTime=" + registerDateTime + ", lastLoginDateTime="
				+ lastLoginDateTime + ", exprerience=" + exprerience + ", sourceId=" + sourceId + ", provider="
				+ provider + ", picture=" + picture + ", isMobileAuthed=" + isMobileAuthed + ", isEmailAuthed="
				+ isEmailAuthed + ", isVIP=" + isVIP + ", isCharge=" + isCharge + ", isVirtualAccount="
				+ isVirtualAccount + "]";
	}

}

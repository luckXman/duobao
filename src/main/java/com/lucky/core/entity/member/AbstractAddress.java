package com.lucky.core.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * AbstractLuckAddress entity provides the base persistence definition of the
 * LuckAddress entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractAddress implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer memberId;			//账户
	private String name;			//接收人
	private String province;		//省份
	private String city;			//市
	private String area;			//区
	private String address;			//详细地址
	private String telephone;		//电话
	private String email;			//email
	private String alias;			//别名
	private String zipCode;			//邮编
	@JSONField(serialize=false)
	private Date createTime; 		//日期
	private Integer isDefault;		//是否默认 1/0=是/否;

	// Constructors

	/** default constructor */
	public AbstractAddress() {
	}

	/** minimal constructor */
	public AbstractAddress(Integer memberId, String name, String province,
			String city, String area, String address, String telephone,Integer isDefault) {
		this.memberId = memberId;
		this.name = name;
		this.province = province;
		this.city = city;
		this.area = area;
		this.address = address;
		this.telephone = telephone;
		this.isDefault=isDefault;
	}

	/** full constructor */
	public AbstractAddress(Integer memberId, String name, String province,
			String city, String area, String address, String telephone,
			String email, String alias,String zipCode,Date createTime,Integer isDefault) {
		this.memberId = memberId;
		this.name = name;
		this.province = province;
		this.city = city;
		this.area = area;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.alias = alias;
		this.zipCode=zipCode;
		this.createTime=createTime;
		this.isDefault=isDefault;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getmemberId() {
		return this.memberId;
	}

	public void setmemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

}
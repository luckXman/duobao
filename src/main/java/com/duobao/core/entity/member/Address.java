package com.duobao.core.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * LuckAddress entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Address extends AbstractAddress implements java.io.Serializable {

	// Constructors
	private static final long serialVersionUID = 1L;
	@JSONField(name = "full")
	private String fullAddress;

	// 多对一映射
	private Member member;

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(Integer account, String name, String province, String city, String area, String address,
			String telephone, Integer isDefault) {
		super(account, name, province, city, area, address, telephone, isDefault);
	}

	/** full constructor */
	public Address(Integer account, String name, String province, String city, String area, String address,
			String telephone, String email, String alias, String zipCode, Date createTime, Integer isDefault) {
		super(account, name, province, city, area, address, telephone, email, alias, zipCode, createTime, isDefault);
	}

	public String getFullAddress() {
		fullAddress = getProvince() + getCity() + getArea() + getAddress();
		return fullAddress;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}

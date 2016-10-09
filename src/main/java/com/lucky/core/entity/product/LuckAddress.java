package com.lucky.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * LuckAddress entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class LuckAddress extends AbstractLuckAddress implements java.io.Serializable {

	// Constructors
	private static final long serialVersionUID = 1L;
	@JSONField(name="full")
	private String fullAddress;

	/** default constructor */
	public LuckAddress() {
	}

	/** minimal constructor */
	public LuckAddress(String account, String name, String province, String city, String area, String address, String telephone,Integer isDefault) {
		super(account, name, province, city, area, address, telephone,isDefault);
	}

	/** full constructor */
	public LuckAddress(String account, String name, String province, String city, String area, String address, String telephone, String email,
			String alias, String zipCode, Date createTime,Integer isDefault) {
		super(account, name, province, city, area, address, telephone, email, alias, zipCode, createTime,isDefault);
	}

	public String getFullAddress() {
		fullAddress=getProvince()+getCity()+getArea()+getAddress();
		return fullAddress;
	}

}

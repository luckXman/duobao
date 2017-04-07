package com.duobao.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * LuckProduct entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@JSONField(serialize=false)
	private int typeId;
	
	private String typeName;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(Product productType, String name, String title, String keywords, String description, String detailUrl, Double money,
			Integer totalPart, Integer multPart, Integer hot, Integer isPos, Integer status, String subtitle, String picArr, Date createTime,
			Integer maxPart) {
		
	}

}

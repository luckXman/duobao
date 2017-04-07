package com.duobao.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.duobao.core.status.ProductType;

/**
 * AbstractLuckProduct entity provides the base persistence definition of the
 * LuckProduct entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduct implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	@JSONField(serialize = false)
	private ProductType productType;

	@JSONField(serialize = false)
	private String name; 

	private String title; 

	private String keywords; 

	@JSONField(name = "desc")
	private String description; 

	private String detailUrl; 

	@JSONField(serialize = false)
	private Double money;

	@JSONField(serialize = false)
	private Integer totalPart;

	@JSONField(name = "limitPart")
	private Integer maxPart;

	private Integer multPart;

	@JSONField(serialize = false)
	private Integer hot;

	@JSONField(serialize = false)
	private Integer isPos;

	@JSONField(serialize = false)
	private Integer status;
	
	private String subtitle; 

	private String picArr; 

	private String coverImage; 

	@JSONField(serialize = false)
	private Date createTime; 

	@JSONField(serialize = false)
	private Integer perScore = 2000; 
	// Constructors

	private String shareTitle; 

	private String shareContent; 

	/** default constructor */
	public AbstractProduct() {
	}

	/** minimal constructor */
	public AbstractProduct(ProductType productType, String name, Double money, Integer totalPart,
			Integer multPart, Integer status, Date createTime) {
		this.name = name;
		this.money = money;
		this.totalPart = totalPart;
		this.multPart = multPart;
		this.status = status;
		this.createTime = createTime;
		this.productType = productType;
	}

	/** full constructor */
	public AbstractProduct(ProductType productType, String name, String title, String keywords, String description,
			String detailUrl, Double money, Integer totalPart, Integer multPart, Integer hot, Integer isPos,
			Integer status, String subtitle, String picArr, Date createTime, Integer maxPart) {
		this.productType = productType;
		this.name = name;
		this.title = title;
		this.keywords = keywords;
		this.description = description;
		this.detailUrl = detailUrl;
		this.money = money;
		this.totalPart = totalPart;
		this.multPart = multPart;
		this.hot = hot;
		this.isPos = isPos;
		this.status = status;
		this.subtitle = subtitle;
		this.picArr = picArr;
		this.createTime = createTime;
		this.maxPart = maxPart;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getTotalPart() {
		return this.totalPart;
	}

	public void setTotalPart(Integer totalPart) {
		this.totalPart = totalPart;
	}

	public Integer getMultPart() {
		return this.multPart;
	}

	public void setMultPart(Integer multPart) {
		this.multPart = multPart;
	}

	public Integer getIsPos() {
		return this.isPos;
	}

	public void setIsPos(Integer isPos) {
		this.isPos = isPos;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * @return the picArr
	 */
	public String getPicArr() {
		return picArr;
	}

	/**
	 * @param picArr
	 *            the picArr to set
	 */
	public void setPicArr(String picArr) {
		this.picArr = picArr;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getMaxPart() {
		return maxPart;
	}

	public void setMaxPart(Integer maxPart) {
		this.maxPart = maxPart;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public Integer getPerScore() {
		return perScore;
	}

	public void setPerScore(Integer perScore) {
		this.perScore = perScore;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

}
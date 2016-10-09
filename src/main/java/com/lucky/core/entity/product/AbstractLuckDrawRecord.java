package com.lucky.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucky.core.status.Platform;
import com.lucky.core.status.WinStatus;

/**
 * AbstractLuckDrawRecord entity provides the base persistence definition of the
 * LuckDrawRecord entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractLuckDrawRecord implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	// Fields
	@JSONField(serialize = false)
	private Integer id;

	@JSONField(serialize = false)
	private String account;

	@JSONField(name = "mId")
	private Integer memberId;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS", name = "buyTime")
	private Date createDateTime;

	@JSONField(name = "num")
	private Integer numCount;

	@JSONField(serialize = false)
	private WinStatus winStatus;

	private String ip;

	private String ipAddr;

	@JSONField(serialize = false)
	private Integer termId;

	private String numStr;

	@JSONField(serialize = false)
	private Platform platform;

	private String termNo; //

	@JSONField(name = "pName")
	private String productName; //

	private Integer score; //

	@JSONField(name = "pid")
	private Integer productId;
	
	private String coverImage;

	// Constructors

	/** default constructor */
	public AbstractLuckDrawRecord() {
	}

	/** minimal constructor */
	public AbstractLuckDrawRecord(Integer termId) {
		this.termId = termId;
	}

	/** minimal constructor */
	public AbstractLuckDrawRecord(String account, Date createDateTime, Integer numCount, String numStr, String termNo, String productName,
			Integer score, Integer productId) {
		this.account = account;
		this.createDateTime = createDateTime;
		this.numCount = numCount;
		this.numStr = numStr;
		this.termNo = termNo;
		this.productName = productName;
		this.score = score;
		this.productId = productId;
	}

	/** full constructor */
	public AbstractLuckDrawRecord(String account, Date createDateTime, Integer numCount, WinStatus winStatus, String ip, String ipAddr,
			Integer termId, String numStr, Platform platform, String termNo, String productName, Integer score, Integer productId,String coverImage) {
		this.account = account;
		this.createDateTime = createDateTime;
		this.numCount = numCount;
		this.winStatus = winStatus;
		this.ip = ip;
		this.ipAddr = ipAddr;
		this.termId = termId;
		this.numStr = numStr;
		this.platform = platform;
		this.termNo = termNo;
		this.productName = productName;
		this.score = score;
		this.productId = productId;
		this.coverImage = coverImage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getCreateDateTime() {
		return this.createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Integer getNumCount() {
		return this.numCount;
	}

	public void setNumCount(Integer numCount) {
		this.numCount = numCount;
	}

	public WinStatus getWinStatus() {
		return this.winStatus;
	}

	public void setWinStatus(WinStatus winStatus) {
		this.winStatus = winStatus;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Integer getTermId() {
		return this.termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

	public String getNumStr() {
		return this.numStr;
	}

	public void setNumStr(String numStr) {
		this.numStr = numStr;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
}
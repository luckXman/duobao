package com.lucky.core.entity.product;

import java.util.Date;

import com.lucky.core.status.WinStatus;


/**
 * AbstractLuckNumPools entity provides the base persistence definition of the
 * LuckNumPools entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractLuckNumPools implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String luckNum;
	private String account;
	private Date createDateTime;
	private Date drawDateTime;
	private WinStatus winStatus;
	private Integer termId;

	// Constructors

	/** default constructor */
	public AbstractLuckNumPools() {
	}

	/** minimal constructor */
	public AbstractLuckNumPools(String luckNum, WinStatus winStatus) {
		this.luckNum = luckNum;
		this.winStatus = winStatus;
	}

	/** full constructor */
	public AbstractLuckNumPools(String luckNum, String account,
			Date createDateTime, Date drawDateTime, WinStatus winStatus, Integer termId) {
		this.luckNum = luckNum;
		this.account = account;
		this.createDateTime = createDateTime;
		this.drawDateTime = drawDateTime;
		this.winStatus = winStatus;
		this.termId = termId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLuckNum() {
		return this.luckNum;
	}

	public void setLuckNum(String luckNum) {
		this.luckNum = luckNum;
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

	public Date getDrawDateTime() {
		return this.drawDateTime;
	}

	public void setDrawDateTime(Date drawDateTime) {
		this.drawDateTime = drawDateTime;
	}

	public WinStatus getWinStatus() {
		return this.winStatus;
	}

	public void setWinStatus(WinStatus winStatus) {
		this.winStatus = winStatus;
	}

	public Integer getTermId() {
		return this.termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

}
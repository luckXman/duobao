package com.lucky.core.entity.product;

import java.util.Date;

import com.lucky.core.status.WinStatus;

/**
 * LuckNumPools entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class LuckNumPools extends AbstractLuckNumPools implements
		java.io.Serializable {

	// Constructors
	private String termNo; //��ʱ����
	
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public LuckNumPools() {
	}

	/** minimal constructor */
	public LuckNumPools(String luckNum, WinStatus winStatus) {
		super(luckNum, winStatus);
	}

	/** full constructor */
	public LuckNumPools(String luckNum, String account, Date createDateTime,
			Date drawDateTime, WinStatus winStatus, Integer termId) {
		super(luckNum, account, createDateTime, drawDateTime, winStatus, termId);
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

}

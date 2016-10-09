package com.lucky.core.entity.product;

import java.util.Date;

import com.lucky.core.status.WinStatus;

/**
 * LuckNumPools entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class NumPools extends AbstractNumPools implements
		java.io.Serializable {

	// Constructors
	private String termNo; //��ʱ����
	
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public NumPools() {
	}

	/** minimal constructor */
	public NumPools(String luckNum, WinStatus winStatus) {
		super(luckNum, winStatus);
	}

	/** full constructor */
	public NumPools(String luckNum, String account, Date createDateTime,
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

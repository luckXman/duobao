package com.duobao.core.entity.product;

import java.util.Date;

import com.duobao.core.status.WinStatus;

/**
 * LuckNumPools entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class NumPoolsEntity extends AbstractNumPools implements
		java.io.Serializable {

	// Constructors
	private String termNo; //��ʱ����
	
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public NumPoolsEntity() {
	}

	/** minimal constructor */
	public NumPoolsEntity(String luckNum, WinStatus winStatus) {
		super(luckNum, winStatus);
	}

	/** full constructor */
	public NumPoolsEntity(String luckNum, String account, Date createDateTime,
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

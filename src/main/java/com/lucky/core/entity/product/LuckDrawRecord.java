package com.lucky.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucky.core.status.Platform;
import com.lucky.core.status.WinStatus;
import com.lucky.core.utils.StringUtil;

/**
 * LuckDrawRecord entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class LuckDrawRecord extends AbstractLuckDrawRecord implements java.io.Serializable {

	private String status;
	
	@JSONField(serialize = false)
	private String startTime;
	
	@JSONField(serialize = false)
	private String endTime;

	@JSONField(serialize = false)
	private int winStatusValue;// -1ȫ�� 1������ 2�ѿ���
	// Constructors
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public LuckDrawRecord() {
	}

	/** minimal constructor */
	public LuckDrawRecord(Integer termId) {
		super(termId);
	}

	/** minimal constructor */
	public LuckDrawRecord(String account, Date createDateTime, Integer numCount, String numStr, String termNo, String productName,Integer score,Integer productId) {
		super(account, createDateTime, numCount, numStr, termNo, productName,score,productId);
	}

	/** full constructor */
	public LuckDrawRecord(String account, Date createDateTime, Integer numCount, WinStatus winStatus, String ip, String ipAddr, Integer termId,
			String numStr, Platform platform, String termNo, String productName,Integer score,Integer productId,String coverImage) {
		super(account, createDateTime, numCount, winStatus, ip, ipAddr, termId, numStr, platform, termNo, productName,score,productId,coverImage);
	}

	public String getStatus() {
		this.status = getWinStatus().getName();
		return status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@JSONField(name="account")
	public String getAccountSec(){
		if(!StringUtil.isNullOrBlank(this.getAccount())){
			return StringUtil.getSecStr(this.getAccount(), 1, this.getAccount().length());
		}
		return "null";
	}

	public int getWinStatusValue() {
		return winStatusValue;
	}

	public void setWinStatusValue(int winStatusValue) {
		this.winStatusValue = winStatusValue;
	}

}

package com.duobao.core.entity.product.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.duobao.core.utils.StringUtil;
/**
 * 页面模形
 * @author wb
 *
 */
public class UserDrawRecordVO implements java.io.Serializable {

	// d.account,d.member_id,d.num_count,d.win_status,d.cover_image,d.term_no,d.product_id,d.product_name,
	// t.account as win_account,t.total_part,t.mod_part
	private static final long serialVersionUID = 1L;
	@JSONField(name = "pid")
	private int productId;

	@JSONField(name = "pname")
	private String productName;

	@JSONField(name = "cimg")
	private String coverImage;

	@JSONField(name = "tid")
	private int termId;

	@JSONField(name = "tno")
	private String termNo;

	@JSONField(name = "wacc")
	private String winAccount;
	
	@JSONField(name = "wmid")
	private int winMemberId;

	@JSONField(serialize = false)
	private String Account;

	private String openNum;

	@JSONField(name = "jcount")
	private int joinCount;

	@JSONField(name = "mid")
	private int memberId;

	@JSONField(name = "tpart")
	private int totalPart;

	@JSONField(name = "lpart")
	private int lastPart;

	@JSONField(name = "status")
	private int winStatus;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
	private Date openTime;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public String getTermNo() {
		return termNo;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public String getWinAccount() {
		return StringUtil.getSecStr(winAccount, 1, winAccount.length());
	}

	public void setWinAccount(String winAccount) {
		this.winAccount = winAccount;
	}

	public String getOpenNum() {
		return openNum;
	}

	public void setOpenNum(String openNum) {
		this.openNum = openNum;
	}

	public int getJoinCount() {
		return joinCount;
	}

	public void setJoinCount(int joinCount) {
		this.joinCount = joinCount;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getTotalPart() {
		return totalPart;
	}

	public void setTotalPart(int totalPart) {
		this.totalPart = totalPart;
	}

	public int getLastPart() {
		return lastPart;
	}

	public void setLastPart(int lastPart) {
		this.lastPart = lastPart;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public int getWinStatus() {
		return winStatus;
	}

	public void setWinStatus(int winStatus) {
		this.winStatus = winStatus;
	}

	public String getSchedule() {
		double schedule = (Double.valueOf(this.totalPart - this.lastPart) / Double.valueOf(this.totalPart)) * 100;
		if (schedule < 1) {
			schedule = 1;
		}
		return schedule + "";
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public int getWinMemberId() {
		return winMemberId;
	}

	public void setWinMemberId(int winMemberId) {
		this.winMemberId = winMemberId;
	}

}

package com.duobao.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.duobao.core.status.TermStatus;
import com.duobao.core.utils.DateUtil;
import com.duobao.core.utils.StringUtil;
/**
 * LuckTerm entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Term extends AbstractTerm implements java.io.Serializable {

	// Constructors
	private static final long serialVersionUID = 1L; 
	
	@JSONField(name="status")
	private Integer statusValue;
	
	@JSONField(name="sellTerm")
	private String onsellTerm;

	/** default constructor */
	public Term() {
	}

	/** minimal constructor */
	public Term(Product luckProduct, String term, Integer totalPart, Date createTime, TermStatus status, Integer multPart) {
		super(luckProduct, term, totalPart, createTime, status, multPart);
	}

	/** full constructor */
	public Term(Product luckProduct, String term, Integer totalPart, Integer soldPart, Integer modPart, Date createTime, Integer hot,
			Integer isPos, Date openTime, TermStatus status, String account, String luckNum, String openCounttime, Integer multPart,
			Integer maxPart, Date finishTime, Integer memberBuyNum, String memberIp) {
		super(luckProduct, term, totalPart, soldPart, modPart, createTime, hot, isPos, openTime, status, account, luckNum, openCounttime, multPart,
				maxPart, finishTime, memberBuyNum, memberIp);
	}

	public String getFirstImage(){
		String url = "";
			if(this.getProduct()!= null){
				String arr = this.getProduct().getPicArr();
				if(!StringUtil.isNullOrBlank(arr)){
					url = arr.split(",")[0];
				}
			}
		return url;
	}

	public String getSchedule(){
		String schedule = "0";
			if(this.getTotalPart()!=null && this.getSoldPart()!=null){
				double result = Double.valueOf(this.getSoldPart())/Double.valueOf(this.getTotalPart())*100;
				schedule = String.format("%.1f", result);
			}
		return schedule;
	}
	
	public String getOpenTimeStr(){
		String openTimeStr = "null";
		Date openTime = this.getOpenTime();
		if(openTime != null){
			openTimeStr = DateUtil.isSameDate(openTime, new Date())?"今天"+DateUtil.dateToString(openTime, "HH:mm:ss"):DateUtil.dateToString(openTime);
		}
		return openTimeStr;
	}
	
	public String getOpenDateStr(){
		String openTimeStr = "null";
		Date openTime = this.getOpenTime();
		if(openTime != null){
			openTimeStr = DateUtil.isSameDate(openTime, new Date())?"今天":DateUtil.dateToString(openTime,"MM-dd");
		}
		return openTimeStr;
	}
	
	@JSONField(name="account")
	public String getAccountSec(){
		if(!StringUtil.isNullOrBlank(this.getAccount())){
			return StringUtil.getSecStr(this.getAccount(), 1, this.getAccount().length());
		}
		return "null";
	}
	
	@JSONField(name="openTimeAll")
	public String getOpenTimeAll(){
		if(this.getOpenTime() != null){
			return DateUtil.dateToString(this.getOpenTime(), "yyyy-MM-dd HH:mm:ss.SSS");
		}
		return "null";
	}

	public String getOnsellTerm() {
		return onsellTerm;
	}

	public void setOnsellTerm(String onsellTerm) {
		this.onsellTerm = onsellTerm;
	}
}

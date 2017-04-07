package com.duobao.core.entity.product;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.duobao.core.status.TermStatus;
import com.duobao.core.utils.DateUtil;

/**
 * AbstractLuckTerm entity provides the base persistence definition of the
 * LuckTerm entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractTerm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	// Fields
	@JSONField(name = "termId")
	private Integer id; //

	@JSONField(name = "product")
	private ProductEntity product; // 产品id

	private String term; // 期数

	private Integer totalPart; // 总份数

	private Integer soldPart; // 已销售份数

	private Integer modPart; // 剩余份数

	@JSONField(format = "yyyy-MM-dd HH:mm:ss", serialize = false)
	private Date createTime; // 创建时间

	@JSONField(serialize = false)
	private Integer hot; // 热度

	@JSONField(serialize = false)
	private Integer isPos; // 是否推荐 1/0 是/否

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date openTime; // 开奖时间

	@JSONField(serialize = false)
	private TermStatus status; // 状态

	@JSONField(serialize = false)
	private String account; // 中奖人

	@JSONField(name = "mId")
	private Integer memberId; // 中奖人

	private String luckNum; // 开奖码

	@JSONField(name = "sum")
	private String openCounttime; // 总时间相加

	private Integer multPart; // 每次只能购买的这个数的倍数 -1(无限制)

	private Integer maxPart; // 限购份数

	@JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
	private Date finishTime; // 完成时间

	@JSONField(name = "buyNum")
	private Integer memberBuyNum; // 中奖人购买的份数

	@JSONField(name = "ip")
	private String memberIp; // 中奖人的IP地址

	private Integer perScore; // 每份积分

	// Constructors

	/** default constructor */
	public AbstractTerm() {
	}

	/** minimal constructor */
	public AbstractTerm(ProductEntity product, String term, Integer totalPart, Date createTime, TermStatus status,
			Integer multPart) {
		this.product = product;
		this.term = term;
		this.totalPart = totalPart;
		this.createTime = createTime;
		this.status = status;
		this.multPart = multPart;
	}

	/** full constructor */
	public AbstractTerm(ProductEntity product, String term, Integer totalPart, Integer soldPart, Integer modPart,
			Date createTime, Integer hot, Integer isPos, Date openTime, TermStatus status, String account,
			String luckNum, String openCounttime, Integer multPart, Integer maxPart, Date finishTime,
			Integer memberBuyNum, String memberIp) {
		this.product = product;
		this.term = term;
		this.totalPart = totalPart;
		this.soldPart = soldPart;
		this.modPart = modPart;
		this.createTime = createTime;
		this.hot = hot;
		this.isPos = isPos;
		this.openTime = openTime;
		this.status = status;
		this.account = account;
		this.luckNum = luckNum;
		this.openCounttime = openCounttime;
		this.multPart = multPart;
		this.maxPart = maxPart;
		this.finishTime = finishTime;
		this.memberBuyNum = memberBuyNum;
		this.memberIp = memberIp;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductEntity getProduct() {
		return this.product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Integer getTotalPart() {
		return this.totalPart;
	}

	public void setTotalPart(Integer totalPart) {
		this.totalPart = totalPart;
	}

	public Integer getSoldPart() {
		return this.soldPart;
	}

	public void setSoldPart(Integer soldPart) {
		this.soldPart = soldPart;
	}

	public Integer getModPart() {
		return this.modPart;
	}

	public void setModPart(Integer modPart) {
		this.modPart = modPart;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsPos() {
		return this.isPos;
	}

	public void setIsPos(Integer isPos) {
		this.isPos = isPos;
	}

	public Date getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getLuckNum() {
		return this.luckNum;
	}

	public void setLuckNum(String luckNum) {
		this.luckNum = luckNum;
	}

	public String getOpenCounttime() {
		return this.openCounttime;
	}

	public void setOpenCounttime(String openCounttime) {
		this.openCounttime = openCounttime;
	}

	public Integer getMultPart() {
		return this.multPart;
	}

	public void setMultPart(Integer multPart) {
		this.multPart = multPart;
	}

	public Integer getMaxPart() {
		return this.maxPart;
	}

	public void setMaxPart(Integer maxPart) {
		this.maxPart = maxPart;
	}

	public String getPrizePeriod() {
		String minute = "";
		Date openResultTime = getOpenTime();
		if (openResultTime != null) {
			minute = DateUtil.getMinutes(openResultTime);
		}

		return minute;
	}

	public String getMemberIp() {
		return this.memberIp;
	}

	public void setMemberIp(String memberIp) {
		this.memberIp = memberIp;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public TermStatus getStatus() {
		return status;
	}

	public void setStatus(TermStatus status) {
		this.status = status;
	}

	public Integer getMemberBuyNum() {
		return memberBuyNum;
	}

	public void setMemberBuyNum(Integer memberBuyNum) {
		this.memberBuyNum = memberBuyNum;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getPerScore() {
		return perScore;
	}

	public void setPerScore(Integer perScore) {
		this.perScore = perScore;
	}

}
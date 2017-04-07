package com.duobao.core.entity.member;

import java.util.Date;
import java.util.List;

public class MemberEntity extends AbstractMember {
	private List<AddressEntity> addresses;

	public MemberEntity() {
		super();
	}

	public MemberEntity(Integer id, String account, String nickName, String name, Integer certType, String certNo,
			String password, String email, String mobile, Integer status, Date registerDateTime, Date lastLoginDateTime,
			Integer exprerience, Integer sourceId, String provider, String picture, Integer isMobileAuthed,
			Integer isEmailAuthed, Integer isVIP, Integer isCharge, Integer isVirtualAccount) {
		super(id, account, nickName, name, certType, certNo, password, email, mobile, status, registerDateTime,
				lastLoginDateTime, exprerience, sourceId, provider, picture, isMobileAuthed, isEmailAuthed, isVIP,
				isCharge, isVirtualAccount);
	}

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}

}

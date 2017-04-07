package com.duobao.core.dao.member;

import java.util.List;

import com.duobao.core.entity.member.AddressEntity;

public interface AddressDao {
	public AddressEntity getAddressById(int id);
	public int saveAddress(AddressEntity address);
	public void deleteAddressById(int id);
	public List<AddressEntity> getAllAddress();
	public List<AddressEntity> getAddressesByMemberId(int id);	
}

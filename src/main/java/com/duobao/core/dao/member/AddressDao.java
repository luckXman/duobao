package com.duobao.core.dao.member;

import java.util.List;

import com.duobao.core.entity.member.Address;

public interface AddressDao {
	public Address getAddressById(int id);
	public int saveAddress(Address address);
	public void deleteAddressById(int id);
	public List<Address> getAllAddress();
	public List<Address> getAddressesByMemberId(int id);	
}

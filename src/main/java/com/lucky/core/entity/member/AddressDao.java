package com.lucky.core.entity.member;

import java.util.List;

public interface AddressDao {
	public Address getAddressById(int id);
	public void saveAddress(Address address);
	public void deleteAddressById(int id);
	public List<Address> getAllAddress();
	public List<Address> getAddressesByMemberId(int id);	
}

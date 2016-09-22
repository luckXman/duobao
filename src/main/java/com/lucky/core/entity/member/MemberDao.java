package com.lucky.core.entity.member;

import java.util.List;

public interface MemberDao {
	public Member getMemberById(int id);
	public void saveMember(Member member);
	public void deleteMemberById(int id);
	
}

package com.lucky.core.dao.member;

import java.util.List;

import com.lucky.core.entity.member.Member;

public interface MemberDao {
	public Member getMemberById(int id);
	public void saveMember(Member member);
	public void deleteMemberById(int id);
	public List<Member> getAllMember();
}

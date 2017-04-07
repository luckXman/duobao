package com.duobao.core.dao.member;

import java.util.List;

import com.duobao.core.entity.member.Member;

public interface MemberDao {
	public Member getMemberById(int id);
	public void saveMember(Member member);
	public void deleteMemberById(int id);
	public List<Member> getAllMember();
}

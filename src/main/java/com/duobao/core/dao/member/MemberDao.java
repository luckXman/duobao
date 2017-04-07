package com.duobao.core.dao.member;

import java.util.List;

import com.duobao.core.entity.member.MemberEntity;

public interface MemberDao {
	public MemberEntity getMemberById(int id);
	public void saveMember(MemberEntity member);
	public void deleteMemberById(int id);
	public List<MemberEntity> getAllMember();
}

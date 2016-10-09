package com.lucky.core.test;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lucky.core.entity.member.Member;
import com.lucky.core.entity.member.MemberDao;

public class DaoTest {
	public static ApplicationContext ctx = null;

	@Before
	public void init() {
		System.out.println("init");
		ctx = new ClassPathXmlApplicationContext("springConfig.xml");
	}

	@Test
	public void springTest() {
		MemberDao dao = (MemberDao) ctx.getBean("memberDao");
		System.out.println(dao.getClass().getName());
		System.out.println(dao.getClass().getMethods());
		Method[] ms = dao.getClass().getMethods();
		for(Method mm :ms){
			System.out.println(mm.getName());
		}
		Member member = new Member();
		member.setAccount("test");
		member.setPassword("afdsa"); 
		member.setNickName("nickName");
		member.setRegisterDateTime(new Date());
		dao.saveMember(member);
	
		/*List<Member> members = dao.getAllMember();
		for (Member m : members) {
			System.out.println(m);
		}*/
	}

	@After
	public void after() {
		System.out.println("success");
	}
}

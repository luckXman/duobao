package com.lucky.core;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lucky.core.dao.member.AddressDao;
import com.lucky.core.dao.member.MemberDao;
import com.lucky.core.entity.member.Address;
import com.lucky.core.entity.member.Member;
import com.lucky.core.status.CommonStatus;

public class DaoTest {
	public static ApplicationContext ctx = null;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		System.out.println("-----------------------init----------------------------------");
	}

	
	@Test
	public void saveAddressTest(){
		AddressDao dao = (AddressDao) ctx.getBean("addressDao");
		MemberDao mDao = (MemberDao) ctx.getBean("memberDao");
		List<Address> addresses = dao.getAllAddress();
		System.out.println(addresses.size());
		Member member = mDao.getMemberById(6);
		System.out.println(member.toString());
		
		Address address = new Address();
		address.setAddress("address");
		address.setAlias("alias");
		address.setArea("area");
		address.setCity("city");
		address.setCreateTime(new Date());
		address.setEmail("");
		address.setIsDefault(CommonStatus.NO.getValue());
		address.setMember(member);
		address.setName("name");
		address.setProvince("pr0");
		address.setTelephone("telephone");
		address.setZipCode("zipCode");
		int id = dao.saveAddress(address);
		Address add = dao.getAddressById(id);
		System.out.println("save:"+add);
		//System.out.println(address);
	}
	
	//@Test
	public void springTest() {
		MemberDao dao = (MemberDao) ctx.getBean("memberDao");
		/*System.out.println(dao.getClass().getName());
		System.out.println(dao.getClass().getMethods());
		Method[] ms = dao.getClass().getMethods();
		for(Method mm :ms){
			System.out.println(mm.getName());
		}*/
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
		System.out.println("-------------------------------success---------------------------");
	}
}

package com.lucky.core;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lucky.core.entity.member.Member;

public class MybatisTest {
	public static void main(String[] args) {
		springTest();
		/*
		String resource = "myBatis.xml";
		InputStream is = MybatisTest.class.getResourceAsStream(resource);
		System.out.println(is);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		String statement = "memberMapper.insertMember";

		Member member = new Member();
		member.setAccount("testone2");
		member.setPassword("111111");
		member.setNickName("哈哈");
		member.setRegisterDateTime(new Date());
		System.out.println(session.insert(statement, member));
		session.commit();

		
		 * String statement2 =
		 * "com.lucky.entity.member.memberMapper.getMemberById"; Object memberd
		 * = session.selectOne(statement2,4); System.out.println(memberd);
		 

		
		 * String detele = "memberMapper.deleteMemberById";
		 * session.delete(detele,5); session.commit();
		 
	*/}

	public static void springTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");

	}
}

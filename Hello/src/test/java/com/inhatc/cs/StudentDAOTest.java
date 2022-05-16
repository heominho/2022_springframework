package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentDAOTest{
	@Inject
	private StudentInfoDAO dao;
	
	/*
	@Test
	public void testInsertMember() throws Exception{
		StudentInfoVO vo = new StudentInfoVO();
		vo.setSid("00001");
		vo.setSname("허민호");
		vo.setSadd("경기도 부천시 원미로");
		vo.setSphone("010-1234-5678");
		vo.setSemail("minho5584@naver.com");
		dao.insertMember(vo);
	}
	*/
	
	@Test
	public void readMember() throws Exception{
		System.out.println(dao.readMember("201844102"));
	}
	
	/*
	@Test
	public void testupdateMEmber() throws Exception{
		StudentInfoVO vo = new StudentInfoVO();
		vo.setSid("00001");
		vo.setSname("update name");
		vo.setSadd("update add");
		vo.setSphone("update phone");
		vo.setSemail("update email");
		dao.updateMember(vo);
	}
	*/
	/*
	@Test
	public void testdeleteMember() throws Exception{
		String sid="201844102";
		dao.deleteMember(sid);
	}
	*/
	/*
	@Test
	public void listCountMember() throws Exception{
		System.out.println(dao.listCount());
	}
	*/
	
	@Test
	public void listMember() throws Exception{
		System.out.println(dao.listAll());
	}
	
	
}
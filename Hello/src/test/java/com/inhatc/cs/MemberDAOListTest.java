package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class MemberDAOListTest{
	@Inject
	private MemberDAO dao;
	
	
	@Test
	public void listCountMember() throws Exception{
		System.out.println(dao.listCount());
	}
	
	
	@Test
	public void listMember() throws Exception{
		System.out.println(dao.listAll());
	}
	
}

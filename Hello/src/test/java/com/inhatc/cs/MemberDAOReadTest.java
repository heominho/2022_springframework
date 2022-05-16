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

public class MemberDAOReadTest{
	@Inject
	private MemberDAO dao;
	
	
	@Test
	public void testdeleteMember() throws Exception{
		String userid="user0";
		dao.deleteMember(userid);
	}
}

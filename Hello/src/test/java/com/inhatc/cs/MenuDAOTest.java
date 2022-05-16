package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.Menu201844102DAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class MenuDAOTest{
	@Inject
	private Menu201844102DAO dao;
	
	
	@Test
	public void testInsertMember() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMenuid(4);
		vo.setMenukind("menukind");
		vo.setMenuname("menuname");
		vo.setPrice(1);
		dao.insertMember(vo);
	}

	
	/*
	@Test
	public void readMember() throws Exception{
		System.out.println(dao.readMember(1));
	}
	*/
	/*
	@Test
	public void testupdateMEmber() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMenuid(1);
		vo.setMenukind("updatmenukind");
		vo.setMenuname("updatemenuid");
		vo.setPrice(130);
		dao.updateMember(vo);
	}
	*/
	/*
	@Test
	public void testdeleteMember() throws Exception{
		int menuid=1;
		dao.deleteMember(menuid);
	}
	*/
	/*
	
	@Test
	public void listCountMember() throws Exception{
		System.out.println(dao.listCount());
	}
	
	*/
	/*
	@Test
	public void listMember() throws Exception{
		System.out.println(dao.listAll());
	}
	
	*/
}
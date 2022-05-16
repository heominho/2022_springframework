package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class BoardTest{
	@Inject
	private BoardDAO dao;
	
	/*
	@Test
	public void testcreate() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("제목3");
		vo.setContent("내용3");
		vo.setWriter("글쓴이");
		dao.create(vo);
	}
	*/
	
	/*
	@Test
	public void testread() throws Exception{
		System.out.println(dao.read(2));
	}
	*/
	/*
	@Test
	public void testupdate() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setBno(2);
		vo.setTitle("update title");
		vo.setContent("update content");
		vo.setWriter("update writer");
		dao.update(vo);
	}
	*/
	/*
	@Test
	public void testdelete() throws Exception{
		int bno=2;
		dao.delete(bno);
	}
	*/
	
	
	
	@Test
	public void listMember() throws Exception{
		System.out.println(dao.listAll());
	}
	
	
}
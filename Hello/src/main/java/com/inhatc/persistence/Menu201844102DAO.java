package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MenuVO;

public interface Menu201844102DAO {
	public MenuVO readMember(int menuid) throws Exception;
	public void updateMember(MenuVO vo) throws Exception;
	public void deleteMember(int menuid) throws Exception;
	public void insertMember(MenuVO vo) throws Exception;

	public int listCount() throws Exception;
	
	public List<MenuVO> listAll() throws Exception;
}

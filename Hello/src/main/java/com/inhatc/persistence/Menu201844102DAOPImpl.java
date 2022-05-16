package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MenuVO;

@Repository
public class Menu201844102DAOPImpl implements Menu201844102DAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.Menu201844102Mapper";
	@Override
	public void insertMember(MenuVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}
	@Override
	public MenuVO readMember(int menuid) {
		return (MenuVO)sqlSession.selectOne(namespace+".selectMember",menuid);
	}
	@Override
	public void updateMember(MenuVO vo) {
		sqlSession.update(namespace+".update",vo);
	}
	@Override
	public void deleteMember(int menuid) {
		sqlSession.delete(namespace+".delete",menuid);
	}
	
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	
	@Override
	public List<MenuVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}

	
}

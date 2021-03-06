package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.mysql.cj.Session;

@Repository
public class BoardDAOimpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.BoardMapper";
	@Override
	public void create(BoardVO vo) {
		sqlSession.insert(namespace+".create",vo);
	}
	@Override
	public BoardVO read(Integer bno) {
		return (BoardVO)sqlSession.selectOne(namespace+".read",bno);
	}
	@Override
	public void update(BoardVO vo) {
		sqlSession.update(namespace+".update",vo);
	}
	@Override
	public void delete(Integer bno) {
		sqlSession.delete(namespace+".delete",bno);
	}
	
	
	@Override
	public List<BoardVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
	
	@Override
	public List<BoardVO> listPage(int page) throws Exception{
		if(page<=0) {
			page = 1;
		}
		page = (page -1) * 10;
		return sqlSession.selectList(namespace+".listPage", page);
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception{
		if(cri.getPage()<=0) {
			cri.setPage(1);
		}
		cri.setPage((cri.getPage()-1 )*10) ;
		return sqlSession.selectList(namespace+".listCriteria", cri);
	}
	
	@Override
	public int countPaging(Criteria cri) throws Exception{
		return sqlSession.selectOne(namespace+".countPaging",cri);
	}
	
}

package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.StudentInfoVO;

@Repository
public class StudentInfoDAOPImpl implements StudentInfoDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";
	@Override
	public void insertMember(StudentInfoVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}
	@Override
	public StudentInfoVO readMember(String sid) {
		return (StudentInfoVO)sqlSession.selectOne(namespace+".selectMember",sid);
	}
	@Override
	public void updateMember(StudentInfoVO vo) {
		sqlSession.update(namespace+".update",vo);
	}
	@Override
	public void deleteMember(String sid) {
		sqlSession.delete(namespace+".delete",sid);
	}
	
	@Override
	public int listCount() {
		return sqlSession.selectOne(namespace+".listCount");
	}
	
	@Override
	public List<StudentInfoVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}

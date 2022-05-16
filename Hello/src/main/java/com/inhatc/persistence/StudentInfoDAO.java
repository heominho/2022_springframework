package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	
	public StudentInfoVO readMember(String sid) throws Exception;
	public void updateMember(StudentInfoVO vo) throws Exception;
	public void deleteMember(String sid) throws Exception;
	public void insertMember(StudentInfoVO vo);

	public int listCount() throws Exception;
	
	public List<StudentInfoVO> listAll() throws Exception;
}

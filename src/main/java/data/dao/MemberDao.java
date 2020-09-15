package data.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.dto.MemberDto;

@Repository
public class MemberDao extends SqlSessionDaoSupport
						implements MemberDaoInter{

	@Override
	public List<MemberDto> getList() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("memberList");
	}
	
	@Override
	public int join(MemberDto dto) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("memberJoin", dto);
	}
	
	@Override
	public MemberDto login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("memberLogin", map);
	}

	


	

	
}

package data.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dao.MemberDaoInter;
import data.dto.MemberDto;

@Service
public class MemberService implements MemberServiceInter {

	@Autowired
	private MemberDaoInter dao;
	
	@Override
	public List<MemberDto> memberlist() {
		// TODO Auto-generated method stub
		return dao.getList();
	}

	@Override
	public int memberjoin(MemberDto dto) {
		// TODO Auto-generated method stub
		return dao.join(dto);
	}
	
	@Override
	public MemberDto memberlogin(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.login(map);
	}

	
}

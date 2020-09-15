package data.dao;

import java.util.List;
import java.util.Map;

import data.dto.MemberDto;

public interface MemberDaoInter {
	public List<MemberDto> getList();
	public int join(MemberDto dto);
	public MemberDto login(Map<String, String> map);
}

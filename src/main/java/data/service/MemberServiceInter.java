package data.service;

import java.util.List;
import java.util.Map;

import data.dto.MemberDto;

public interface MemberServiceInter {
	public List<MemberDto> memberlist();
	public int memberjoin(MemberDto dto);
	public MemberDto memberlogin(Map<String, String> map);
}

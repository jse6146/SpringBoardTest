package com.board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.MemberDto;
import data.service.MemberServiceInter;

@Controller
public class MemberController {

	@Autowired
	private MemberServiceInter service;

	@GetMapping("/list")
	public void memberList(Model model) {

		List<MemberDto> memberlist = new ArrayList<MemberDto>();

		memberlist = service.memberlist();

		model.addAttribute("memberlist", memberlist);
	}

	//회원가입폼
	@GetMapping("/joinform")
	public String joinform() {
		return "/login/joinform";
	}

	//회원가입
	@PostMapping("/join")
	public String memberJoin(@ModelAttribute MemberDto dto) {

		int cnt=0;
		cnt=service.memberjoin(dto);
		return cnt==1 ? "/login/loginform" : "/login/joinform";
	}

	//로그인폼
	@GetMapping("/loginform")
	public String loginform() {
		return "/login/loginform";
	}

	//로그인
	@PostMapping("/login")
	public String memberLogin(@RequestParam Map<String, String> map,HttpSession session) {

		MemberDto memberdto = service.memberlogin(map);

		if(memberdto != null) {
			session.setAttribute("loginMember", memberdto);
			return "/login/loginok";
		}else {
			System.out.println("로그인실패");
			return "/login/loginform";
		}
	}
}

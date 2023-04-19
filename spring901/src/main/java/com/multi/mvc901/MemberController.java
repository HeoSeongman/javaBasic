package com.multi.mvc901;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	MemberDAO dao;
	
	public MemberController(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping("member_insert")
	public void insert(MemberVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}

}

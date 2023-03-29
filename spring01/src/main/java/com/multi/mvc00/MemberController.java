package com.multi.mvc00;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	private MemberDAO dao;
	
	public MemberController(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("member_login")
	public String login(MemberVO vo) {
		System.out.println("login 요청됨.");
		System.out.println(vo);
		if (dao.login(vo) == 1) {
			return "OK";
		} else {
			return "NO";
		}
	}

	@RequestMapping("member_insert")
	public MemberVO insert(MemberVO vo) {
		System.out.println("insert 요청됨.");
		System.out.println(vo.toString());
		dao.insert(vo);
		return vo;
	}
	
	@RequestMapping("member_update")
	public void update(MemberVO vo) {
		System.out.println("update 요청됨.");
		System.out.println(vo.toString());
	}
	
	@RequestMapping("member_delete")
	public void delete(String id) {
		System.out.println("delete 요청됨.");
		System.out.println("요청된 delete id : " + id);
	}
	
	@RequestMapping("member_select")
	public void select(String id, Model model) {
		System.out.println("select 요청됨.");
		System.out.println("요청된 select id : " + id);
		MemberVO vo = dao.select(id);
		model.addAttribute("vo", vo);
	}
		
}

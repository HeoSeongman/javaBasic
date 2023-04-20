package com.multi.mvc901;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("member_delete")
	public void delete(String id) {
		System.out.println(dao.delete(id));
	}
	
	@RequestMapping("member_update")
	public void update(MemberVO vo) {
		System.out.println(dao.update(vo));
	}
	
	@RequestMapping("member_select")
	public void select(String id, Model model) {
		model.addAttribute("vo", dao.select(id));
	}
	
	@RequestMapping("member_list")
	public void list(Model model) {
		model.addAttribute("list", dao.list());
	}
	
	
}

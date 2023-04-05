package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	private MemberDAO dao;
	
	public MemberController(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("member_login")
	public String login(MemberVO vo, HttpSession session) {
		System.out.println("login 요청됨.");
		System.out.println(vo);
		if (dao.login(vo) == 1) {
			session.setAttribute("id", vo.getId());
//			return "redirect:bbs.jsp";
			return "OK";
		} else {
			return "redirect:member.jsp";
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
	
	@RequestMapping("member_select_json")
	@ResponseBody
	public MemberVO select(String id) {
		System.out.println("요청된 select id : " + id);
		return dao.select(id);
	}
	
	@RequestMapping("member_list")
	public void list(Model model) {
		ArrayList<MemberVO> list = dao.selectAll();
		System.out.println("member_list : " + list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("member_list_json")
	@ResponseBody
	public ArrayList<MemberVO> list() {
		return dao.selectAll();
	}
		
}

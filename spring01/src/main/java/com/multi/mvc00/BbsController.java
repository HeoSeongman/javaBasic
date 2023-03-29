package com.multi.mvc00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbs_insert")
	public BbsVO insert(BbsVO vo) {
		System.out.println("bbs_insert 호출됨.");
		System.out.println(vo.toString());
		dao.insert(vo);
		System.out.println(dao.toString());
		return vo;
	}
	
	@RequestMapping("bbs_update")
	public BbsVO update(BbsVO vo) {
		System.out.println("bbs_update 호출됨.");
		System.out.println(vo.toString());
		dao.update(vo);
		System.out.println(dao.toString());
		return vo;
	}
	
	@RequestMapping("bbs_delete")
	public void delete(int no, Model model) {
		System.out.println("bbs_delete 호출됨.");
		System.out.println("bbs_delete no : " + no);
		dao.delete(no);
		model.addAttribute("no", no);
		System.out.println(dao.toString());
	}
	
	@RequestMapping("bbs_select")
	public void select(int no, Model model) {
		System.out.println("bbs_select no : " + no);
		BbsVO vo = dao.select(no);
		model.addAttribute("vo", vo);
	}
	
}

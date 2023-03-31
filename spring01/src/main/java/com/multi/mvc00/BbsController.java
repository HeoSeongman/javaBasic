package com.multi.mvc00;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("bbs_insert")
	public BbsVO insert(BbsVO vo) {
		System.out.println("bbs_insert 호출됨.");
		System.out.println(vo.toString());
		bbsDAO.insert(vo);
		System.out.println(bbsDAO.toString());
		return vo;
	}
	
	@RequestMapping("bbs_update")
	public BbsVO update(BbsVO vo) {
		System.out.println("bbs_update 호출됨.");
		System.out.println(vo.toString());
		bbsDAO.update(vo);
		System.out.println(bbsDAO.toString());
		return vo;
	}
	
	@RequestMapping("bbs_delete")
	public void delete(int no, Model model) {
		System.out.println("bbs_delete 호출됨.");
		System.out.println("bbs_delete no : " + no);
		bbsDAO.delete(no);
		model.addAttribute("no", no);
		System.out.println(bbsDAO.toString());
	}
	
	@RequestMapping("bbs_select")
	public void select(int no, Model model, HttpSession session) {
		session.setAttribute("vo", bbsDAO.select(no));
	}
	
	@RequestMapping("bbs_list")
	public void list(Model model) {
		ArrayList<BbsVO> list = bbsDAO.list();
		model.addAttribute("list", list);
	}
	
}

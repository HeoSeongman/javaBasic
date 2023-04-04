package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO replyDAO;
	
	@RequestMapping("reply_insert")
	public void insert(ReplyVO vo) {
		System.out.println("reply_insert 호출됨.");
		System.out.println(vo.toString());
		replyDAO.insert(vo);
	}
	
	@RequestMapping("reply_update")
	public ReplyVO update(ReplyVO vo) {
		System.out.println("reply_update 호출됨.");
		System.out.println(vo.toString());
		replyDAO.update(vo);
		System.out.println(replyDAO.toString());
		return vo;
	}
	
	@RequestMapping("reply_delete")
	public void delete(int no, Model model) {
		System.out.println("reply_delete 호출됨.");
		System.out.println("reply_delete no : " + no);
		replyDAO.delete(no);
		model.addAttribute("no", no);
		System.out.println(replyDAO.toString());
	}
	
	@RequestMapping("reply_select")
	public void select(int no, Model model) {
		model.addAttribute("vo", replyDAO.select(no));
	}
	
	@RequestMapping("reply_list")
	public void list(int bbsno, Model model) {
		model.addAttribute("list", replyDAO.list(bbsno));
	}
}

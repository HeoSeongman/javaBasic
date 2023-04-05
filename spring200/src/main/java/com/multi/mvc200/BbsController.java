package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO bbsDAO;
	@Autowired
	ReplyDAO replyDAO;
	
	@RequestMapping("bbs_insert")
	public BbsVO insert(BbsVO vo) {
		System.out.println("bbs_insert 호출됨.");
		System.out.println(vo.toString());
		bbsDAO.insert(vo);
		System.out.println(bbsDAO.toString());
		return vo;
	}
	
	@RequestMapping("bbs_update")
	public void update(BbsVO vo) {
		System.out.println(vo.toString());
		bbsDAO.update(vo);
	}
	
	@RequestMapping("bbs_delete")
	public String delete(int no, Model model) {
//		for (int i = 0; i < 1000; i++) {
//			bbsDAO.insert(new BbsVO(0, "title " + i, "content " + i, "writer "+ i));
//		}
		int flag = bbsDAO.delete(no);
		if (flag == 1) {
			model.addAttribute("flag", flag);
			return "bbs_delete";
		} else {
			//model.addAttribute("nothing", "아무런 의미 없는 데이터.");
			return "forward:nothing.jsp";
		}
	}
	
	@RequestMapping("nothing")
	public void nothing(Model model) {
		model.addAttribute("nothing", "컨트롤러에서 넣은 아무런 의미 없는 데이터.");
	}
	
	@RequestMapping("bbs_select")
	public void select(int no, Model model) {
		model.addAttribute("vo", bbsDAO.select(no));
		model.addAttribute("replyList", replyDAO.list(no));
	}
	
	@RequestMapping("bbs_one")
	public void one(int no, Model model) {
		model.addAttribute("vo", bbsDAO.select(no));
	}
	
	@RequestMapping("bbs_one22")
	@ResponseBody
	public BbsVO one22(int no) {
		//model.addAttribute("vo", bbsDAO.select(no));
		return bbsDAO.select(no);
	}
	
	@RequestMapping("bbs_list")
	public void list(Model model) {
		ArrayList<BbsVO> list = bbsDAO.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbs_list22")
	@ResponseBody
	public ArrayList<BbsVO> list22() {
		return bbsDAO.list();
	}
	
}

package com.multi.mvc300;

import java.util.ArrayList;
import java.util.List;

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
	public void insert(BbsVO vo) {
		bbsDAO.insert(vo);
	}
	
	@RequestMapping("bbs_update")
	public void update(BbsVO vo) {
		bbsDAO.update(vo);
	}
	
	@RequestMapping("bbs_delete")
	public void delete(int no) {
		bbsDAO.delete(no);
	}
	
	@RequestMapping("bbs_select")
	public void select(int no, Model model) {
		model.addAttribute("vo", bbsDAO.select(no));
	}
	
	@RequestMapping("bbs_list")
	public void list(Model model) {
		List<BbsVO> list = bbsDAO.list();
		model.addAttribute("list", list);
	}
	
}

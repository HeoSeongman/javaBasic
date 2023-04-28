package com.multi.mongoDB;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {
	
	MemoDAO dao;
	
	public MemoController(MemoDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("list.memo")
	public void list(Model model) {
		List<MemoVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("insert.memo")
	public void insert(MemoVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("one.memo")
	public void one(String _id, Model model) {
		MemoVO one = dao.one(_id);
		model.addAttribute("vo", one);
	}
	
	@RequestMapping("delete.memo")
	public String delete(String _id) {
		dao.delete(_id);
		return "redirect:/mongo_memo.jsp";
	}
	
	@RequestMapping("update.memo")
	public String update(String _id, String content, Model model) {
		// 스프링은 변수명에 _(언더바)가 붙으면 주입해주지 않는다.
		MemoVO vo = new MemoVO(_id, content);
		
		dao.update(vo);
		return "redirect:/mongo_memo.jsp";
	}
}

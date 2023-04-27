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
}

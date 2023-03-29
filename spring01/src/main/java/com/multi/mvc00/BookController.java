package com.multi.mvc00;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	private BookDAO dao;
	
	public BookController(BookDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("book_insert")
	public void insert(BookVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("book_select")
	public String select(int id, Model model) {
		BookVO select = dao.select(id);
		if (select == null) {
			return "redirect:book.jsp";
		} else {
			model.addAttribute("vo", select);
			return "book_select";
		}
	}
}

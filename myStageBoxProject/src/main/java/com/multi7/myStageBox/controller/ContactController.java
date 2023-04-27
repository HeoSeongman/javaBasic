package com.multi7.myStageBox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi7.myStageBox.ContactDAO;
import com.multi7.myStageBox.ContactVO;
import com.multi7.myStageBox.Enums.HelpCategory;

@Controller
public class ContactController {
	
	private ContactDAO dao;
	
	public ContactController(ContactDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("contactWrite")
	public void contactWrite(String member, Model model) {
		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("member", member);
	}
	
	@RequestMapping("contactCreate")
	public String contactCreate(ContactVO vo) {
		dao.create(vo);
		System.out.println(vo);
		return "redirect:HelpMain";
	}
	
	@RequestMapping("contactList")
	public void contactList(String member, Model model) {
		model.addAttribute("contactList", dao.selectList(member));
		model.addAttribute("member", member);
	}
	
}

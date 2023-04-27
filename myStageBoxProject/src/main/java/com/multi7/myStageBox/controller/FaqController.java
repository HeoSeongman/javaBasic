package com.multi7.myStageBox.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi7.myStageBox.FaqDAO;
import com.multi7.myStageBox.FaqVO;
import com.multi7.myStageBox.Enums.HelpCategory;

@Controller
public class FaqController {

	FaqDAO dao;
	
	public FaqController(FaqDAO dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("faq")
	public void faqByCategory(String helpCategory, Model model) {
		List<FaqVO> list = null;
		if (helpCategory == null) {
			list = dao.selectList();
		} else {
			list = dao.selectListByCategory(helpCategory);
		}

		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("faqList", list);
	}
	
	@RequestMapping("faqSearch")
	public void faqSearch(String search, Model model) {
		List<FaqVO> list = null;
		if (search == null) {
			list = dao.selectList();
		} else {
			list = dao.selectListBySearch(search);
		}

		model.addAttribute("helpCategory", HelpCategory.values());
		model.addAttribute("searchList", list);
	}
}

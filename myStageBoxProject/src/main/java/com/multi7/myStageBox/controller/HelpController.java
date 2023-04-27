package com.multi7.myStageBox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi7.myStageBox.Enums.HelpCategory;

@Controller
public class HelpController {

	@RequestMapping("HelpMain")
	public void getPage(Model model) {
		model.addAttribute("helpCategory", HelpCategory.values());
	}
}

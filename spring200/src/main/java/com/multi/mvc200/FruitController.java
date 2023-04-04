package com.multi.mvc200;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("사과");
		fruit.add("바나나");
		fruit.add("멜론");
		fruit.add("딸기");
		fruit.add("참외");
		model.addAttribute("fruit", fruit);
	}
}

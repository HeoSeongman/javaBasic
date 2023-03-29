package com.multi.mvc00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	
	@RequestMapping("food")
	public String foodSelect(String like, String dislike) {
		if (like.equals("라면")) {
			return "like";
		} else if (like.equals("아무거나")) {
			return "redirect:food.jsp";
		}
		
		if (dislike.equals("커피")) {
			return "dislike";
		} else {
			return "redirect:food.jsp";
		}
	}
}

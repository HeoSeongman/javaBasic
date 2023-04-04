package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TourController {

	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tour = new ArrayList<String>();
		tour.add("제주도");
		tour.add("미국 동부");
		tour.add("미국 서부");
		tour.add("태국");
		tour.add("평창");
		model.addAttribute("tour", tour);
	}
}

package com.multi.mvc00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public String selectMovie(String movie) {
		System.out.println(movie);
		switch (movie) {
			case "코미디": movie = "comic"; break;
			case "드라마": movie = "drama"; break;
			case "액션": movie = "action"; break;
			default : movie = "redirect:movie.jsp"; break;
		}
		System.out.println(movie);
		
		return movie;
	}
}

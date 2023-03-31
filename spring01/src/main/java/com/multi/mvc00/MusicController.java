package com.multi.mvc00;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {
	
	private MusicDAO dao;
	
	public MusicController(MusicDAO dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping("music_insert_request")
	public String insert(MusicVO vo) {
		dao.insert(vo);
		return "redirect:music_list";
	}
	
	@RequestMapping("music_update")
	public void update(int id, Model model) {
		model.addAttribute("vo", dao.select(id));
	}
	
	@RequestMapping("music_update_request")
	public String update_request(MusicVO vo) {
		dao.update(vo);
		return "redirect:music_list";
	}
	
	@RequestMapping("music_delete")
	public void delete(int id) {
		dao.delete(id);
	}
	
	@RequestMapping("music_select")
	public void select(int id, Model model) {
		model.addAttribute("vo", dao.select(id));
	}
	
	@RequestMapping("music_list")
	public void list(Model model) {
		ArrayList<MusicVO> list = dao.list();
		model.addAttribute("list", list);
	}
}

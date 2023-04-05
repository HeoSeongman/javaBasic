package com.multi.mvc200;

import java.util.ArrayList;
import java.util.Collection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("json1")
	@ResponseBody
	public MemberVO json1() {
		return new MemberVO("root", "rootPW", "root", "010-1234-5678");
	}

	@RequestMapping("json2")
	@ResponseBody
	public ArrayList<MemberVO> json2() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("root", "rootPW", "root", "010-1234-5678"));
		list.add(new MemberVO("root1", "rootPW1", "root1", "010-1234-5671"));
		list.add(new MemberVO("root2", "rootPW2", "root2", "010-1234-5672"));

		return list;
	}

	@RequestMapping("json3")
	@ResponseBody
	public BbsVO json3() {
		return new BbsVO(313, "title_313", "content_313", "writer_313");
	}

	@RequestMapping("json4")
	@ResponseBody
	public ArrayList<BbsVO> json4() {
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(new BbsVO(432, "title_432", "content_432", "writer_432"));
		list.add(new BbsVO(578, "title_578", "content_578", "writer_578"));
		list.add(new BbsVO(912, "title_912", "content_912", "writer_912"));
		list.add(new BbsVO(45, "title_45", "content_45", "writer_45"));

		return list;
	}

	@RequestMapping("map")
	@ResponseBody
	public String map() {
		JSONObject json1 = new JSONObject();
		json1.put("lat", 35.90002453290482);
		JSONObject json2 = new JSONObject();
		json2.put("lng", 128.63782664499877);
		JSONArray array = new JSONArray();
		array.add(json1);
		array.add(json2);
		return array.toJSONString();
	}

	@RequestMapping("chart")
	@ResponseBody
	public String chart() {
		JSONArray list = new JSONArray();
		JSONArray item1 = new JSONArray();
		JSONArray item2 = new JSONArray();
		JSONArray item3 = new JSONArray();
		JSONArray item4 = new JSONArray();
		JSONArray item5 = new JSONArray();
		JSONArray item6 = new JSONArray();
		item1.addAll(of("Month", "Bolivia", "Ecuador", "Madagascar", "Papua New Guinea", "Rwanda", "Average"));
		item2.addAll(of("2004/05", 165, 938, 522, 998, 450, 614.6));
		item3.addAll(of("2005/06", 135,   1120,    599,       1268,     288,   682));
		item4.addAll(of("2006/07", 157,   1167,    587,       807,      397,   623));
		item5.addAll(of("2007/08", 139,   1110,    615,       968,      215,   609.4));
		item6.addAll(of("2008/09", 136,   691,     629,       1026,     366,   569.6));
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(item5);
		list.add(item6);
		return list.toJSONString();
	}

	public ArrayList<Object> of(Object... objects) {
		ArrayList<Object> list = new ArrayList<Object>();
		for (Object item : objects) {
			list.add(item);
		}
		return list;
	}
}

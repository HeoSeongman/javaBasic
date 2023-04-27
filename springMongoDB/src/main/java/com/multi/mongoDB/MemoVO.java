package com.multi.mongoDB;

import java.util.Date;

public class MemoVO {
	
	private String _id;
	private String name;
	private String content;
	private Date date;
	private String weather;
	
	public MemoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemoVO(String _id, String name, String content, Date date, String weather) {
		super();
		this._id = _id;
		this.name = name;
		this.content = content;
		this.date = date;
		this.weather = weather;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "MemoVO [_id=" + _id + ", name=" + name + ", content=" + content + ", date=" + date + ", weather="
				+ weather + "]";
	}
		
}

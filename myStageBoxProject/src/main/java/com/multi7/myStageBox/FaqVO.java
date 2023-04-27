package com.multi7.myStageBox;

import com.multi7.myStageBox.Enums.HelpCategory;

public class FaqVO {
	private int id;
	private HelpCategory helpCategory;
	private String title;
	private String content;
	
	public FaqVO(int id, String helpCategory, String title, String content) {
		super();
		this.id = id;
		setHelpCategory(helpCategory);
		this.title = title;
		this.content = content;
	}
	
	public FaqVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HelpCategory getHelpCategory() {
		return helpCategory;
	}
	public void setHelpCategory(String helpCategory) {
		this.helpCategory = HelpCategory.valueOf(helpCategory);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}

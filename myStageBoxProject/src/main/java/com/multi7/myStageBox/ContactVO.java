package com.multi7.myStageBox;

import com.multi7.myStageBox.Enums.HelpCategory;

public class ContactVO {
	private int id;
	private String member;
	private HelpCategory helpCategory;
	private String title;
	private String content;
	private String answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
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
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public ContactVO(int id, String member, HelpCategory helpCategory, String title, String content, String answer) {
		super();
		this.id = id;
		this.member = member;
		this.helpCategory = helpCategory;
		this.title = title;
		this.content = content;
		this.answer = answer;
	}
	
	public ContactVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContactVO [id=" + id + ", member=" + member + ", helpCategoryDetail=" + helpCategory + ", title=" + title
				+ ", content=" + content + ", answer=" + answer + "]";
	}
	
	
}

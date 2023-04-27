package com.multi7.myStageBox.Enums;

public enum HelpCategorySimple {
	CONCERT(1, "공연 및 축제 관련"),
	TICKET(2, "티켓관련"),
	MEMBER(3, "회원관련"),
	OTHER(4, "기타");
	
	private int num;
	private String detail;

	HelpCategorySimple(int num, String detail) {
		this.num = num;
		this.detail = detail;
	}

	public int getNum() {
		return num;
	}

	public String getDetail() {
		return detail;
	}
	
	public static HelpCategorySimple findByNum(int num) {
		for (HelpCategorySimple hc : HelpCategorySimple.values()) {
			if (hc.num == num) {
				return hc;
			}
		}
		return HelpCategorySimple.CONCERT;
	}
}

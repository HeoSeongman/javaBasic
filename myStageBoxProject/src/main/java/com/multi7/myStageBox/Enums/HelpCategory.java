package com.multi7.myStageBox.Enums;

public enum HelpCategory {
	Favorite_Concert("인기있는 공연,축제"),
	Review("후기"),
	HandicappedSeat("장애인석"),
	Payment("결제 방법"),
	PickUpTicket("티켓 수령"),
	TicketCancellation("티켓 취소/환불"),
	CreateMember("회원 가입"),
	DeleteMember("회원 탈퇴"),
	UpdateMember("회원정보 변경"),
	ForgetIDPW("아이디/비밀번호 분실"),
	Events("이벤트"),
	IncomeDeduction("소득공제"),
	CashReceipts("현금영수증");
	
	private String name;

	private HelpCategory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

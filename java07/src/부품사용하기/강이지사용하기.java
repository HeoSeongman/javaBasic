package 부품사용하기;

import 부품만들기.강아지;

public class 강이지사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 진돗개 = new 강아지();
		진돗개.이름 = "흰둥이";
		진돗개.품종 = "진돗개";
		진돗개.나이 = 3;
		진돗개.울음소리 = "멍멍!";
		진돗개.소개하다();
		진돗개.짖기();
		
		강아지 시바견 = new 강아지();
		시바견.이름 = "누렁이";
		시바견.품종 = "시바견";
		시바견.나이 = 1;
		시바견.울음소리 = "왈왈!";
		시바견.소개하다();
		시바견.짖기();
	}

}

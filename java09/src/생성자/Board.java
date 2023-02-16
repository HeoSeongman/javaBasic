package 생성자;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article a1 = new Article(1, "자바", "오늘은 자바 하는 날.", "지금이");
		Article a2 = new Article(2, "JSP", "오늘은 JSP 하는 날.", "지금삼");
		Article a3 = new Article(3, "SPRING", "오늘은 SPRING 하는 날.", "지금일");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}

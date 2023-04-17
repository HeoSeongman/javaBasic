package 프로그래머스;

public class 영어가싫어요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "onetwothreefourfivesixseveneightnine";
		Solution8 sol8 = new Solution8();
		System.out.println(sol8.solution(numbers));
	}

}

class Solution8 {
    public long solution(String numbers) {
        String[] nStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < nStr.length; i++) {
        	numbers = numbers.replaceAll(nStr[i], String.valueOf(i));
        }
        System.out.println(numbers);

        return Long.parseLong(numbers);
    }
}
package pm;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 >>>");
		int num = sc.nextInt();
		String grade = " ", opt = " ";
		if (num >= 90) {
			grade = "A";
		}else if(num >= 80) {
			grade = "B";
		}else if(num >= 70) {
			grade = "C";
		}else if(num >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		if (num == 100) {
			opt = "+";
		}else if (num <= 59) {
			opt = " ";
		}else if (num % 10 >= 7) {
			opt = "+";
		}else if (num% 10 <= 3) {
			opt = "-";
		}
		System.out.println("당신의 학점은 "+grade+opt+"입니다. \n");
		
	}

}

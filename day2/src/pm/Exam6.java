package pm;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(i+"일차"+j+"교시");
			}
		}
		
		
//		String name = "홍길동";
		String[] names = {"홍","이","성"};
		int[] numbers = {1,2,3,4,5};
		
		
		for (String name: names) {
			System.out.println(name);
		}
		
		
		
		
		
	}

}

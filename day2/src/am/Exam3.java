package am;

public class Exam3 {

	public static void main(String[] args) {
		// 제어문 - 조건문 - if, 			switch
		// 		- 반복문 - while, for, 	do~while

		
//		if (5 > 3) {
//			System.out.println("출력1");
//		}
//		
//		int a = 3;
//		if (a==3) {
//			System.out.println("출력2");
//		}
		
//		if (5 > 3) {
//			System.out.println("안녕");
//		}else {
//			System.out.println("방가");
//		}
		
		int a = 85;
		if (a >= 90) {
			System.out.println("a학점");
		} else if (a >= 80) {
			System.out.println("b학점");
		} else if (a >= 70) {
		System.out.println("c학점");
		}else if (a >= 60) {
		System.out.println("d학점");
		}else {
			System.out.println("f학점");
		}
		
	}

}

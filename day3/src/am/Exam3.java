package am;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 10;
//		while (i > 0) {
//			System.out.println(i);
//			i -= 2;
//		}
		
//		for (int i = 0; i < 5; i ++) {
//			for (int j = 0; j < 3; j++) {
//				if (i ==2) {
//					continue;
//				}
//				if(j == 1) {
//					break;
//				}
//				System.out.println("A");
//			}
//		}
//		out:
//		for (int i = 0; i <10; i ++) {
//			for (int j=0; j <5; j++) {
//				if (i ==3 & j == 2) {
//					break out;
//				}
//				System.out.println(i+" "+j);
//			}
//		}
//		
//		
//			for (int i = 0; i <10; i ++) {
//				for (int j=0; j <5; j++) {
//					if (i ==3 & j == 2) {
//						i = 100;
//						break;
//					}
//					System.out.println(i+" "+j);
//				}
//			}
		
		while (true) {
			System.out.println("1)빅맥");
			System.out.println("2)타코");
			System.out.println("3)백반");
			System.out.println("원하는 메뉴를 선택하세요 (종료 : 0)");
			Scanner put = new Scanner(System.in);
			int menu = put.nextInt();
			if (menu == 1) {
				System.out.println("선택한 메뉴는 1번, 빅맥입니다.");continue;
			}else if (menu == 2) {
				System.out.println("선택한 메뉴는 2번, 타코입니다.");continue;
			}else if (menu == 3) {
				System.out.println("선택한 메뉴는 3번, 백반입니다.");continue;
			}else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");break;
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료: 0)");
				continue;
			}
			
		}
		
		
		
	}

}

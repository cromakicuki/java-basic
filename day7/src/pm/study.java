package pm;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// 3개의 정수 중 최솟값 구하기
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 a를 넣으세요");
//		int a = sc.nextInt();
//		System.out.println("정수 b를 넣으세요");
//		int b = sc.nextInt();
//		System.out.println("정수 c를 넣으세요");
//		int c = sc.nextInt();
//		System.out.println("입력된 숫자는 "+a+" "+b+" "+c+" 입니다.");
//		int min = a;
		
		int a = 3;
		int b = 1;
		int c = 2;
		int min = a;
		
		while(min == 0)
			if (a < b && b < c) {
				break;
			}else if(min > b){
				min = b;
			}else if(min > c) {
				min = c;
			}
		
		
		System.out.println("최솟값은"+min+"입니다.");
	}

}

package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		int no1;
//		do {
//			System.out.println("3자리 정수 입력 >>");
//			no1 = sc.nextInt();
//		}while(no1 < 100 || no1 > 999);
//		
//		System.out.println("입력한 값은 "+no1+"입니다.");
		
		Random rand = new Random();
		int comp = 10 + rand.nextInt(90);
		int no;
		do {
			System.out.println("10부터 99 사이의 글자를 맞추세요");
			System.out.print("어떤 숫자일까요? ");no = sc.nextInt();
			if (no > comp) {
				System.out.println("더 작은 숫자입니다.");
			}else if (no < comp) {
				System.out.println("더 큰 숫자입니다.");
			}
		}while(no != comp);
		System.out.println("정답입니다.");
		
		
		
		
		
		
	}

}

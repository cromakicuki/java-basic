package am;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 0, sum = 0;
//		while (sum <100) {
//			sum += num;
//			num++;
//		}
//		System.out.println((num-1)+"까지의 합" + sum);
		
//		int a = 0;
//		while(a <10) {
//			System.out.println(a+" ");
//			a++;
//		}
//		System.out.println();
//		
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
		
		
//		int c = 0;
//		while(true) {
//			if (c > 9) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//		}
		
		int a;
		a = 0;
		while(a <10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<10);
		
		// while문과 do~while문은 1회이상 반복될 때에는 동일한 결과다.
		// while문이 0번 반복될 때만 차이가 있고 1회 이상에서는 완전히 동일하다.
		// do~ while문은 절대 한 번 더 실행되는 것이 아니다.
		
		
//		for (int i = 0; i<3; i++) {
//			for (int j = 0; j <5; j++) {
//				System.out.println(i+" "+j);
//			}
//		}
		
		int k = 0;
		while (k < 3) {
			int w = 0;
			while (w < 5) {
				System.out.println(k+" "+w);
				w++;
			}
			k++;
		}
		
		
		
	}

}

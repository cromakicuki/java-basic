package am;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		// 배열, 반복, 조건
		// 주석, 클래스, 객체
		
		// Q1 첫 수부터 2개씩을 나누어 출력하세요
		
		// Q2 첫 수부터 숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 배열로
		// 만들어 출력하시오
		int[] a = {1,3,4,5,6};
		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i]%2 ==0) {
//				System.out.println(a[i]);
//			}
//		}
		
		J j = new J();
//		j.print(a);
		j.cc(a);

	}

}

class J {
//	void print(int[] a){
//		for(int i = 0; i < a.length; i++) {
//			System.out.println("숫자는"+a[i]+a[i+1]);
//		}
//	}
	
	void cc(int[] a) {
		int[] b;
		for(int i = 0; i < a.length; i++) {
			if((a[i]+a[i+1])%2 == 0) {
				b = new int[]{i,i+1};
				System.out.println("인덱스 번호:"+Arrays.toString(b));
			}else {
				System.out.println("해당하는 숫자가 없습니다.");
			}
		}
		
	}
}

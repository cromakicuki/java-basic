package pm;

public class Exam6 {

	public static void main(String[] args) {
		// 가변 길이 매서드
		// 매서드 오버로딩은 입력변수의 개수 혹은 자료형에 따라 구분된다.
		// 만약 입력 변수로 1~100 사이의 불특정 갯수로 입력이 들어오면
		// 매서드도 100개를 만들어야한다.
		// 이것을 간단하게 할 수 있는 방법
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
		method1(2);
		method1(2,3);
		method2("main");
		
	}
//	public static void sum(int a) {
//		
//	}
//	public static void sum(int a, int b) {
//		
//	}
//	public static void sum(int a, int b, int c) {
//	
//	}
	
	public static void method1(int ...values) {
		System.out.println("길이:" + values.length);
		
		for(int each: values) {
			System.out.println(each+" ");
		}
		System.out.println();
	}
	
	public static void method2(String ...values) {
		System.out.println("길이:" + values.length);
		
		for(String each: values) {
			System.out.println(each+" ");
		}
		System.out.println();
	}
	
}

package pm;

public class Exam5 {

	public static void main(String[] args) {
		// Method Overloading
		
//		printa(); // 인수 없음
//		
//		printb(3); // 인수가 1개인데 int 형
//		
//		printc(5.8); // 인수가 1개인데 double 형
//		
//		printd(2,5);  // 인수가 2개일 때
//		
		// print(); // 하나의 매서드 명으로 인수의 개수와 형에 따라 동작을 다르게 한다.
		print();
		print(3);
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double b) {
		System.out.println(b);
	}
	
	
}

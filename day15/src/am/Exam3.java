package am;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		
		d.print();
		d.print(3);
		d.print(5.8);
		d.print("안녕");
		
		F f = new F();
		
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		System.out.println(f.arraySum(data1));
		System.out.println(f.arraySum(data2));
		System.out.println(f.arraySum(new int[] {1,2,3}));
		//System.out.println(f.arraySum({1,2,3}));
		
	}

}

class D {
	void print() {
		System.out.println("-> 입력값이 없습니다");
	}
	void print(int a) {
		System.out.println("-> 정수 입력값 : "+a);
	}
	void print(double b) {
		System.out.println("-> 실수 입력값 : "+b);
	}
	void print(String c) {
		System.out.println("-> 문자열 입력값 : "+c);
	}
}

class F {
	int arraySum(int[] a) {
		int b = 0;
		for(int num: a) {
			b += num;
		}
		return b;
	}
}
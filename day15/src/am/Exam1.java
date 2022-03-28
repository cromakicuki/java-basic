package am;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.m);
		b.work1();
	}

}

class A {
	int m=3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}
class B {
	int m;
	void work1() {
		int k;
		//System.out.println(k);
	}
}
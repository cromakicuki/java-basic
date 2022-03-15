package pm;

public class Exam41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 다형적 표현
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
	}

}

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

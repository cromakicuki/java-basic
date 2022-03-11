package am;

public class A {

	public int a = 1;
	protected int b = 2;
			int c = 3;
	private int d = 4;
	void abc() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
	}
	
	public int m = 3;
	public int n = 4;
	public void print() {
		System.out.println("임포트");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}


class K {
	int m = 3;
	int n = 4;
	void print() {
		System.out.println("임포트");
	}
}


package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class H {
	void abc() {
		System.out.println("H클래스의 abc()");
	}
}

class O extends H {
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	void bcd() {
		abc();
//		super.abc();
	}
}
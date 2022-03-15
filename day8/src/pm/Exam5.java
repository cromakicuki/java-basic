package pm;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Q q1 = new Q();
		q1.print();
		
		W w = new W();
		w.print();
		
		Q qw = new W();
		qw.print();
	}

}

class Q{
	void print() {
		System.out.println("Q클래스");
	}
}
class W extends Q{
	void print() {
		System.out.println("W클래스");
	}
}
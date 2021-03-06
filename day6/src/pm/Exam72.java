package pm;

public class Exam72 {

	public static void main(String[] args) {
		// this 키워드 (파이썬 self)
		// 모든 매서드에는 자신이 포함된 클래스의 객체를 가리키는 this가 있다.
		// this는 생략이 가능하다. 묵시적으로 사용된다.
		// this. 생략해도 항상 자바가 자동으로 추가해주므로 전혀 신경 쓸 필요가
		// 없어보이기도 한다. 하지만 this. 명시적으로 꼭 직접 붙여줘야 할 때도 있다.
		
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);
	}

}

class Z {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	void work( ) {
		this.init(2, 3);
	}
}
package pm;

public class Exam74 {

	public static void main(String[] args) {
		// this() 매서드 (this 키워드와 완전 다름)
		// this() 매서드는 this 키워드와 비슷하게 보이지만 의미가 완전히 다르다.
		// this() 매서드는 자신이 속한 클래스의 내부의 다른 생성자를 호출할 때 사용한다.
		// 1. 생성자의 내부에서만 사용한다.
		// 2. 생성자의 첫줄에 위치한다.
		// 두 개의 조건 중 하나라도 지켜지지 않으면 에러가 발생된다.
		
		T t1 = new T();
		System.out.println();
		T t2 = new T(3); // 생성자 오버로딩

	}

}


class T {
	T(){
		System.out.println("첫번째 생성자");
	}
	T(int a) { // 생성자 오버로딩
		this(); // 생성자 내부에서 첫번재 생성자를 호출
		System.out.println("두번째 생성자");
	}
}
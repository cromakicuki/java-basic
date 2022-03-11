package pm;

public class Exam71 {

	public static void main(String[] args) {
		// 생성자 오버로딩 Constructor Overloading
		// 생성자의 모양 (개수, 자료형)에 따라 객체를 생성하는 방법이 결정된다.
		K k1 = new K();
		K k2 = new K(3);
		K k3 = new K(3,5);
		

	}

}


class K {
	K(){
		System.out.println("첫번째 생성자");
	}
	K(int a){
		System.out.println("두번째 생성자");
	}
	K(int a, int b) {
		System.out.println("세번째 생성자");
	}
}
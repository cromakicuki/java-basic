package pm;

public class Exam42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매서드는 클래스의 기능
		
		//매서드 호출
		// 매서드를 사용하려면 먼저 객체를 생성해야 한다.
	}

}

class ca {
	// no input no output return이 없으면 out도 없다.
	void print() {
		System.out.println("안녕");
	}
	//no input yes output
	int data() { //int return의 타입
		return 3;
	}
	//yes input yes output
	double sum(int a, double b) { // return 타입
		return a + b;
	}
	
	void printMonth(int m) {
		if(m <0 || m > 12) {
			System.out.println("월을 잘못 입력하셨습니다.");
			return;
		}
		System.out.println(m+"월입니다.");
	}
	
	
}
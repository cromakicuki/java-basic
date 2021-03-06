package pm;

public class Exam6 {
/*
 사용자 정의 예외 클래스를 만들어보면 다른 예외들의 동작도 이해하기 쉽다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.bcd_1();
		b.bcd_2();
	}

}


class MyException extends Exception { //일반 예외
	MyException() {
		super();
	}
	MyException(String s) {
		super(s);
	}
}

class MyRTException extends RuntimeException { //실행 예외
	MyRTException(){
		super();
	}
	MyRTException(String s){
		super(s);
	}
}


class B {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지:MyException");
	
	MyRTException mer1 = new MyRTException();
	MyRTException mer2 = new MyRTException("예외 메시지: MyRTException");
	
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상 작동");
			}else {
				throw me1; //예외 발생
			}
		}catch(MyException e) {
			System.out.println("예외 처리 1");
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("정상 작동");
		}else {
			throw me1; //강제 예외 발생
		}
	}
	
	void bcd_2() {
		try {
			abc_2(65);
		}catch(MyException e){
			System.out.println("예외 처리 2");
		}
	}
}
package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
예외처리 문법은 크게 3가지 요소로 구성된다.
try {
	//일반 예외, 실행 예외 발생가능 코드
}catch (예외명) {
	//예외가 발생했을 때 처리
}finally{
	//예외 발생 여부와는 관계없이 항상 언제나 실행
}

try {
 	System.out.println(3/0);
 	System.out.println("프로그램 종료");
 }catch (ArithmeticException e) {
 	System.out.println("숫자는 0으로 나눌 수 없습니다.");
 	System.out.println("프로그램 종료");
 }
 */
		
		try {
		 	System.out.println(3/0);
		 	System.out.println("프로그램 종료");
		 }catch (ArithmeticException e) {
		 	System.out.println("숫자는 0으로 나눌 수 없습니다.");
		 	System.out.println("프로그램 종료");
		 }
		try {
		 	System.out.println(3/0);
		 }catch (ArithmeticException e) {
		 	System.out.println("숫자는 0으로 나눌 수 없습니다.");
		 }finally {
			 System.out.println("프로그램 종료");
		 }
		
/*
 예외 처리 과정
 
 실제 내부적으로 예외가 처리되는 과정을 자세히 알아보자.
try {
		 	System.out.println(3/0); ---> 예외 발생  ----> 자바 (예외 클래스로 객체 생성)
		 												| 
		 }catch (ArithmeticException e) {  <=======		|
		 	System.out.println("숫자는 0으로 나눌 수 없습니다.");
		 }finally {
			 System.out.println("프로그램 종료");
		 }
 
 최초 try 구문이 실행되어 만약 예외가 발생하지 않으면 catch는 실행되지 않다. 그리고 finally 블록 구문을 실행한다.
그런데 try 구문이 실행되어 만약 예외가 발생하면 자바가 먼저 인지하여 예외 타입의 객체를 생성하여 catch의 매개 변수로 전달한다.
이것은 마치 자바가 catch()라는 이름의 매서드를 호출하는 것과 비슷하다. 만약 자바가 생성해서 넘겨준 객체 타입을 catch 블록이 
처리할 수 없을 때 즉 해당 객체를 받을 catch() 블록이 존재하지 않으면 예외처리가 되지 않는다.

절대 매서드는 아니다. 하지만 매서드가 다양한 입력 매개변수 타입으로 오버로딩될 수 있는 것처럼
catch() 블록도 예외 타입에 따라 여러개를 포함할 수 있다.

try {
	//일반 예외, 실행 예외 발생가능 코드
}catch (예외 타입1) {
	//예외가 발생했을 때 처리
}catch (예외 타입2) {
	//예외가 발생했을 때 처리
}finally{
	//예외 발생 여부와는 관계없이 항상 언제나 실행
 */
		/*
		 다중 예외처리 구문을 작성시 주의할 사항은 try()구문에서 예외가 발생하고
		 여러개의 catch() 구문이 있어도 실행되는 catch 구문은 
		 */
		
	}

}

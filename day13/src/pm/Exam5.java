package pm;



public class Exam5 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Generic 제네릭
 
 자바에서는 다양한 종류 클래스와 인터페이스를 제공한다. 이런 클래스와 인터페이스를
 내부 멤버에서 활용하는 클래스를 작성할 때는 제공되는 클래스나 인터페이스의 다양성만큼
 많은 가지수의 클래스를 생성해야 한다. 또한 동일한 이름의 매서드가 다양한 타입의
 입력 매개변수를 가질 수 있도록 하려면 고려하는 입력매개변수 타입의 수만큼
 오버로딩을 수행해야 한다. 그래서 이러한 비효율성을 한번에 해결하는데 필요한 
 문법 요소가 바로 제네릭이다.
 
 사과를 저장 setter 하고 가져오기 getter
 연필을 저장 setter 하고 가져오기 getter
 먼저 클래스 Goods1은 Apple 타입의 필드, 이 필드 값을 쓸 수 있는 getter 매서드와 
 setter 매서드를 갖고 있따. 따라서 이 클래스의 객체를 생성함으로 사과를 저장 set하고
 저장된 사과를 가져오는 get 기능을 수행할 수 있다.
 
 
 */
//	}

}

class Apple {}

class Goods1 {
	private Apple apple = new Apple();
	
	public Apple get() {
		return apple;
	}
	
}
package pm;

public class Exam51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 abstract 추상 - 구체적이지 않다
 abstract method - 중괄호가 없느 매서드, 매서드의 기능이 정의되지 낳는다. 그냥 ; 끝난다.
 					abstract 리턴 타입 매서드명 ();
 					
 					
 
 abstract class 
 
 class Animal {
 	void cry() {
 	} // 기능을 구현하지 않음 -> 	추상 매서드로 정의하는 것이 효율적이다. 
 							추상 매서드를 포함하는 클래스는 반드시 추상 클래스로 정의해야
 }							추상 클래스도 클래스이므로 상속도 할 수 있다.
 							추상클래스로는 객체를 생성할 수는 없다.
 class Cat extends Animal {
 	void cry() {
 		System.out.println("야옹");
 	}
 }
 
 class Dog extends Animal {
 	void cry() {
 		System.out.println("멍멍")
 	}
 }

 Animal animal1 = new Cat();
 animal1.cry();
 Animal animal2 = new Dog();
 animal2.cry();
 
 다형적 표현을 사용할 때도 cry() 매서드를 호출한다.
 
추상 매서드 사용의 장점

일반 클래스 정의를 했을 때와 추상 클래스 정의를 했을 때
자식 클래스에서 cry() 매서드를 오버라이딩하는 과정에서 만약에 매서드 명에 
오타가 발생됐다고 가정했을 때 cRy()...
이때 일반 클래스를 상속한 자식 클래스에서는 오버라이딩이 아니라 추가로 새로운 매서드를 정의한 결과가 된다.
따라서 cry() cRy() 2개의 매서드가 존재하게 된다. 이런 경우 객체를 생성하고
cry() 매서드를 호출해도 아무것도 출력되지 않는다. 부모의 cry() 매서드에는 아무것도 정의되지 않았기 때문이다.

추상 클래스를 생각해보면...
자식 클래스가 오버라이딩하려고 하는 과정에서 오타가 발생하면 문법 오류가 발생한다.
추상 클래스를 상속받으면 추상 클래스에 정의해놓은 추상 매서드들을
구체화한 클래스를 만들어야만 한다. 매서드 오버라이딩을 강제하는 방식으로 생각하자.

겨우 오타찾는 정도의 장점이라고 가볍게 볼수도 있겠지만 여러사람들이나 여러 회사들이
협업을 하게 되는 경우 많은 필요성을 느끼게 될 것이다.

내부에는 추상 매서드가 1개라고 있으면 해당 클래스는 추상 매서드를 일반 매서드로 오버라이딩 하거나 
자신을 추상클래스로 정의해야한다. 그런데 cat 클래스는 오버라이딩도 하지 않고 
자신을 추상 클래스로 정의하지도 않았으므로 오류가 발생한다.

정리..
만약 abc()라는 추상 매서드를 포함하고 있는 추상 클래스가 잇을 때 '이것을 상속한
모든 자식 클래스들 내부에는 항상 반드시 abc() 매서드가 정의되어있어야만 한다. 라는 사실을
보장하게 되는 것이다.

 */
		Animal animal1 = new Cat();
		animal1.cry();
		Animal animal2 = new Dog();
		animal2.cry();
	}

}

abstract class Animal {	//추상 클래스 선언
 	abstract void cry(); //추상 매서드 선언
 }

class Cat extends Animal {
 	void cry() {
 		System.out.println("야옹");
 	}
 }
 
 class Dog extends Animal {
 	void cry() {
 		System.out.println("멍멍");
 	}
 }
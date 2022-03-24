package am;

public class Exam6 {
	/*
	 Object는 모든 타입의 객체를 저장가능하지만 이때 주의할점이 있다.
	 데이터를 저장할 때는 상관없지만 저장된 데이터를 각각의 타입으로 꺼내기 위해서는 
	 저장된 형태로 캐스팅해야한다. 필드 자체가 Object 타입이기 때문에 get()
	 매서드로 가져오는 타입 또한 항상 Object 타입니다. 따라서 Apple 객체를 저장했을 때는
	 get() 매서드로 가져온 Object을 Apple 타입 혹은 Pencil 객체를 저장했을 때는
	 가져온 Object 타입을 각 Pencil타입으로 각각 캐스팅해야한다.
	 
	 하지만 실수로 실제로는 Apple 객체인데 가져올 때는 Pencil 객체로 캐스팅을 하게 되면
	 잘못 캐스팅했을 때 발생하는 예외인 ClassCastException 은 실행 예외이기 때문에
	 문법 오류는 발생하지 않는다. 잘못된 캐스팅은 실행중에 예외를 발생하게 된다.
	 프로그램이 강제종료되는 것이다.
	 */
	public static void main(String[] args) {
		Goods goods1 = new Goods();
		goods1.set(new Apple());
		Apple apple = (Apple)goods1.get();
		
		Goods goods2 = new Goods();
		goods2.set(new Pencil());
		Pencil pencil = (Pencil)goods2.get();
		
		Goods goods3 = new Goods();
		goods3.set(new Apple());
		Pencil pencil2 = (Pencil)goods3.get();
	}

}


class Apple {}
class Pencil {}

class Goods {  // Object 모든 타입의 객체 저장 가능
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;
	}
}


/*
각 상품마다 각각의 클래스를 생성하는 대신 최상위 클래스인 Object 타입의 필드를
선언하면 모든 타입을 저장할 수는 있다. 문제없다. 다만, 객체를 get() 매서드로
꺼내오는 경우 각각의 타입으로 다운캐스팅을 수행해야만 한다.
이때 잘못된 캐스팅으로 실행 예외가 발생할 수 있고 프로그램이 강제 종료되는 문제가
발생한다. 이러한 문제점까지 해결하주는 것이 바로 '제네릭'이다.

 */

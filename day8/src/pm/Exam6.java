package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Animal bb = new Bird();
		Animal cc = new Cat();
		Animal dd = new Dog();
		
	}

}

class Animal {
	void cry() {
	}
}

	class Bird extends Animal {
		void cry() {
			System.out.println("짹짹");
		}
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


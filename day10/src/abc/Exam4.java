package abc;

abstract class Predator extends Animal {
	abstract String getFood();
	
	void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
	
	static int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable {
	void bark();
}

//interface PredatorBarkable extends Predator, Barkable {
//}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {
	public String getFood() {
		return "apple";
	}
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable {
	public String getFood() {
		return "banana";
	}
	public void bark() {
		System.out.println("으르렁");
	}
}

//class Crocodile extends Animal implements PredatorBarkable {
//	public String getFood() {
//		return "strawberry";
//	}
//}
//
//class Leopard extends Animal implements PredatorBarkable {
//	public String getFood() {
//		return "orange";
//	}
//}

class ZooKeeper {
    void feed(Predator predator) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed "+predator.getFood());
    }

//    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
//        System.out.println("feed apple");
//    }
//    
//    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
//        System.out.println("feed banana");
//    }
//    public void feed(Crocodile crocodile) {
//        System.out.println("feed strawberry");
//    }
//
//    public void feed(Leopard leopard) {
//        System.out.println("feed orange");
//    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
    	animal.bark();
//        if (animal instanceof Tiger) {
//            System.out.println("어흥");
//        } else if (animal instanceof Lion) {
//            System.out.println("으르렁");
//        }
    }
}

public class Exam4 {
    public static void main(String[] args) {
//        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
//        zooKeeper.feed(tiger);  // feed apple 출력
//        zooKeeper.feed(lion);  // feed banana 출력
        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}




//public class Exam4 {
//
//}

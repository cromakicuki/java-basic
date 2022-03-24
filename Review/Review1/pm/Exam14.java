package pm;

public class Exam14 {
    public static void main(String[] args) {
        Y y = new Y();
        System.out.println();
        Y y3 = new Y(3);
    }
}

class Y {
    Y() {
        System.out.println("첫번재 생성자");
    }
    Y(int a) {
        this();
        System.out.println("두번째 생성자");
    }
}
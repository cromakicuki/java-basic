package pm;

public class Exam12 {
    public static void main(String[] args) {
        R r1 = new R();
        R r2 = new R(3);
        R r3 = new R(3,2);
    }
}

class R {
    R() {
        System.out.println("첫");
    }
    R(int a) {
        System.out.println("둘");
    }
    R(int a, int b) {
        System.out.println("셋");
    }
}
package pm;

public class Exam9 {

    /*
클래스의 내부 구성 요소 - 필드 / 매서드 / 생성자/ this this()

필드 - 클래스에 포함된 변수

    */
    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1();

    }
}


class A {
    int m = 3; // 필드, 전역변수
    int n = 4;

    void work1() {
        int k = 5; //지역변수
        System.out.println(k);
        work2(2);
    }

    void work2(int i) {
        int j = 4;
        System.out.println(i+j);
    }
}
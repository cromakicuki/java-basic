package am;

public class Exam3 {
    /*
    연산자 + - * /
    */

    public static void main(String[] args) {
        int a = 3;
        ++a; //전위형
        System.out.println(a);

        int b = 3;
        b++; // 후위형  b = b + 1; b = += 1;
        System.out.println(b); 

        int a1 = 5;

        // a의 홀수 짝수 출력
        // 'a는 홀수 입니다.'

        if(a1%2 == 0) {
            System.out.println("a는 짝수입니다.");
        }else {
            System.out.println("a는 홀수입니다.");
        }

        // d가 3의 배수?

        int d = 9;

        if(d % 3 == 0) {
            System.out.println(d+"는 3의 배수 입니다.");
        }else {
            System.out.println(d+"는 3의 배수가 아닙니다.");
        }

        int q = 5;
        int w = 2;
        int e = 5;

        System.out.println(q==w);
        System.out.println(q==e);

        String str1 = new String("안녕");
        String str2 = new String("안녕");

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));
    }
}

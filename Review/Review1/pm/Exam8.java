package pm;

public class Exam8 {
 public static void main(String[] args) {
     /*
 클래스와 객체
 객체는 사용가능한 실체를 의미하고
 클래스는 그 객체를 생성하기 위한 설계도.

 절차 지향은 이야기를 순서대로 쓰듯이 프로그램을 구성하는 방식.
 객체 지향은 프로그램에서 사용되는 객체를 생성하고
 그 객체에 포함되어있는 
 */ 

 V v = new V();
 System.out.println(v.m);
 v.print();
 }
      
}

class V {
    int m = 3;
    void print() {
        
    }
}
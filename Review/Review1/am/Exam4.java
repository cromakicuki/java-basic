package am;

public class Exam4 {
    /*
     기본적으로 소스 코드를 위에서부터 아래로 차례대로 1줄씩 처리된다.
     프로그램을 의도적으로 흐름을 바꿔야 할 필요가 있다.
     이때 사용하는 것이 바로 제어문이다.
     
     즉 제어문은 '프로그램의 처리 순서를 바꾸는 것' 이다.

     자바에서는 5개의 제어문과 2개의 제어 키워드 break continue

     조건if switch~case

     반복문 while~do while for
     */
    public static void main(String[] args) {
    
        int x = 1;
        if(x > 0){
            System.out.println(x+"는 양의 정수 입니다.");
        }else if(x == 0) {
            System.out.println(x+"는 0입니다.");
        }else {
            System.out.println(x+"는 음의 정수입니다.");
        }
    
    
        switch(x){
            case 1 :
                System.out.println(x+"는 양의 정수 입니다.");
                break;
            case 0 :
                System.out.println(x+"는 0입니다.");
                break;
            case -1 :
                System.out.println(x+"는 음의 정수입니다.");
                break;
        }
        
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("1입니다.");
                break;
        
            case 2:
                System.out.println("2입니다.");
                break;
        }

        int month = 3;
        switch(month) {
            case 3: case 4: case 5:
            System.out.println();
            case 6: case 7: case 8:
            
        }

    }
     
}

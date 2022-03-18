package am;

public class Exam5 {
    public static void main(String[] args) {
        // for문으로 0,1,2,3,4,5
        // for(int i = 0; i <6; i++){
        //     System.out.print(i+" ");
        // }
        // int j = 0;
        // while(j < 6) {
        //     System.out.print(j+" ");
        //     j++;
        // }

        // for(int i = 2; i < 10; i++) {
        //     for(int j = 1; j < 10; j++) {
        //         System.out.println(i+"*"+j+"="+(i*j));
        //     }
        // }

        int a = 2;
        
        while (a < 10) {
            int b = 1;
            while (b < 10) {
                System.out.println(a+"*"+b+"="+(a*b));
                b++;
            }
            a++;
        }
        

    }
}

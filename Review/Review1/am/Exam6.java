package am;

public class Exam6 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++){
        //     if(i%2 ==0) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for(;;) {
        //     System.out.println(mama);
        // }

        // while (true) {
        //     System.out.println("ma");
        // }

        // int i = 0;
        // do {
        //     System.out.println("Hello World"+i);
        //     i++;
        // }while(i <= 10);


        //3 6 9 게임 100 미만의 숫자 중...
        // for(int i = 1; i <100; i++){
        //     int cnt = 0;
        //     int x = i/10;
        //     int y = i%10;

        //     if(x%3 == 0) {
        //         cnt++;
        //         if(y%3 == 0){
        //             cnt++;
        //         }
        //     }
        //     if(i%10 == 0) {
        //         if(cnt == 2) {
        //             System.out.println("짝짝");
        //         }else if (cnt == 1){
        //             System.out.println("짝");
        //         }else {
        //             System.out.println(i);
        //         }
        //     }else {
        //         System.out.println(i + "\t");
        //     }
            
        // }
        int en = 0;
        for(int i = 1; i <= 100; i++){
            String a = Integer.toString(i);
            int count = 0;
            for (int j = 0; j < a.length(); j++){
                if (a.charAt(j) == '3' |a.charAt(j) == '6'|a.charAt(j) == '9'){
                    count++;
                }
            }
            String str = "짝";
            Boolean b = count >= 1;
            String repeated = new String(new char[count]).replace("\0", str);
            en++;    
            if (en%10 == 0) {
                if(b == true) {System.out.println(repeated);}
                else{System.out.println(i);}
            }else {
                if(b == true) {System.out.print(repeated+" ");}
                else{{System.out.print(i+" ");}
            }
        }

        // if(a.contains("3")|a.contains("6")|a.contains("9")){
        //     System.out.print('짝'+" ");
        // }else {
        //     System.out.print(i+" ");
        // }

    }
} }

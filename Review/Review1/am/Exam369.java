package am;

public class Exam369 {
    public static void main(String[] args) {
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
                else{System.out.print(i+" ");}
            }
        
        }
    }
}

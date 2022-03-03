package pm;

public class Exam5 {
	public static void main(String[] args) {
		// 숫자로 문자 저장

				char value4 = 65;
				System.out.println(value4);
				System.out.println();	
			
				// 유니코드로 문자 저장

				char value5 = '\u0065';
				System.out.println(value5);
				System.out.println();
				
				float value21 = 3;
				long value22 = 5;
				int value27 = (int)3.5;

				System.out.println(value21);
				System.out.println(value22);
				System.out.println(value27);
}
}

//quiz 2
// 1 byte a = 3;
// 2 byte b = 5; 
// 3 byte c = 130; // int c = 130;
// 4 long d = a+b; // int d = a+b;
// 5 long e = 100;
// 6 float f = 3.5; // float f = 3.5f;

//quiz 3
//1 System.out.println((int)5.6+3.5);  // 5 + 3.5
//2 System.out.println((int)5.6+(int)3.5); // 5+3
//3 System.out.println((int)(5.6+3.5)); // 9
//4 System.out.println(7/4); // 1
//5 System.out.println((double)3/2); // 1.5
//6 System.out.println((double)(3/2)); // 1.0
package pm;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if (a < 3 & b < 3) {
//			System.out.println("둘 다 3마입니다.");
//		}
		
		
		
		
		int a  = 88;
		switch (a / 10) {
		case 9: case 10:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
			break;
		}
		
		
		int mon = 3;
		switch (mon) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default :
			System.out.println("겨울입니다.");
			break;
		}

		

		
	}

}

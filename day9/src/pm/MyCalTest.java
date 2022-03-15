package pm;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		int i = cal.plus(3, 4);
		int j = cal.exec(5, 6);
		System.out.println(i);
		
		Calculator.exec2(3,4);
	}

}

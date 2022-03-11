package pm;


public class Exam41 {

	public static void main(String[] args) {
		// 가변 길이 자료형을 이용하여 여러개의 정수를 개수와 상관없이
		// 입력받아 그 평균값을 출력하는 매서드를 만드세요
		
		
		
		C c = new C();
		
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	}

}

class C {
	void averageScore (int ...values) {
		double sum = 0.0;
		for(int each: values) {
			sum += each;
		}
		double avg = sum / values.length;
		System.out.println("평균은"+ avg);
		
	}
}
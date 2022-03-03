package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String j = "*";
		for (int i = 1; i <= 5; i++) {
			System.out.println(j);
			j = j + "*";
		}
		
		int[] arr1 = {70,60,55,75,95,90,80,80,85,100};
		int sum = 0;
		int min1 = 0;
		int min2 = 0;
		for (int i = 0; i <=10; i++) {
			sum = sum + arr1[i];
			min1 = (arr1[i] < arr1[i+1]) ? arr1[i]:arr1[i+1];
			min2 = (arr1[i] > arr1[i+1]) ? arr1[i]:arr1[i+1];
		}
		System.out.println("합계"+sum + "평균" + sum/10+"최고점수"+min2+"최소점수"+min1 );
		
		
		
		
		
		
		
		
		
	}

}

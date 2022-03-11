package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] b = new int[100];
//		for (int i = 0; ; i++) {
//			b[i] = i +1;
//		}
//		System.out.println(Arrays.toString(b));
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}

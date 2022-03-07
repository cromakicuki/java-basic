package pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] array1 = new boolean[3];
		for(int i=0; i <3; i++) {
			System.out.println(array1[i]);
		System.out.println();
			
		for(boolean j : array1) {
			System.out.println(j);
		}
		
		int[] array2 = new int[3];
		for (int each: array2) {
			System.out.println(each);
		}
		
		String[] array3 = new String[3];
		for (String str : array3) {
			System.out.println(str+" ");
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
		}
	}

}

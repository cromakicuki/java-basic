package am;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2,7,11,15}; // 인풋 인덱스
	    int target = 9; // 나와야할 숫자
	    
	    int[] nums2 = new int[]{3,2,4}; // 인풋 인덱스
	    int target2 = 6; // 나와야할 숫자

	    int[] nums3 = new int[]{3,3}; // 인풋 인덱스
	    int target3 = 6; // 나와야할 숫자

	    A a = new A(); // class A 호출
	    a.print(nums3,target3); // a로 출력
	}

}

class A { // 클래스 이름 지정
	  void print(int[] num, int tar) { // 함수 이름과 들어오게 될 변수 지정 
	    for(int i = 0; i < num.length; i++) { // 반복문으로 인덱스의 수까지
	    	if((num[i]+num[i+1])==tar){ // 변수[i]+변수[i+1]이 target의 수와 같다면
	    		int[] t = new int[] {i,i+1}; // i와 i+1을 인덱스에 넣는다
	    		System.out.println("["+t[0]+","+t[1]+"]"); //인덱스를 출력한다
	    	}
	    }
	  }
	}
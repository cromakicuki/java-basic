package pm;

public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable audioRunnable = new audioThread1();
		Thread thread1 = new Thread(audioRunnable);
		thread1.start();
		Runnable videoRunnable = new videoThread1();
		Thread thread2 = new Thread(videoRunnable);
		thread2.start();
	}

}


class videoThread1 implements Runnable {

	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		
		for (int a: intArray) {
			System.out.print("비디오 프레임: "+a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

class audioThread1 implements Runnable {
	@Override
	public void run() {
		String[] strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막 번호: "+b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}
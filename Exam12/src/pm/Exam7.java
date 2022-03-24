package pm;

public class Exam7 {

	public static void main(String[] args) {
		Thread smiVideoThread = new videoThread();
		smiVideoThread.start();
		
		Thread smiAudioThread = new audioThread();
		smiAudioThread.start();
	}

}


class videoThread extends Thread {

	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		
		for (int a: intArray) {
			System.out.print("비디오 프레임: "+a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

class audioThread extends Thread {
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
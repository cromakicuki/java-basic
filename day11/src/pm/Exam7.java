package pm;
class FoolException extends RuntimeException {
	//디폴트 생성자 자동
	//상속받고 있으므로 자동으로 부모 생성자 호출 super();
}


public class Exam7 {

	public void sayNick(String nick) {
		try {
		if("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은"+nick+"입니다.");
		}catch(FoolException e) {
			System.out.println("FoolException이 발생했습니다");
		}
	}
	public static void main(String[] args) {
		Exam7 sample = new Exam7();
		sample.sayNick("fool");
		sample.sayNick("genious");

	}


}

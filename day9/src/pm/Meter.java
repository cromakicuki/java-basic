package pm;

public interface Meter {

	public void start();
	public void stop(int distance);
	
	public default void afterMidnight() {
		System.out.println("자정이 넘었습니다. 할증이 필요합니다.");
	}
}

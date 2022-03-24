package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
제네릭 타입 변수가 2개일 때를 생각해보자 제네릭 타입 변수가 2개인 점만 
제외하면 전시간에 살펴본 변수가 1개일 때와 완벽하게 동일하다.
객체를 생성할 때 사용한 실제 제네릭 타입은 순서대로 각각의 제네릭 타입 변수로 치환된다.
 */
		KeyValue<String, Integer> kv1 = new KeyValue<> ();
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		
		System.out.println(key1+value1);
		
		KeyValue<String, Integer> kv2 = new KeyValue<> ();
		kv2.setKey("사과");
		kv2.setValue(1000);
		
		String key2 = kv1.getKey();
		int value2 = kv1.getValue();
		
		System.out.println(key2+value2);
	}

}

class KeyValue<K,V> {
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

/*
 
 */

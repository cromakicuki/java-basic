package pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	객체 생성 방법
 	Array.asList() 매서드를 사용한 정적 컬렉션 개체 완성
 	List<Integer> aList1 = Arrays.asList(1,2,3,4);
 	aList1.set(1,7);
 	
 	Arrays.asList() 매서드를 사용한 정적 컬렉션 개체 생성은 내부적으로는
 	배열을 먼저 생성하고 이것을 List<E>로 래핑wrapping 즉 포장만 해놓는다.
 	따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 크기 변경이 불가능하다.
 	구현 클래스로 객체를 생성했을 때와 달리 데이터의 추가 삭제가 불가능해진다.
 	단 크기를 변경하지 않는 데이터의 변경은 가능하다. 따라서 고정된 개수의 
 	데이터를 저장하거나 활용할 때 사용된다.
 */
		
//		List<Integer> aList1 = Arrays.asList(1,2,3,4);
//		//매서드를 사용한 정적 컬렉션 개체 완성
//	 	aList1.set(1,7); // 1 7 3 4
//	 	List<Integer> aList1 = new ArrayList<>(); 
//	 	List<Integer> aList2 = new ArrayList<>(30);
//	 	List<Integer> aList3 = new Vector<>();
//	 	List<Integer> aList4 = new Vector<>(30);
//	 	//List<Integer> aList5 = new LinkedList<>(30); 저장용량 지정 불가
	 
		List<Integer> aList1 = new ArrayList<>();
		//1. add - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		//2. add - 위치 지정 삽입
		aList1.add(1,6); //(index, value)
		System.out.println(aList1.toString());
		//3. addAll - 또 다른 리스트를 통째로 넣기
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2.toString());
		//3. addAll - 또 다른 리스트를 통째로 넣기
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList2);
		System.out.println(aList3.toString());
		//4. set
		aList3.set(1, 5); //(index, value)
		System.out.println(aList3.toString());
		//5. remove
		aList3.remove(1); // index 값을 삭제
		System.out.println(aList3.toString());
		//6. remove
		aList3.remove(new Integer(2)); // 처음 등장하는 값을 삭제
		System.out.println(aList3.toString());
		//7. clear()
		aList3.clear();
		System.out.println(aList3.toString());
		//8.isEmpty()
		System.out.println(aList3.isEmpty());
		//9.size
		System.out.println(aList3.size());
		//10. get // index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		
//		int i = 0;
//		for(int num : aList2) {
//			System.out.println(aList2.get(i)+"번째: "+num);
//			i++;
//		}
		for(int i =1; i<aList2.size();i++) {
			System.out.println(i+"번째: "+aList2.get(i-1));
		}
	}

}

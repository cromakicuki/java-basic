package pm;

import java.util.LinkedList;
import java.util.List;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Linked List 연결 리스트
 List<E>의 모든 공통 특징을 다 가지고 있다.
 (동질 자료, 동적 할당, 추가/변경/삭제 동일한 메서드 사용)
 
 1.LinkdList<E>는 객체를 생성할 때 저장 용량을 지정할 수 없다.
 2. 내부적으로 데이터를 저장하는 방식이 좀 다르다. 모든 데이터가 서로 연결된 형태로
 	관리된다는 점이다.
 */
		
		List<Integer> livkelist1 = new LinkedList<Integer>();
		livkelist1.add(3);
		livkelist1.add(4);
		livkelist1.add(5);
		//4. set
		livkelist1.set(1, 5); //(index, value)
		System.out.println(livkelist1.toString());
		//5. remove
		livkelist1.remove(1); // index 값을 삭제
		System.out.println(livkelist1.toString());
		//6. remove
		livkelist1.remove(new Integer(2)); // 처음 등장하는 값을 삭제
		System.out.println(livkelist1.toString());
		//7. clear()
		livkelist1.clear();
		System.out.println(livkelist1.toString());
		//8.isEmpty()
		livkelist1.add(3);
		livkelist1.add(4);
		livkelist1.add(5);
		System.out.println(livkelist1.isEmpty());
		//9.size
		System.out.println(livkelist1.size());
		//10. get // index로 가져오기
		
		
		System.out.println(livkelist1.get(0));
		System.out.println(livkelist1.get(1));
		System.out.println(livkelist1.get(2));
	}

}
/*
 만약 7개의 데이터를 가진 ArrayList에서 2번 인덱스에 데이터를 추가하고자 한다면
 기존 2번 이후의 모든 데이터가 한칸씩 뒤로 밀려나게 된다. 그러면 밀려나는 모든 데이터의
 위치 정보가 모두 수정되야 한다는 것을 의미한다. 만약 데이터가 1000개 이고 0번 인덱스에
 데이터를 추가하면 1000개의 데이터 위치 정보를 모두 수정이 되어야한다.
 그러나 Linked List 는 각 원소의 앞뒤 정보를 저장하고 있으므로 어딘가에 값이 추가되면
 값이 추가된 위치의 앞뒤 데이터 정보단 수정하면 된다. 따라서 중간에 데이터를 추가할 때 속도 
 차이가 날 것이라는 것을 예상할 수 있다.
 그렇다고 장점만 있진 않다. LinkedList는 각 원소가 자신의 인덱스 정보를 갖고 있지는 않다.
 특정 인덱스 위치 값을 가져오기 위해서는 앞에서부터 차례대로 번호를 세어가면서 인덱스 위치를
 찾아야한다. 반면에 ArrayList는 데이터 자체에 인덱스 번호를 갖고 있으므로 특정 인덱스 위치의
 데이터를 빠르게 찾을 수 있다.
 
 데이터를 추가 또는 삭제할 때는 LinkedList가 빠르고 데이터를 찾을 때는 ArrayList가 빠르다.
 
 			ArrayList	LinkedList
 추가 삭제			느림			빠름 
    검색			빠름			느림
 
 0 1 2 3 4 5 6		0 1 2 3 4 5 6 7
 가 나 다 라 마 바 사		가 나 아 다 라 마 바 사
 
 */

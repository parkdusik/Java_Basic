package api07.ArrayList;

/**
 * @날짜:2025. 8. 29.
 * @작성자:박두식
 * @설명: list >>ArrayList
 * 				순서유지 index
 * 				데이터 중복 가능
 */

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a.get(1));
		System.out.println(a.toString());

		a.add(77);		//추가
		a.add(2,88);	//추가
		a.set(0, 66);	//수정(교체)
		System.out.println(a.toString());
		
		a.remove(1);	//삭제
		System.out.println(a.toString());
		
		ArrayList<Object> b=new ArrayList<Object>();
		 // ArrayList는 제네릭 타입을 지정해야 하지만,
        // 최상위 클래스인 Object로 선언하면 모든 타입 저장 가능 (업캐스팅 활용)
		b.add("apple");
		b.add(10);
		b.add(55.5f);
		b.add('A');
		b.add(77.7);
		
		System.out.println(b.toString());
	}

}

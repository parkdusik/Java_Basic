package api07.ArrayList;


/**
 * @날짜:2025. 8. 29.
 * @작성자:박두식
 * @설명:ArrayList<Data>
 */
import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		Data a=new Data(10,30);
		Data b=new Data(30,40);
		Data c=new Data(50,60);
		
		ArrayList<Data> list=new ArrayList<Data>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0;i<list.size();i++) {
			Data ab=list.get(i);
			ab.yousan();
			System.out.println(ab.toString());
		}
		
		//추가
		list.add(new Data(1,2));
		list.add(2, new Data(3, 4));
		//수정
		list.set(0, new Data(5,6));
		for(int i=0;i<list.size();i++) {
			Data ab=list.get(i);
			ab.yousan();
			System.out.println(ab.toString());
		}
		//삭제
		list.remove(0);
	}

}

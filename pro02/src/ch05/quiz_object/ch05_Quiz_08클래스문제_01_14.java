package ch05.quiz_object;
/*
14. 다음 메인 함수를 보고 클래스를 작성하세요. (getter 메소드는 데이터 값 1씩 증가)
public class Quiz14 {
public static void main(String[] args) {
Plus p=new Plus();
p.setX(10);
p.setY(20);
System.out.println(p.getX() + "," + p.getY());
}
}
 */
class Plus{
	
	private int x;
	private int y;
	
	public Plus() {}
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX() {
		return ++x;
	}
	
	public int getY() {
		return ++y;
	}
}


public class ch05_Quiz_08클래스문제_01_14 {
	public static void main(String[] args) {
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		System.out.println(p.getX() + "," + p.getY());
	}
}

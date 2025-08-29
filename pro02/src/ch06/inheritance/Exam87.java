package ch06.inheritance;


/**
 * @날짜:2025. 8. 26.
 * @작성자:박두식
 * @설명:상속 -함수 재정의
 */

class EParents{
	protected int x;
	protected int y;
	
	public EParents() {}
	
	public EParents(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void yonsan() {
		System.out.println("hap:"+(x+y));
	}
}

class ESon extends EParents{
	public ESon() {}
	
	public ESon(int x, int y) {
		super(x, y);
	}
	
	public void yonsan() {
		System.out.println("cha:"+(x-y));
	}
}

public class Exam87 {

	public static void main(String[] args) {
		EParents a=new EParents(20, 30);
		a.yonsan();
		
		ESon b=new ESon(10, 20);
		b.yonsan();
	}

}

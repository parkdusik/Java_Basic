package ch07.interfaceA;

/**
 * @날짜:2025. 8. 27.
 * @작성자:박두식
 * @설명:interface
 * 		-내부적으로 public static final상수와 public abstract함수로 구성
 */

interface XX{
	public int su=20;//변수, 함수 //변수 static final
	
	public void disp();//추상 함수 (abstract)
}

class YY implements XX{
	protected int x;
	@Override
	public void disp() {
		System.out.println("Hi");
	}
	
	public void output() {
		
	}
}

class ZZ extends YY{}

interface Test extends XX{}
//interface exam implements YY{} 없음


public class Exam94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			YY y=new YY();
			y.disp();
			y.output();
			
			XX x=new YY();
			x.disp();
			//x.output();
		
	}

}

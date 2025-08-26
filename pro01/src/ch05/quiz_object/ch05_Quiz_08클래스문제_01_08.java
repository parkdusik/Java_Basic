package ch05.quiz_object;
/*
8.  다음과 같은 멤버 변수를 갖는 SutdaCard 클래스를 정의 하세요.
타입 필드이름 설명
정수 num 카드의 숫자 (1~10사이의 정수)
boolean isKwang 광이면 true, 아니면 false

 */

class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public SutdaCard() {}
	
	public SutdaCard(int num) {
		this.num=num;
	}
	
	public void setkwang(String Kwang) {
		if(Kwang =="광") {
			this.isKwang =true;
		}else {
			this.isKwang=false;
		}
	}
	
	public void disp() {
		System.out.println(this.num);
		System.out.println(this.isKwang);
	}
	
}

public class ch05_Quiz_08클래스문제_01_08 {
	public static void main(String[] args) {
		SutdaCard a=new SutdaCard(2);
		a.setkwang("광");
		a.disp();
	}
}

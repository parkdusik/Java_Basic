package ch05.quiz_object;

/*
29. 다음 main 보시고 프로그램을 작성하세요. (임의의 수 입력 받아서 사칙연산)
		public class Quiz28 {
		public static void main(String[] ar)throws
		IOException{Yonsan y=new Yonsan();
		y.input();
		y.yonsan();
		y.disp();
		}}
*/
import java.util.Scanner;

class Yonsan{
	private int su;
	private int value;
	private char buho;
	private int resultInt;
	private float resultFloat;
	Scanner sc=new Scanner(System.in);
	
	
	public void input() {
		System.out.println("수를 입력하세요");
		su=sc.nextInt();
		System.out.println("부호를 입력하세요");
		String str=sc.next();
		this.buho=str.charAt(0);
		System.out.println("수를 입력하세요");
		value=sc.nextInt();
	}
	public void yonsan() {
		switch(this.buho) {
		case'+': this.resultInt=this.su+this.value; break;
		case'-': this.resultInt=this.su-this.value; break;
		case'*': this.resultInt=this.su*this.value; break;
		case'/': this.resultFloat=(float)this.su/this.value; break;
		default:
			this.input();
			this.yonsan();
			break;
		}
	}
	
	public void disp() {
		if(this.buho == '/') {
			System.out.println(""+su+buho+value+"="+resultFloat);
		}else {
			System.out.println(""+su+buho+value+"="+resultInt);
		}
	}
	
	
}



public class ch05_Quiz_08클래스문제_02_29 {
	public static void main(String[] args) {
		Yonsan y=new Yonsan();
		y.input();
		y.yonsan();
		y.disp();
		
		}
}

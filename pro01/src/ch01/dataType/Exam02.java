package ch01.dataType;

/*
 * 단항연산자 : !(일반부정), ~(이진 또는 비트 부정),+/-
 * 
 * */

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a=false;
		boolean b=!a;//일반 부정
		boolean c=!!a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		// ~(이진 또는 비트 부정)
		int d=~10;
		// 0000 1010 : 10
		// 1111 0101 : -10 //음수의 하나큰값
		System.out.println(d);
		
		int e=~-15;
		//1111 001 : -15
		//0000 1110 : 14//양수의 하나 작은 값
		System.out.println(e);
		
		// +/-
		int x=100;
		int y=-200;
		System.out.println(x+"\t"+y);
		System.out.println(-x+"\t"+ -y);
		
	}

}

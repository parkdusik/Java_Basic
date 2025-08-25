package ch01.dataType;

/*
 * 단항연산자 : !(일반부정), ~(이진 또는 비트 부정),+/-
 * 			++/--(전위형 증감 연산자, 후위형 증감 연산자)
 * 
 * */


public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		x++; //후위형 증감 연산자
		++x; //전위형 증감 연산자
		System.out.println(x);
		
		--x; // 11 전위형 증감 연산자
		x--; // 10 우위형 증감 연산자
		System.out.println(x);
		
		int y = 10;
		int z = ++y;
		//int z = y++; // y=11, z=10
		System.out.print("y:"+y);
		System.out.print("z:"+z);
		
		int a = 10;
		int b = 20;
		int c = ++a + ++b; // int c = a++ + b++;
		System.out.println(c);
		
	}
}

package ch01.dataType;
/*
 * 5. 비교연산자 : <, >, <=, >=, ==, !=
 * */

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		boolean c=a>b; // 10>20
		boolean d=a<b; //10<20
		boolean e=a>=b; //10>=20
		boolean f=a<=b; // 10<=20
		System.out.println(c);//false
		System.out.println(d);//true
		System.out.println(e);//false
		System.out.println(f);//true
		
		int x=100;
		int y=200;
		boolean z=x==y;  // 100 ==200
		boolean zz=x!=y; //100 != 200
		
		System.out.println(z);//false
		System.out.println(zz);//true
		
		
		
	}
}

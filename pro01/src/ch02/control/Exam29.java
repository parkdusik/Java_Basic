package ch02.control;

/**
 * @날짜:2025. 8. 20.
 * @작성자:박두식
 * @설명:제어문 - 조건문(if, switch ~case) / 반복문(for, while, do~while)
 * 		제어문 - 반복문(while, do~while)
 * 		제어문 - 반복문(while, do~while 차이점)
 */

public class Exam29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x=10;
		
		while(x>50) { //실행이 안된다.
			System.out.println("while x"+x);
		}
		
		do {//일단 한번은 실행.
			System.out.println("do x:"+x); // 10
		}while(x>50);
	}
}

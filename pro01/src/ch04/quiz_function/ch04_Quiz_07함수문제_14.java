package ch04.quiz_function;

/*
14. 함수를 이용하여 "나 사랑해?"를 물어보고, '1'을 입력할 경우 "우린 천생연분인가 봐!!"를, 
 '2'를 입력할 경우"꺼져!!" 가 출력되게 하시오. (Call By Value)
 */

import java.util.Scanner;

public class ch04_Quiz_07함수문제_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나 사랑해? (1:Yes Or 2: NO) : ");
		int num=sc.nextInt();
		choose(num);
		
		sc.close();
	}
	
	public static void choose(int num) {
		if(num==1) {
			System.out.println("우리는 천생연분 인가봐!!");
		}else if(num==2) {
			System.out.println("꺼져!!");
		}else {
			System.out.println("1이랑 2를 입력해주세요.");
		}
	}
}

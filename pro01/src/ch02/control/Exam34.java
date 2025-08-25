package ch02.control;

/**
 * @날짜:2025. 8. 20.
 * @작성자:박두식
 * @설명:표준입출력
 */

import java.util.Scanner;

public class Exam34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		
		//임의의 두수를 입력받아서 큰 수를 출력
		System.out.println("첫번째 수:");
		int su=sc.nextInt();
		
		System.out.println("두번째 수:");
		int Value=sc.nextInt();
		
		if(su>Value) {
			System.out.println(su);
		}else {
			System.out.println(Value);
		}
		
		//사용자가 입력한 횟수만큼 반복해서 출력(java)하기
		System.out.println("수 입력:");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("java");
		}
		
		//이름, 국어, 영어, 수학 점수 입력받아서 총점과 평균을 구하세요.
		System.out.println("이름");
		String name=sc.next();
		
		System.out.println("국어");
		int kor=sc.nextInt();
		
		System.out.println("영어");
		int eng=sc.nextInt();
		
		System.out.println("수학");
		int mat=sc.nextInt();
		
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		
		System.out.println(name);
		System.out.println(tot);
		System.out.println(avg);
		
		sc.close();
	}
}

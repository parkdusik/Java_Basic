package ch02.quiz_if;

import java.util.Scanner;

public class ch02_Quiz_05제어문문제_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 :");
		int num=sc.nextInt();
		
		if(num>10 && num<20) {
			System.out.println("입력한 숫자"+num+ "은 10보다 크고 20보다 작은수 입니다.");
		}else {
			System.out.println("입력한 숫자"+num+"은 10보다 크고 20보다 작은수가 아닙니다.");
		}
		
		sc.close();
	}
}

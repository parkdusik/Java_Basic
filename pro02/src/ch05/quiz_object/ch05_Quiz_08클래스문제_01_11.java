package ch05.quiz_object;
/*
 * 11. 다음 메인 함수를 보고 클래스를 작성하세요. (데이터 값 입력 받기)

public class Quiz11 {
public static void main(String[] ar){
Employee emp=new Employee();
emp.input();
emp.output();
}
}

 */

import java.util.Scanner;

class Employee{
	private String name;
	private int empID;
	private int age;
	private String title;
	private String dept;
	private char level;
	
	public Employee() {}
	
	public void input() {
			Scanner sc=new Scanner(System.in);
			System.out.println("이름 : ");
			this.name=sc.next();
			System.out.println("사번 : ");
			this.empID=sc.nextInt();
			System.out.println("나이 : ");
			this.age=sc.nextInt();
			System.out.println("직함 : ");
			this.title=sc.next();
			System.out.println("근무부서 : ");
			this.dept=sc.next();
			System.out.println("인사등급 : ");
			String std=sc.next();
			this.level=std.charAt(0);
	}
	
	public void output() {
		
		System.out.println(name+"\t"+empID+"\t"+age+"\t"+title+"\t"+dept+"\t"+level);
	}
	
	
	
	
}



public class ch05_Quiz_08클래스문제_01_11 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.input();
		emp.output();
		
		
	}
}

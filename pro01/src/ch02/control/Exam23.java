package ch02.control;

/**
 * @날짜:2025. 8. 20.
 * @작성자:박두식
 * @설명:제어문 - 조건문(if, switch ~case) / 반복문(for, while, do~while)
 * 		제어문 - 반복문(for, 다중 for)
 */

public class Exam23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su=0;
		for(int i=0; i<10; i++) {
			System.out.println(++su);
		}
		
		System.out.println();
		
		int hap=0;
		
		for(int i=1; i<=10; i++) {
			hap=hap+i; //hap+=i  <== 같은 수식이나 오른쪽의 연산 처리가 조금 빠르다 카더라.
		}
		
		System.out.println(hap);
		
		int sum=0;
		for(int i=100; i<=200; i++) {
			if(i>150&&i<200) {
				sum+=i; //sum=sum+i
			}
		}
		System.out.print(sum);
	}

}

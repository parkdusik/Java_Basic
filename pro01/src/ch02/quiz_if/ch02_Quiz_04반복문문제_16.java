package ch02.quiz_if;

public class ch02_Quiz_04반복문문제_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=10; i<=20; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		
		int sum2=0;
		int j=10;
		while(j<=20) {
			sum2+=j;
			++j;
		}
		
		System.out.println(sum2);
		
		
		int sum3=0;
		int k=10;
		do {
			sum3+=k;
			k++;
			
		}while(k<=20);
		System.out.println(sum3);
	}
}

package ch01.dataType;

/*
 * 단항연산자 : !(일반부정), ~(이진 또는 비트 부정),+/-
 * 			++/--(전위형 증감 연산자, 후위형 증감 연산자)
 *			(cast) 또는 (자료형)
 * */

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		byte b=a; //동일 자료형 또는 큰 자료형
		System.out.println(a+"\t"+b);
		
		short c=20;
		byte d=(byte) c; //byte d=c; <==상위자료형 숫자를 하위 자료형에 넣을 수 없다. (자료형)은 자료형을 바꿔주는 것
		System.out.println(c+"\t"+d);
		
		float i=11.1f;
		double j=12.2; //정수 +실수 = 실수
		//double k=i+j;
		float k=i+(float)j;//형변환
		System.out.println(k+"\n");
		
		int su=10;
		float value=33.3f;
		float result=su+value;
		System.out.println(result);
		
		int num=10;
		int imsi=3; // 정수자료형을 나눌시 실수가 될때. 정수자료형을 실수로 바꾸거나(비추)
		float r=(float) num / imsi; // or float r= num / (float)imsi; 형변환 // 3.0f // 10.0f/3
		System.out.println(r);
		
	}

}

package api03.String;
/**
 * @날짜:2025. 8. 28.
 * @작성자:박두식
 * @설명:String 클래스
 */

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		String oldStr="자바는 객체지향 언어입니다.";
		String newStr=oldStr.replace("자바", "JAVA");
		System.out.println("문자열 치환:"+newStr);
		System.out.println("문자열 원본:"+oldStr+"\t");
		
		String str="How are you?";
		System.out.println("문자열 잘라내기:"+str.substring(2));
		System.out.println("문자열 잘라내기:"+str.substring(2,9)+"\n"); //2번지~9번지, 즉 2~8
		
		String t="    자바    프로그램 ";
		System.out.println("앞뒤공백문자제거:"+t.trim());
		
		//문자열 >> 기본자료형 (int, float.....)
		String su="10";
		Scanner sc=new Scanner(su); //System.in
		int num=sc.nextInt();
		System.out.println(++num);
		
		//엄청많이 사용~~~!!!!!!!!!!!
	
		int value=Integer.parseInt(su);
		System.out.println(++value);
		sc.close();
		
		System.out.println();
		
		//기본자료형(int, float....) >>문자열
		int imsi=10;
		String a=String.valueOf(imsi);
		String b=String.valueOf(10.5);
		String c=String.valueOf(true);
		System.out.println(a+"\t"+b+"\t"+c);
				
}

}

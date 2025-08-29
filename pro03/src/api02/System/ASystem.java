package api02.System;
/**
 * @날짜:2025. 8. 28.
 * @작성자:박두식
 * @설명:System클래스
 */

import java.io.PrintStream;
import java.io.InputStream;
import java.io.IOException;//키보드 입력
import java.util.Scanner;

public class ASystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hahaha");
		PrintStream ps=System.out;
		ps.println("API 시작입니다.");
		ps.println(10);
		ps.println(24.5f);
		
		InputStream is=System.in;
		//키보드 입력을 읽음
		
		//바이트 방식, 문자 방식
		System.out.println("문자입력");//A입력
		char value=(char)is.read();
		
		//A입력후 엔터를 칠시 엔더값이 들어가서 imsi에 들어가지 않음.
		
		//enter = \r+\n . enter값을 읽고 버림.
		is.read(); //\r
		is.read(); //\n
		
		System.out.println("문자입력");
		char imsi=(char)is.read();
		
		is.read(); //\r
		is.read(); //\n
		
		System.out.println("문자입력");
		char temp=(char)is.read();
		
		is.read(); //\r
		is.read(); //\n
		
		
		System.out.println(value);
		System.out.println(imsi);
		System.out.println(temp);
		
		System.out.println();
		
		Scanner sc=new Scanner(is);
		
		System.out.println("문자열 입력");
		String str=sc.next();
		System.out.println(str);
		
		System.out.println("문자 입력");
		String strCh=sc.next();
		char ch=strCh.charAt(0); //바이트>>>문자열로 읽어온다. 결론
		System.out.println(ch);
				
		sc.close();
	}
	
	

}

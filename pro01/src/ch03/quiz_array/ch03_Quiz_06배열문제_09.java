package ch03.quiz_array;

/*
 * 정수를 10개 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는
프로그램을 작성하세요.
 * */

import java.util.Scanner;

public class ch03_Quiz_06배열문제_09 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
   
      Scanner sc=new Scanner(System.in);
      
      System.out.println("3의 배수를 출력해드립니다.");
      
      int [] nums = new int[10];
      String multi3=""; 
      
      for(int i=0; i<nums.length; i++) {
      System.out.println((i+1)+"번째 숫자를 입력해주세요.");
      nums[i] = sc.nextInt();
      
      if(nums[i]%3==0) {
      multi3+=nums[i]+" ";;
      }
      }
      
      System.out.println(multi3+"은 3의 배수입니다.");
      
      
      sc.close();
   }
}

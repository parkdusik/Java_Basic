package ch03.quiz_array;

/*
12. 5개의 수를 입력 받아 큰 순서대로 나열하는 프로그램을 만들어 보자. 
*/

import java.util.Scanner;


public class ch03_Quiz_06배열문제_12 {

	 public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      Scanner sc=new Scanner(System.in);
	      
	      int[] nums =new int[5];
	      
	      
	      System.out.println("5개의 수를 입력 받아 큰 순서대로 나열하는 프로그램입니다.");
	      for(int i=0; i<nums.length;i++) {
	         System.out.println((i+1)+"번째 수를 입력해주세요.");
	         nums[i]=sc.nextInt();
	      }
	   
	      for(int i=0; i<nums.length-1;i++) {
	         for(int j=i+1; j<nums.length;j++)
	            if(nums[i]<nums[j]) {
	               int temp=nums[i];
	               nums[i]=nums[j];
	               nums[j]=temp;
	            }
	      }
	      
	      for(int i=0; i<nums.length;i++) {
	         System.out.println(nums[i]+"\t");
	      }
	      
	      
	      sc.close();
   }
}

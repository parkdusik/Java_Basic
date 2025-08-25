package ch03.quiz_array;

/*
11. 인원수를 입력 받아 총점, 평균을 구하는 성적표를 작성하세요.
*/

import java.util.Scanner;


public class ch03_Quiz_06배열문제_11 {

	  public static void main(String[] args) {
	      // TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);

	      System.out.println("입력하실 학생 수를 입력하세요");
	      int stCount=sc.nextInt();
	      String[] stuName= new String[stCount]; 
	      int[][] stuScore= new int [stCount][3];
	      int[] stuTotalScore= new int [stCount];
	      double[] stuAvgScore= new double [stCount];
	      
	      for(int i=0; i<stCount; i++) {
	         System.out.println((i+1)+"번째 학생 입력");
	         System.out.println("이름을 입력하세요");
	         String name=sc.next();
	         stuName[i]=name;
	         
	         System.out.println(name+"님의 국어 점수를 입력하세요");
	         stuScore[i][0]=sc.nextInt();
	         System.out.println(name+"님의 수학 점수를 입력하세요");
	         stuScore[i][1]=sc.nextInt();
	         System.out.println(name+"님의 영어 점수를 입력하세요");
	         stuScore[i][2]=sc.nextInt();
	         stuTotalScore[i]=stuScore[i][0]+stuScore[i][1]+stuScore[i][2];
	         stuAvgScore[i]=stuTotalScore[i]/3;
	      }
	      
	      
	      System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
	      for(int i=0; i<stCount; i++) {
	         System.out.println(stuName[i]+"\t"
	      +stuScore[i][0]+"\t"+stuScore[i][1]+"\t"+stuScore[i][2]
	            +"\t"+stuTotalScore[i]+"\t"+stuAvgScore[i]);
	         
	      }
	      
	sc.close();
   }
}

package ch05.quiz_object;

/*
30. 다음 결과값을 보시고 프로그램을 작성하세요
		
*/
import java.util.Scanner;

class SungJuk{
	private int inwon;
	private String name[];
	private int kor[];
	private int eng[];
	private int mat[];
	private int tot[];
	private float avg[];
	private int banTot;
	private float banAvg;
	
	
	Scanner sc=new Scanner(System.in);
	
	public SungJuk() {
		System.out.println("인원수 입력");
		inwon=sc.nextInt();
		name = new String[inwon];
	    kor = new int[inwon];
	    eng = new int[inwon];
	    mat = new int[inwon];
		
		for(int i=0; i<inwon; i++) {
			System.out.println("이름");
			name[i]=sc.next();
			System.out.println("국어");
			kor[i]=sc.nextInt();
			System.out.println("영어");
			eng[i]=sc.nextInt();
			System.out.println("수학");
			mat[i]=sc.nextInt();
		}
		
		total();
		average();
		banTotal();
		banAverage();
	}
	
	
	public void total() {
		tot = new int[inwon];
		for(int i=0; i<inwon;i++){
		tot[i]=kor[i]+eng[i]+mat[i];
		}
	}
	public void average() {
		avg = new float[inwon];
		for(int i=0; i<inwon;i++) {
		avg[i]=(float)tot[i]/3;
		}
	}
	
	public void banTotal() {
		for(int i=0; i<inwon;i++) {
			banTot+=tot[i];
		}
	}
	public void banAverage() {
		banAvg=(float)(banTot/inwon);
	}
	
	
	public void disp() {
		for(int i=0; i<inwon;i++) {
		System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		}
	public void title() {
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
	}
	public void bandisp() {
		System.out.println("반총점:"+banTot+"\t"+"반평균:"+banAvg+"\t"+"인원수:"+inwon);
	}
}



public class ch05_Quiz_08클래스문제_02_30 {
	public static void main(String[] args) {
		SungJuk sungjuk =new SungJuk();
		sungjuk.title();
		sungjuk.disp();
		sungjuk.bandisp();
		
	}
}

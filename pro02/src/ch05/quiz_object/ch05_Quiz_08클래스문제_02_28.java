package ch05.quiz_object;

/*
28. 다음 main() 보시고 클래스를 작성하세요. (학점 A, B, C, D, F로 정한다.)
	public class Quiz27 {
	public static void main(String[] args)
	{ HakJum h=new 
	HakJum(88);h.getHakjum();
	h.disp();
	}
	}
*/

class HakJum{
	private int jumsu;
	private char grade;
	
	public HakJum() {}
	public HakJum(int score) {
		this.jumsu=score;
	}
	
	public void getHakjum() {
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80 && jumsu<90) {
			grade='B';
		}else if(jumsu>=70 && jumsu<80) {
			grade='C';
		}else if(jumsu>=60 && jumsu<70) {
			grade='D';
		}else {
			grade='F';
		}
	}
	
	public void disp() {
		System.out.println("jumsu:"+jumsu+"\t"+"grade:"+grade);
	}
}


public class ch05_Quiz_08클래스문제_02_28 {
	public static void main(String[] args) {
		HakJum h=new HakJum(88);
		h.getHakjum();
		h.disp();
	}
	
}

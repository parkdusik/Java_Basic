package ch05.quiz_object;
/*
13. 다음 메인 함수를 보고 클래스를 작성하세요. (절대값 구하기)
public class Quiz11 {
public static void main(String[] ar){
Employee emp=new Employee();
emp.input();
emp.output();
}
}
public class Quiz13 {
public static void main(String[] args){
ABS abs=new ABS();
abs.setValue(-10);
abs.resultAbs();
abs.disp();
 }
}
 */

class ABS{
	private int value;
	
	public ABS() {}
	
	public void setValue(int value ) {
		this.value=value;
	}
	
	public void resultAbs( ) {
			value=Math.abs(value);
		}
	
	public void disp( ) {
		System.out.println("result:"+value);
	}
	
	
}



public class ch05_Quiz_08클래스문제_01_13 {
	public static void main(String[] args) {
		ABS abs=new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}
}

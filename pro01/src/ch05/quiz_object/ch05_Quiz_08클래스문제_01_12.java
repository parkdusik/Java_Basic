package ch05.quiz_object;
/*
 12. 다음 메인 함수를 보고 클래스를 작성하세요.
 */

class Circle{
	private double radius;
	private double area;
	
	Circle(){}
	
	public void getRadius(double radius) {
		this.radius=radius;
	}
	public void findArea() {
		this.area=Math.PI*this.radius*this.radius;
	}
	public void disp() {
		System.out.println("원의 면적:"+area);
	}
}

public class ch05_Quiz_08클래스문제_01_12 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}
}

package ch06.inheritance;

/**
 * @날짜:2025. 8. 26.
 * @작성자:박두식
 * @설명:클래스 -상속
 */

class Car{
	public String model;
	public String color;
	public void disp(){
		System.out.println("Car diso...");
	}
}

class SportsCar extends Car{//model, color, disp()
	public int maxSpeed; //maxSpeed, output()
	public void output() {
		System.out.println(model+"\t"+color+"\t"+maxSpeed);
	}
}

public class Exam81 {

	public static void main(String[] args) {
		Car car=new Car();
		
		SportsCar sp=new SportsCar();
		sp.model="소나타";
		sp.color="";
		sp.maxSpeed=181;
		sp.disp();
		sp.output();
	}

}

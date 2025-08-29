package ch06.inheritance;

public class Exam89_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		long b=a;	//자동형변환
		byte c=(byte) a; //명시적 형변환
		
		Shape s=new Shape(); //aa(), draw();
		Line i=new Line(); //aa(), bb(), draw()
		Shape[] ss=new Shape[3];
		Line[] ii=new Line[3];
		
		
		//Upcasting : 자식클래스가 부모클래스 타입으로 변환되는 것.
		
		Shape shape=new Line();
		shape.aa();
		//shape.bb(); ERROR
		shape.draw();
		
		Shape h=new Rect();
		h.aa();
		//h.bb();
		h.draw();
		
		Shape r=new Cirle();
		r.aa();
		//r.cc();
		r.draw();
		
		System.out.println("---------");
		
		Shape[] array=new Shape[3];
		array[0]=new Line();
		array[1]=new Rect();
		array[2]=new Cirle();
		
		for(int j=0;j<array.length;j++) {
			array[j].aa();
			array[j].draw();
		}
	}

}

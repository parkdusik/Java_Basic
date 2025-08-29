package ch05.object;

public class MyData { //this = myData
	private int x; //10; //this ==myData.x
	private int y; //5;  //this ==myData.y

	//this.setData(int x,int y) ==,yData.setData()
	public void setData(int x, int y) { //a=10, b=5
		//내부에 매개변수 x, y가 있으므로 외부int x,y를 참조하지 않음.
		//블록 내부의 변수가 우선임.
		//		x=x;
		//		y=y;
		this.x=x; //앞 x가 private x가 됨
		this.y=x; //앞 y가 private y가 됨	
		//this.disp()==myData
		System.out.println(x+"\t"+y);
		System.out.println(this.x+"\t"+this.y);
	}
	
	public void disp() {
		//블럭 내부에 x, y변수가 없으므로 블럭 밖의 x,y인 private int x,y 참조
		System.out.println(x+"\t"+y);
	}
	
	public void aa() {}; //x,y
	public void bb() {}; //x,y
	public void cc() {}; //x,y
}

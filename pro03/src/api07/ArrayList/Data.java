package api07.ArrayList;

public class Data {
	private int x;
	private int y;
	private int z;
	
	public Data() {}
	public Data(int x, int y) {
		this.x=y;
		this.y=y;
	}
	
	public void yousan() {
		z=x+y;
	}
	@Override
	public String toString() {
		return "Data [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}

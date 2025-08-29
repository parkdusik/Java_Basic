package ch06.robotAbstract;

public class SuperRobot extends Robot {
	
	public SuperRobot() {}
	
	public SuperRobot(String kind) {
		super.kind=kind;
	}
	
	@Override
	public void actionFly() {
		System.out.println("날수 있습니다.");
	}
	
	@Override
	public void actionMisail() {
		System.out.println("미사일을 쏠 수 있습니다.");
	}
	
	@Override
	public void actionKnife() {
		System.out.println("레이저 검을 가지고 있습니다.");
	}
}

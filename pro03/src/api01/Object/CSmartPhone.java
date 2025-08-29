package api01.Object;

public class CSmartPhone {
	private String company;
	private String os;
	
	public CSmartPhone() {}
	
	public CSmartPhone(String company, String os) {
		this.company=company;
		this.os=os;
	}
	
	public void disp() {
		System.out.println(company+"\t"+os);
	}

	@Override
	public String toString() {
		return "CSmartPhone [company=" + company + ", os=" + os + "]";
	}
	//object로부터 toString을 상속받았지만. 내것이 아님. 그러므로 재정의 필요.
	
}

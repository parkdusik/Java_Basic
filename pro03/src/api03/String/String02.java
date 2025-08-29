package api03.String;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="apple";
		String b="apple";
		System.out.println("주소값 비교:"+(a==b));
		System.out.println("데이터 값 비교:"+a.equals(b));
		
		String x=new String("hi");
		String y=new String("hi");
		System.out.println("주소값 비교:"+(x==y));
		System.out.println("데이터 값 비교:"+x.equals(y));
		System.out.println();
		
		String s="banana";
		String t="BANANA";
		System.out.println("데이터값 비교(대소문자 구분):"+s.equals(t));
		System.out.println("데이터값 비교(대소문자 구분 안함):"+s.equalsIgnoreCase(t));
	}

}

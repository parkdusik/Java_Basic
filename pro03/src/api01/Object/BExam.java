package api01.Object;
/**
 * @날짜:2025. 8. 28.
 * @작성자:박두식
 * @설명: boolean equals(object obj)
 */
public class BExam {
	public static void main(String[] args) {
		String name=new String("apple");
		String irum=new String("apple");
		
		String a="hi";
		String b="hi";
		
		System.out.println("String 주소값 비교 "+(name==irum));
		System.out.println("String 주소값 비교 "+(a==b));
		
		System.out.println("String 데이터 값 비교:"+(name.equals(irum)));
		System.out.println("String 데이터 값 비교:"+(irum.equals(name)));
		System.out.println("String 데이터 값 비교:"+(a.equals(b)));
	}
}

package api04.Wapper;

/**
 * @날짜:2025. 8. 29.
 * @작성자:박두식
 * @설명: Wrapper 클래스는
 * 		-기본 자료형*byte, char, short, int, long, float, double, boolean)값을 포함하는 객체 통칭
 * 		-자동 Boxing, UnBoxing
 */
public class AutoBoxing {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj=100;//원래 안됐었음
		System.out.println(obj);
		
		//자동 Unboxing Interger 클래스 >>자료형
		int value=obj;
		System.out.println(value);
		
		//연산 Boxing/UnBoxing
		int result=obj+100;
		System.out.println(result);
		
	}
}

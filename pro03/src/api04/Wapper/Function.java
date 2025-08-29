package api04.Wapper;

/**
 * @날짜:2025. 8. 29.
 * @작성자:박두식
 * @설명: Integer 클래스
 */
public class Function {

	public static void main(String[] args) {
		// RGB R:0~15 G:0~15 B:0~15
		// 00 00 FF 파랑
		// FF 00 00 빨강
		// 00 FF 00 초록
		
		// RGB 0~255 0~255 0~255
		
		
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		int bytesu=Integer.BYTES;
		int size=Integer.SIZE;
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("byteSu:"+bytesu+"byte");
		System.out.println("size:"+size+"bit");
		System.out.println();
		
		String binarty = Integer.toBinaryString(10);
		String octal=Integer.toOctalString(10);
		String hex=Integer.toHexString(10);
		
		System.out.println("binary:"+binarty);
		System.out.println("octal:"+octal);
		System.out.println("hex:"+hex);
		
		//문자 >>정수형, 실수형, 논리형
		int value2=Integer.parseInt("10"); //Interger.valueOf("10");
		double value3=Double.parseDouble("3.14");
		boolean value4=Boolean.parseBoolean("ture");
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		//정수형, 실수형, 논리형>>문자
		String value5=String.valueOf(10);
		System.out.println(value5);
	}

}

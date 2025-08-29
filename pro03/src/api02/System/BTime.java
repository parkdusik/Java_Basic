package api02.System;
/**
 * @날짜:2025. 8. 28.
 * @작성자:박두식
 * @설명:System 클래스
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class BTime {

	public static void main(String[] args) {

		long time=System.currentTimeMillis();
		System.out.println("현재 날자를 초 단위:"+time);
		System.out.println("현재 시간을 나노초 단위로:"+System.nanoTime());
		
		Date date=new Date(time);
		System.out.println(date); //2025-28
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String ds=sdf.format(date);
		System.out.println(ds);
	}

}

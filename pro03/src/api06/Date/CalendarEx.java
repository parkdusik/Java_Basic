package api06.Date;

/**
 * @날짜:2025. 8. 29.
 * @작성자:박두식
 * @설명:Calendar클래스
 */
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int day=today.get(Calendar.DAY_OF_MONTH);
		
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int seconde=today.get(Calendar.SECOND);
		
		int amPm=today.get(Calendar.AM_PM);
		
		System.out.println(year+"년도");
		System.out.println(month+"월");
		System.out.println(day+"일\t");
		
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(seconde+"초");
		System.out.println(amPm==0 ? "오전":"오후");
		System.out.println();
		
		
		
		

		//Calender 현재 시스템 날짜 가져와서 원하는 포맷 출력 방식
		Date date=today.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		//Date 현재 시스템 날짜를 가져와서 원하는 포맷출력 방식
		Date d=new Date();
		sdf.format(d);
	}

}

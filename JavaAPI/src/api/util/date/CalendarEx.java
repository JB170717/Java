package api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		//
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //날짜가 1개 빠져서 나와...
		int day = cal.get(Calendar.DATE);
		int hour =cal.get(Calendar.HOUR);
		int minute =cal.get(Calendar.MINUTE); 
		int second =cal.get(Calendar.SECOND); 
		
		System.out.println(year);
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",year,month,day,hour,minute,second);
		
		
 		
	}
	

}

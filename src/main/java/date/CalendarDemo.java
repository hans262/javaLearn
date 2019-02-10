package date;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//设置时间、修改时间
//		c.set(Calendar.DAY_OF_MONTH, 24);
//		c.add(Calendar.DAY_OF_MONTH, -1);
		//获取时间
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"年"+month+"月"+day+"日");
		
		
	}
}

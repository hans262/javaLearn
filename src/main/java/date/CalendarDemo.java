package date;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//����ʱ�䡢�޸�ʱ��
//		c.set(Calendar.DAY_OF_MONTH, 24);
//		c.add(Calendar.DAY_OF_MONTH, -1);
		//��ȡʱ��
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"��"+month+"��"+day+"��");
		
		
	}
}

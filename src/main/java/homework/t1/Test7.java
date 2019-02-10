package homework.t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test7 {
	public static void main(String[] args) throws ParseException {
//		method2();
		
//		method1();
		
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		
		System.out.println(c.get(Calendar.YEAR));
		
	}

	private static void method2() {
		new AAA();
		System.gc();
		System.out.println(System.currentTimeMillis());
	}

	private static void method1() throws ParseException {
		Date d=new Date();
		System.out.println(d.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		Date d2=sdf.parse("2018-06-28 17:41:33");
		System.out.println(d2);
	}
}


class AAA{
	public void finalize(){
		System.out.println("我被回收了");
	}
}

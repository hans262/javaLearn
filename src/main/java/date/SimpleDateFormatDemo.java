package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
//		method1();
		method2();
	}

	private static void method2() throws ParseException {
		//自定义格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date=new Date();
		//转字符串
		String s=sdf.format(date);
		System.out.println(s);
		//转Date对象
		Date d=sdf.parse(s);
		System.out.println(d);
	}

	private static void method1() throws ParseException {
		//默认格式
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date date=new Date();
		//转字符串
		String s=sdf.format(date);
		System.out.println(s);
		//转Date对象
		Date d=sdf.parse(s);
		System.out.println(d);
	}
}

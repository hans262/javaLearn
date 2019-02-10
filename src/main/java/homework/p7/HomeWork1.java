package homework.p7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
1.已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象
2.将(1)中的日期对象转换为日历类的对象
3.根据日期对象获取改日期是星期几,以及这一年的第几天   
4.通过键盘录入日期字符串，格式(2015-10-20) 
	如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"
*/
public class HomeWork1 {
	public static void main(String[] args) throws ParseException {
//		method1();
//		method2();
//		method3();
		


	}

	private static void method3() {
		//根据日期对象获取改日期是星期几,以及这一年的第几天
		Date d=new Date();
		
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.MONTH, 10-1);
		c.set(Calendar.DAY_OF_MONTH, 20);
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		int days=c.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(days);
	}

	private static void method2() throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入日期：");
		String s=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(s);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年-MM月-dd日 是E，是yyyy年的第DDD天");
		System.out.println(sdf2.format(d));
	}

	private static void method1() throws ParseException {
		//日期字符串
		String s="2015-10-20";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//转日期对象
		Date d=sdf.parse(s);
		System.out.println("日期对象："+d);
		//转日历对象
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		System.out.println(c.get(Calendar.YEAR));
	}
}


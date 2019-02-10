package homework.p7;

import java.util.Calendar;

/*
要求:利用Calendar类的方法判断当前年是闰年还是平年
提示:
闰年:二月有29天
将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天
*/
public class HomeWork3 {
	public static void main(String[] args) {
//		method1();
		method2();
	}
	private static void method2() {
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 3-1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_YEAR, -1);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		int dd=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(dd);
		if(dd==29)
			System.out.println("闰年");
		else
			System.out.println("不是闰年");
	}

	private static void method1() {
		int year=2000;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
			System.out.println("闰年");
		else 
			System.out.println("不是闰年");
	}
}

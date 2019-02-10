package homework.p7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
*/
public class HomeWork2 {
	public static void main(String[] args) throws ParseException {
		String s="1994-04-06";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(s);
		//出生时的毫秒数
		long start=d.getTime();
		System.out.println(start);
		//现在的毫秒数
		long now=System.currentTimeMillis();
		System.out.println(now);
		//总天数
		long day=(now-start)/(24*60*60*1000);
		System.out.println(day);
	}
}



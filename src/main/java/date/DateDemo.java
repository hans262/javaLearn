package date;

import java.util.Date;


public class DateDemo {
	public static void main(String[] args) {
		/*Date d=new Date();
		System.out.println(d);
		Date d2=new Date(1000);
		System.out.println(d2);*/
		
		Date d=new Date();//得到当前时间
		System.out.println(d);//把当年时间转化成毫秒
		d.setTime(1000);//设置当前时间
		System.out.println(d);
		
		
		
		
		
	}
}

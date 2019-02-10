package homework.p7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
1.��֪�����ַ���:"2015-10-20",���������ַ���ת��Ϊ���ڶ���
2.��(1)�е����ڶ���ת��Ϊ������Ķ���
3.�������ڶ����ȡ�����������ڼ�,�Լ���һ��ĵڼ���   
4.ͨ������¼�������ַ�������ʽ(2015-10-20) 
	�����룺2015-10-20�����"2015��-10��-20�� �� ���ڶ�����2015��ĵ� 293 ��"
*/
public class HomeWork1 {
	public static void main(String[] args) throws ParseException {
//		method1();
//		method2();
//		method3();
		


	}

	private static void method3() {
		//�������ڶ����ȡ�����������ڼ�,�Լ���һ��ĵڼ���
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
		System.out.println("���������ڣ�");
		String s=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(s);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��-MM��-dd�� ��E����yyyy��ĵ�DDD��");
		System.out.println(sdf2.format(d));
	}

	private static void method1() throws ParseException {
		//�����ַ���
		String s="2015-10-20";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//ת���ڶ���
		Date d=sdf.parse(s);
		System.out.println("���ڶ���"+d);
		//ת��������
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		System.out.println(c.get(Calendar.YEAR));
	}
}


package homework.p7;

import java.util.Calendar;

/*
Ҫ��:����Calendar��ķ����жϵ�ǰ�������껹��ƽ��
��ʾ:
����:������29��
����������Ϊ3��1��,Ȼ����1����2�µ�,���2�µ��Ƕ�����
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
			System.out.println("����");
		else
			System.out.println("��������");
	}

	private static void method1() {
		int year=2000;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
			System.out.println("����");
		else 
			System.out.println("��������");
	}
}

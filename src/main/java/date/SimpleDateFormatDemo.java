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
		//�Զ����ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date date=new Date();
		//ת�ַ���
		String s=sdf.format(date);
		System.out.println(s);
		//תDate����
		Date d=sdf.parse(s);
		System.out.println(d);
	}

	private static void method1() throws ParseException {
		//Ĭ�ϸ�ʽ
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date date=new Date();
		//ת�ַ���
		String s=sdf.format(date);
		System.out.println(s);
		//תDate����
		Date d=sdf.parse(s);
		System.out.println(d);
	}
}

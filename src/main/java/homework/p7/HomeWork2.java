package homework.p7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.�Ӽ���¼��һ�������ַ���,��ʽΪ xxxx-xx-xx,������˵ĳ�������
2.�����˳������ڵ���ǰ�����������ĺ���ֵ���������˻��˶�����
*/
public class HomeWork2 {
	public static void main(String[] args) throws ParseException {
		String s="1994-04-06";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(s);
		//����ʱ�ĺ�����
		long start=d.getTime();
		System.out.println(start);
		//���ڵĺ�����
		long now=System.currentTimeMillis();
		System.out.println(now);
		//������
		long day=(now-start)/(24*60*60*1000);
		System.out.println(day);
	}
}



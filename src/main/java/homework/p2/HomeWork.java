package homework.p2;

import java.util.Random;

/*1.����String getStr(char[] chs)����
������������ȡ����Ϊ5������ַ�����
�ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������*/

/*(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ	*/

public class HomeWork {
	public static void main(String[] args) {
		char[] chs={'A','B','C','D','E','F','G','H','I','J','k','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println(getStr(chs));
	}
	public static String getStr(char[] chs) {
		String s="";
		Random r=new Random();
		for(int i=0;i<5;i++){
			int index=r.nextInt(26);
			s+=chs[index];
		}
		int temp1=r.nextInt(10);
		int temp2=r.nextInt(5);
		StringBuilder sb=new StringBuilder(s);
		s=sb.replace(temp2,temp2+1,temp1+"").toString();
		return s;
	}
	//��ȡ���26����ĸ
	public static void getRandomLettres() {
		Random r=new Random();
		for(int i=0;i<26;i++){
			System.out.print((char)(r.nextInt(26)+65)+",");
		}
	}
}

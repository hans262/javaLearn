package homework.p2;

import java.util.Random;

/*1.定义String getStr(char[] chs)方法
功能描述：获取长度为5的随机字符串，
字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成*/

/*(1)定义长度为26，元素值为26个大写英文字母的数组chs
(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值	*/

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
	//获取随机26个字母
	public static void getRandomLettres() {
		Random r=new Random();
		for(int i=0;i<26;i++){
			System.out.print((char)(r.nextInt(26)+65)+",");
		}
	}
}

package besic.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������·ݣ�");
		System.out.println(getSeason(sc.nextInt()));
	}
	public static String getSeason(int x) {
		if(x==3 || x==4 || x==5) return "����";
		else if(x==6 || x==7 || x==8) return "�ļ�";
		else if(x==9 || x==10 || x==11) return "�＾";
		else if(x==12 || x==1 || x==2) return "����";
		else return "������ļ�������";
	}
}

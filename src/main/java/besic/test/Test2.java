package besic.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������·ݣ�");
		System.out.println(getSeason(sc.nextInt()));
	}
	public static String getSeason(int month) {
		switch(month){
		case 3:
		case 4:
		case 5:
			return "����";
		case 6:
		case 7:
		case 8:
			return "�ļ�";
		case 9:
		case 10:
		case 11:
			return "�＾";
		case 12:
		case 1:
		case 2:
			return "����";
		default:
			return "��������·�����";
		}
	}
}

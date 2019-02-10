package besic.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入月份：");
		System.out.println(getSeason(sc.nextInt()));
	}
	public static String getSeason(int month) {
		switch(month){
		case 3:
		case 4:
		case 5:
			return "春季";
		case 6:
		case 7:
		case 8:
			return "夏季";
		case 9:
		case 10:
		case 11:
			return "秋季";
		case 12:
		case 1:
		case 2:
			return "冬季";
		default:
			return "你输入的月份有误";
		}
	}
}

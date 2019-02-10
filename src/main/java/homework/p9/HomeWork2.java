package homework.p9;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个原字符串：");
		String scrStr=sc.nextLine();
		System.out.println("请输入要删除字符串：");
		String delStr=sc.nextLine();
		
		int start;
		while((start=scrStr.indexOf(delStr))!=-1){
			int end=scrStr.indexOf(delStr)+delStr.length();
			String temp1=scrStr.substring(0,start);
			String temp2=scrStr.substring(end,scrStr.length());
			scrStr=temp1+temp2;
		}
		System.out.println(scrStr.trim());
	}
}

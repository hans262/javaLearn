package besic.string;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ������ݣ�");
		String s=sc.nextLine();
		
		String start=s.substring(0,1).toUpperCase();
		String end=s.substring(1).toLowerCase();
		
		System.out.println(start+end);
	}
}

package besic.if_switch;

import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������ a");
		int a=sc.nextInt();
		System.out.println("������ڶ������� b");
		int b=sc.nextInt();
		if(a>b) System.out.println("���ֵ��a");
		else if(a==b) System.out.println("a����b");
		else System.out.println("���ֵ��b");
	}
}

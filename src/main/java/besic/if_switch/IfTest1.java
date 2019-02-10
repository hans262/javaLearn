package besic.if_switch;

import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据 a");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据 b");
		int b=sc.nextInt();
		if(a>b) System.out.println("最大值是a");
		else if(a==b) System.out.println("a等于b");
		else System.out.println("最大值是b");
	}
}

package besic.debug;

import java.util.Scanner;

public class DebugTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据");
		int b=sc.nextInt();
		System.out.println(sum(a,b));
	}
	public static int sum(int x,int y){
		return x+y;
	}
}

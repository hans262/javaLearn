package besic.method;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请依次输入两个int类型数字");
		System.out.println("求和值为："+getSum(sc.nextInt(),sc.nextInt()));
	}
	public static int getSum(int a,int b){
		return a+b;
	}
}

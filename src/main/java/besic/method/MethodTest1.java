package besic.method;

import java.util.Scanner;

public class MethodTest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请依次输入三个int类型的数字");
		System.out.println("最大值是："+getMax(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
	public static int getMax(int a,int b,int c){
		int tamp=(a>b)?a:b;
		return (tamp>c)?tamp:c;
	}
}

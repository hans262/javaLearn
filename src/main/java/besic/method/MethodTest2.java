package besic.method;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������int��������");
		System.out.println("���ֵΪ��"+getSum(sc.nextInt(),sc.nextInt()));
	}
	public static int getSum(int a,int b){
		return a+b;
	}
}

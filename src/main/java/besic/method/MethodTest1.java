package besic.method;

import java.util.Scanner;

public class MethodTest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������int���͵�����");
		System.out.println("���ֵ�ǣ�"+getMax(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
	public static int getMax(int a,int b,int c){
		int tamp=(a>b)?a:b;
		return (tamp>c)?tamp:c;
	}
}

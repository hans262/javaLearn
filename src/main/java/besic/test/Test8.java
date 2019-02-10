package besic.test;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		int x=sc.nextInt();
		int[] arr=new int[4];
		arr[0]=x/10/10/10%10;
		arr[1]=x/10/10%10;
		arr[2]=x/10%10;
		arr[3]=x%10;
		setCode(arr);
		
		int temp=arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		temp=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		printArr(arr);
	}
	public static void setCode(int[] arr) {
		for(int i=0;i<arr.length;i++){
			arr[i]+=5;
			arr[i]%=10;
		}
	}
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
		System.out.println();
	}
}

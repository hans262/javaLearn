package besic.test;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数据");
			arr[i]=sc.nextInt();
		}
		printArr(arr);
		reverse(arr);
		printArr(arr);
	}
	public static void reverse(int[] arr) {
		for(int s=0,e=arr.length-1;s<=e;s++,e--){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
		}
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+",");
		System.out.print("]");
		System.out.println();
	}
}

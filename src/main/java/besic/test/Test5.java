package besic.test;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数据:");
			arr[i]=sc.nextInt();
		}
		int avg=(sum(arr)-getMax(arr)-getMin(arr))/(arr.length-2);
		System.out.println("选手的平均分是："+avg);
	}
	public static int getMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
		}
		return max;
	}
	public static int getMin(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}
	public static int sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++) sum+=arr[i];
		return sum;
	}
}

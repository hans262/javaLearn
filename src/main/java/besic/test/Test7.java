package besic.test;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		int[] arr={5,7,6,9,2,5,4,3,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字：");
		int index=getIndex(arr,sc.nextInt());
		System.out.println("索引为:"+index);
	}
	public static int getIndex(int[] arr,int x) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x) return i;
		}
		return -1;
	}
}

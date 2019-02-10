package homework.file;

import java.util.Scanner;
/*1.键盘录入6个int类型的数据存数数组arr中
2.将arr数组中的内容反转
3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
5.打印最终的数组(实现了1-4步之后的数组)
6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]*/
public class Test2 {
	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("输入第"+(i+1)+"个数字");
			arr[i]=sc.nextInt();
		}
		printArr(arr);
		reversal(arr);
		
		for(int i=3;i<arr.length;i++){
			if(i%2==1){
				int temp=arr[i];
				arr[i]=arr[i-2];
				arr[i-2]=temp;
			}
		}
		printArr(arr);
	}
	public static void reversal(int[] arr) {
		for(int s=0,e=arr.length-1;s<=e;s++,e--){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
		}
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
		System.out.println("]");
	}
}

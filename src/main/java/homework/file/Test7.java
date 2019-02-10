package homework.file;

import java.util.Random;

/*1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数，
2.定义一个方法，传入两个数组，函数中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
	如果没有则输出"对不起两个数组的所有元素均相同"*/
public class Test7 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] arr2=new int[10];
		Random ran=new Random();
		for(int i=0;i<arr.length;i++) arr[i]=ran.nextInt(100);
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+",");
		System.out.print("]");
		System.out.println();
	}
}

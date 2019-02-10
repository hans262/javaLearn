package homework.file;

import java.util.Scanner;

/*1.键盘录入10个整数存入数组中
2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
3.定义一个方法打印原数组和处理后的数组
4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数*/
public class Test5 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			
		}
	}
}

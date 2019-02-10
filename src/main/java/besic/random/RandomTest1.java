package besic.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
	public static void main(String[] args) {
		Random ran=new Random();
		int num=ran.nextInt(10)+1;
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个数字（1~10）");
			int a=sc.nextInt();
			if(a>num) System.out.println("大了");
			else if(a<num) System.out.println("小了");
			else{
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
}

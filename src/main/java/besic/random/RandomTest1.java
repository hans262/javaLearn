package besic.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
	public static void main(String[] args) {
		Random ran=new Random();
		int num=ran.nextInt(10)+1;
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("������һ�����֣�1~10��");
			int a=sc.nextInt();
			if(a>num) System.out.println("����");
			else if(a<num) System.out.println("С��");
			else{
				System.out.println("��ϲ��¶���");
				break;
			}
		}
	}
}

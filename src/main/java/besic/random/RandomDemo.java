package besic.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random ran=new Random();
		for(int i=0;i<10;i++){
			int num=ran.nextInt(10);
			num++;
			System.out.println(num);
		}
	}
}

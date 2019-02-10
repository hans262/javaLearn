package besic.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÔÂ·İ£º");
		System.out.println(getSeason(sc.nextInt()));
	}
	public static String getSeason(int x) {
		if(x==3 || x==4 || x==5) return "´º¼¾";
		else if(x==6 || x==7 || x==8) return "ÏÄ¼¾";
		else if(x==9 || x==10 || x==11) return "Çï¼¾";
		else if(x==12 || x==1 || x==2) return "¶¬¼¾";
		else return "ÄãÊäÈëµÄ¼¾½ÚÓĞÎó";
	}
}

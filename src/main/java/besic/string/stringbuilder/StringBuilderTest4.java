package besic.string.stringbuilder;

import java.util.Scanner;

public class StringBuilderTest4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String str=sc.nextLine();
		System.out.println(isSymme(str));
	}
	public static boolean isSymme(String s) {
		StringBuilder sb=new StringBuilder(s);
		return s.equals(sb.reverse().toString());
	}
}

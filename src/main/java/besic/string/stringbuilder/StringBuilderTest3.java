package besic.string.stringbuilder;

import java.util.Scanner;

public class StringBuilderTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String s=sc.nextLine();
		String str=getReverse2(s);
		System.out.println(str);
	}
	public static String getReverse(String s) {
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString();
	}
	public static String getReverse2(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}

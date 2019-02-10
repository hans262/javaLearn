package besic.string;

import java.util.Scanner;

public class StringTest6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String s=sc.nextLine();
		String s2=getReversal(s);
		System.out.println(s2);
	}
	public static String getReversal(String s) {
		String s2="";
		for(int i=s.length()-1;i>=0;i--){
			s2+=s.charAt(i);
		}
		return s2;
	}
	public static String getReversal2(String s) {
		String s2="";
		char[] ch=s.toCharArray();
		for(int si=0,e=ch.length-1;si<=e;si++,e--){
			char temp=ch[si];
			ch[si]=ch[e];
			ch[e]=temp;
		}
		s2=new String(ch);
		return s2;
	}
}

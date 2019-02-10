package besic.string;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串数据：");
		String s=sc.nextLine();
		
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z'){
				bigCount+=1;
			}else if(ch>='a' && ch<='z'){
				smallCount+=1;
			}else if(ch>='0' && ch<='9'){
				numberCount+=1;
			}else{
				System.out.println("该字符非法");
			}
		}
		System.out.println(bigCount+","+smallCount+","+numberCount);
	}
}

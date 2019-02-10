package homework.p9;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++){
			arr[i]=s.charAt(i);
		}
		if(arr[0]!=arr[arr.length-1]){
			char temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				arr[i]='`';
			}
		}
		System.out.println(arr);
		
	}
}

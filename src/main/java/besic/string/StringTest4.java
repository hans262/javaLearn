package besic.string;

import java.util.Scanner;

public class StringTest4 {
	public static void main(String[] args) {
		String username="admin";
		String password="admin";
		
		for(int i=0;i<3;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入账号：");
			String name=sc.nextLine();
			System.out.println("请输入密码：");
			String pwd=sc.nextLine();
			
			if(username.equals(name) && password.equals(pwd)){
				System.out.println("登录成功");
				break;
			}else{
				if((2-i)==0) System.out.println("你的账号已被锁定，请与管理员取得练习。");
				else System.out.println("登录失败你还有"+(2-i)+"次机会");
			}
		}
	}
}

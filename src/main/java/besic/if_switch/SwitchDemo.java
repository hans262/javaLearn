package besic.if_switch;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day){
		case 1:
			System.out.println("今天是星期一");
			System.out.println("上班");
			break;
		case 2:
			System.out.println("今天是星期二");
			System.out.println("上班");
			break;
		case 3:
			System.out.println("今天是星期三");
			System.out.println("上班");
			break;
		case 4:
			System.out.println("今天是星期四");  
			System.out.println("上班");          
			break;                               
		case 5:                                  
			System.out.println("今天是星期五");  
			System.out.println("明天放假");
			break;                               
		case 6:                                  
			System.out.println("今天是星期六");  
			System.out.println("休息");
			break;                               
		case 7:
			System.out.println("今天是星期天");
			System.out.println("休息");
			break;
		default:
			System.out.println("你的输入有误");
			break;
		}
	}
}

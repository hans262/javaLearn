package besic.if_switch;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day){
		case 1:
			System.out.println("����������һ");
			System.out.println("�ϰ�");
			break;
		case 2:
			System.out.println("���������ڶ�");
			System.out.println("�ϰ�");
			break;
		case 3:
			System.out.println("������������");
			System.out.println("�ϰ�");
			break;
		case 4:
			System.out.println("������������");  
			System.out.println("�ϰ�");          
			break;                               
		case 5:                                  
			System.out.println("������������");  
			System.out.println("����ż�");
			break;                               
		case 6:                                  
			System.out.println("������������");  
			System.out.println("��Ϣ");
			break;                               
		case 7:
			System.out.println("������������");
			System.out.println("��Ϣ");
			break;
		default:
			System.out.println("�����������");
			break;
		}
	}
}

package besic.string;

import java.util.Scanner;

public class StringTest4 {
	public static void main(String[] args) {
		String username="admin";
		String password="admin";
		
		for(int i=0;i<3;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("�������˺ţ�");
			String name=sc.nextLine();
			System.out.println("���������룺");
			String pwd=sc.nextLine();
			
			if(username.equals(name) && password.equals(pwd)){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				if((2-i)==0) System.out.println("����˺��ѱ��������������Աȡ����ϰ��");
				else System.out.println("��¼ʧ���㻹��"+(2-i)+"�λ���");
			}
		}
	}
}

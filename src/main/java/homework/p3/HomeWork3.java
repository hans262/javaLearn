package homework.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬
//��ʽ���û���������,�磺aaa,123��
//2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
//	jack,123
//	rose,123
//	tom,123
//3.Ҫ��������¹��ܣ�
//  ��������ʱ������̨��ʾ�û�����ע����û��������룻
//   ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
//   �ǣ�����̨��ʾ���û����Ѵ���
//   �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���
public class HomeWork3 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=sc.nextLine();
		System.out.println("���������룺");
		String password=sc.nextLine();
		BufferedReader br=new BufferedReader(new FileReader("user.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("user.txt",true));
		String line;
		boolean flag=false;
		while((line=br.readLine())!=null){
			String n=line.split(",")[0];
			if(n.equals(username)){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("�û����Ѵ���");
		}else{
			bw.write(username+","+password);
			bw.newLine();
			bw.flush();
			System.out.println("ע��ɹ�");
		}
		br.close();
		bw.close();
	}
}

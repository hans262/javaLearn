package homework.p3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//ʵ��һ����֤��С����Ҫ�����£�
//1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,
//����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
//2. ����¼��һ����Ҫ��У�����֤�룬
//����������֤����data.txt�д��ڣ�
//�ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ�� 
public class HomeWork2 {
	public static void main(String[] args) throws IOException {
		String code="9856";
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		String line;
		boolean flag=false;
		while((line=br.readLine())!=null){
			if(code.equals(line)){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("��֤�ɹ�");
		}else{
			System.out.println("��֤ʧ��");
		}
		br.close();
	}
}

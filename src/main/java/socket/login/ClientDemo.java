package socket.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * ģ���û���¼
 * 		
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//�����ͻ���Socket����
		Socket s=new Socket("OULA",8888);
		
		//��ȡ�û�������
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������û�����");
		String username=br.readLine();
		System.out.println("����������");
		String password=br.readLine();
		
		//�������ݣ�����Ϊ��λ����
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println(username);
		out.println(password);
		
		//��������
		BufferedReader res=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String result=res.readLine();
		
		//��ӡ���
		System.out.println(result);
		
		//�ͷ���Դ
		s.close();
	}
}

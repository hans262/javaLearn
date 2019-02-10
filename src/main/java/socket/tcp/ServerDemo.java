package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ʹ��TCPЭ���������
 * 		�������ն�Socket����
 * 		������������
 * 		��ȡ����������
 * 		��ȡ����
 * 		�������
 * 		�ͷ���Դ
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
		//��������
		Socket s=ss.accept();
		//��ȡ����������
		InputStream is=s.getInputStream();
		//��ȡ����
		byte[] bys=new byte[1024];
		int len;
		len=is.read(bys);
		String data=new String(bys, 0, len);
		
		InetAddress adress=s.getInetAddress();
		String clientHostName=adress.getHostName();
		
		//��ӡ����
		System.out.println("client --->"+clientHostName);
		System.out.println(data);
		
		s.close();
		
	}
}

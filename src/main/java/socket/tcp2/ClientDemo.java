package socket.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * ģ�������յ�����
 * ת�ɴ�Щ ��ת�����ͻ���
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws  IOException {
		//�����ͻ���Socket����
		Socket s=new Socket(InetAddress.getByName("OULA"),10086);
		
		//��������
		OutputStream os =s.getOutputStream();
		byte[] bys="hello tcp, im comming!".getBytes();
		os.write(bys);
		
		//��������
		InputStream is=s.getInputStream();
		byte[] byss=new byte[1024];
		int len;
		len=is.read(byss);
		String data=new String(byss, 0, len);
		
		//��ӡ����
		System.out.println(data);
		
		//�ͷ���Դ
		s.close();
		
	}
}

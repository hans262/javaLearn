package socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/*
 * ʹ��TCPЭ�鷢������
 * 		�������Ͷ�Socket���󣬴������ӣ�
 * 		��ȡ���������
 * 		������ݣ���������
 * 		�ͷ���Դ
 * 
 * Exception in thread "main" java.net.ConnectException:
 * ����ʧ���쳣
 * 
 */

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket(InetAddress.getByName("OULA"),10086);
		
		OutputStream os=s.getOutputStream();
		byte[] data="hello tcp, im comming!!!".getBytes();
		os.write(data);
		
		s.close();
	}
}

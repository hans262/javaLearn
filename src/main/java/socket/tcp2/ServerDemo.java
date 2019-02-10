package socket.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//���������Socket����
		ServerSocket ss=new ServerSocket(10086);
		
		//���������ݣ�
		Socket s=ss.accept();
		
		//��ȡ����
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len;
		len=is.read(bys);
		String data=new String(bys, 0, len);
		
		//��ӡ����
		System.out.println(data);
		
		//��������
		OutputStream os=s.getOutputStream();
		String upperData=data.toUpperCase();
		os.write(upperData.getBytes());
		
		//�ͷ���Դ
		s.close();
		
	}
}

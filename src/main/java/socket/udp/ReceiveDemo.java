package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ʹ��UDP��������
 * 		�������ն�Socket����
 * 		��������
 * 		��������
 * 		�������
 * 		�ͷ���Դ
 * 
 * 
 * 
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(8888);
		//��������
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		ds.receive(dp);//����
		
		//��������
		InetAddress address=dp.getAddress();
		byte[] data=dp.getData();
		int length=dp.getLength();
		
		//�������
		System.out.println("sender --->"+address.getHostAddress());
		System.out.println(new String(data, 0, length));
		
		ds.close();
	}
}

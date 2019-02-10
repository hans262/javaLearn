package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ʹ��UDPЭ�鷢������
 * 		�������Ͷ�Socket����
 * 		�������ݲ����
 * 		��������
 * 		�ͷ���Դ
 * 
 * DatagramSocket:�����������ͺͽ������ݣ�����UDP
 * DatagramSocket() : ����Socket�����������˿ں�
 * DatagramSocket(int port) : ����Socket����ָ���˿ں�
 * 
 * 
 * DatagramPacket:�����ʾ���ݰ�
 * DatagramPacket(byte[] bys, int length, InetAddress address, int port)
 * 	���ṩ ����byte[] ����˭ip �˿�
 * 
 * ע������
 * 	�˿ںŴ������ݿ���������������������쳣�������ղ���
 * 	���ն˶˿ںŲ����ظ�
 * 	
 * 
 * 
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		//��������
		String s="hello udp, im comming";
		byte[] bys=s.getBytes();
		int length=bys.length;
		InetAddress address=InetAddress.getByName("OULA");
		int port=8888;
		
		DatagramPacket dp=new DatagramPacket(bys, length, address, port);

		ds.send(dp);
		ds.close();
	}
}

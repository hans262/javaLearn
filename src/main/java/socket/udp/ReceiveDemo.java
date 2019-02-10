package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP接收数据
 * 		创建接收端Socket对象
 * 		接收数据
 * 		解析数据
 * 		输出数据
 * 		释放资源
 * 
 * 
 * 
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(8888);
		//接收数据
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		ds.receive(dp);//阻塞
		
		//解析数据
		InetAddress address=dp.getAddress();
		byte[] data=dp.getData();
		int length=dp.getLength();
		
		//输出数据
		System.out.println("sender --->"+address.getHostAddress());
		System.out.println(new String(data, 0, length));
		
		ds.close();
	}
}

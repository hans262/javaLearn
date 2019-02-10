package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP协议发送数据
 * 		创建发送端Socket对象
 * 		创建数据并打包
 * 		发送数据
 * 		释放资源
 * 
 * DatagramSocket:此类用来发送和接收数据，基于UDP
 * DatagramSocket() : 创建Socket对象并随机分配端口号
 * DatagramSocket(int port) : 创建Socket对象并指定端口号
 * 
 * 
 * DatagramPacket:此类表示数据包
 * DatagramPacket(byte[] bys, int length, InetAddress address, int port)
 * 	需提供 数据byte[] 发给谁ip 端口
 * 
 * 注意事项
 * 	端口号错误，数据可以正常发出，不会出现异常，但是收不到
 * 	接收端端口号不能重复
 * 	
 * 
 * 
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		//创建数据
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

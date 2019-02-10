package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用TCP协议接收数据
 * 		创建接收端Socket对象
 * 		监听（阻塞）
 * 		获取输入流对象
 * 		获取数据
 * 		输出数据
 * 		释放资源
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
		//监听阻塞
		Socket s=ss.accept();
		//获取输入流对象
		InputStream is=s.getInputStream();
		//读取数据
		byte[] bys=new byte[1024];
		int len;
		len=is.read(bys);
		String data=new String(bys, 0, len);
		
		InetAddress adress=s.getInetAddress();
		String clientHostName=adress.getHostName();
		
		//打印数据
		System.out.println("client --->"+clientHostName);
		System.out.println(data);
		
		s.close();
		
	}
}

package socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/*
 * 使用TCP协议发送数据
 * 		创建发送端Socket对象，创建链接，
 * 		获取输出流对象
 * 		输出数据，发送数据
 * 		释放资源
 * 
 * Exception in thread "main" java.net.ConnectException:
 * 连接失败异常
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

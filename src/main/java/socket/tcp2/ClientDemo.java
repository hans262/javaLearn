package socket.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 模拟服务端收到数据
 * 转成大些 再转发给客户端
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws  IOException {
		//创建客户端Socket对象
		Socket s=new Socket(InetAddress.getByName("OULA"),10086);
		
		//发送数据
		OutputStream os =s.getOutputStream();
		byte[] bys="hello tcp, im comming!".getBytes();
		os.write(bys);
		
		//接收数据
		InputStream is=s.getInputStream();
		byte[] byss=new byte[1024];
		int len;
		len=is.read(byss);
		String data=new String(byss, 0, len);
		
		//打印数据
		System.out.println(data);
		
		//释放资源
		s.close();
		
	}
}

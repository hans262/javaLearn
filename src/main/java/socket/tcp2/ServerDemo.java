package socket.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务端Socket对象
		ServerSocket ss=new ServerSocket(10086);
		
		//监听（数据）
		Socket s=ss.accept();
		
		//读取数据
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len;
		len=is.read(bys);
		String data=new String(bys, 0, len);
		
		//打印数据
		System.out.println(data);
		
		//发送数据
		OutputStream os=s.getOutputStream();
		String upperData=data.toUpperCase();
		os.write(upperData.getBytes());
		
		//释放资源
		s.close();
		
	}
}

package socket.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 模拟用户登录
 * 		
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket对象
		Socket s=new Socket("OULA",8888);
		
		//获取用户名密码
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名：");
		String username=br.readLine();
		System.out.println("请输入密码");
		String password=br.readLine();
		
		//发送数据，以行为单位发送
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println(username);
		out.println(password);
		
		//接收数据
		BufferedReader res=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String result=res.readLine();
		
		//打印结果
		System.out.println(result);
		
		//释放资源
		s.close();
	}
}

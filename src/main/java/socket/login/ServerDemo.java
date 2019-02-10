package socket.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务端Socket对象
		ServerSocket ss=new ServerSocket(8888);
		
		//监听
		Socket s=ss.accept();
		
		//接收数据，以行为单位
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String username=br.readLine();
		String password=br.readLine();
		
		//判断密码
		boolean isOk=false;
		User user=new User(username,password);
		List<User> users=DB.getUsers();
		if(users.contains(user)){
			isOk=true;
		}
		
		//返回数据
		PrintWriter out =new PrintWriter(s.getOutputStream(),true);
		if(isOk){
			out.println("登录成功");
		}else{
			out.println("登录失败");
		}
		
		s.close();
	}
}

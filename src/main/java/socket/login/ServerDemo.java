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
		//���������Socket����
		ServerSocket ss=new ServerSocket(8888);
		
		//����
		Socket s=ss.accept();
		
		//�������ݣ�����Ϊ��λ
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String username=br.readLine();
		String password=br.readLine();
		
		//�ж�����
		boolean isOk=false;
		User user=new User(username,password);
		List<User> users=DB.getUsers();
		if(users.contains(user)){
			isOk=true;
		}
		
		//��������
		PrintWriter out =new PrintWriter(s.getOutputStream(),true);
		if(isOk){
			out.println("��¼�ɹ�");
		}else{
			out.println("��¼ʧ��");
		}
		
		s.close();
	}
}

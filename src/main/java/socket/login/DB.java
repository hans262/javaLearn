package socket.login;

import java.util.ArrayList;
import java.util.List;
/*
 * ģ�����ݿ�
 */
public class DB {
	private static List<User> users=new ArrayList<User>();
	
	//��ʼ�����ݣ���̬����飬����ص�ʱ���ִ��
	static{
		users.add(new User("huahua","123456"));
		users.add(new User("goudan","654321"));
		users.add(new User("admin","password"));
	}
	public static List<User> getUsers(){
		return users;
	}
}

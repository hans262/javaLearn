package socket.login;

import java.util.ArrayList;
import java.util.List;
/*
 * 模拟数据库
 */
public class DB {
	private static List<User> users=new ArrayList<User>();
	
	//初始化数据，静态代码块，类加载的时候就执行
	static{
		users.add(new User("huahua","123456"));
		users.add(new User("goudan","654321"));
		users.add(new User("admin","password"));
	}
	public static List<User> getUsers(){
		return users;
	}
}

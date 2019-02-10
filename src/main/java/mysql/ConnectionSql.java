package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSql{
	//JDBC 驱动数据库 URL,用户名,密码
	static String url = "jdbc:mysql://localhost:3306/myapp?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	static String dbName = "root";
	static String dbPassword = "5276";
	//注册JDBC驱动 并抛出异常
	static{
		String driver = "com.mysql.jdbc.Driver";
		try{
			Class.forName(driver);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	//创建connection对象 并抛出异常
	public static Connection getConnection(){	
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,dbName,dbPassword);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
}
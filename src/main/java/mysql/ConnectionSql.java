package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSql{
	//JDBC �������ݿ� URL,�û���,����
	static String url = "jdbc:mysql://localhost:3306/myapp?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	static String dbName = "root";
	static String dbPassword = "5276";
	//ע��JDBC���� ���׳��쳣
	static{
		String driver = "com.mysql.jdbc.Driver";
		try{
			Class.forName(driver);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	//����connection���� ���׳��쳣
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
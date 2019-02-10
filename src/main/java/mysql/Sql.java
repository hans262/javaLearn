package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sql {
	public static void main(String[] args){
		dbSelect();
//		dbInsert();
//		dbUpdate();
//		dbDelete();
	}
	public static void dbDelete() {
		String sql="DELETE FROM users WHERE id=?";
		Connection conn = null;
		
    PreparedStatement stmt = null;
    try{
        	//得到数据库连接对象
        	conn = ConnectionSql.getConnection();
        	//接收PreparedStatement对象,预编译SQL
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,7);
			//执行数据库语句
			stmt.executeUpdate();
    }catch(SQLException e){
        	e.printStackTrace();
        }finally{
			try{
			    stmt.close();
			    conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void dbUpdate() {
		String sql="UPDATE users SET password=? WHERE id=?";
		Connection conn = null;
        PreparedStatement stmt = null;
        try{
        	//得到数据库连接对象
        	conn = ConnectionSql.getConnection();
        	//接收PreparedStatement对象,预编译SQL
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,"qwe123");
			stmt.setInt(2,5);
			//执行数据库语句
			stmt.executeUpdate();
        }catch(SQLException e){
        	e.printStackTrace();
        }finally{
			try{
			    stmt.close();
			    conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void dbInsert() {
		String sql="INSERT INTO users(username,password) VALUES(?,?)";
		Connection conn = null;
        PreparedStatement stmt = null;
        try{
        	//得到数据库连接对象
        	conn = ConnectionSql.getConnection();
        	//接收PreparedStatement对象,预编译SQL
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "徐会长");
			stmt.setString(2, "qwe789");
			//执行数据库语句
			stmt.executeUpdate();
        }catch(SQLException e){
        	e.printStackTrace();
        }finally{
			try{
			    stmt.close();
			    conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void dbSelect(){
		String sql="SELECT * FROM users";
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
		try {
			//接收connection连接对象
			conn = ConnectionSql.getConnection();
			//接收PreparedStatement对象,预编译SQL
			stmt = conn.prepareStatement(sql);
			//接收ResultSet对象，存放结果集
			rs = stmt.executeQuery();
	        while(rs.next()){
	        	int id=rs.getInt("id");
				String username=rs.getString("username");
				String password=rs.getString("password");
				System.out.println(id+","+username+","+password);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				rs.close();
			    stmt.close();
			    conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

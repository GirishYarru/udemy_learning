package demo.jdbc;
import java.sql.*;
public class TestDb {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/demo";
			Connection conn = DriverManager.getConnection(url,"root","Google@66");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}

package demo.jdbc;
//step1 - need to import jdbc api classes
import java.sql.*;

public class TESTMySqlConnection {
	
	public static void main(String[] args) {
		
		try {
			//step 2 - load mysql driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//formulate the database address
			String dbURL = "jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=latin1";
			String userName = "root";
			String pwd = "Google@66";
			//jdbc:mysql://hostName:portNumber/dbName
			
			
			//step-4 create a connection from application to MYSQL DB
			Connection conn = DriverManager.getConnection(dbURL, userName, pwd);
			
			
			if(conn == null) {
				System.out.println("connection failed");
			}else {
				System.out.println("successfully connected");
			}
			
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

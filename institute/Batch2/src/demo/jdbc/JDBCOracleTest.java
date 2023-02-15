package demo.jdbc;
//step1
import java.sql.*;


public class JDBCOracleTest {
	//JDBC and database properties.
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/demo?characterEncoding=latin1";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Google@66";
 
	public static void main(String args[]){
		Connection conn = null;
		try{
			//step - 2
			//Register the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
		
			
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
			
		
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
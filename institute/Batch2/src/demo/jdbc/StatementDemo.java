package demo.jdbc;

import java.sql.*;

public class StatementDemo {

	//JDBC and database properties.
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/demo?characterEncoding=latin1";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Google@66";
 
	public static void main(String args[]) throws SQLException{
		Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	
			
			Statement st = conn.createStatement();
			
			String sql = "select * from demo.student_det";
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+ rs.getInt("id"));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			conn.close();
		}
	}	


}

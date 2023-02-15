package demo.jdbc;

import java.sql.*;

public class PrepareStatementDemo {
	//JDBC and database properties.
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/demo?characterEncoding=latin1";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Google@66";
	
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
			
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			String sql = "select * from demo.student_det where name=?";
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
		    ps.setString(1, "tharun");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+ rs.getInt("id"));
				
			}
			
			
			//int  noOfRowsImpacted = st.executeUpdate("DELETE from demo.student_det where id=3");

			
			
		
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			conn.close();
		}
	
	}

}

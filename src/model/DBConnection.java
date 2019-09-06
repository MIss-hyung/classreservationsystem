package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getCon() throws SQLException{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classreservationdb";
			con=DriverManager.getConnection(url, "root", "1234");
			return con;
		}catch(ClassNotFoundException ce){
			System.out.println(ce.getMessage());
			return null;
		}
	}
}

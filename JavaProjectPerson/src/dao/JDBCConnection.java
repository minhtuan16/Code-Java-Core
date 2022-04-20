package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection getConn() {
		
		final String username = "root";
		final String password = "010601";

		final String url = "jdbc:mysql://localhost:3306/person";
		
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Loi ket noi db");
			e.printStackTrace();
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		getConn();
//	}
}

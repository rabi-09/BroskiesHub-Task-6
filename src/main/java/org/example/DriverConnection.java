package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnection {
	private static final String USERNAME = "your_username", PASSWORD = "your_password", URL = "jdbc:mysql://localhost:your_port_id/your_db_name";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}

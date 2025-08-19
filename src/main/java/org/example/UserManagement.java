package org.example;

import java.sql.*;
import java.util.Scanner;

public class UserManagement{
	private Connection connection = null;
	private Scanner sc = new Scanner(System.in);
	
	public void getAllUsers() throws SQLException {
		try {
			connection = DriverConnection.getConnection();
			String query = "select * from user";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				System.out.println("ID: "+resultSet.getInt("id")+" Name: "+resultSet.getString("name")+" Email: "+resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				connection.close();
		}
	}
	
	public void getUserByID() throws SQLException {
		try {
			connection = DriverConnection.getConnection();
			String query = "select * from user where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter User ID to fetch");
			int id = sc.nextInt();
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()){
				System.out.println("ID: "+resultSet.getInt("id")+" Name: "+resultSet.getString("name")+" Email: "+resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				connection.close();
		}
	}
	
	public void insertUser() throws SQLException {
		try{
			connection = DriverConnection.getConnection();
			String query = "insert into user values (?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("Enter User's ID, Name and Email");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			int i = preparedStatement.executeUpdate();
			System.out.println(i+" row inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				connection.close();
		}
	}
	
}

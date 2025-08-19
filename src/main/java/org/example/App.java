package org.example;


import java.sql.SQLException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws SQLException {
        Scanner sc = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        while (true){
            System.out.println("Enter Your Choice\n0-Exit\n1-Insert a User\n2-Get All Users\n3-Get User By ID");
            int choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.exit(1);
                case 1:
                    userManagement.insertUser();
                    break;
                case 2:
                    userManagement.getAllUsers();
                    break;
                case 3:
                    userManagement.getUserByID();
                    break;
                default:
                    System.exit(1);
                    
            }
        }
    }
}

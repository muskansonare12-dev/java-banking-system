package Bankmanagementsystem;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class BankingApp {

    private static final String url = "jdbc:mysql://localhost:3306/banking_system";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);
           User user=new User(connection,scanner);

            while(true) {
                System.out.println("******WELCOME TO BANKING SYSTEM*****");
                System.out.println();
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("Enter Your Choice: ");

                int choice1= scanner.nextInt();
                switch (choice1) {
                  case 1:
                    user.register();
                    break;

                    case 2:
                    System.out.println("Thank you!");
                    return;

                    default:
                        System.out.println("Invalid choice!");
                }
                }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

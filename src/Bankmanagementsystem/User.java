package Bankmanagementsystem;

import java.sql.Connection;
import java.util.Scanner;


public class User {

    private Connection connection;
    private Scanner scanner;

    public User(Connection connection ,Scanner scanner ) {
        this.connection = connection;
        this.scanner = scanner;
    }
    public void register(){
        scanner.nextInt();


        System.out.println("Enter Name");
        String name=scanner.nextLine();

        System.out.println("Enter Email");
        String email= scanner.nextLine();

        System.out.println("Enter password");
        String password =scanner.nextLine();

        System.out.println("User Register Successfully");

        }

    }






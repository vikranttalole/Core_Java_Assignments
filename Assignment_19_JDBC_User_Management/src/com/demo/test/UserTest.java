package com.demo.test;
import java.sql.*;
import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        PreparedStatement ps =
                con.prepareStatement(
                "select * from users where username=? and address=?");

        ps.setString(1, username);
        ps.setString(2, address);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println("User Found");

            System.out.println("Username : "
                    + rs.getString("username"));

            System.out.println("Address : "
                    + rs.getString("address"));

            System.out.println("Mobile : "
                    + rs.getString("mobile"));

            System.out.println("Email : "
                    + rs.getString("email"));

        } else {

            System.out.println("User Not Found");

            System.out.print("Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            ps = con.prepareStatement(
                    "insert into users values(?,?,?,?)");

            ps.setString(1, username);
            ps.setString(2, address);
            ps.setString(3, mobile);
            ps.setString(4, email);

            ps.executeUpdate();

            System.out.println("User Inserted Successfully");
        }

        con.close();
        sc.close();
    }
}
package com.demo.test;

import java.sql.*;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Connection con = DBConnection.getConnection();

        int choice;

        do {

            System.out.println("\n1.Add Product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display All");
            System.out.println("4.Search By Id");
            System.out.println("5.Display Qty > Given Qty");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Id: ");
                    int id = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Qty: ");
                    int qty = sc.nextInt();

                    PreparedStatement ps =
                            con.prepareStatement(
                            "insert into product values(?,?,?,?)");

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setDouble(3, price);
                    ps.setInt(4, qty);

                    ps.executeUpdate();

                    System.out.println("Product Added");
                    break;

                case 2:
                    System.out.print("Enter Product Id:");
                    id = sc.nextInt();

                    ps = con.prepareStatement(
                            "delete from product where productid=?");

                    ps.setInt(1, id);

                    ps.executeUpdate();

                    System.out.println("Deleted");
                    break;

                case 3:
                    Statement st = con.createStatement();

                    ResultSet rs =
                            st.executeQuery("select * from product");

                    while(rs.next()) {

                        System.out.println(
                                rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getDouble(3)+" "+
                                rs.getInt(4));
                    }
                    break;

                case 4:
                    System.out.print("Enter Id:");
                    id = sc.nextInt();

                    ps = con.prepareStatement(
                            "select * from product where productid=?");

                    ps.setInt(1, id);

                    rs = ps.executeQuery();

                    while(rs.next()) {

                        System.out.println(
                                rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getDouble(3)+" "+
                                rs.getInt(4));
                    }
                    break;

                case 5:
                    System.out.print("Enter Qty:");
                    qty = sc.nextInt();

                    ps = con.prepareStatement(
                            "select * from product where qty > ?");

                    ps.setInt(1, qty);

                    rs = ps.executeQuery();

                    while(rs.next()) {

                        System.out.println(
                                rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getDouble(3)+" "+
                                rs.getInt(4));
                    }
                    break;
            }

        } while(choice != 6);

        con.close();
        sc.close();
    }
}
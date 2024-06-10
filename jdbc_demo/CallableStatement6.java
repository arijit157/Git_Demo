package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class CallableStatement6 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your firstname:");
        String fname=sc.nextLine();

        System.out.println("Enter your last name:");
        String lname=sc.nextLine();

        try(sc) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            CallableStatement cstmt = conn.prepareCall("{? = call function_lm2(?, ?)}");
            cstmt.registerOutParameter(1, Types.VARCHAR);
            cstmt.setString(2,fname);
            cstmt.setString(3, lname);
            cstmt.execute();
            String fullName=cstmt.getString(1);
            System.out.println("Your full name: "+fullName);
            cstmt.close();
            conn.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

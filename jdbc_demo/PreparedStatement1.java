package jdbc_demo;

import java.util.*;
import java.sql.*;

public class PreparedStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID:");
        int id = sc.nextInt();
        System.out.println("Enter the roll no:");
        int rollNo = sc.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatement pstmt = conn.prepareStatement("select * from students where id=? and roll_no=?");
            pstmt.setInt(1, id);
            pstmt.setInt(2, rollNo);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                        + " " + rs.getInt(5) + " " + rs.getInt(6));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package jdbc_demo;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from students");) {
                    
            Class.forName("com.mysql.cj.jdbc.Driver");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                        + " " + rs.getInt(5) + " " + rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
